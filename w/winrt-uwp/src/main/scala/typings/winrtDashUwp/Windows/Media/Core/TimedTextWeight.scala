package typings.winrtDashUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Core.TimedTextWeight.bold
import typings.winrtDashUwp.Windows.Media.Core.TimedTextWeight.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedTextWeight extends js.Object

/** Specifies the weight of timed text. */
@JSGlobal("Windows.Media.Core.TimedTextWeight")
@js.native
object TimedTextWeight extends js.Object {
  /** The text is bold. */
  @js.native
  sealed trait bold extends TimedTextWeight
  
  /** The text is normal weight. */
  @js.native
  sealed trait normal extends TimedTextWeight
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextWeight with Double] = js.native
  /* 1 */ @js.native
  object bold extends TopLevel[bold with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
}

