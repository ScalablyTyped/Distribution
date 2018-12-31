package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "TextPreProcessor")
@js.native
class TextPreProcessor () extends js.Object {
  val hasAllValuesOnLastRun: scala.Boolean = js.native
  def onProcess(textValue: TextPreProcessorValue): scala.Unit = js.native
  def process(text: java.lang.String): java.lang.String = js.native
  def process(text: java.lang.String, returnDisplayValue: scala.Boolean): java.lang.String = js.native
  def process(text: java.lang.String, returnDisplayValue: scala.Boolean, doEncoding: scala.Boolean): java.lang.String = js.native
}

