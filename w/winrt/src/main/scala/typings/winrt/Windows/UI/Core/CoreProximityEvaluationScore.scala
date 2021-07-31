package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoreProximityEvaluationScore extends StObject
@JSGlobal("Windows.UI.Core.CoreProximityEvaluationScore")
@js.native
object CoreProximityEvaluationScore extends StObject {
  
  @js.native
  sealed trait closest
    extends StObject
       with CoreProximityEvaluationScore
  
  @js.native
  sealed trait farthest
    extends StObject
       with CoreProximityEvaluationScore
}
