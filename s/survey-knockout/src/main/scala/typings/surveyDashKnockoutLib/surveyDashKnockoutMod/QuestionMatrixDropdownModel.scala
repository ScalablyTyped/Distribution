package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionMatrixDropdownModel")
@js.native
class QuestionMatrixDropdownModel protected () extends QuestionMatrixDropdownModelBase {
  def this(name: java.lang.String) = this()
  val locTotalText: LocalizableString = js.native
  /**
    * Set this property to show it on the first column for the total row.
    */
  var totalText: java.lang.String = js.native
  /* protected */ def createMatrixRow(item: ItemValue, value: js.Any): MatrixDropdownRowModel = js.native
}

