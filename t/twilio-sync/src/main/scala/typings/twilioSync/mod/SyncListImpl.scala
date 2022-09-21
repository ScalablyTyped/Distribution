package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncListImpl
  extends StObject
     with SyncEntity {
  
  /* private */ var _addOrUpdateItemOnServer: Any = js.native
  
  /* private */ var _getItemFromServer: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _handleContextUpdate: Any = js.native
  
  /* private */ var _handleItemMutated: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _handleItemRemoved: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _updateContextIfRequired: Any = js.native
  
  /* private */ var _updateItemUnconditionally: Any = js.native
  
  /* private */ var _updateItemWithIfMatch: Any = js.native
  
  /* private */ var _updateRootDateUpdated: Any = js.native
  
  /* private */ var cache: Any = js.native
  
  /* private */ var context: Any = js.native
  
  /* private */ var contextEventId: Any = js.native
  
  def dateExpires: String = js.native
  
  def dateUpdated: js.Date = js.native
  
  /* private */ var descriptor: Any = js.native
  
  /**
    * @private
    */
  /* private */ var emitItemMutationEvent: Any = js.native
  
  def get(index: Double): js.Promise[SyncListItem] = js.native
  
  /**
    * @return {Promise<Object>} Context of List
    * @private
    */
  def getContext(): js.Promise[js.Object] = js.native
  
  def getItems(args: Any): js.Promise[Paginator[SyncListItem]] = js.native
  
  def links: Any = js.native
  
  def mutate(index: Double, mutator: Mutator): js.Promise[SyncListItem] = js.native
  def mutate(index: Double, mutator: Mutator, itemMetadataUpdates: SyncListItemMetadata): js.Promise[SyncListItem] = js.native
  
  def push(value: Any): js.Promise[SyncListItem] = js.native
  def push(value: Any, itemMetadata: SyncListItemMetadata): js.Promise[SyncListItem] = js.native
  
  /**
    * Query items from the List
    * @private
    */
  /* protected */ def queryItems(arg: Any): js.Promise[Paginator[SyncListItem]] = js.native
  
  def remove(index: Double): js.Promise[Unit] = js.native
  
  def removeList(): js.Promise[Unit] = js.native
  
  def revision: String = js.native
  
  def set(index: Double, value: js.Object): js.Promise[SyncListItem] = js.native
  def set(index: Double, value: js.Object, itemMetadataUpdates: SyncListItemMetadata): js.Promise[SyncListItem] = js.native
  
  def setItemTtl(index: Double, ttl: Double): js.Promise[Unit] = js.native
  
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
  
  /* private */ var shouldIgnoreEvent: Any = js.native
  
  def update(index: Double, obj: js.Object): js.Promise[SyncListItem] = js.native
  def update(index: Double, obj: js.Object, itemMetadataUpdates: SyncListItemMetadata): js.Promise[SyncListItem] = js.native
  
  /* private */ var updateMergingQueue: Any = js.native
  
  // private props
  def uri: String = js.native
}
