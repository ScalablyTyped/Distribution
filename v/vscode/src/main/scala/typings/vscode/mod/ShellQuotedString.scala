package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellQuotedString extends StObject {
  
  /**
    * The quoting style to use.
    */
  var quoting: ShellQuoting
  
  /**
    * The actual string value.
    */
  var value: String
}
object ShellQuotedString {
  
  inline def apply(quoting: ShellQuoting, value: String): ShellQuotedString = {
    val __obj = js.Dynamic.literal(quoting = quoting.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellQuotedString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShellQuotedString] (val x: Self) extends AnyVal {
    
    inline def setQuoting(value: ShellQuoting): Self = StObject.set(x, "quoting", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
