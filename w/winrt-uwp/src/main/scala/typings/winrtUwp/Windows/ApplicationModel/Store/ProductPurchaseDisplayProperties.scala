package typings.winrtUwp.Windows.ApplicationModel.Store

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to provide the product name that is displayed to the user at time of purchase. */
@js.native
trait ProductPurchaseDisplayProperties extends js.Object {
  
  /** Windows Phone only. This is an internal product description. */
  var description: String = js.native
  
  /** Windows Phone only. Gets or sets the location of an image used to represent the product at time of purchase. */
  var image: Uri = js.native
  
  /** Gets or sets the product name that is displayed to the user at time of purchase. */
  var name: String = js.native
}
object ProductPurchaseDisplayProperties {
  
  @scala.inline
  def apply(description: String, image: Uri, name: String): ProductPurchaseDisplayProperties = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductPurchaseDisplayProperties]
  }
  
  @scala.inline
  implicit class ProductPurchaseDisplayPropertiesOps[Self <: ProductPurchaseDisplayProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Uri): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
