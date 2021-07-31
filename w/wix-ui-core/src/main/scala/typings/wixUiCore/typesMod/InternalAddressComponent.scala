package typings.wixUiCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalAddressComponent extends StObject {
  
  var long: String
  
  var short: String
}
object InternalAddressComponent {
  
  @scala.inline
  def apply(long: String, short: String): InternalAddressComponent = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalAddressComponent]
  }
  
  @scala.inline
  implicit class InternalAddressComponentMutableBuilder[Self <: InternalAddressComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
