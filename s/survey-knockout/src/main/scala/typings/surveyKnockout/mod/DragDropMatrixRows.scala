package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "DragDropMatrixRows")
@js.native
open class DragDropMatrixRows () extends DragDropCore[QuestionMatrixDynamicModel] {
  def this(surveyValue: ISurvey) = this()
  def this(surveyValue: Unit, creator: Any) = this()
  def this(surveyValue: ISurvey, creator: Any) = this()
  def this(surveyValue: Unit, creator: Any, longTap: Boolean) = this()
  def this(surveyValue: Unit, creator: Unit, longTap: Boolean) = this()
  def this(surveyValue: ISurvey, creator: Any, longTap: Boolean) = this()
  def this(surveyValue: ISurvey, creator: Unit, longTap: Boolean) = this()
  
  /* protected */ @JSName("doDrop")
  var doDrop_FDragDropMatrixRows: Any = js.native
  
  var fromIndex: Double = js.native
  
  /* protected */ def getDropTargetByDataAttributeValue(dataAttributeValue: Any): MatrixDropdownRowModelBase = js.native
  
  var toIndex: Double = js.native
}
