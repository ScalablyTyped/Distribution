package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settings {
  
  @JSImport("survey-knockout", "settings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Set to false to hide empty page description in design mode
    */
  @JSImport("survey-knockout", "settings.allowShowEmptyDescriptionInDesignMode")
  @js.native
  def allowShowEmptyDescriptionInDesignMode: Boolean = js.native
  @scala.inline
  def allowShowEmptyDescriptionInDesignMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowShowEmptyDescriptionInDesignMode")(x.asInstanceOf[js.Any])
  
  /**
    * Set to false to hide empty page title and description in design mode
    */
  @JSImport("survey-knockout", "settings.allowShowEmptyTitleInDesignMode")
  @js.native
  def allowShowEmptyTitleInDesignMode: Boolean = js.native
  @scala.inline
  def allowShowEmptyTitleInDesignMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowShowEmptyTitleInDesignMode")(x.asInstanceOf[js.Any])
  
  /**
    * The prefix that uses to store the question comment, as {questionName} + {commentPrefix}.
    * The default
    */
  @JSImport("survey-knockout", "settings.commentPrefix")
  @js.native
  def commentPrefix: String = js.native
  @scala.inline
  def commentPrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("commentPrefix")(x.asInstanceOf[js.Any])
  
  /**
    * Override this function, set your function, if you want to show your own dialog confirm window instead of standard browser window.
    * @param message
    */
  @scala.inline
  def confirmActionFunc(message: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("confirmActionFunc")(message.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * default locale name for localizable strings that uses during serialization, {"default": "My text", "de": "Mein Text"}
    */
  @JSImport("survey-knockout", "settings.defaultLocaleName")
  @js.native
  def defaultLocaleName: String = js.native
  @scala.inline
  def defaultLocaleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocaleName")(x.asInstanceOf[js.Any])
  
  /**
    * Disable the question while choices are getting from the web service
    */
  @JSImport("survey-knockout", "settings.disableOnGettingChoicesFromWeb")
  @js.native
  def disableOnGettingChoicesFromWeb: Boolean = js.native
  @scala.inline
  def disableOnGettingChoicesFromWeb_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableOnGettingChoicesFromWeb")(x.asInstanceOf[js.Any])
  
  /**
    * Set this property to true to execute the complete trigger on value change instead of on next page.
    */
  @JSImport("survey-knockout", "settings.executeCompleteTriggerOnValueChanged")
  @js.native
  def executeCompleteTriggerOnValueChanged: Boolean = js.native
  @scala.inline
  def executeCompleteTriggerOnValueChanged_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("executeCompleteTriggerOnValueChanged")(x.asInstanceOf[js.Any])
  
  /**
    * Set this property to false to execute the skip trigger on next page instead of on value change.
    */
  @JSImport("survey-knockout", "settings.executeSkipTriggerOnValueChanged")
  @js.native
  def executeSkipTriggerOnValueChanged: Boolean = js.native
  @scala.inline
  def executeSkipTriggerOnValueChanged_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("executeSkipTriggerOnValueChanged")(x.asInstanceOf[js.Any])
  
  /**
    * separator that can allow to set value and text of ItemValue object in one string as: "value|text"
    */
  @JSImport("survey-knockout", "settings.itemValueSeparator")
  @js.native
  def itemValueSeparator: String = js.native
  @scala.inline
  def itemValueSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemValueSeparator")(x.asInstanceOf[js.Any])
  
  /**
    * By default all rows are rendered no matters whwther they are visible.
    * Set it true, and survey markup rows will be rendered only if they are visible in viewport.
    * This feature is experimantal and might do not support all the use cases.
    */
  @JSImport("survey-knockout", "settings.lazyRowsRendering")
  @js.native
  def lazyRowsRendering: Boolean = js.native
  @scala.inline
  def lazyRowsRendering_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lazyRowsRendering")(x.asInstanceOf[js.Any])
  
  /**
    * Default cell type for dropdown and dynamic matrices
    */
  @JSImport("survey-knockout", "settings.matrixDefaultCellType")
  @js.native
  def matrixDefaultCellType: String = js.native
  @scala.inline
  def matrixDefaultCellType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrixDefaultCellType")(x.asInstanceOf[js.Any])
  
  /**
    * Default row name for matrix (single choice)
    */
  @JSImport("survey-knockout", "settings.matrixDefaultRowName")
  @js.native
  def matrixDefaultRowName: String = js.native
  @scala.inline
  def matrixDefaultRowName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrixDefaultRowName")(x.asInstanceOf[js.Any])
  
  /**
    * Maximum rowCount that returns in addConditionObjectsByContext function
    */
  @JSImport("survey-knockout", "settings.matrixMaxRowCountInCondition")
  @js.native
  def matrixMaxRowCountInCondition: Double = js.native
  @scala.inline
  def matrixMaxRowCountInCondition_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrixMaxRowCountInCondition")(x.asInstanceOf[js.Any])
  
  /**
    * Maximum row count in dynamic matrix
    */
  @JSImport("survey-knockout", "settings.matrixMaximumRowCount")
  @js.native
  def matrixMaximumRowCount: Double = js.native
  @scala.inline
  def matrixMaximumRowCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrixMaximumRowCount")(x.asInstanceOf[js.Any])
  
  /**
    * Total value postfix for dropdown and dynamic matrices. The total value stores as: {matrixName} + {postfix}
    */
  @JSImport("survey-knockout", "settings.matrixTotalValuePostFix")
  @js.native
  def matrixTotalValuePostFix: String = js.native
  @scala.inline
  def matrixTotalValuePostFix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrixTotalValuePostFix")(x.asInstanceOf[js.Any])
  
  /**
    * Set this property to change the default value of the minWidth constraint
    */
  @JSImport("survey-knockout", "settings.maxWidth")
  @js.native
  def maxWidth: String = js.native
  @scala.inline
  def maxWidth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
  
  /**
    * This property tells how many times survey re-run expressions on value changes during condition running. We need it to avoid recursions in the expressions
    */
  @JSImport("survey-knockout", "settings.maximumConditionRunCountOnValueChanged")
  @js.native
  def maximumConditionRunCountOnValueChanged: Double = js.native
  @scala.inline
  def maximumConditionRunCountOnValueChanged_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maximumConditionRunCountOnValueChanged")(x.asInstanceOf[js.Any])
  
  /**
    * Set this property to change the default value of the minWidth constraint
    */
  @JSImport("survey-knockout", "settings.minWidth")
  @js.native
  def minWidth: String = js.native
  @scala.inline
  def minWidth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(x.asInstanceOf[js.Any])
  
  /**
    * Maximum panel count in dynamic panel
    */
  @JSImport("survey-knockout", "settings.panelMaximumPanelCount")
  @js.native
  def panelMaximumPanelCount: Double = js.native
  @scala.inline
  def panelMaximumPanelCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("panelMaximumPanelCount")(x.asInstanceOf[js.Any])
  
  /**
    * Maximum rate value count in rating question
    */
  @JSImport("survey-knockout", "settings.ratingMaximumRateValueCount")
  @js.native
  def ratingMaximumRateValueCount: Double = js.native
  @scala.inline
  def ratingMaximumRateValueCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ratingMaximumRateValueCount")(x.asInstanceOf[js.Any])
  
  /**
    * Set this property to change readOnlyCommentRenderMode: "textarea" (default) or (div)
    */
  @JSImport("survey-knockout", "settings.readOnlyCommentRenderMode")
  @js.native
  def readOnlyCommentRenderMode: String = js.native
  @scala.inline
  def readOnlyCommentRenderMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnlyCommentRenderMode")(x.asInstanceOf[js.Any])
  
  /**
    * Set to true to always serialize the localization string as object even if there is only one value for default locale. Instead of string "MyStr" serialize as {default: "MyStr"}
    */
  @JSImport("survey-knockout", "settings.serializeLocalizableStringAsObject")
  @js.native
  def serializeLocalizableStringAsObject: Boolean = js.native
  @scala.inline
  def serializeLocalizableStringAsObject_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serializeLocalizableStringAsObject")(x.asInstanceOf[js.Any])
  
  /**
    * By default visibleIndex for question with hideNumber = true is -1, and survey doesn't count these questions when set questions numbers.
    * Set it true, and a question next to a question with hidden title number will increase it's number.
    */
  @JSImport("survey-knockout", "settings.setQuestionVisibleIndexForHiddenNumber")
  @js.native
  def setQuestionVisibleIndexForHiddenNumber: Boolean = js.native
  @scala.inline
  def setQuestionVisibleIndexForHiddenNumber_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setQuestionVisibleIndexForHiddenNumber")(x.asInstanceOf[js.Any])
  
  /**
    * By default visibleIndex for question with titleLocation = "hidden" is -1, and survey doesn't count these questions when set questions numbers.
    * Set it true, and a question next to a question with hidden title will increase it's number.
    */
  @JSImport("survey-knockout", "settings.setQuestionVisibleIndexForHiddenTitle")
  @js.native
  def setQuestionVisibleIndexForHiddenTitle: Boolean = js.native
  @scala.inline
  def setQuestionVisibleIndexForHiddenTitle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setQuestionVisibleIndexForHiddenTitle")(x.asInstanceOf[js.Any])
  
  /**
    * SurveyJS web service API url
    */
  @JSImport("survey-knockout", "settings.surveyServiceUrl")
  @js.native
  def surveyServiceUrl: String = js.native
  @scala.inline
  def surveyServiceUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("surveyServiceUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Cache the result for choices getting from web services. Set this property to false, to disable the caching.
    */
  @JSImport("survey-knockout", "settings.useCachingForChoicesRestfull")
  @js.native
  def useCachingForChoicesRestfull: Boolean = js.native
  @scala.inline
  def useCachingForChoicesRestfull_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useCachingForChoicesRestfull")(x.asInstanceOf[js.Any])
  
  /**
    * Encode parameter on calling restfull web API
    */
  @JSImport("survey-knockout", "settings.webserviceEncodeParameters")
  @js.native
  def webserviceEncodeParameters: Boolean = js.native
  @scala.inline
  def webserviceEncodeParameters_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webserviceEncodeParameters")(x.asInstanceOf[js.Any])
}
