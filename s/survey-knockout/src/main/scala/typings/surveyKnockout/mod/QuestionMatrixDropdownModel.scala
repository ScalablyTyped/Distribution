package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixDropdownModel")
@js.native
open class QuestionMatrixDropdownModel protected () extends QuestionMatrixDropdownModelBase {
  def this(name: String) = this()
  
  /* protected */ def createMatrixRow(item: ItemValue, value: Any): MatrixDropdownRowModel = js.native
  
  /*
    * Specifies whether to hide the question when the matrix has no visible rows.
    */
  def hideIfRowsEmpty: Boolean = js.native
  def hideIfRowsEmpty_=(`val`: Boolean): Unit = js.native
  
  def locTotalText: LocalizableString = js.native
  
  /*
    * A width for the column that displays row titles (first column). Accepts CSS values.
    */
  def rowTitleWidth: String = js.native
  def rowTitleWidth_=(`val`: String): Unit = js.native
  
  /*
    * A title for the total row. Applies if at least one column displays total values.
    */
  def totalText: String = js.native
  def totalText_=(`val`: String): Unit = js.native
}
