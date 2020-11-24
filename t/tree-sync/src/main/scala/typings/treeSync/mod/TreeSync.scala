package typings.treeSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeSync extends js.Object {
  
  /**
    * Syncs the input directory to the output directory. File I/O is done synchronously.
    */
  def sync(): js.Array[TreeSyncResult] = js.native
}
object TreeSync {
  
  @scala.inline
  def apply(sync: () => js.Array[TreeSyncResult]): TreeSync = {
    val __obj = js.Dynamic.literal(sync = js.Any.fromFunction0(sync))
    __obj.asInstanceOf[TreeSync]
  }
  
  @scala.inline
  implicit class TreeSyncOps[Self <: TreeSync] (val x: Self) extends AnyVal {
    
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
    def setSync(value: () => js.Array[TreeSyncResult]): Self = this.set("sync", js.Any.fromFunction0(value))
  }
}
