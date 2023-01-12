package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Storage extends StObject {
  
  def read(`type`: String, id: String): js.Object
  
  def remove(`type`: String, sid: String, uniqueName: String): Any
  
  def store(`type`: String, id: String, value: js.Object): Any
  
  def update(`type`: String, id: String, uniqueName: String, patch: js.Object): Any
  
  def updateStorageId(storageId: String): Any
}
object Storage {
  
  inline def apply(
    read: (String, String) => js.Object,
    remove: (String, String, String) => Any,
    store: (String, String, js.Object) => Any,
    update: (String, String, String, js.Object) => Any,
    updateStorageId: String => Any
  ): Storage = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction2(read), remove = js.Any.fromFunction3(remove), store = js.Any.fromFunction3(store), update = js.Any.fromFunction4(update), updateStorageId = js.Any.fromFunction1(updateStorageId))
    __obj.asInstanceOf[Storage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Storage] (val x: Self) extends AnyVal {
    
    inline def setRead(value: (String, String) => js.Object): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
    
    inline def setRemove(value: (String, String, String) => Any): Self = StObject.set(x, "remove", js.Any.fromFunction3(value))
    
    inline def setStore(value: (String, String, js.Object) => Any): Self = StObject.set(x, "store", js.Any.fromFunction3(value))
    
    inline def setUpdate(value: (String, String, String, js.Object) => Any): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
    
    inline def setUpdateStorageId(value: String => Any): Self = StObject.set(x, "updateStorageId", js.Any.fromFunction1(value))
  }
}
