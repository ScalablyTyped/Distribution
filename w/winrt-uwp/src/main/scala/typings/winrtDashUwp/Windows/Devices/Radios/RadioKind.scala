package typings.winrtDashUwp.Windows.Devices.Radios

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RadioKind extends js.Object

/** Enumeration that represents the kinds of radio devices. */
@JSGlobal("Windows.Devices.Radios.RadioKind")
@js.native
object RadioKind extends js.Object {
  /** A Bluetooth radio. */
  @js.native
  sealed trait bluetooth extends RadioKind
  
  /** An FM radio. */
  @js.native
  sealed trait fm extends RadioKind
  
  /** A mobile broadband radio. */
  @js.native
  sealed trait mobileBroadband extends RadioKind
  
  /** An unspecified kind of radio device. */
  @js.native
  sealed trait other extends RadioKind
  
  /** A Wi-Fi radio. */
  @js.native
  sealed trait wiFi extends RadioKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RadioKind with Double] = js.native
  /* 3 */ @js.native
  object bluetooth extends TopLevel[bluetooth with Double]
  
  /* 4 */ @js.native
  object fm extends TopLevel[fm with Double]
  
  /* 2 */ @js.native
  object mobileBroadband extends TopLevel[mobileBroadband with Double]
  
  /* 0 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 1 */ @js.native
  object wiFi extends TopLevel[wiFi with Double]
  
}

