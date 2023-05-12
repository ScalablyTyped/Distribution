package typings.thunderbirdWebextBrowser.browser.compose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomHeader extends StObject {
  
  /** Name of a custom header, must have a `X-` prefix. */
  var name: String
  
  var value: String
}
object CustomHeader {
  
  inline def apply(name: String, value: String): CustomHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomHeader] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
