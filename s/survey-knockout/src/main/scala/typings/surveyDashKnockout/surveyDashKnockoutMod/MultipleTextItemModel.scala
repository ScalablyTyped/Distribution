package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "MultipleTextItemModel")
@js.native
class MultipleTextItemModel ()
  extends Base
     with IValidatorOwner
     with ISurveyData
     with ISurveyImpl {
  def this(name: js.Any) = this()
  def this(name: js.Any, title: String) = this()
  val editor: QuestionTextModel = js.native
  /**
    * Returns the text or html for rendering the title.
    */
  val fullTitle: String = js.native
  val id: String = js.native
  /**
    * Use this property to change the default input type.
    */
  var inputType: String = js.native
  /**
    * Set this property to true, to make the item a required. If a user doesn't fill the item then a validation error will be generated.
    */
  var isRequired: Boolean = js.native
  val locPlaceHolder: LocalizableString = js.native
  val locRequiredErrorText: LocalizableString = js.native
  val locTitle: LocalizableString = js.native
  /**
    * The maximim text length. If it is -1, defaul value, then the survey maxTextLength property will be used.
    * If it is 0, then the value is unlimited
    * @see SurveyModel.maxTextLength
    */
  var maxLength: Double = js.native
  /**
    * The item name.
    */
  var name: String = js.native
  /**
    * The input place holder.
    */
  var placeHolder: String = js.native
  /**
    * The custom text that will be shown on required error. Use this property, if you do not want to show the default text.
    */
  var requiredErrorText: String = js.native
  /**
    * Item title. If it is empty, the item name is rendered as title. This property supports markdown.
    * @see name
    */
  var title: String = js.native
  /* CompleteClass */
  override var validatedValue: js.Any = js.native
  /* CompleteClass */
  override var validators: js.Array[SurveyValidator] = js.native
  /**
    * The item value.
    */
  var value: js.Any = js.native
  /* protected */ def createEditor(name: String): QuestionTextModel = js.native
  /* CompleteClass */
  override def geSurveyData(): ISurveyData = js.native
  /* CompleteClass */
  override def getAllValues(): js.Any = js.native
  /* CompleteClass */
  override def getComment(name: String): String = js.native
  /* CompleteClass */
  override def getDataFilteredProperties(): js.Any = js.native
  /* CompleteClass */
  override def getDataFilteredValues(): js.Any = js.native
  /* CompleteClass */
  override def getFilteredProperties(): js.Any = js.native
  /* CompleteClass */
  override def getFilteredValues(): js.Any = js.native
  def getMaxLength(): js.Any = js.native
  /* CompleteClass */
  override def getSurvey(): ISurvey = js.native
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
  /* CompleteClass */
  override def getValidatorTitle(): String = js.native
  /* CompleteClass */
  override def getValue(name: String): js.Any = js.native
  def isEmpty(): Boolean = js.native
  def onValueChanged(newValue: js.Any): Unit = js.native
  /* CompleteClass */
  override def setComment(name: String, newValue: String): js.Any = js.native
  def setData(data: IMultipleTextData): Unit = js.native
  /* CompleteClass */
  override def setValue(name: String, newValue: js.Any, locNotification: Boolean): js.Any = js.native
  def setValue(name: String, value: js.Any): Unit = js.native
  def valueChangedCallback(newValue: js.Any): Unit = js.native
}

