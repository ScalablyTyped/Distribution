package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyElementCore")
@js.native
open class SurveyElementCore ()
  extends Base
     with ILocalizableOwner {
  
  def ariaLabel: String = js.native
  
  def ariaTitleId: String = js.native
  
  /* protected */ def createLocTitleProperty(): LocalizableString = js.native
  
  def cssClasses: Any = js.native
  
  def cssTitle: String = js.native
  
  /*
    * Explanatory text displayed under the title.
    */
  def description: String = js.native
  def description_=(`val`: String): Unit = js.native
  
  /* protected */ def getDefaultTitleTagName(): String = js.native
  
  /* protected */ def getDefaultTitleValue(): String = js.native
  
  /* protected */ def getIsTitleRenderedAsString(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String, name: String): String = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  /* CompleteClass */
  override def getRenderer(name: String): String = js.native
  
  /* CompleteClass */
  override def getRendererContext(locStr: LocalizableString): Any = js.native
  
  def getTitleOwner(): ITitleOwner = js.native
  
  def getTitleToolbar(): AdaptiveActionContainer[Action] = js.native
  
  /*
    * Returns `true` if the survey element has a description.
    */
  var hasDescription: Boolean = js.native
  
  def hasTitle: Boolean = js.native
  
  def hasTitleActions: Boolean = js.native
  
  def hasTitleEvents: Boolean = js.native
  
  def isTitleOwner: Boolean = js.native
  
  def isTitleRenderedAsString: Boolean = js.native
  
  def locDescription: LocalizableString = js.native
  
  def locTitle: LocalizableString = js.native
  
  /*
    * A title for the survey element. If `title` is undefined, the `name` property value is displayed instead.
    * 
    * Empty pages and panels do not display their titles or names.
    */
  def title: String = js.native
  
  def titleAriaExpanded: Boolean = js.native
  
  def titleAriaLabel: String = js.native
  
  def titleTabIndex: Double = js.native
  
  def titleTagName: String = js.native
  
  def title_=(`val`: String): Unit = js.native
  
  def toggleState(): Boolean = js.native
  
  def updateDescriptionVisibility(newDescription: Any): Unit = js.native
}
