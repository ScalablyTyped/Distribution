package typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Profile. */
trait Profile extends js.Object {
  /** For JSON content that is timestamped, detailed results about the social behavior disclosed by the input in terms of temporal characteristics. The results include information about the distribution of the content over the days of the week and the hours of the day. */
  var behavior: js.UndefOr[js.Array[Behavior]] = js.undefined
  /** If the **consumption_preferences** parameter is `true`, detailed results for each category of consumption preferences. Each element of the array provides information inferred from the input text for the individual preferences of that category. */
  var consumption_preferences: js.UndefOr[js.Array[ConsumptionPreferencesCategory]] = js.undefined
  /** Detailed results for the Needs characteristics inferred from the input text. */
  var needs: js.Array[Trait]
  /** A recursive array of `Trait` objects that provides detailed results for the Big Five personality characteristics (dimensions and facets) inferred from the input text. */
  var personality: js.Array[Trait]
  /** The language model that was used to process the input. */
  var processed_language: String
  /** Detailed results for the Values characteristics inferred from the input text. */
  var values: js.Array[Trait]
  /** Warning messages associated with the input text submitted with the request. The array is empty if the input generated no warnings. */
  var warnings: js.Array[Warning]
  /** The number of words from the input that were used to produce the profile. */
  var word_count: Double
  /** When guidance is appropriate, a string that provides a message that indicates the number of words found and where that value falls in the range of required or suggested number of words. */
  var word_count_message: js.UndefOr[String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    needs: js.Array[Trait],
    personality: js.Array[Trait],
    processed_language: String,
    values: js.Array[Trait],
    warnings: js.Array[Warning],
    word_count: Double,
    behavior: js.Array[Behavior] = null,
    consumption_preferences: js.Array[ConsumptionPreferencesCategory] = null,
    word_count_message: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(needs = needs, personality = personality, processed_language = processed_language, values = values, warnings = warnings, word_count = word_count)
    if (behavior != null) __obj.updateDynamic("behavior")(behavior)
    if (consumption_preferences != null) __obj.updateDynamic("consumption_preferences")(consumption_preferences)
    if (word_count_message != null) __obj.updateDynamic("word_count_message")(word_count_message)
    __obj.asInstanceOf[Profile]
  }
}

