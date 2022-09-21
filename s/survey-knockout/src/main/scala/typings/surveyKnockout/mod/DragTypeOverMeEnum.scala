package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DragTypeOverMeEnum extends StObject
@JSImport("survey-knockout", "DragTypeOverMeEnum")
@js.native
object DragTypeOverMeEnum extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DragTypeOverMeEnum & Double] = js.native
  
  @js.native
  sealed trait InsideEmptyPanel
    extends StObject
       with DragTypeOverMeEnum
  /* 1 */ val InsideEmptyPanel: typings.surveyKnockout.mod.DragTypeOverMeEnum.InsideEmptyPanel & Double = js.native
  
  @js.native
  sealed trait MultilineLeft
    extends StObject
       with DragTypeOverMeEnum
  /* 1 */ val MultilineLeft: typings.surveyKnockout.mod.DragTypeOverMeEnum.MultilineLeft & Double = js.native
  
  @js.native
  sealed trait MultilineRight
    extends StObject
       with DragTypeOverMeEnum
  /* 0 */ val MultilineRight: typings.surveyKnockout.mod.DragTypeOverMeEnum.MultilineRight & Double = js.native
}
