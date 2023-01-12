package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionFields extends StObject {
  
  var extensionFields: scala.Double
  
  var none: scala.Double
}
object ExtensionFields {
  
  inline def apply(extensionFields: scala.Double, none: scala.Double): ExtensionFields = {
    val __obj = js.Dynamic.literal(extensionFields = extensionFields.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionFields] (val x: Self) extends AnyVal {
    
    inline def setExtensionFields(value: scala.Double): Self = StObject.set(x, "extensionFields", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
