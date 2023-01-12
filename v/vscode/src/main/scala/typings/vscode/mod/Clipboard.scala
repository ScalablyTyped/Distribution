package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clipboard extends StObject {
  
  /**
    * Read the current clipboard contents as text.
    * @returns A thenable that resolves to a string.
    */
  def readText(): Thenable[String]
  
  /**
    * Writes text into the clipboard.
    * @returns A thenable that resolves when writing happened.
    */
  def writeText(value: String): Thenable[Unit]
}
object Clipboard {
  
  inline def apply(readText: () => Thenable[String], writeText: String => Thenable[Unit]): Clipboard = {
    val __obj = js.Dynamic.literal(readText = js.Any.fromFunction0(readText), writeText = js.Any.fromFunction1(writeText))
    __obj.asInstanceOf[Clipboard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Clipboard] (val x: Self) extends AnyVal {
    
    inline def setReadText(value: () => Thenable[String]): Self = StObject.set(x, "readText", js.Any.fromFunction0(value))
    
    inline def setWriteText(value: String => Thenable[Unit]): Self = StObject.set(x, "writeText", js.Any.fromFunction1(value))
  }
}
