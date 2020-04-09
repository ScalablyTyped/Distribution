package typings.surveyKnockout.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionSignaturePadModel")
@js.native
class QuestionSignaturePadModel protected () extends Question {
  def this(name: String) = this()
  /**
    * Use it to clear content of the signature pad.
    */
  var allowClear: Boolean = js.native
  /**
    * The clear signature button caption.
    */
  val clearButtonCaption: String = js.native
  /**
    * Use it to set the specific height for the signature pad.
    */
  var height: String = js.native
  /**
    * Use it to set pen color for the signature pad.
    */
  var penColor: String = js.native
  def destroySignaturePad(el: HTMLElement): Unit = js.native
  def initSignaturePad(el: HTMLElement): Unit = js.native
}

