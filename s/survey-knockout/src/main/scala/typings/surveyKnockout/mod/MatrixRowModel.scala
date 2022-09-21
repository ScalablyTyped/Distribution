package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "MatrixRowModel")
@js.native
open class MatrixRowModel protected () extends Base {
  def this(item: ItemValue, fullName: String, data: IMatrixData, value: Any) = this()
  
  var cellClick: Any = js.native
  
  var data: IMatrixData = js.native
  
  var fullName: String = js.native
  
  var item: ItemValue = js.native
  
  def locText: LocalizableString = js.native
  
  def name: String = js.native
  
  def rowClasses: String = js.native
  
  def text: String = js.native
  
  def value: Any = js.native
  def value_=(`val`: Any): Unit = js.native
}
