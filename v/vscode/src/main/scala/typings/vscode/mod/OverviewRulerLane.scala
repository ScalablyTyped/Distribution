package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverviewRulerLane extends StObject
@JSImport("vscode", "OverviewRulerLane")
@js.native
object OverviewRulerLane extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverviewRulerLane & Double] = js.native
  
  @js.native
  sealed trait Center
    extends StObject
       with OverviewRulerLane
  /* 2 */ val Center: typings.vscode.mod.OverviewRulerLane.Center & Double = js.native
  
  @js.native
  sealed trait Full
    extends StObject
       with OverviewRulerLane
  /* 7 */ val Full: typings.vscode.mod.OverviewRulerLane.Full & Double = js.native
  
  @js.native
  sealed trait Left
    extends StObject
       with OverviewRulerLane
  /* 1 */ val Left: typings.vscode.mod.OverviewRulerLane.Left & Double = js.native
  
  @js.native
  sealed trait Right
    extends StObject
       with OverviewRulerLane
  /* 4 */ val Right: typings.vscode.mod.OverviewRulerLane.Right & Double = js.native
}
