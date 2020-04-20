package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnCellQuestionUpdate extends js.Object {
  var properties: js.Array[String]
  def onCellQuestionUpdate(cellQuestion: js.Any, column: js.Any, question: js.Any, data: js.Any): Unit
}

object AnonOnCellQuestionUpdate {
  @scala.inline
  def apply(onCellQuestionUpdate: (js.Any, js.Any, js.Any, js.Any) => Unit, properties: js.Array[String]): AnonOnCellQuestionUpdate = {
    val __obj = js.Dynamic.literal(onCellQuestionUpdate = js.Any.fromFunction4(onCellQuestionUpdate), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnCellQuestionUpdate]
  }
}

