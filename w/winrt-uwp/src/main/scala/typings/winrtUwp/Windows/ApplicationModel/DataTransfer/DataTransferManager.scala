package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.datarequested
import typings.winrtUwp.winrtUwpStrings.targetapplicationchosen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Programmatically initiates an exchange of content with other apps. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
@js.native
abstract class DataTransferManager () extends js.Object {
  /** Occurs when a share operation starts. */
  @JSName("ondatarequested")
  var ondatarequested_Original: TypedEventHandler[DataTransferManager, DataRequestedEventArgs] = js.native
  /** Occurs when the user chooses a target app in the Share charm. */
  @JSName("ontargetapplicationchosen")
  var ontargetapplicationchosen_Original: TypedEventHandler[DataTransferManager, TargetApplicationChosenEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datarequested(`type`: datarequested, listener: TypedEventHandler[DataTransferManager, DataRequestedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetapplicationchosen(
    `type`: targetapplicationchosen,
    listener: TypedEventHandler[DataTransferManager, TargetApplicationChosenEventArgs]
  ): Unit = js.native
  /** Occurs when a share operation starts. */
  def ondatarequested(ev: DataRequestedEventArgs with WinRTEvent[DataTransferManager]): Unit = js.native
  /** Occurs when the user chooses a target app in the Share charm. */
  def ontargetapplicationchosen(ev: TargetApplicationChosenEventArgs with WinRTEvent[DataTransferManager]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datarequested(`type`: datarequested, listener: TypedEventHandler[DataTransferManager, DataRequestedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_targetapplicationchosen(
    `type`: targetapplicationchosen,
    listener: TypedEventHandler[DataTransferManager, TargetApplicationChosenEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
@js.native
object DataTransferManager extends js.Object {
  /**
    * Returns the DataTransferManager object associated with the current window.
    * @return The DataTransferManager object associated with the current window.
    */
  def getForCurrentView(): DataTransferManager = js.native
  /** Programmatically initiates the user interface for sharing content with another app. */
  def showShareUI(): Unit = js.native
}

