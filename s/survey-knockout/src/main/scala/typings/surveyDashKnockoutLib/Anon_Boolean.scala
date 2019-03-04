package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Boolean extends js.Object {
  var boolean: Anon_CellQuestion
  var checkbox: Anon_CellQuestion
  var comment: Anon_CellQuestion
  var dropdown: Anon_CellQuestion
  var expression: Anon_CellQuestion
  var radiogroup: Anon_CellQuestion
  var text: Anon_CellQuestion
}

object Anon_Boolean {
  @scala.inline
  def apply(
    boolean: Anon_CellQuestion,
    checkbox: Anon_CellQuestion,
    comment: Anon_CellQuestion,
    dropdown: Anon_CellQuestion,
    expression: Anon_CellQuestion,
    radiogroup: Anon_CellQuestion,
    text: Anon_CellQuestion
  ): Anon_Boolean = {
    val __obj = js.Dynamic.literal(boolean = boolean, checkbox = checkbox, comment = comment, dropdown = dropdown, expression = expression, radiogroup = radiogroup, text = text)
  
    __obj.asInstanceOf[Anon_Boolean]
  }
}

