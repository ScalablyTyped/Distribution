package typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ConsumptionPreferencesCategory. */
trait ConsumptionPreferencesCategory extends js.Object {
  /** The unique, non-localized identifier of the consumption preferences category to which the results pertain. IDs have the form `consumption_preferences_{category}`. */
  var consumption_preference_category_id: String
  /** Detailed results inferred from the input text for the individual preferences of the category. */
  var consumption_preferences: js.Array[ConsumptionPreferences]
  /** The user-visible name of the consumption preferences category. */
  var name: String
}

object ConsumptionPreferencesCategory {
  @scala.inline
  def apply(
    consumption_preference_category_id: String,
    consumption_preferences: js.Array[ConsumptionPreferences],
    name: String
  ): ConsumptionPreferencesCategory = {
    val __obj = js.Dynamic.literal(consumption_preference_category_id = consumption_preference_category_id.asInstanceOf[js.Any], consumption_preferences = consumption_preferences.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConsumptionPreferencesCategory]
  }
}

