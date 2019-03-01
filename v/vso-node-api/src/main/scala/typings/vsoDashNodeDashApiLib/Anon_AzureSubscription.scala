package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AzureSubscription extends js.Object {
  var azureSubscription: scala.Double
  var chef: scala.Double
  var custom: scala.Double
  var generic: scala.Double
}

object Anon_AzureSubscription {
  @scala.inline
  def apply(azureSubscription: scala.Double, chef: scala.Double, custom: scala.Double, generic: scala.Double): Anon_AzureSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("azureSubscription")(azureSubscription)
    __obj.updateDynamic("chef")(chef)
    __obj.updateDynamic("custom")(custom)
    __obj.updateDynamic("generic")(generic)
    __obj.asInstanceOf[Anon_AzureSubscription]
  }
}

