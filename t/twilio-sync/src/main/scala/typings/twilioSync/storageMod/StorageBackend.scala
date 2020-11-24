package typings.twilioSync.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageBackend extends js.Object {
  
  def getItem(key: String): String = js.native
  
  def removeItem(key: String): Unit = js.native
  
  def setItem(key: String, value: String): Unit = js.native
}
object StorageBackend {
  
  @scala.inline
  def apply(getItem: String => String, removeItem: String => Unit, setItem: (String, String) => Unit): StorageBackend = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[StorageBackend]
  }
  
  @scala.inline
  implicit class StorageBackendOps[Self <: StorageBackend] (val x: Self) extends AnyVal {
    
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
    def setGetItem(value: String => String): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveItem(value: String => Unit): Self = this.set("removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItem(value: (String, String) => Unit): Self = this.set("setItem", js.Any.fromFunction2(value))
  }
}
