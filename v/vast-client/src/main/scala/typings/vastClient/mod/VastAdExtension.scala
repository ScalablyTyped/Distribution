package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastAdExtension extends StObject {
  
  var attributes: VastAdAttributes
  
  var children: js.Array[VastAdExtensionChild]
}
object VastAdExtension {
  
  @scala.inline
  def apply(attributes: VastAdAttributes, children: js.Array[VastAdExtensionChild]): VastAdExtension = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastAdExtension]
  }
  
  @scala.inline
  implicit class VastAdExtensionMutableBuilder[Self <: VastAdExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: VastAdAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: js.Array[VastAdExtensionChild]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: VastAdExtensionChild*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
