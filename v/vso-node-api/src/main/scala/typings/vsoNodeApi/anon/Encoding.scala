package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encoding extends js.Object {
  
  var add: scala.Double = js.native
  
  var all: scala.Double = js.native
  
  var branch: scala.Double = js.native
  
  var delete: scala.Double = js.native
  
  var edit: scala.Double = js.native
  
  var encoding: scala.Double = js.native
  
  var lock: scala.Double = js.native
  
  var merge: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var property: scala.Double = js.native
  
  var rename: scala.Double = js.native
  
  var rollback: scala.Double = js.native
  
  var sourceRename: scala.Double = js.native
  
  var targetRename: scala.Double = js.native
  
  var undelete: scala.Double = js.native
}
object Encoding {
  
  @scala.inline
  def apply(
    add: scala.Double,
    all: scala.Double,
    branch: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    encoding: scala.Double,
    lock: scala.Double,
    merge: scala.Double,
    none: scala.Double,
    property: scala.Double,
    rename: scala.Double,
    rollback: scala.Double,
    sourceRename: scala.Double,
    targetRename: scala.Double,
    undelete: scala.Double
  ): Encoding = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any], sourceRename = sourceRename.asInstanceOf[js.Any], targetRename = targetRename.asInstanceOf[js.Any], undelete = undelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: scala.Double): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranch(value: scala.Double): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: scala.Double): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit(value: scala.Double): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: scala.Double): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock(value: scala.Double): Self = this.set("lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge(value: scala.Double): Self = this.set("merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: scala.Double): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRename(value: scala.Double): Self = this.set("rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollback(value: scala.Double): Self = this.set("rollback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRename(value: scala.Double): Self = this.set("sourceRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRename(value: scala.Double): Self = this.set("targetRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndelete(value: scala.Double): Self = this.set("undelete", value.asInstanceOf[js.Any])
  }
}
