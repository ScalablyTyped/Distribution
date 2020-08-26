package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** API usage information for the request. */
@js.native
trait AnalysisResultsUsage extends js.Object {
  /** Number of features used in the API call. */
  var features: js.UndefOr[Double] = js.native
  /** Number of text characters processed. */
  var text_characters: js.UndefOr[Double] = js.native
  /** Number of 10,000-character units processed. */
  var text_units: js.UndefOr[Double] = js.native
}

object AnalysisResultsUsage {
  @scala.inline
  def apply(): AnalysisResultsUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisResultsUsage]
  }
  @scala.inline
  implicit class AnalysisResultsUsageOps[Self <: AnalysisResultsUsage] (val x: Self) extends AnyVal {
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
    def setFeatures(value: Double): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setText_characters(value: Double): Self = this.set("text_characters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText_characters: Self = this.set("text_characters", js.undefined)
    @scala.inline
    def setText_units(value: Double): Self = this.set("text_units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText_units: Self = this.set("text_units", js.undefined)
  }
  
}

