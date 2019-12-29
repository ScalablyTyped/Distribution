package typings.winrtDashUwp.Windows.Devices.Custom

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IOControlAccessMode extends js.Object

/** Identifies the access mode. */
@JSGlobal("Windows.Devices.Custom.IOControlAccessMode")
@js.native
object IOControlAccessMode extends js.Object {
  /** Any mode. */
  @js.native
  sealed trait any extends IOControlAccessMode
  
  /** Read mode. */
  @js.native
  sealed trait read extends IOControlAccessMode
  
  /** Read/write mode. */
  @js.native
  sealed trait readWrite extends IOControlAccessMode
  
  /** Write mode. */
  @js.native
  sealed trait write extends IOControlAccessMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IOControlAccessMode with Double] = js.native
  /* 0 */ @js.native
  object any extends TopLevel[any with Double]
  
  /* 1 */ @js.native
  object read extends TopLevel[read with Double]
  
  /* 3 */ @js.native
  object readWrite extends TopLevel[readWrite with Double]
  
  /* 2 */ @js.native
  object write extends TopLevel[write with Double]
  
}

