package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "settings")
@js.native
object settings extends js.Object {
  /**
    * The prefix that uses to store the question comment, as {questionName} + {commentPrefix}.
    * The default
    */
  var commentPrefix: String = js.native
  /**
    * default locale name for localizable strings that uses during serialization, {"default": "My text", "de": "Mein Text"}
    */
  var defaultLocaleName: String = js.native
  /**
    * Disable the question while choices are getting from the web service
    */
  var disableOnGettingChoicesFromWeb: Boolean = js.native
  /**
    * separator that can allow to set value and text of ItemValue object in one string as: "value|text"
    */
  var itemValueSeparator: String = js.native
  /**
    * Default cell type for dropdown and dynamic matrices
    */
  var matrixDefaultCellType: String = js.native
  /**
    * Default row name for matrix (single choice)
    */
  var matrixDefaultRowName: String = js.native
  /**
    * Maximum row count in dynamic matrix
    */
  var matrixMaximumRowCount: Double = js.native
  /**
    * Total value postfix for dropdown and dynamic matrices. The total value stores as: {matrixName} + {postfix}
    */
  var matrixTotalValuePostFix: String = js.native
  /**
    * Maximum panel count in dynamic panel
    */
  var panelMaximumPanelCount: Double = js.native
  /**
    * Maximum rate value count in rating question
    */
  var ratingMaximumRateValueCount: Double = js.native
  /**
    * SurveyJS web service API url
    */
  var surveyServiceUrl: String = js.native
  /**
    * Encode parameter on calling restfull web API
    */
  var webserviceEncodeParameters: Boolean = js.native
}

