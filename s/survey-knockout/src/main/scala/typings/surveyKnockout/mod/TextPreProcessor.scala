package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "TextPreProcessor")
@js.native
open class TextPreProcessor () extends StObject {
  
  var _unObservableValues: Any = js.native
  
  def hasAllValuesOnLastRun: Boolean = js.native
  
  def onProcess(textValue: TextPreProcessorValue): Unit = js.native
  
  def process(text: String): String = js.native
  def process(text: String, returnDisplayValue: Boolean): String = js.native
  def process(text: String, returnDisplayValue: Boolean, doEncoding: Boolean): String = js.native
  def process(text: String, returnDisplayValue: Unit, doEncoding: Boolean): String = js.native
  
  def processValue(name: String, returnDisplayValue: Boolean): TextPreProcessorValue = js.native
}
