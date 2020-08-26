package typings.winrtUwp.Windows.Devices.Printers

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs to access a 3D printer's capabilities and print tickets. */
@js.native
trait PrintSchema extends js.Object {
  /**
    * Gets the 3D printer capabilities.
    * @param constrainTicket The print ticket.
    * @return An XML PrintCapabilities document containing 3D printer capabilities.
    */
  def getCapabilitiesAsync(constrainTicket: IRandomAccessStreamWithContentType): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  /**
    * Gets the 3D printer's default print ticket.
    * @return An XML PrintTicket document containing the 3D printer's default print ticket.
    */
  def getDefaultPrintTicketAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  /**
    * Creates a new print ticket by merging the user’s selection with the default print ticket and validating that it will work for the device.
    * @param deltaTicket The delta print ticket, specifies the differences between the default print ticket and the user's selections.
    * @return An XML PrintTicket document containing the suggested print ticket.
    */
  def mergeAndValidateWithDefaultPrintTicketAsync(deltaTicket: IRandomAccessStreamWithContentType): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
}

object PrintSchema {
  @scala.inline
  def apply(
    getCapabilitiesAsync: IRandomAccessStreamWithContentType => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType],
    getDefaultPrintTicketAsync: () => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType],
    mergeAndValidateWithDefaultPrintTicketAsync: IRandomAccessStreamWithContentType => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
  ): PrintSchema = {
    val __obj = js.Dynamic.literal(getCapabilitiesAsync = js.Any.fromFunction1(getCapabilitiesAsync), getDefaultPrintTicketAsync = js.Any.fromFunction0(getDefaultPrintTicketAsync), mergeAndValidateWithDefaultPrintTicketAsync = js.Any.fromFunction1(mergeAndValidateWithDefaultPrintTicketAsync))
    __obj.asInstanceOf[PrintSchema]
  }
  @scala.inline
  implicit class PrintSchemaOps[Self <: PrintSchema] (val x: Self) extends AnyVal {
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
    def setGetCapabilitiesAsync(
      value: IRandomAccessStreamWithContentType => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
    ): Self = this.set("getCapabilitiesAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDefaultPrintTicketAsync(value: () => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]): Self = this.set("getDefaultPrintTicketAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setMergeAndValidateWithDefaultPrintTicketAsync(
      value: IRandomAccessStreamWithContentType => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
    ): Self = this.set("mergeAndValidateWithDefaultPrintTicketAsync", js.Any.fromFunction1(value))
  }
  
}

