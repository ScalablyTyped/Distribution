package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Universal Integrated Circuit Card (UICC), normally called a SIM Card on a mobile broadband device. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUicc")
@js.native
abstract class MobileBroadbandUicc ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUicc {
  /** Gets the unique SIM Card identity on a mobile broadband device. */
  /* CompleteClass */
  override var simIccId: String = js.native
  /**
    * Asynchronously retrieves a list of mobile broadband UICC (SIM card) applications.
    * @return An asynchronous retrieval operation. On successful completion, returns an object with the results of the retrieval operation.
    */
  /* CompleteClass */
  override def getUiccAppsAsync(): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppsResult
  ] = js.native
}

