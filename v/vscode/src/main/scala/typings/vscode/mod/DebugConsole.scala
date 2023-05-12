package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugConsole extends StObject {
  
  /**
  		 * Append the given value to the debug console.
  		 *
  		 * @param value A string, falsy values will not be printed.
  		 */
  def append(value: String): Unit
  
  /**
  		 * Append the given value and a line feed character
  		 * to the debug console.
  		 *
  		 * @param value A string, falsy values will be printed.
  		 */
  def appendLine(value: String): Unit
}
object DebugConsole {
  
  inline def apply(append: String => Unit, appendLine: String => Unit): DebugConsole = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendLine = js.Any.fromFunction1(appendLine))
    __obj.asInstanceOf[DebugConsole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebugConsole] (val x: Self) extends AnyVal {
    
    inline def setAppend(value: String => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    inline def setAppendLine(value: String => Unit): Self = StObject.set(x, "appendLine", js.Any.fromFunction1(value))
  }
}
