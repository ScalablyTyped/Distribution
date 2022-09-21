package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "DragDropChoices")
@js.native
open class DragDropChoices () extends DragDropCore[QuestionSelectBase] {
  def this(surveyValue: ISurvey) = this()
  def this(surveyValue: Unit, creator: Any) = this()
  def this(surveyValue: ISurvey, creator: Any) = this()
  def this(surveyValue: Unit, creator: Any, longTap: Boolean) = this()
  def this(surveyValue: Unit, creator: Unit, longTap: Boolean) = this()
  def this(surveyValue: ISurvey, creator: Any, longTap: Boolean) = this()
  def this(surveyValue: ISurvey, creator: Unit, longTap: Boolean) = this()
  
  /* protected */ @JSName("doDragOver")
  var doDragOver_FDragDropChoices: Any = js.native
  
  /* protected */ def isDropTargetValid(dropTarget: ItemValue): Boolean = js.native
}
