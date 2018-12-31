package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a device service command session which allows the caller to submit predefined commands to the modem on a mobile broadband device service. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceCommandSession")
@js.native
abstract class MobileBroadbandDeviceServiceCommandSession () extends js.Object {
  /** Closes the command session on a mobile broadband device service. */
  def closeSession(): scala.Unit = js.native
  /**
    * Starts an asynchronous operation on a mobile broadband device service to send a query command to the command session.
    * @param commandId The command identifier for the query command to be executed.
    * @param data The data to be submitted as part of the command.
    * @return An asynchronous operation that returns the result of the command.
    */
  def sendQueryCommandAsync(commandId: scala.Double, data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult] = js.native
  /**
    * Starts an asynchronous operation on a mobile broadband device service to send a set command to the command session.
    * @param commandId The command identifier for the set command to be executed.
    * @param data The data to be submitted as part of the command.
    * @return An asynchronous operation that returns the result of the command.
    */
  def sendSetCommandAsync(commandId: scala.Double, data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult] = js.native
}

