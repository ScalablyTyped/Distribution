package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextScrollMode with Double] = js.native
  /* 0 */ @js.native
  object popon extends TopLevel[popon with Double]
  
  /* 1 */ @js.native
  object rollup extends TopLevel[rollup with Double]
  
}

