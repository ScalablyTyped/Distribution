package typings.surveyDashKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellQuestion extends js.Object {
  var properties: js.Array[String]
  def onCellQuestionUpdate(cellQuestion: js.Any, column: js.Any, question: js.Any, data: js.Any): Unit
}

object Anon_CellQuestion {
  @scala.inline
  def apply(onCellQuestionUpdate: (js.Any, js.Any, js.Any, js.Any) => Unit, properties: js.Array[String]): Anon_CellQuestion = {
    val __obj = js.Dynamic.literal(onCellQuestionUpdate = js.Any.fromFunction4(onCellQuestionUpdate), properties = properties)
  
    __obj.asInstanceOf[Anon_CellQuestion]
  }
}

