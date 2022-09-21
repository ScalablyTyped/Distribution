package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncMapImpl
  extends StObject
     with SyncEntity {
  
  /* private */ var _getItemFromServer: Any = js.native
  
  /* private */ var _handleItemMutated: Any = js.native
  
  /**
    * @private
    */
  /* protected */ def _handleItemRemoved(key: Any, eventId: Any, oldData: Any, dateUpdated: js.Date, remote: Boolean): Unit = js.native
  
  /* private */ var _putItemToServer: Any = js.native
  
  /* private */ var _putItemUnconditionally: Any = js.native
  
  /* private */ var _putItemWithIfMatch: Any = js.native
  
  /* private */ var _updateRootDateUpdated: Any = js.native
  
  /* private */ val cache: Any = js.native
  
  def dateExpires: String = js.native
  
  def dateUpdated: js.Date = js.native
  
  /* private */ val descriptor: Any = js.native
  
  /* private */ var emitItemMutationEvent: Any = js.native
  
  def get(key: String): js.Promise[SyncMapItem] = js.native
  
  def getItems(): js.Promise[Paginator[SyncMapItem]] = js.native
  def getItems(args: Any): js.Promise[Paginator[SyncMapItem]] = js.native
  
  def links: Any = js.native
  
  def mutate(key: String, mutator: Mutator): js.Promise[SyncMapItem] = js.native
  def mutate(key: String, mutator: Mutator, itemMetadataUpdates: SyncMapItemMetadata): js.Promise[SyncMapItem] = js.native
  
  /**
    * @private
    */
  /* protected */ def queryItems(): js.Promise[Paginator[SyncMapItem]] = js.native
  /* protected */ def queryItems(args: Any): js.Promise[Paginator[SyncMapItem]] = js.native
  
  def remove(key: String): js.Promise[Unit] = js.native
  
  def removeMap(): js.Promise[Unit] = js.native
  
  def revision: String = js.native
  
  def set(key: String, value: js.Object): js.Promise[SyncMapItem] = js.native
  def set(key: String, value: js.Object, itemMetadataUpdates: SyncMapItemMetadata): js.Promise[SyncMapItem] = js.native
  
  def setItemTtl(key: String, ttl: Double): js.Promise[Unit] = js.native
  
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
  
  /* private */ var shouldIgnoreEvent: Any = js.native
  
  def update(key: String, obj: js.Object): js.Promise[SyncMapItem] = js.native
  def update(key: String, obj: js.Object, itemMetadataUpdates: SyncMapItemMetadata): js.Promise[SyncMapItem] = js.native
  
  /* private */ val updateMergingQueue: Any = js.native
  
  // private props
  def uri: String = js.native
}
