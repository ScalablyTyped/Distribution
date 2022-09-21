package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ButtonGroupItemModel")
@js.native
open class ButtonGroupItemModel protected () extends StObject {
  def this(question: QuestionButtonGroupModel, item: ItemValue, index: Double) = this()
  
  def caption: LocalizableString = js.native
  
  def css: Any = js.native
  
  def describedBy: String = js.native
  
  def hasErrors: Boolean = js.native
  
  def iconName: Any = js.native
  
  def iconSize: Any = js.native
  
  def id: String = js.native
  
  var index: Double = js.native
  
  def isRequired: Boolean = js.native
  
  var item: ItemValue = js.native
  
  def name: String = js.native
  
  def onChange(): Unit = js.native
  
  var question: QuestionButtonGroupModel = js.native
  
  def readOnly: Boolean = js.native
  
  def selected: Boolean = js.native
  
  def showCaption: Any = js.native
  
  def value: Any = js.native
}
