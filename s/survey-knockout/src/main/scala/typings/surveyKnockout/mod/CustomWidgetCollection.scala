package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "CustomWidgetCollection")
@js.native
class CustomWidgetCollection () extends js.Object {
  
  def add(widgetJson: js.Any): Unit = js.native
  def add(widgetJson: js.Any, activatedBy: String): Unit = js.native
  
  def addCustomWidget(widgetJson: js.Any): Unit = js.native
  def addCustomWidget(widgetJson: js.Any, activatedBy: String): Unit = js.native
  
  def clear(): Unit = js.native
  
  /**
    * Returns the way the custom wiget is activated. It can be activated by a property ("property"), question type ("type") or by new/custom question type ("customtype").
    * @param widgetName the custom widget name
    * @see setActivatedBy
    */
  def getActivatedBy(widgetName: String): String = js.native
  
  def getCustomWidget(question: IQuestion): QuestionCustomWidget = js.native
  
  def getCustomWidgetByName(name: String): QuestionCustomWidget = js.native
  
  var onCustomWidgetAdded: Event[js.Function1[/* customWidget */ QuestionCustomWidget, _], _] = js.native
  
  /**
    * Sets the way the custom wiget is activated. The activation types are: property ("property"), question type ("type") or new/custom question type ("customtype"). A custom wiget may support all or only some of this activation types.
    * @param widgetName
    * @param activatedBy there are three possible variants: "property", "type" and "customtype"
    */
  def setActivatedBy(widgetName: String, activatedBy: String): Unit = js.native
  
  val widgets: js.Array[QuestionCustomWidget] = js.native
}
/* static members */
@JSImport("survey-knockout", "CustomWidgetCollection")
@js.native
object CustomWidgetCollection extends js.Object {
  
  var Instance: CustomWidgetCollection = js.native
}
