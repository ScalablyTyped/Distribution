package typings
package vexflowLib.VexNs.FlowNs.PedalMarkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Styles extends js.Object

@JSGlobal("Vex.Flow.PedalMarking.Styles")
@js.native
object Styles extends js.Object {
  @js.native
  sealed trait BRACKET
    extends vexflowLib.VexNs.FlowNs.PedalMarkingNs.Styles
  
  @js.native
  sealed trait MIXED
    extends vexflowLib.VexNs.FlowNs.PedalMarkingNs.Styles
  
  @js.native
  sealed trait TEXT
    extends vexflowLib.VexNs.FlowNs.PedalMarkingNs.Styles
  
  val BRACKET: BRACKET with scala.Double = js.native
  val MIXED: MIXED with scala.Double = js.native
  /* 1 */ val TEXT: TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.PedalMarkingNs.Styles with scala.Double] = js.native
}

