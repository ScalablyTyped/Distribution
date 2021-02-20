package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastAdExtensionChild extends StObject {
  
  var attributes: VastAdChildAttributes = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var value: String | Double = js.native
}
object VastAdExtensionChild {
  
  @scala.inline
  def apply(attributes: VastAdChildAttributes, value: String | Double): VastAdExtensionChild = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastAdExtensionChild]
  }
  
  @scala.inline
  implicit class VastAdExtensionChildMutableBuilder[Self <: VastAdExtensionChild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: VastAdChildAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
