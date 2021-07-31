package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ComponentQuestionJSON")
@js.native
class ComponentQuestionJSON protected () extends StObject {
  def this(name: String, json: js.Any) = this()
  
  val isComposite: Boolean = js.native
  
  var json: js.Any = js.native
  
  var name: String = js.native
  
  def onAfterRender(question: Question, htmlElement: js.Any): Unit = js.native
  
  def onAfterRenderContentElement(question: Question, element: Question, htmlElement: js.Any): Unit = js.native
  
  def onCreated(question: Question): Unit = js.native
  
  def onInit(): Unit = js.native
  
  def onItemValuePropertyChanged(question: Question, item: ItemValue, propertyName: String, name: String, newValue: js.Any): Unit = js.native
  
  def onLoaded(question: Question): Unit = js.native
  
  def onPropertyChanged(question: Question, propertyName: String, newValue: js.Any): Unit = js.native
}
