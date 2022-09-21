package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "MatrixDynamicRowModel")
@js.native
open class MatrixDynamicRowModel protected ()
  extends MatrixDropdownRowModelBase
     with IShortcutText {
  def this(index: Double, data: IMatrixDropdownData, value: Any) = this()
  
  var dragOrClickHelper: DragOrClickHelper = js.native
  
  var index: Double = js.native
  
  /* CompleteClass */
  var shortcutText: String = js.native
  @JSName("shortcutText")
  def shortcutText_MMatrixDynamicRowModel: String = js.native
}
