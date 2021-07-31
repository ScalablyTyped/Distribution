package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a UICC (SIM card) application. */
trait MobileBroadbandUiccApp extends StObject {
  
  /**
    * Asynchronously retrieves details about a UICC application.
    * @param uiccFilePath A sequence of characters specifying the UICC file path of the application. Use the MobileBroadbandUiccApp.Id property value of this instance, to get app record details for this application.
    * @return An asynchronous retrieval operation. On successful completion, returns a MobileBroadbandUiccAppRecordDetailsResult instance initialized for the specified application's details.
    */
  def getRecordDetailsAsync(uiccFilePath: IIterable[Double]): IPromiseWithIAsyncOperation[MobileBroadbandUiccAppRecordDetailsResult]
  
  /** Gets the ID of this UICC application. */
  var id: IBuffer
  
  /** Gets what kind of UICC application this instance represents. */
  var kind: UiccAppKind
  
  /**
    * Asynchronously reads a UICC application record.
    * @param uiccFilePath A sequence of characters specifying the path to the UICC application.
    * @param recordIndex The record index within the UICC application's records.
    * @return An asynchronous retrieval operation. On successful completion, returns a MobileBroadbandUiccAppReadRecordResult with the result of the operation.
    */
  def readRecordAsync(uiccFilePath: IIterable[Double], recordIndex: Double): IPromiseWithIAsyncOperation[MobileBroadbandUiccAppReadRecordResult]
}
object MobileBroadbandUiccApp {
  
  @scala.inline
  def apply(
    getRecordDetailsAsync: IIterable[Double] => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppRecordDetailsResult],
    id: IBuffer,
    kind: UiccAppKind,
    readRecordAsync: (IIterable[Double], Double) => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppReadRecordResult]
  ): MobileBroadbandUiccApp = {
    val __obj = js.Dynamic.literal(getRecordDetailsAsync = js.Any.fromFunction1(getRecordDetailsAsync), id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], readRecordAsync = js.Any.fromFunction2(readRecordAsync))
    __obj.asInstanceOf[MobileBroadbandUiccApp]
  }
  
  @scala.inline
  implicit class MobileBroadbandUiccAppMutableBuilder[Self <: MobileBroadbandUiccApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRecordDetailsAsync(value: IIterable[Double] => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppRecordDetailsResult]): Self = StObject.set(x, "getRecordDetailsAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: IBuffer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: UiccAppKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadRecordAsync(
      value: (IIterable[Double], Double) => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppReadRecordResult]
    ): Self = StObject.set(x, "readRecordAsync", js.Any.fromFunction2(value))
  }
}
