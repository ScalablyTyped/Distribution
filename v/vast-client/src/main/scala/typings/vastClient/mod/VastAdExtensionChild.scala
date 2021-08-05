package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastAdExtensionChild extends StObject {
  
  var attributes: VastAdChildAttributes
  
  var name: js.UndefOr[String] = js.undefined
  
  var value: String | Double
}
object VastAdExtensionChild {
  
  inline def apply(attributes: VastAdChildAttributes, value: String | Double): VastAdExtensionChild = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastAdExtensionChild]
  }
  
  extension [Self <: VastAdExtensionChild](x: Self) {
    
    inline def setAttributes(value: VastAdChildAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
