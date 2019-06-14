package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SerialParity extends js.Object

/** Defines values for the parity bit for the serial data transmission. The values are used by the Parity property on the SerialDevice object. */
@JSGlobal("Windows.Devices.SerialCommunication.SerialParity")
@js.native
object SerialParity extends js.Object {
  /** Sets the parity bit so that the total count of data bits set is an even number. */
  @js.native
  sealed trait even
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialParity
  
  /** Leaves the parity bit set to 1. */
  @js.native
  sealed trait mark
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialParity
  
  /** No parity check occurs. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialParity
  
  /** Sets the parity bit so that the total count of data bits set is an odd number. */
  @js.native
  sealed trait odd
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialParity
  
  /** Leaves the parity bit set to 0. */
  @js.native
  sealed trait space
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialParity
  
  /* 2 */ val even: even with scala.Double = js.native
  /* 3 */ val mark: mark with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val odd: odd with scala.Double = js.native
  /* 4 */ val space: space with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialParity with scala.Double
  ] = js.native
}

