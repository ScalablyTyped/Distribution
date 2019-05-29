package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

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
  def this(name: js.Any, title: java.lang.String) = this()
  val editor: QuestionTextModel = js.native
  /**
    * Returns the text or html for rendering the title.
    */
  val fullTitle: java.lang.String = js.native
  val id: java.lang.String = js.native
  /**
    * Use this property to change the default input type.
    */
  var inputType: java.lang.String = js.native
  /**
    * Set this property to true, to make the item a required. If a user doesn't fill the item then a validation error will be generated.
    */
  var isRequired: scala.Boolean = js.native
  val locPlaceHolder: LocalizableString = js.native
  val locRequiredErrorText: LocalizableString = js.native
  val locTitle: LocalizableString = js.native
  /**
    * The maximim text length. If it is -1, defaul value, then the survey maxTextLength property will be used.
    * If it is 0, then the value is unlimited
    * @see SurveyModel.maxTextLength
    */
  var maxLength: scala.Double = js.native
  /**
    * The item name.
    */
  var name: java.lang.String = js.native
  /**
    * The input place holder.
    */
  var placeHolder: java.lang.String = js.native
  /**
    * The custom text that will be shown on required error. Use this property, if you do not want to show the default text.
    */
  var requiredErrorText: java.lang.String = js.native
  /**
    * Item title. If it is empty, the item name is rendered as title. This property supports markdown.
    * @see name
    */
  var title: java.lang.String = js.native
  /* CompleteClass */
  override var validatedValue: js.Any = js.native
  /* CompleteClass */
  override var validators: js.Array[SurveyValidator] = js.native
  /**
    * The item value.
    */
  var value: js.Any = js.native
  /* protected */ def createEditor(name: java.lang.String): QuestionTextModel = js.native
  /* CompleteClass */
  override def geSurveyData(): ISurveyData = js.native
  /* CompleteClass */
  override def getAllValues(): js.Any = js.native
  /* CompleteClass */
  override def getComment(name: java.lang.String): java.lang.String = js.native
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
  override def getValidatorTitle(): java.lang.String = js.native
  /* CompleteClass */
  override def getValue(name: java.lang.String): js.Any = js.native
  def isEmpty(): scala.Boolean = js.native
  def onValueChanged(newValue: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def setComment(name: java.lang.String, newValue: java.lang.String): js.Any = js.native
  def setData(data: IMultipleTextData): scala.Unit = js.native
  /* CompleteClass */
  override def setValue(name: java.lang.String, newValue: js.Any): js.Any = js.native
  def valueChangedCallback(newValue: js.Any): scala.Unit = js.native
}

