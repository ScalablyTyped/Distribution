package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAzureSubscription extends js.Object {
  var azureSubscription: Double
  var chef: Double
  var custom: Double
  var generic: Double
}

object AnonAzureSubscription {
  @scala.inline
  def apply(azureSubscription: Double, chef: Double, custom: Double, generic: Double): AnonAzureSubscription = {
    val __obj = js.Dynamic.literal(azureSubscription = azureSubscription.asInstanceOf[js.Any], chef = chef.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAzureSubscription]
  }
}

