package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureSubscription extends js.Object {
  var azureSubscription: scala.Double = js.native
  var chef: scala.Double = js.native
  var custom: scala.Double = js.native
  var generic: scala.Double = js.native
}

object AzureSubscription {
  @scala.inline
  def apply(azureSubscription: scala.Double, chef: scala.Double, custom: scala.Double, generic: scala.Double): AzureSubscription = {
    val __obj = js.Dynamic.literal(azureSubscription = azureSubscription.asInstanceOf[js.Any], chef = chef.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSubscription]
  }
  @scala.inline
  implicit class AzureSubscriptionOps[Self <: AzureSubscription] (val x: Self) extends AnyVal {
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
    def setAzureSubscription(value: scala.Double): Self = this.set("azureSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setChef(value: scala.Double): Self = this.set("chef", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: scala.Double): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeneric(value: scala.Double): Self = this.set("generic", value.asInstanceOf[js.Any])
  }
  
}

