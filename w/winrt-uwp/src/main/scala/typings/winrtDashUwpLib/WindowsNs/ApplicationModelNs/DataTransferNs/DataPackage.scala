package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the data that a user wants to exchange with another app. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackage")
@js.native
/** Constructor that creates a new DataPackage . */
class DataPackage () extends js.Object {
  /** Occurs when the DataPackage is destroyed. */
  @JSName("ondestroyed")
  var ondestroyed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DataPackage, _] = js.native
  /** Occurs when a paste operation is completed. */
  @JSName("onoperationcompleted")
  var onoperationcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DataPackage, OperationCompletedEventArgs] = js.native
  /** Allows you to get and set properties like the title of the content being shared. */
  var properties: DataPackagePropertySet = js.native
  /** Specifies the DataPackageOperation (none, move, copy, or link) for the operation. */
  var requestedOperation: DataPackageOperation = js.native
  /** Maps a URI to a file. Used to ensure that referenced content (such as an image) in HTML content is added to the DataPackage . */
  var resourceMap: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[
    java.lang.String, 
    winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference
  ] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_destroyed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.destroyed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DataPackage, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_operationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.operationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DataPackage, OperationCompletedEventArgs]
  ): scala.Unit = js.native
  /**
    * Returns a DataPackageView object. This object is a read-only copy of the DataPackage object.
    * @return The object that is a read-only copy of the DataPackage object.
    */
  def getView(): DataPackageView = js.native
  /** Occurs when the DataPackage is destroyed. */
  def ondestroyed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[DataPackage]): scala.Unit = js.native
  /** Occurs when a paste operation is completed. */
  def onoperationcompleted(ev: OperationCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[DataPackage]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_destroyed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.destroyed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DataPackage, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_operationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.operationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DataPackage, OperationCompletedEventArgs]
  ): scala.Unit = js.native
  /**
    * Sets the application link that a DataPackage contains.
    * @param value A URI with a scheme that isn't http or https that's handled by the source app.
    */
  def setApplicationLink(value: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): scala.Unit = js.native
  /**
    * Sets the bitmap image contained in the DataPackage .
    * @param value A stream that contains the bitmap image.
    */
  def setBitmap(value: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference): scala.Unit = js.native
  /**
    * Sets the data contained in the DataPackage in a RandomAccessStream format.
    * @param formatId Specifies the format of the data. We recommend that you set this value by using the StandardDataFormats class.
    * @param value Specifies the content that the DataPackage contains.
    */
  def setData(formatId: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
    * Sets a delegate to handle requests from the target app.
    * @param formatId Specifies the format of the data. We recommend that you set this value by using the StandardDataFormats class.
    * @param delayRenderer A delegate that is responsible for processing requests from a target app.
    */
  def setDataProvider(formatId: java.lang.String, delayRenderer: DataProviderHandler): scala.Unit = js.native
  /**
    * Adds HTML content to the DataPackage .
    * @param value The HTML content.
    */
  def setHtmlFormat(value: java.lang.String): scala.Unit = js.native
  /**
    * Sets the Rich Text Format (RTF) content that is contained in a DataPackage .
    * @param value Specifies the RTF content for the DataPackage .
    */
  def setRtf(value: java.lang.String): scala.Unit = js.native
  /**
    * Sets the files and folders contained in a DataPackage .
    * @param value The files and folders to be added to the DataPackage .
    */
  def setStorageItems(
    value: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem]
  ): scala.Unit = js.native
  /**
    * Adds files and folders to a DataPackage .
    * @param value The files and folders to be added to the DataPackage .
    * @param readOnly Specify true if the files are read-only; false otherwise.
    */
  def setStorageItems(
    value: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem],
    readOnly: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Sets the text that a DataPackage contains.
    * @param value The text.
    */
  def setText(value: java.lang.String): scala.Unit = js.native
  /**
    * Sets the Uniform Resource Identifier (URI) that is contained in the DataPackage .
    * @param value The URI that is contained in the DataPackage .
    */
  def setUri(value: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): scala.Unit = js.native
  /**
    * Sets the web link that a DataPackage contains.
    * @param value A URI with an http or https scheme that corresponds to the content being displayed to the user.
    */
  def setWebLink(value: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): scala.Unit = js.native
}

