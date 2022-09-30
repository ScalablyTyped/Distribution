package typings.surveyKnockout.mod

import typings.surveyKnockout.anon.CaseSensitive
import typings.surveyKnockout.anon.Checkbox
import typings.surveyKnockout.anon.DataList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settings {
  
  @JSImport("survey-knockout", "settings")
  @js.native
  val ^ : js.Any = js.native
  
  /*
    * Set to false to hide empty page description in design mode
    */
  @JSImport("survey-knockout", "settings.allowShowEmptyDescriptionInDesignMode")
  @js.native
  def allowShowEmptyDescriptionInDesignMode: Boolean = js.native
  inline def allowShowEmptyDescriptionInDesignMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowShowEmptyDescriptionInDesignMode")(x.asInstanceOf[js.Any])
  
  /*
    * Set to false to hide empty page title and description in design mode
    */
  @JSImport("survey-knockout", "settings.allowShowEmptyTitleInDesignMode")
  @js.native
  def allowShowEmptyTitleInDesignMode: Boolean = js.native
  inline def allowShowEmptyTitleInDesignMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowShowEmptyTitleInDesignMode")(x.asInstanceOf[js.Any])
  
  /*
    * Set this property to false to stop showing "Compete" button when the complete trigger is going to be executed.
    */
  @JSImport("survey-knockout", "settings.changeNavigationButtonsOnCompleteTrigger")
  @js.native
  def changeNavigationButtonsOnCompleteTrigger: Boolean = js.native
  inline def changeNavigationButtonsOnCompleteTrigger_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("changeNavigationButtonsOnCompleteTrigger")(x.asInstanceOf[js.Any])
  
  /*
    * The prefix that uses to store the question comment, as "questionName + commentPrefix".
    * The default value is "-Comment"
    */
  @JSImport("survey-knockout", "settings.commentPrefix")
  @js.native
  def commentPrefix: String = js.native
  inline def commentPrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("commentPrefix")(x.asInstanceOf[js.Any])
  
  /*
    * Options for SurveyJS comparator. By default we trim strings and compare them as case insensitive. To change the behavior you can use following code:
    * settings.comparator.trimStrings = false; //"abc " will not equal to "abc". They are equal by default.
    * settings.comparator.caseSensitive = true; //"abc " will not equal to "Abc". They are equal by default.
    */
  @JSImport("survey-knockout", "settings.comparator")
  @js.native
  def comparator: CaseSensitive = js.native
  inline def comparator_=(x: CaseSensitive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comparator")(x.asInstanceOf[js.Any])
  
  /*
    * Override this function, set your function, if you want to show your own dialog confirm window instead of standard browser window.
    */
  inline def confirmActionFunc(message: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("confirmActionFunc")(message.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /*
    * Specifies a list of custom icons.
    * Use this property to replace SurveyJS default icons (displayed in UI elements of SurveyJS Library or Creator) with your custom icons.
    * For every default icon to replace, add a key/value object with the default icon's name as a key and the name of your custom icon as a value.
    * For example: Survey.settings.customIcons["icon-redo"] = "my-own-redo-icon"
    */
  @JSImport("survey-knockout", "settings.customIcons")
  @js.native
  def customIcons: Any = js.native
  inline def customIcons_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customIcons")(x.asInstanceOf[js.Any])
  
  /*
    * default locale name for localizable strings that uses during serialization, {"default": "My text", "de": "Mein Text"}
    */
  @JSImport("survey-knockout", "settings.defaultLocaleName")
  @js.native
  def defaultLocaleName: String = js.native
  inline def defaultLocaleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocaleName")(x.asInstanceOf[js.Any])
  
  /*
    * Disable the question while choices are getting from the web service
    */
  @JSImport("survey-knockout", "settings.disableOnGettingChoicesFromWeb")
  @js.native
  def disableOnGettingChoicesFromWeb: Boolean = js.native
  inline def disableOnGettingChoicesFromWeb_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableOnGettingChoicesFromWeb")(x.asInstanceOf[js.Any])
  
  /*
    * Set this property to true to execute the complete trigger on value change instead of on next page.
    */
  @JSImport("survey-knockout", "settings.executeCompleteTriggerOnValueChanged")
  @js.native
  def executeCompleteTriggerOnValueChanged: Boolean = js.native
  inline def executeCompleteTriggerOnValueChanged_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("executeCompleteTriggerOnValueChanged")(x.asInstanceOf[js.Any])
  
  /*
    * Set this property to false to execute the skip trigger on next page instead of on value change.
    */
  @JSImport("survey-knockout", "settings.executeSkipTriggerOnValueChanged")
  @js.native
  def executeSkipTriggerOnValueChanged: Boolean = js.native
  inline def executeSkipTriggerOnValueChanged_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("executeSkipTriggerOnValueChanged")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "settings.expressionDisableConversionChar")
  @js.native
  def expressionDisableConversionChar: String = js.native
  inline def expressionDisableConversionChar_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expressionDisableConversionChar")(x.asInstanceOf[js.Any])
  
  /*
    * Set it to true to serialize itemvalue instance always as object even if text property is empty
    * const item = new Survey.ItemValue(5);
    * item.toJSON(); //will return {value: 5}, instead of 5 by default.
    */
  @JSImport("survey-knockout", "settings.itemValueAlwaysSerializeAsObject")
  @js.native
  def itemValueAlwaysSerializeAsObject: Boolean = js.native
  inline def itemValueAlwaysSerializeAsObject_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemValueAlwaysSerializeAsObject")(x.asInstanceOf[js.Any])
  
  /*
    * Set it to true to serialize itemvalue text property, even if it is empty or equals to value
    * const item = new Survey.ItemValue("item1");
    * item.toJSON(); //will return {value: item1, text: "item1"}, instead of "item1" by default.
    */
  @JSImport("survey-knockout", "settings.itemValueAlwaysSerializeText")
  @js.native
  def itemValueAlwaysSerializeText: Boolean = js.native
  inline def itemValueAlwaysSerializeText_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemValueAlwaysSerializeText")(x.asInstanceOf[js.Any])
  
  /*
    * separator that can allow to set value and text of ItemValue object in one string as: "value|text"
    */
  @JSImport("survey-knockout", "settings.itemValueSeparator")
  @js.native
  def itemValueSeparator: String = js.native
  inline def itemValueSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemValueSeparator")(x.asInstanceOf[js.Any])
  
  /*
    * By default all rows are rendered no matters whwther they are visible.
    * Set it true, and survey markup rows will be rendered only if they are visible in viewport.
    * This feature is experimantal and might do not support all the use cases.
    */
  @JSImport("survey-knockout", "settings.lazyRowsRendering")
  @js.native
  def lazyRowsRendering: Boolean = js.native
  
  @JSImport("survey-knockout", "settings.lazyRowsRenderingStartRow")
  @js.native
  def lazyRowsRenderingStartRow: Double = js.native
  inline def lazyRowsRenderingStartRow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lazyRowsRenderingStartRow")(x.asInstanceOf[js.Any])
  
  inline def lazyRowsRendering_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lazyRowsRendering")(x.asInstanceOf[js.Any])
  
  /*
    * Default cell type for dropdown and dynamic matrices
    */
  @JSImport("survey-knockout", "settings.matrixDefaultCellType")
  @js.native
  def matrixDefaultCellType: String = js.native
  inline def matrixDefaultCellType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrixDefaultCellType")(x.asInstanceOf[js.Any])
  
  /*
    * Default row name for matrix (single choice)
    */
  @JSImport("survey-knockout", "settings.matrixDefaultRowName")
  @js.native
  def matrixDefaultRowName: String = js.native
  inline def matrixDefaultRowName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrixDefaultRowName")(x.asInstanceOf[js.Any])
  
  /*
    * Maximum rowCount that returns in addConditionObjectsByContext function
    */
  @JSImport("survey-knockout", "settings.matrixMaxRowCountInCondition")
  @js.native
  def matrixMaxRowCountInCondition: Double = js.native
  inline def matrixMaxRowCountInCondition_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrixMaxRowCountInCondition")(x.asInstanceOf[js.Any])
  
  /*
    * Maximum row count in dynamic matrix
    */
  @JSImport("survey-knockout", "settings.matrixMaximumRowCount")
  @js.native
  def matrixMaximumRowCount: Double = js.native
  inline def matrixMaximumRowCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrixMaximumRowCount")(x.asInstanceOf[js.Any])
  
  /*
    * Set this property to false, to render matrix dynamic remove action as button.
    * It is rendered as icon in new themes ("defaultV2") by default.
    */
  @JSImport("survey-knockout", "settings.matrixRenderRemoveAsIcon")
  @js.native
  def matrixRenderRemoveAsIcon: Boolean = js.native
  inline def matrixRenderRemoveAsIcon_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrixRenderRemoveAsIcon")(x.asInstanceOf[js.Any])
  
  /*
    * Total value postfix for dropdown and dynamic matrices. The total value stores as: {matrixName} + {postfix}
    */
  @JSImport("survey-knockout", "settings.matrixTotalValuePostFix")
  @js.native
  def matrixTotalValuePostFix: String = js.native
  inline def matrixTotalValuePostFix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matrixTotalValuePostFix")(x.asInstanceOf[js.Any])
  
  /*
    * Set the value as string "yyyy-mm-dd". text questions with inputType "date" will not allow to set to survey date that greater than this value
    */
  @JSImport("survey-knockout", "settings.maxDate")
  @js.native
  def maxDate: String = js.native
  inline def maxDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(x.asInstanceOf[js.Any])
  
  /*
    * Set this property to change the default value of the maxWidth constraint
    */
  @JSImport("survey-knockout", "settings.maxWidth")
  @js.native
  def maxWidth: String = js.native
  inline def maxWidth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
  
  /*
    * This property tells how many times survey re-run expressions on value changes during condition running. We need it to avoid recursions in the expressions
    */
  @JSImport("survey-knockout", "settings.maximumConditionRunCountOnValueChanged")
  @js.native
  def maximumConditionRunCountOnValueChanged: Double = js.native
  inline def maximumConditionRunCountOnValueChanged_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maximumConditionRunCountOnValueChanged")(x.asInstanceOf[js.Any])
  
  /*
    * Set the value as string "yyyy-mm-dd". text questions with inputType "date" will not allow to set to survey date that less than this value
    */
  @JSImport("survey-knockout", "settings.minDate")
  @js.native
  def minDate: String = js.native
  inline def minDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minDate")(x.asInstanceOf[js.Any])
  
  /*
    * Set this property to change the default value of the minWidth constraint
    */
  @JSImport("survey-knockout", "settings.minWidth")
  @js.native
  def minWidth: String = js.native
  inline def minWidth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(x.asInstanceOf[js.Any])
  
  /*
    * Maximum panel count in dynamic panel
    */
  @JSImport("survey-knockout", "settings.panelMaximumPanelCount")
  @js.native
  def panelMaximumPanelCount: Double = js.native
  inline def panelMaximumPanelCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("panelMaximumPanelCount")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "settings.questions")
  @js.native
  def questions: DataList = js.native
  inline def questions_=(x: DataList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("questions")(x.asInstanceOf[js.Any])
  
  /*
    * Maximum rate value count in rating question
    */
  @JSImport("survey-knockout", "settings.ratingMaximumRateValueCount")
  @js.native
  def ratingMaximumRateValueCount: Double = js.native
  inline def ratingMaximumRateValueCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ratingMaximumRateValueCount")(x.asInstanceOf[js.Any])
  
  /*
    * Specifies how the input field of [Comment](https://surveyjs.io/Documentation/Library?id=questioncommentmodel) questions is rendered in the read-only mode.
    * Available values:
    * "textarea" (default) - A 'textarea' element is used to render a Comment question's input field.
    * "div" - A 'div' element is used to render a Comment question's input field.
    */
  @JSImport("survey-knockout", "settings.readOnlyCommentRenderMode")
  @js.native
  def readOnlyCommentRenderMode: String = js.native
  inline def readOnlyCommentRenderMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnlyCommentRenderMode")(x.asInstanceOf[js.Any])
  
  /*
    * Specifies how the input field of [Text](https://surveyjs.io/Documentation/Library?id=questiontextmodel) questions is rendered in the read-only mode.
    * Available values:
    * "input" (default) - An 'input' element is used to render a Text question's input field.
    * "div" - A 'div' element is used to render a Text question's input field.
    */
  @JSImport("survey-knockout", "settings.readOnlyTextRenderMode")
  @js.native
  def readOnlyTextRenderMode: String = js.native
  inline def readOnlyTextRenderMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnlyTextRenderMode")(x.asInstanceOf[js.Any])
  
  /*
    * Set to true to always serialize the localization string as object even if there is only one value for default locale. Instead of string "MyStr" serialize as {default: "MyStr"}
    */
  @JSImport("survey-knockout", "settings.serializeLocalizableStringAsObject")
  @js.native
  def serializeLocalizableStringAsObject: Boolean = js.native
  inline def serializeLocalizableStringAsObject_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serializeLocalizableStringAsObject")(x.asInstanceOf[js.Any])
  
  /*
    * By default visibleIndex for question with hideNumber = true is -1, and survey doesn't count these questions when set questions numbers.
    * Set it true, and a question next to a question with hidden title number will increase it's number.
    */
  @JSImport("survey-knockout", "settings.setQuestionVisibleIndexForHiddenNumber")
  @js.native
  def setQuestionVisibleIndexForHiddenNumber: Boolean = js.native
  inline def setQuestionVisibleIndexForHiddenNumber_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setQuestionVisibleIndexForHiddenNumber")(x.asInstanceOf[js.Any])
  
  /*
    * By default visibleIndex for question with titleLocation = "hidden" is -1, and survey doesn't count these questions when set questions numbers.
    * Set it true, and a question next to a question with hidden title will increase it's number.
    */
  @JSImport("survey-knockout", "settings.setQuestionVisibleIndexForHiddenTitle")
  @js.native
  def setQuestionVisibleIndexForHiddenTitle: Boolean = js.native
  inline def setQuestionVisibleIndexForHiddenTitle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setQuestionVisibleIndexForHiddenTitle")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "settings.showDefaultItemsInCreatorV2")
  @js.native
  def showDefaultItemsInCreatorV2: Boolean = js.native
  inline def showDefaultItemsInCreatorV2_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showDefaultItemsInCreatorV2")(x.asInstanceOf[js.Any])
  
  /*
    * By default checkbox and radiogroup items are ordered in rows.
    * Set it "column", and items will be ordered in columns.
    */
  @JSImport("survey-knockout", "settings.showItemsInOrder")
  @js.native
  def showItemsInOrder: String = js.native
  inline def showItemsInOrder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showItemsInOrder")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "settings.showModal")
  @js.native
  def showModal: Any = js.native
  inline def showModal_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showModal")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "settings.supportCreatorV2")
  @js.native
  def supportCreatorV2: Boolean = js.native
  inline def supportCreatorV2_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportCreatorV2")(x.asInstanceOf[js.Any])
  
  /*
    * Supported validators by question types. You can modify this variable to add validators for new question types or add/remove for existing question types.
    */
  @JSImport("survey-knockout", "settings.supportedValidators")
  @js.native
  def supportedValidators: Checkbox = js.native
  inline def supportedValidators_=(x: Checkbox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedValidators")(x.asInstanceOf[js.Any])
  
  /*
    * SurveyJS web service API url
    */
  @JSImport("survey-knockout", "settings.surveyServiceUrl")
  @js.native
  def surveyServiceUrl: String = js.native
  inline def surveyServiceUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("surveyServiceUrl")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "settings.titleTags")
  @js.native
  def titleTags: typings.surveyKnockout.anon.Page = js.native
  inline def titleTags_=(x: typings.surveyKnockout.anon.Page): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleTags")(x.asInstanceOf[js.Any])
  
  /*
    * Cache the result for choices getting from web services. Set this property to false, to disable the caching.
    */
  @JSImport("survey-knockout", "settings.useCachingForChoicesRestful")
  @js.native
  def useCachingForChoicesRestful: Boolean = js.native
  inline def useCachingForChoicesRestful_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useCachingForChoicesRestful")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "settings.useCachingForChoicesRestfull")
  @js.native
  def useCachingForChoicesRestfull: Boolean = js.native
  inline def useCachingForChoicesRestfull_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useCachingForChoicesRestfull")(x.asInstanceOf[js.Any])
  
  /*
    * Set this value to false, if you want to have UTC fuctions, for example setUTCHours inside our functions, like today.
    * By default it uses setHours function, with local date
    */
  @JSImport("survey-knockout", "settings.useLocalTimeZone")
  @js.native
  def useLocalTimeZone: Boolean = js.native
  inline def useLocalTimeZone_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useLocalTimeZone")(x.asInstanceOf[js.Any])
  
  /*
    * Encode parameter on calling restful web API
    */
  @JSImport("survey-knockout", "settings.webserviceEncodeParameters")
  @js.native
  def webserviceEncodeParameters: Boolean = js.native
  inline def webserviceEncodeParameters_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webserviceEncodeParameters")(x.asInstanceOf[js.Any])
}
