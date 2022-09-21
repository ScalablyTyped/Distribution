package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncDocumentImpl
  extends StObject
     with SyncEntity {
  
  /**
    * @private
    */
  /* private */ var _handleSuccessfulUpdateResult: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _postUpdateToServer: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _setUnconditionally: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _setWithIfMatch: Any = js.native
  
  /**
    * Get new data from server
    * @private
    */
  /* private */ var _softSync: Any = js.native
  
  /**
    * Update data entity with new data
    * @private
    */
  def _update(update: Any): Unit = js.native
  
  def data: js.Object = js.native
  
  def dateExpires: String = js.native
  
  def dateUpdated: js.Date = js.native
  
  /* private */ val descriptor: Any = js.native
  
  /* private */ var isDeleted: Any = js.native
  
  def mutate(mutator: Mutator): js.Promise[js.Object] = js.native
  def mutate(mutator: Mutator, metadataUpdates: SyncDocumentMetadata): js.Promise[js.Object] = js.native
  
  def removeDocument(): js.Promise[scala.Nothing] = js.native
  
  def revision: String = js.native
  
  def set(value: js.Object): js.Promise[js.Object] = js.native
  def set(value: js.Object, metadataUpdates: SyncDocumentMetadata): js.Promise[js.Object] = js.native
  
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
  
  def update(obj: js.Object): js.Promise[js.Object] = js.native
  def update(obj: js.Object, metadataUpdates: SyncDocumentMetadata): js.Promise[js.Object] = js.native
  
  /* private */ val updateMergingQueue: Any = js.native
  
  // private props
  def uri: String = js.native
}
