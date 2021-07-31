package typings.twilioSync

import typings.twilioSync.servicesMod.Configuration
import typings.twilioSync.servicesMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageMod {
  
  @JSImport("twilio-sync/lib/services/storage", "SessionStorage")
  @js.native
  class SessionStorage protected ()
    extends StObject
       with Storage {
    def this(config: Configuration) = this()
    def this(config: Configuration, storage: StorageBackend) = this()
    
    var _apply: js.Any = js.native
    
    var _read: js.Any = js.native
    
    var _store: js.Any = js.native
    
    val config: js.Any = js.native
    
    /* private */ def isReady: js.Any = js.native
    
    /* CompleteClass */
    override def read(`type`: String, id: String): js.Object = js.native
    
    /* CompleteClass */
    override def remove(`type`: String, sid: String, uniqueName: String): js.Any = js.native
    
    val storage: js.Any = js.native
    
    var storageId: js.Any = js.native
    
    var storageKey: js.Any = js.native
    
    /* CompleteClass */
    override def store(`type`: String, id: String, value: js.Object): js.Any = js.native
    
    /* CompleteClass */
    override def update(`type`: String, id: String, uniqueName: String, patch: js.Object): js.Any = js.native
    
    /* CompleteClass */
    override def updateStorageId(storageId: String): js.Any = js.native
  }
  
  trait StorageBackend extends StObject {
    
    def getItem(key: String): String
    
    def removeItem(key: String): Unit
    
    def setItem(key: String, value: String): Unit
  }
  object StorageBackend {
    
    @scala.inline
    def apply(getItem: String => String, removeItem: String => Unit, setItem: (String, String) => Unit): StorageBackend = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[StorageBackend]
    }
    
    @scala.inline
    implicit class StorageBackendMutableBuilder[Self <: StorageBackend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetItem(value: String => String): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveItem(value: String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetItem(value: (String, String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
}
