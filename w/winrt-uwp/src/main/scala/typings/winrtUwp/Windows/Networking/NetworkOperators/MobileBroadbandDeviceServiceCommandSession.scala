package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a device service command session which allows the caller to submit predefined commands to the modem on a mobile broadband device service. */
@js.native
trait MobileBroadbandDeviceServiceCommandSession extends StObject {
  
  /** Closes the command session on a mobile broadband device service. */
  def closeSession(): Unit = js.native
  
  /**
    * Starts an asynchronous operation on a mobile broadband device service to send a query command to the command session.
    * @param commandId The command identifier for the query command to be executed.
    * @param data The data to be submitted as part of the command.
    * @return An asynchronous operation that returns the result of the command.
    */
  def sendQueryCommandAsync(commandId: Double, data: IBuffer): IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult] = js.native
  
  /**
    * Starts an asynchronous operation on a mobile broadband device service to send a set command to the command session.
    * @param commandId The command identifier for the set command to be executed.
    * @param data The data to be submitted as part of the command.
    * @return An asynchronous operation that returns the result of the command.
    */
  def sendSetCommandAsync(commandId: Double, data: IBuffer): IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult] = js.native
}
object MobileBroadbandDeviceServiceCommandSession {
  
  @scala.inline
  def apply(
    closeSession: () => Unit,
    sendQueryCommandAsync: (Double, IBuffer) => IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult],
    sendSetCommandAsync: (Double, IBuffer) => IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult]
  ): MobileBroadbandDeviceServiceCommandSession = {
    val __obj = js.Dynamic.literal(closeSession = js.Any.fromFunction0(closeSession), sendQueryCommandAsync = js.Any.fromFunction2(sendQueryCommandAsync), sendSetCommandAsync = js.Any.fromFunction2(sendSetCommandAsync))
    __obj.asInstanceOf[MobileBroadbandDeviceServiceCommandSession]
  }
  
  @scala.inline
  implicit class MobileBroadbandDeviceServiceCommandSessionMutableBuilder[Self <: MobileBroadbandDeviceServiceCommandSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseSession(value: () => Unit): Self = StObject.set(x, "closeSession", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSendQueryCommandAsync(value: (Double, IBuffer) => IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult]): Self = StObject.set(x, "sendQueryCommandAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSendSetCommandAsync(value: (Double, IBuffer) => IPromiseWithIAsyncOperation[MobileBroadbandDeviceServiceCommandResult]): Self = StObject.set(x, "sendSetCommandAsync", js.Any.fromFunction2(value))
  }
}
