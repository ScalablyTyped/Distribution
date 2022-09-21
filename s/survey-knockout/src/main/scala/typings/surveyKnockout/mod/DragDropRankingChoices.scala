package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "DragDropRankingChoices")
@js.native
open class DragDropRankingChoices () extends DragDropChoices {
  def this(surveyValue: ISurvey) = this()
  def this(surveyValue: Unit, creator: Any) = this()
  def this(surveyValue: ISurvey, creator: Any) = this()
  def this(surveyValue: Unit, creator: Any, longTap: Boolean) = this()
  def this(surveyValue: Unit, creator: Unit, longTap: Boolean) = this()
  def this(surveyValue: ISurvey, creator: Any, longTap: Boolean) = this()
  def this(surveyValue: ISurvey, creator: Unit, longTap: Boolean) = this()
  
  /* protected */ @JSName("doClear")
  var doClear_FDragDropRankingChoices: Any = js.native
  
  /* protected */ @JSName("doDragOver")
  var doDragOver_FDragDropRankingChoices: Any = js.native
  
  /* protected */ @JSName("doDrop")
  var doDrop_FDragDropRankingChoices: Any = js.native
  
  var isDragOverRootNode: Boolean = js.native
  
  /* protected */ def isDropTargetValid(dropTarget: ItemValue, dropTargetNode: Any): Boolean = js.native
}
