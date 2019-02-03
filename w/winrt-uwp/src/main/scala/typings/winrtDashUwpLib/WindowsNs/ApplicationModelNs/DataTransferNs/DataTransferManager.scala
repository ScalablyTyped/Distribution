package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Programmatically initiates an exchange of content with other apps. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
@js.native
abstract class DataTransferManager () extends js.Object {
  /** Occurs when a share operation starts. */
  @JSName("ondatarequested")
  var ondatarequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DataTransferManager, DataRequestedEventArgs] = js.native
  /** Occurs when the user chooses a target app in the Share charm. */
  @JSName("ontargetapplicationchosen")
  var ontargetapplicationchosen_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DataTransferManager, TargetApplicationChosenEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datarequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.datarequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DataTransferManager, DataRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetapplicationchosen(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.targetapplicationchosen,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DataTransferManager, TargetApplicationChosenEventArgs]
  ): scala.Unit = js.native
  /** Occurs when a share operation starts. */
  def ondatarequested(ev: DataRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[DataTransferManager]): scala.Unit = js.native
  /** Occurs when the user chooses a target app in the Share charm. */
  def ontargetapplicationchosen(
    ev: TargetApplicationChosenEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[DataTransferManager]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datarequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.datarequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DataTransferManager, DataRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_targetapplicationchosen(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.targetapplicationchosen,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DataTransferManager, TargetApplicationChosenEventArgs]
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
@js.native
object DataTransferManager extends js.Object {
  /**
    * Returns the DataTransferManager object associated with the current window.
    * @return The DataTransferManager object associated with the current window.
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataTransferManager = js.native
  /** Programmatically initiates the user interface for sharing content with another app. */
  def showShareUI(): scala.Unit = js.native
}

