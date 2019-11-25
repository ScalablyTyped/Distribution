package typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ToneCategory. */
trait ToneCategory extends js.Object {
  /** The unique, non-localized identifier of the category for the results. The service can return results for the following category IDs: `emotion_tone`, `language_tone`, and `social_tone`. */
  var category_id: String
  /** The user-visible, localized name of the category. */
  var category_name: String
  /** An array of `ToneScore` objects that provides the results for the tones of the category. */
  var tones: js.Array[ToneScore]
}

object ToneCategory {
  @scala.inline
  def apply(category_id: String, category_name: String, tones: js.Array[ToneScore]): ToneCategory = {
    val __obj = js.Dynamic.literal(category_id = category_id.asInstanceOf[js.Any], category_name = category_name.asInstanceOf[js.Any], tones = tones.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToneCategory]
  }
}

