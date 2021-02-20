package typings.webLocksApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LockManagerSnapshot extends StObject {
  
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
  implicit class LockManagerSnapshotMutableBuilder[Self <: LockManagerSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeld(value: js.Array[Lock]): Self = StObject.set(x, "held", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeldVarargs(value: Lock*): Self = StObject.set(x, "held", js.Array(value :_*))
    
    @scala.inline
    def setPending(value: js.Array[Lock]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingVarargs(value: Lock*): Self = StObject.set(x, "pending", js.Array(value :_*))
  }
}
