package typings.winrtDashUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedTextScrollMode extends js.Object

/** Specifies the method in which lines of text scroll through the region. */
@JSGlobal("Windows.Media.Core.TimedTextScrollMode")
@js.native
object TimedTextScrollMode extends js.Object {
  /** Text lines pop on to the region discretely. */
  @js.native
  sealed trait popon extends TimedTextScrollMode
  
  /** Text lines roll up onto the region. */
  @js.native
  sealed trait rollup extends TimedTextScrollMode
  
  /* 0 */ val popon: typings.winrtDashUwp.Windows.Media.Core.TimedTextScrollMode.popon with Double = js.native
  /* 1 */ val rollup: typings.winrtDashUwp.Windows.Media.Core.TimedTextScrollMode.rollup with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextScrollMode with Double] = js.native
}

