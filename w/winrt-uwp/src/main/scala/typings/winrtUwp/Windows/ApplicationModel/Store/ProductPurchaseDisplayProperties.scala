package typings.winrtUwp.Windows.ApplicationModel.Store

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to provide the product name that is displayed to the user at time of purchase. */
@js.native
trait ProductPurchaseDisplayProperties extends StObject {
  
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
  implicit class ProductPurchaseDisplayPropertiesMutableBuilder[Self <: ProductPurchaseDisplayProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Uri): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
