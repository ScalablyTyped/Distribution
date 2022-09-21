package typings.winjs.mod.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type of IListDataSource that provides read-access to an object that implements the IStorageQueryResultBase interface. A StorageDataSource enables you to query and bind to items in the data source.
  **/
@JSImport("winjs", "UI.StorageDataSource")
@js.native
open class StorageDataSource[T] protected ()
  extends StObject
     with typings.winjs.WinJS.UI.StorageDataSource[T] {
  //#region Constructors
  /**
    * Creates a new StorageDataSource object.
    * @constructor
    * @param query The IStorageQueryResultBase that the StorageDataSource obtains its items from. Instead of IStorageQueryResultBase, you can also pass one of these string values: Music, Pictures, Videos, Documents.
    * @param options The set of properties and values to apply to the new StorageDataSource. Properties on this object may include: mode , requestedThumbnailSize , thumbnailOptions , synchronous .
    **/
  def this(query: Any) = this()
  def this(query: Any, options: Any) = this()
}
object StorageDataSource {
  
  @JSImport("winjs", "UI.StorageDataSource")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion Methods
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.StorageDataSource.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
