package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a UICC (SIM card) application. */
@js.native
trait MobileBroadbandUiccApp extends js.Object {
  
  /**
    * Asynchronously retrieves details about a UICC application.
    * @param uiccFilePath A sequence of characters specifying the UICC file path of the application. Use the MobileBroadbandUiccApp.Id property value of this instance, to get app record details for this application.
    * @return An asynchronous retrieval operation. On successful completion, returns a MobileBroadbandUiccAppRecordDetailsResult instance initialized for the specified application's details.
    */
  def getRecordDetailsAsync(uiccFilePath: IIterable[Double]): IPromiseWithIAsyncOperation[MobileBroadbandUiccAppRecordDetailsResult] = js.native
  
  /** Gets the ID of this UICC application. */
  var id: IBuffer = js.native
  
  /** Gets what kind of UICC application this instance represents. */
  var kind: UiccAppKind = js.native
  
  /**
    * Asynchronously reads a UICC application record.
    * @param uiccFilePath A sequence of characters specifying the path to the UICC application.
    * @param recordIndex The record index within the UICC application's records.
    * @return An asynchronous retrieval operation. On successful completion, returns a MobileBroadbandUiccAppReadRecordResult with the result of the operation.
    */
  def readRecordAsync(uiccFilePath: IIterable[Double], recordIndex: Double): IPromiseWithIAsyncOperation[MobileBroadbandUiccAppReadRecordResult] = js.native
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
  implicit class MobileBroadbandUiccAppOps[Self <: MobileBroadbandUiccApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetRecordDetailsAsync(value: IIterable[Double] => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppRecordDetailsResult]): Self = this.set("getRecordDetailsAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: IBuffer): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: UiccAppKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadRecordAsync(
      value: (IIterable[Double], Double) => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppReadRecordResult]
    ): Self = this.set("readRecordAsync", js.Any.fromFunction2(value))
  }
}
