package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "settings")
@js.native
object settings extends js.Object {
  
  /**
    * Set to false to hide empty page description in design mode
    */
  var allowShowEmptyDescriptionInDesignMode: Boolean = js.native
  
  /**
    * Set to false to hide empty page title and description in design mode
    */
  var allowShowEmptyTitleInDesignMode: Boolean = js.native
  
  /**
    * The prefix that uses to store the question comment, as {questionName} + {commentPrefix}.
    * The default
    */
  var commentPrefix: String = js.native
  
  /**
    * Override this function, set your function, if you want to show your own dialog confirm window instead of standard browser window.
    * @param message
    */
  def confirmActionFunc(message: String): Boolean = js.native
  
  /**
    * default locale name for localizable strings that uses during serialization, {"default": "My text", "de": "Mein Text"}
    */
  var defaultLocaleName: String = js.native
  
  /**
    * Disable the question while choices are getting from the web service
    */
  var disableOnGettingChoicesFromWeb: Boolean = js.native
  
  /**
    * Set this property to true to execute the complete trigger on value change instead of on next page.
    */
  var executeCompleteTriggerOnValueChanged: Boolean = js.native
  
  /**
    * Set this property to false to execute the skip trigger on next page instead of on value change.
    */
  var executeSkipTriggerOnValueChanged: Boolean = js.native
  
  /**
    * separator that can allow to set value and text of ItemValue object in one string as: "value|text"
    */
  var itemValueSeparator: String = js.native
  
  /**
    * By default all rows are rendered no matters whwther they are visible.
    * Set it true, and survey markup rows will be rendered only if they are visible in viewport.
    * This feature is experimantal and might do not support all the use cases.
    */
  var lazyRowsRendering: Boolean = js.native
  
  /**
    * Default cell type for dropdown and dynamic matrices
    */
  var matrixDefaultCellType: String = js.native
  
  /**
    * Default row name for matrix (single choice)
    */
  var matrixDefaultRowName: String = js.native
  
  /**
    * Maximum rowCount that returns in addConditionObjectsByContext function
    */
  var matrixMaxRowCountInCondition: Double = js.native
  
  /**
    * Maximum row count in dynamic matrix
    */
  var matrixMaximumRowCount: Double = js.native
  
  /**
    * Total value postfix for dropdown and dynamic matrices. The total value stores as: {matrixName} + {postfix}
    */
  var matrixTotalValuePostFix: String = js.native
  
  /**
    * Set this property to change the default value of the minWidth constraint
    */
  var maxWidth: String = js.native
  
  /**
    * This property tells how many times survey re-run expressions on value changes during condition running. We need it to avoid recursions in the expressions
    */
  var maximumConditionRunCountOnValueChanged: Double = js.native
  
  /**
    * Set this property to change the default value of the minWidth constraint
    */
  var minWidth: String = js.native
  
  /**
    * Maximum panel count in dynamic panel
    */
  var panelMaximumPanelCount: Double = js.native
  
  /**
    * Maximum rate value count in rating question
    */
  var ratingMaximumRateValueCount: Double = js.native
  
  /**
    * Set this property to change readOnlyCommentRenderMode: "textarea" (default) or (div)
    */
  var readOnlyCommentRenderMode: String = js.native
  
  /**
    * Set to true to always serialize the localization string as object even if there is only one value for default locale. Instead of string "MyStr" serialize as {default: "MyStr"}
    */
  var serializeLocalizableStringAsObject: Boolean = js.native
  
  /**
    * By default visibleIndex for question with hideNumber = true is -1, and survey doesn't count these questions when set questions numbers.
    * Set it true, and a question next to a question with hidden title number will increase it's number.
    */
  var setQuestionVisibleIndexForHiddenNumber: Boolean = js.native
  
  /**
    * By default visibleIndex for question with titleLocation = "hidden" is -1, and survey doesn't count these questions when set questions numbers.
    * Set it true, and a question next to a question with hidden title will increase it's number.
    */
  var setQuestionVisibleIndexForHiddenTitle: Boolean = js.native
  
  /**
    * SurveyJS web service API url
    */
  var surveyServiceUrl: String = js.native
  
  /**
    * Cache the result for choices getting from web services. Set this property to false, to disable the caching.
    */
  var useCachingForChoicesRestfull: Boolean = js.native
  
  /**
    * Encode parameter on calling restfull web API
    */
  var webserviceEncodeParameters: Boolean = js.native
}
