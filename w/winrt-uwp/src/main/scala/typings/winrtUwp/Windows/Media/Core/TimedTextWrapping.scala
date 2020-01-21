package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedTextWrapping extends js.Object

/** Specifies the wrapping behavior of timed text. */
@JSGlobal("Windows.Media.Core.TimedTextWrapping")
@js.native
object TimedTextWrapping extends js.Object {
  /** The text is not wrapped. */
  @js.native
  sealed trait noWrap extends TimedTextWrapping
  
  /** The text is wrapped. */
  @js.native
  sealed trait wrap extends TimedTextWrapping
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextWrapping with Double] = js.native
  /* 0 */ @js.native
  object noWrap extends TopLevel[noWrap with Double]
  
  /* 1 */ @js.native
  object wrap extends TopLevel[wrap with Double]
  
}

