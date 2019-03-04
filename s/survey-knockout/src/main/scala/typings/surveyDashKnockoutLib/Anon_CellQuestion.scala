package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellQuestion extends js.Object {
  var properties: js.Array[java.lang.String]
  def onCellQuestionUpdate(cellQuestion: js.Any, column: js.Any, question: js.Any, data: js.Any): scala.Unit
}

object Anon_CellQuestion {
  @scala.inline
  def apply(
    onCellQuestionUpdate: js.Function4[js.Any, js.Any, js.Any, js.Any, scala.Unit],
    properties: js.Array[java.lang.String]
  ): Anon_CellQuestion = {
    val __obj = js.Dynamic.literal(onCellQuestionUpdate = onCellQuestionUpdate, properties = properties)
  
    __obj.asInstanceOf[Anon_CellQuestion]
  }
}

