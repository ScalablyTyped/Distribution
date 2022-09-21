package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "CustomWidgetCollection")
@js.native
open class CustomWidgetCollection () extends StObject {
  
  def add(widgetJson: Any): Unit = js.native
  def add(widgetJson: Any, activatedBy: String): Unit = js.native
  
  def addCustomWidget(widgetJson: Any): QuestionCustomWidget = js.native
  def addCustomWidget(widgetJson: Any, activatedBy: String): QuestionCustomWidget = js.native
  
  def clear(): Unit = js.native
  
  /*
    * Returns the way the custom wiget is activated. It can be activated by a property ("property"), question type ("type") or by new/custom question type ("customtype").
    */
  def getActivatedBy(widgetName: String): String = js.native
  
  def getCustomWidget(question: IQuestion): QuestionCustomWidget = js.native
  
  def getCustomWidgetByName(name: String): QuestionCustomWidget = js.native
  
  var onCustomWidgetAdded: Event[js.Function1[/* customWidget */ QuestionCustomWidget, Any], Any] = js.native
  
  /*
    * Sets the way the custom wiget is activated. The activation types are: property ("property"), question type ("type") or new/custom question type ("customtype"). A custom wiget may support all or only some of this activation types.
    */
  def setActivatedBy(widgetName: String, activatedBy: String): Unit = js.native
  
  def widgets: Any = js.native
  
  var widgetsActivatedBy: Any = js.native
  
  var widgetsValues: Any = js.native
}
/* static members */
object CustomWidgetCollection {
  
  @JSImport("survey-knockout", "CustomWidgetCollection")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "CustomWidgetCollection.Instance")
  @js.native
  def Instance: CustomWidgetCollection = js.native
  inline def Instance_=(x: CustomWidgetCollection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instance")(x.asInstanceOf[js.Any])
}
