package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ComponentQuestionJSON")
@js.native
open class ComponentQuestionJSON protected () extends StObject {
  def this(name: String, json: ICustomQuestionTypeConfiguration) = this()
  
  def getDisplayValue(keyAsText: Boolean, value: Any, question: Question): Any = js.native
  
  def isComposite: Boolean = js.native
  
  var json: ICustomQuestionTypeConfiguration = js.native
  
  var name: String = js.native
  
  def onAfterRender(question: Question, htmlElement: Any): Unit = js.native
  
  def onAfterRenderContentElement(question: Question, element: Question, htmlElement: Any): Unit = js.native
  
  def onCreated(question: Question): Unit = js.native
  
  def onInit(): Unit = js.native
  
  def onItemValuePropertyChanged(question: Question, item: ItemValue, propertyName: String, name: String, newValue: Any): Unit = js.native
  
  def onLoaded(question: Question): Unit = js.native
  
  def onPropertyChanged(question: Question, propertyName: String, newValue: Any): Unit = js.native
  
  def onValueChanged(question: Question, name: String, newValue: Any): Unit = js.native
}
