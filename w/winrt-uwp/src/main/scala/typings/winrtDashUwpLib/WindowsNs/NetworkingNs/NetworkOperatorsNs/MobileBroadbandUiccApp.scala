package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a UICC (SIM card) application. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUiccApp")
@js.native
abstract class MobileBroadbandUiccApp () extends js.Object {
  /** Gets the ID of this UICC application. */
  var id: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets what kind of UICC application this instance represents. */
  var kind: UiccAppKind = js.native
  /**
                   * Asynchronously retrieves details about a UICC application.
                   * @param uiccFilePath A sequence of characters specifying the UICC file path of the application. Use the MobileBroadbandUiccApp.Id property value of this instance, to get app record details for this application.
                   * @return An asynchronous retrieval operation. On successful completion, returns a MobileBroadbandUiccAppRecordDetailsResult instance initialized for the specified application's details.
                   */
  def getRecordDetailsAsync(uiccFilePath: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[scala.Double]): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[MobileBroadbandUiccAppRecordDetailsResult] = js.native
  /**
                   * Asynchronously reads a UICC application record.
                   * @param uiccFilePath A sequence of characters specifying the path to the UICC application.
                   * @param recordIndex The record index within the UICC application's records.
                   * @return An asynchronous retrieval operation. On successful completion, returns a MobileBroadbandUiccAppReadRecordResult with the result of the operation.
                   */
  def readRecordAsync(
    uiccFilePath: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[scala.Double],
    recordIndex: scala.Double
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[MobileBroadbandUiccAppReadRecordResult] = js.native
}

