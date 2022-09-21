package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "StringEditorViewModel")
@js.native
open class StringEditorViewModel protected () extends StObject {
  def this(locString: Any) = this()
  
  def dispose(): Unit = js.native
  
  def editValue: Any = js.native
  def editValue_=(`val`: Any): Unit = js.native
  
  def koHasHtml: Any = js.native
  
  var locString: Any = js.native
  
  def onClick(sender: StringEditorViewModel, event: Any): Unit = js.native
  
  def onInput(sender: StringEditorViewModel, event: Any): Unit = js.native
}
