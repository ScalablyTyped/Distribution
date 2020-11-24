package typings.webLocksApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LockManagerSnapshot extends js.Object {
  
  var held: js.Array[Lock] = js.native
  
  var pending: js.Array[Lock] = js.native
}
object LockManagerSnapshot {
  
  @scala.inline
  def apply(held: js.Array[Lock], pending: js.Array[Lock]): LockManagerSnapshot = {
    val __obj = js.Dynamic.literal(held = held.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockManagerSnapshot]
  }
  
  @scala.inline
  implicit class LockManagerSnapshotOps[Self <: LockManagerSnapshot] (val x: Self) extends AnyVal {
    
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
    def setHeldVarargs(value: Lock*): Self = this.set("held", js.Array(value :_*))
    
    @scala.inline
    def setHeld(value: js.Array[Lock]): Self = this.set("held", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingVarargs(value: Lock*): Self = this.set("pending", js.Array(value :_*))
    
    @scala.inline
    def setPending(value: js.Array[Lock]): Self = this.set("pending", value.asInstanceOf[js.Any])
  }
}
