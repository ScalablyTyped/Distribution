package typings.winrtUwp.Windows.Devices.SmartCards

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents info about a smart card. */
@js.native
trait SmartCard extends StObject {
  
  /**
    * Establishes a connection to the smart card and returns a SmartCardConnection object representing the connection.
    * @return Asynchronous operation that, when complete, returns the SmartCardConnection object representing the connection.
    */
  def connectAsync(): IPromiseWithIAsyncOperation[SmartCardConnection] = js.native
  
  /**
    * Returns the smart card's Answer to Reset (ATR), a standard series of bytes that contains info about the smart card's characteristics, behaviors, and state.
    * @return The smart card's ATR byte set.
    */
  def getAnswerToResetAsync(): IPromiseWithIAsyncOperation[IBuffer] = js.native
  
  /**
    * Returns the smart card's status.
    * @return One of the SmartCardStatus enumeration values, representing the smart card's status.
    */
  def getStatusAsync(): IPromiseWithIAsyncOperation[SmartCardStatus] = js.native
  
  /** Gets info about the smart card reader into which the smart card is inserted. */
  var reader: SmartCardReader = js.native
}
object SmartCard {
  
  @scala.inline
  def apply(
    connectAsync: () => IPromiseWithIAsyncOperation[SmartCardConnection],
    getAnswerToResetAsync: () => IPromiseWithIAsyncOperation[IBuffer],
    getStatusAsync: () => IPromiseWithIAsyncOperation[SmartCardStatus],
    reader: SmartCardReader
  ): SmartCard = {
    val __obj = js.Dynamic.literal(connectAsync = js.Any.fromFunction0(connectAsync), getAnswerToResetAsync = js.Any.fromFunction0(getAnswerToResetAsync), getStatusAsync = js.Any.fromFunction0(getStatusAsync), reader = reader.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartCard]
  }
  
  @scala.inline
  implicit class SmartCardMutableBuilder[Self <: SmartCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectAsync(value: () => IPromiseWithIAsyncOperation[SmartCardConnection]): Self = StObject.set(x, "connectAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAnswerToResetAsync(value: () => IPromiseWithIAsyncOperation[IBuffer]): Self = StObject.set(x, "getAnswerToResetAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStatusAsync(value: () => IPromiseWithIAsyncOperation[SmartCardStatus]): Self = StObject.set(x, "getStatusAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReader(value: SmartCardReader): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
  }
}
