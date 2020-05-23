package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureSubscription extends js.Object {
  var azureSubscription: scala.Double
  var chef: scala.Double
  var custom: scala.Double
  var generic: scala.Double
}

object AzureSubscription {
  @scala.inline
  def apply(azureSubscription: scala.Double, chef: scala.Double, custom: scala.Double, generic: scala.Double): AzureSubscription = {
    val __obj = js.Dynamic.literal(azureSubscription = azureSubscription.asInstanceOf[js.Any], chef = chef.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSubscription]
  }
}

