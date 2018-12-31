package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "CustomWidgetCollection")
@js.native
class CustomWidgetCollection () extends js.Object {
  var onCustomWidgetAdded: Event[js.Function1[/* customWidget */ QuestionCustomWidget, _], _] = js.native
  val widgets: js.Array[QuestionCustomWidget] = js.native
  def addCustomWidget(widgetJson: js.Any): scala.Unit = js.native
  def addCustomWidget(widgetJson: js.Any, activatedBy: java.lang.String): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  /**
    * Returns the way the custom wiget is activated. It can be activated by a property ("property"), question type ("type") or by new/custom question type ("customtype").
    * @param widgetName the custom widget name
    * @see setActivatedBy
    */
  def getActivatedBy(widgetName: java.lang.String): js.Any = js.native
  def getCustomWidget(question: IQuestion): QuestionCustomWidget = js.native
  def getCustomWidgetByName(name: java.lang.String): QuestionCustomWidget = js.native
  /**
    * Sets the way the custom wiget is activated. The activation types are: property ("property"), question type ("type") or new/custom question type ("customtype"). A custom wiget may support all or only some of this activation types.
    * @param widgetName
    * @param activatedBy there are three possible variants: "property", "type" and "customtype"
    */
  def setActivatedBy(widgetName: java.lang.String, activatedBy: java.lang.String): scala.Unit = js.native
}

@JSImport("survey-knockout", "CustomWidgetCollection")
@js.native
object CustomWidgetCollection extends js.Object {
  var Instance: surveyDashKnockoutLib.surveyDashKnockoutMod.CustomWidgetCollection = js.native
}

