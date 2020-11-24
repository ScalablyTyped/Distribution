package typings.uploadcare.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Remove extends js.Object {
  
  def remove(uuid: String, callback: js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]): Unit = js.native
  
  def store(uuid: String, callback: js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]): Unit = js.native
}
object Remove {
  
  @scala.inline
  def apply(
    remove: (String, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit,
    store: (String, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit
  ): Remove = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove), store = js.Any.fromFunction2(store))
    __obj.asInstanceOf[Remove]
  }
  
  @scala.inline
  implicit class RemoveOps[Self <: Remove] (val x: Self) extends AnyVal {
    
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
    def setRemove(
      value: (String, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit
    ): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStore(
      value: (String, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit
    ): Self = this.set("store", js.Any.fromFunction2(value))
  }
}
