package typings.winrtUwp.Windows.Devices.SerialCommunication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
