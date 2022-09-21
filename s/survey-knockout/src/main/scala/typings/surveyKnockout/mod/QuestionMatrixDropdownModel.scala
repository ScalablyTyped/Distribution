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
    * Set this property to true to hide the question if there is no visible rows in the matrix.
    */
  def hideIfRowsEmpty: Boolean = js.native
  def hideIfRowsEmpty_=(`val`: Boolean): Unit = js.native
  
  def locTotalText: LocalizableString = js.native
  
  /*
    * The column width for the first column, row title column.
    */
  def rowTitleWidth: String = js.native
  def rowTitleWidth_=(`val`: String): Unit = js.native
  
  /*
    * Set this property to show it on the first column for the total row.
    */
  def totalText: String = js.native
  def totalText_=(`val`: String): Unit = js.native
}
