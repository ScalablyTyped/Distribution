package typings.stylelint.mod

import typings.std.Error
import typings.stylelint.stylelintInts.`78`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationError
  extends StObject
     with Error {
  
  var code: `78`
}
object ConfigurationError {
  
  inline def apply(message: String, name: String): ConfigurationError = {
    val __obj = js.Dynamic.literal(code = 78, message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigurationError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: `78`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
