package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a UICC (SIM card) application. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUiccApp")
@js.native
open class MobileBroadbandUiccApp ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccApp {
  
  /**
    * Asynchronously retrieves details about a UICC application.
    * @param uiccFilePath A sequence of characters specifying the UICC file path of the application. Use the MobileBroadbandUiccApp.Id property value of this instance, to get app record details for this application.
    * @return An asynchronous retrieval operation. On successful completion, returns a MobileBroadbandUiccAppRecordDetailsResult instance initialized for the specified application's details.
    */
  /* CompleteClass */
  override def getRecordDetailsAsync(uiccFilePath: IIterable[Double]): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppRecordDetailsResult
  ] = js.native
  
  /** Gets the ID of this UICC application. */
  /* CompleteClass */
  var id: IBuffer = js.native
  
  /** Gets what kind of UICC application this instance represents. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.Networking.NetworkOperators.UiccAppKind = js.native
  
  /**
    * Asynchronously reads a UICC application record.
    * @param uiccFilePath A sequence of characters specifying the path to the UICC application.
    * @param recordIndex The record index within the UICC application's records.
    * @return An asynchronous retrieval operation. On successful completion, returns a MobileBroadbandUiccAppReadRecordResult with the result of the operation.
    */
  /* CompleteClass */
  override def readRecordAsync(uiccFilePath: IIterable[Double], recordIndex: Double): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppReadRecordResult
  ] = js.native
}
