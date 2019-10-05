package typings.winrtDashUwp.Windows.Devices.SmartCards

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.cardadded
import typings.winrtDashUwp.winrtDashUwpStrings.cardremoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents info about a smart card reader. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardReader")
@js.native
abstract class SmartCardReader () extends js.Object {
  /** Gets the smart card reader's device ID. */
  var deviceId: String = js.native
  /** Gets the smart card reader's type. */
  var kind: SmartCardReaderKind = js.native
  /** Gets the smart card reader's device name. */
  var name: String = js.native
  /** Occurs when a smart card is inserted into the smart card reader or tapped on an NFC reader. */
  @JSName("oncardadded")
  var oncardadded_Original: TypedEventHandler[SmartCardReader, CardAddedEventArgs] = js.native
  /** Occurs when a smart card is taken out of the smart card reader. */
  @JSName("oncardremoved")
  var oncardremoved_Original: TypedEventHandler[SmartCardReader, CardRemovedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cardadded(`type`: cardadded, listener: TypedEventHandler[SmartCardReader, CardAddedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cardremoved(`type`: cardremoved, listener: TypedEventHandler[SmartCardReader, CardRemovedEventArgs]): Unit = js.native
  /**
    * Returns a list of info about all smart cards that are connected to the smart card reader.
    * @return After the operation completes, returns the list of info about all smart cards that are connected to the smart card reader.
    */
  def findAllCardsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Returns the smart card reader's status.
    * @return After the status request completes, returns one of the SmartCardReaderStatus enumeration values, representing the smart card reader's status.
    */
  def getStatusAsync(): IPromiseWithIAsyncOperation[SmartCardReaderStatus] = js.native
  /** Occurs when a smart card is inserted into the smart card reader or tapped on an NFC reader. */
  def oncardadded(ev: CardAddedEventArgs with WinRTEvent[SmartCardReader]): Unit = js.native
  /** Occurs when a smart card is taken out of the smart card reader. */
  def oncardremoved(ev: CardRemovedEventArgs with WinRTEvent[SmartCardReader]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cardadded(`type`: cardadded, listener: TypedEventHandler[SmartCardReader, CardAddedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cardremoved(`type`: cardremoved, listener: TypedEventHandler[SmartCardReader, CardRemovedEventArgs]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.SmartCards.SmartCardReader")
@js.native
object SmartCardReader extends js.Object {
  /**
    * Returns a smart card reader that matches the specified device ID.
    * @param deviceId The smart card reader's device ID.
    * @return The matching smart card reader.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[SmartCardReader] = js.native
  /**
    * Returns an Advanced Query Syntax (AQS) string representing all smart card readers connected to the device. This string is passed to the FindAllAsync method to enumerate the given set of smart card readers.
    * @return The Advanced Query Syntax (AQS) string representing all smart card readers connected to the device.
    */
  def getDeviceSelector(): String = js.native
  /**
    * Returns an Advanced Query Syntax (AQS) string representing a set of a specific type of smart card readers connected to the device. This string is passed to the FindAllAsync method to enumerate the given set of smart card readers.
    * @param kind One of the enumeration values, representing a specific smart card reader type.
    * @return The Advanced Query Syntax (AQS) string representing a set of the specified type of smart card readers connected to the device.
    */
  def getDeviceSelector(kind: SmartCardReaderKind): String = js.native
}

