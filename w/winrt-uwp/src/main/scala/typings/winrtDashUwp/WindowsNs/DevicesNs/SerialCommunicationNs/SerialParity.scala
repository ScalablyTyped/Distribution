package typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs

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
  sealed trait even extends SerialParity
  
  /** Leaves the parity bit set to 1. */
  @js.native
  sealed trait mark extends SerialParity
  
  /** No parity check occurs. */
  @js.native
  sealed trait none extends SerialParity
  
  /** Sets the parity bit so that the total count of data bits set is an odd number. */
  @js.native
  sealed trait odd extends SerialParity
  
  /** Leaves the parity bit set to 0. */
  @js.native
  sealed trait space extends SerialParity
  
  /* 2 */ val even: typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs.SerialParity.even with Double = js.native
  /* 3 */ val mark: typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs.SerialParity.mark with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs.SerialParity.none with Double = js.native
  /* 1 */ val odd: typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs.SerialParity.odd with Double = js.native
  /* 4 */ val space: typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs.SerialParity.space with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SerialParity with Double] = js.native
}

