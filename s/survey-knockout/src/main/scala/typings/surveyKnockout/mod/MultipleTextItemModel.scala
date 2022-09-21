package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "MultipleTextItemModel")
@js.native
open class MultipleTextItemModel ()
  extends Base
     with IValidatorOwner
     with ISurveyData
     with ISurveyImpl {
  def this(name: Any) = this()
  def this(name: Any, title: String) = this()
  def this(name: Unit, title: String) = this()
  
  /* protected */ def createEditor(name: String): QuestionTextModel = js.native
  
  var data: IMultipleTextData = js.native
  
  def editor: QuestionTextModel = js.native
  
  var editorValue: QuestionTextModel = js.native
  
  /*
    * Returns the text or html for rendering the title.
    */
  def fullTitle: String = js.native
  
  /* InferMemberOverrides */
  override def getDataFilteredProperties(): Any = js.native
  
  /* InferMemberOverrides */
  override def getDataFilteredValues(): Any = js.native
  
  def getMaxLength(): Any = js.native
  
  def getOriginalObj(): Base = js.native
  
  /* InferMemberOverrides */
  override def getSurvey(): ISurvey = js.native
  
  /* CompleteClass */
  override def getSurveyData(): ISurveyData = js.native
  
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
  
  /* CompleteClass */
  override def getValidatorTitle(): String = js.native
  
  /* CompleteClass */
  override def getValidators(): js.Array[SurveyValidator] = js.native
  
  def id: String = js.native
  
  /*
    * Use this property to change the default input type.
    */
  def inputType: String = js.native
  def inputType_=(`val`: String): Unit = js.native
  
  def isEmpty(): Boolean = js.native
  
  /*
    * Set this property to true, to make the item a required. If a user doesn't fill the item then a validation error will be generated.
    */
  def isRequired: Boolean = js.native
  def isRequired_=(`val`: Boolean): Unit = js.native
  
  def locPlaceHolder: LocalizableString = js.native
  
  def locPlaceholder: LocalizableString = js.native
  
  def locRequiredErrorText: LocalizableString = js.native
  
  def locTitle: LocalizableString = js.native
  
  /*
    * The maximum text length. If it is -1, defaul value, then the survey maxTextLength property will be used.
    * If it is 0, then the value is unlimited
    */
  def maxLength: Double = js.native
  def maxLength_=(`val`: Double): Unit = js.native
  
  /*
    * The item name.
    */
  def name: String = js.native
  def name_=(`val`: String): Unit = js.native
  
  def onValueChanged(newValue: Any): Unit = js.native
  
  def placeHolder: String = js.native
  def placeHolder_=(`val`: String): Unit = js.native
  
  /*
    * The input place holder.
    */
  def placeholder: String = js.native
  def placeholder_=(`val`: String): Unit = js.native
  
  def question: Question = js.native
  
  /*
    * The custom text that will be shown on required error. Use this property, if you do not want to show the default text.
    */
  def requiredErrorText: String = js.native
  def requiredErrorText_=(`val`: String): Unit = js.native
  
  def setComment(name: String, newValue: String): Unit = js.native
  
  def setData(data: IMultipleTextData): Unit = js.native
  
  def setValue(name: String, value: Any): Unit = js.native
  
  /*
    * The input size.
    */
  def size: Double = js.native
  def size_=(`val`: Double): Unit = js.native
  
  /*
    * Item title. If it is empty, the item name is rendered as title. This property supports markdown.
    */
  def title: String = js.native
  def title_=(`val`: String): Unit = js.native
  
  /* CompleteClass */
  var validatedValue: Any = js.native
  @JSName("validatedValue")
  def validatedValue_MMultipleTextItemModel: Any = js.native
  
  /*
    * The list of question validators.
    */
  def validators: Any = js.native
  def validators_=(`val`: Any): Unit = js.native
  
  /*
    * The item value.
    */
  def value: Any = js.native
  
  def valueChangedCallback(newValue: Any): Unit = js.native
  
  def value_=(`val`: Any): Unit = js.native
}
