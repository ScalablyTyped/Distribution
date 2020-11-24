package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixDropdownModel")
@js.native
class QuestionMatrixDropdownModel protected () extends QuestionMatrixDropdownModelBase {
  def this(name: String) = this()
  
  /* protected */ def createMatrixRow(item: ItemValue, value: js.Any): MatrixDropdownRowModel = js.native
  
  val locTotalText: LocalizableString = js.native
  
  /**
    * The column width for the first column, row title column.
    */
  var rowTitleWidth: String = js.native
  
  /**
    * Set this property to show it on the first column for the total row.
    */
  var totalText: String = js.native
}
