package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AzureSubscription extends js.Object {
  var azureSubscription: Double
  var chef: Double
  var custom: Double
  var generic: Double
}

object Anon_AzureSubscription {
  @scala.inline
  def apply(azureSubscription: Double, chef: Double, custom: Double, generic: Double): Anon_AzureSubscription = {
    val __obj = js.Dynamic.literal(azureSubscription = azureSubscription, chef = chef, custom = custom, generic = generic)
  
    __obj.asInstanceOf[Anon_AzureSubscription]
  }
}

