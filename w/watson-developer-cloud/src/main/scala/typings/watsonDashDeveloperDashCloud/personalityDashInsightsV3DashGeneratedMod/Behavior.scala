package typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** Behavior. */
trait Behavior extends js.Object {
  /** The category of the characteristic: `behavior` for temporal data. */
  var category: String
  /** The user-visible, localized name of the characteristic. */
  var name: String
  /** For JSON content that is timestamped, the percentage of timestamped input data that occurred during that day of the week or hour of the day. The range is 0 to 1. */
  var percentage: Double
  /** The unique, non-localized identifier of the characteristic to which the results pertain. IDs have the form `behavior_{value}`. */
  var trait_id: String
}

object Behavior {
  @scala.inline
  def apply(category: String, name: String, percentage: Double, trait_id: String): Behavior = {
    val __obj = js.Dynamic.literal(category = category, name = name, percentage = percentage, trait_id = trait_id)
  
    __obj.asInstanceOf[Behavior]
  }
}

