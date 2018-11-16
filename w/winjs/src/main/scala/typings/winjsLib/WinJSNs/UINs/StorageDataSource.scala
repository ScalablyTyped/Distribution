package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A type of IListDataSource that provides read-access to an object that implements the IStorageQueryResultBase interface. A StorageDataSource enables you to query and bind to items in the data source.
    **/
@JSGlobal("WinJS.UI.StorageDataSource")
@js.native
class StorageDataSource[T] protected () extends js.Object {
  //#region Constructors
  /**
           * Creates a new StorageDataSource object.
           * @constructor
           * @param query The IStorageQueryResultBase that the StorageDataSource obtains its items from. Instead of IStorageQueryResultBase, you can also pass one of these string values: Music, Pictures, Videos, Documents.
           * @param options The set of properties and values to apply to the new StorageDataSource. Properties on this object may include: mode , requestedThumbnailSize , thumbnailOptions , synchronous .
          **/
  def this(query: js.Any) = this()
  //#region Constructors
  /**
           * Creates a new StorageDataSource object.
           * @constructor
           * @param query The IStorageQueryResultBase that the StorageDataSource obtains its items from. Instead of IStorageQueryResultBase, you can also pass one of these string values: Music, Pictures, Videos, Documents.
           * @param options The set of properties and values to apply to the new StorageDataSource. Properties on this object may include: mode , requestedThumbnailSize , thumbnailOptions , synchronous .
          **/
  def this(query: js.Any, options: js.Any) = this()
  /**
           * Registers an event handler for the specified event.
           * @param type The name of the event for which to add a listener.
           * @param eventHandler The event handler function to associate with the event.
           * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
          **/
  def addEventListener(`type`: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  /**
           * Registers an event handler for the specified event.
           * @param type The name of the event for which to add a listener.
           * @param eventHandler The event handler function to associate with the event.
           * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
          **/
  def addEventListener(`type`: java.lang.String, eventHandler: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
           * Raises an event of the specified type and with additional properties.
           * @param type The type (name) of the event.
           * @param details The set of additional properties to be attached to the event object.
           * @returns true if preventDefault was called on the event, otherwise false.
          **/
  def dispatchEvent(`type`: java.lang.String, details: js.Any): scala.Boolean = js.native
  //#endregion Constructors
  //#region Methods
  /**
           * Draws the thumbnail for the specified item to the specified img element.
           * @param item The item to retrieve the thumbnail for.
           * @param image The img element that will display the thumbnail.
           * @returns A Promise that completes when the full-quality thumbnail is visible.
          **/
  def loadThumbnail(item: IItem[T], image: stdLib.HTMLImageElement): winjsLib.WinJSNs.Promise[scala.Unit] = js.native
  /**
           * Removes a listener for the specified event.
           * @param type The name of the event for which to remove a listener.
           * @param eventHandler The event handler function to associate with the event.
           * @param useCapture Optional. The same value that was passed to addEventListener for this listener. It may be omitted if it was omitted when calling addEventListener.
          **/
  def removeEventListener(`type`: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  /**
           * Removes a listener for the specified event.
           * @param type The name of the event for which to remove a listener.
           * @param eventHandler The event handler function to associate with the event.
           * @param useCapture Optional. The same value that was passed to addEventListener for this listener. It may be omitted if it was omitted when calling addEventListener.
          **/
  def removeEventListener(`type`: java.lang.String, eventHandler: js.Function, useCapture: js.Any): scala.Unit = js.native
}

/**
     * A type of IListDataSource that provides read-access to an object that implements the IStorageQueryResultBase interface. A StorageDataSource enables you to query and bind to items in the data source.
    **/
@JSGlobal("WinJS.UI.StorageDataSource")
@js.native
object StorageDataSource extends js.Object {
  //#endregion Methods
  /**
           * Indicates that the object is compatibile with declarative processing.
          **/
  var supportedForProcessing: scala.Boolean = js.native
}

