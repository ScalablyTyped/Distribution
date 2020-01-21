package typings.winjs.mod.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type of IListDataSource that provides read-access to an object that implements the IStorageQueryResultBase interface. A StorageDataSource enables you to query and bind to items in the data source.
  **/
@JSImport("winjs", "UI.StorageDataSource")
@js.native
class StorageDataSource[T] protected ()
  extends typings.winjs.WinJS.UI.StorageDataSource[T] {
  //#region Constructors
  /**
    * Creates a new StorageDataSource object.
    * @constructor
    * @param query The IStorageQueryResultBase that the StorageDataSource obtains its items from. Instead of IStorageQueryResultBase, you can also pass one of these string values: Music, Pictures, Videos, Documents.
    * @param options The set of properties and values to apply to the new StorageDataSource. Properties on this object may include: mode , requestedThumbnailSize , thumbnailOptions , synchronous .
    **/
  def this(query: js.Any) = this()
  def this(query: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.StorageDataSource")
@js.native
object StorageDataSource extends js.Object {
  //#endregion Methods
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

