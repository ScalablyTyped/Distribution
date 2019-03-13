package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverviewRulerLane extends js.Object

@JSImport("vscode", "OverviewRulerLane")
@js.native
object OverviewRulerLane extends js.Object {
  @js.native
  sealed trait Center
    extends vscodeLib.vscodeMod.OverviewRulerLane
  
  @js.native
  sealed trait Full
    extends vscodeLib.vscodeMod.OverviewRulerLane
  
  @js.native
  sealed trait Left
    extends vscodeLib.vscodeMod.OverviewRulerLane
  
  @js.native
  sealed trait Right
    extends vscodeLib.vscodeMod.OverviewRulerLane
  
  /* 2 */ val Center: Center with scala.Double = js.native
  /* 7 */ val Full: Full with scala.Double = js.native
  /* 1 */ val Left: Left with scala.Double = js.native
  /* 4 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.OverviewRulerLane with scala.Double] = js.native
}

