package typings.winrtUwp.Windows.Services.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains additional details that you can pass to a purchase request for a product, including the product name to display to the user during the purchase. */
@js.native
trait StorePurchaseProperties extends js.Object {
  /** Gets or sets a JSON-formatted string that contains extended data to pass with the purchase request to the Windows Store. */
  var extendedJsonData: String = js.native
  /** Gets or sets the product name that is displayed to the user during the purchase. The specified name appears in the title bar of the purchase UI. */
  var name: String = js.native
}

object StorePurchaseProperties {
  @scala.inline
  def apply(extendedJsonData: String, name: String): StorePurchaseProperties = {
    val __obj = js.Dynamic.literal(extendedJsonData = extendedJsonData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePurchaseProperties]
  }
  @scala.inline
  implicit class StorePurchasePropertiesOps[Self <: StorePurchaseProperties] (val x: Self) extends AnyVal {
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
    def setExtendedJsonData(value: String): Self = this.set("extendedJsonData", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

