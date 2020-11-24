package typings.twilioSync.servicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Storage extends js.Object {
  
  def read(`type`: String, id: String): js.Object = js.native
  
  def remove(`type`: String, sid: String, uniqueName: String): js.Any = js.native
  
  def store(`type`: String, id: String, value: js.Object): js.Any = js.native
  
  def update(`type`: String, id: String, uniqueName: String, patch: js.Object): js.Any = js.native
  
  def updateStorageId(storageId: String): js.Any = js.native
}
object Storage {
  
  @scala.inline
  def apply(
    read: (String, String) => js.Object,
    remove: (String, String, String) => js.Any,
    store: (String, String, js.Object) => js.Any,
    update: (String, String, String, js.Object) => js.Any,
    updateStorageId: String => js.Any
  ): Storage = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction2(read), remove = js.Any.fromFunction3(remove), store = js.Any.fromFunction3(store), update = js.Any.fromFunction4(update), updateStorageId = js.Any.fromFunction1(updateStorageId))
    __obj.asInstanceOf[Storage]
  }
  
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
    
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
    def setRead(value: (String, String) => js.Object): Self = this.set("read", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: (String, String, String) => js.Any): Self = this.set("remove", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStore(value: (String, String, js.Object) => js.Any): Self = this.set("store", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdate(value: (String, String, String, js.Object) => js.Any): Self = this.set("update", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUpdateStorageId(value: String => js.Any): Self = this.set("updateStorageId", js.Any.fromFunction1(value))
  }
}
