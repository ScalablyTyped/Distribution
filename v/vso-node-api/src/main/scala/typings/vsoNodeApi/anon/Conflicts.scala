package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conflicts extends js.Object {
  
  var conflicts: scala.Double = js.native
  
  var failure: scala.Double = js.native
  
  var notSet: scala.Double = js.native
  
  var queued: scala.Double = js.native
  
  var rejectedByPolicy: scala.Double = js.native
  
  var succeeded: scala.Double = js.native
}
object Conflicts {
  
  @scala.inline
  def apply(
    conflicts: scala.Double,
    failure: scala.Double,
    notSet: scala.Double,
    queued: scala.Double,
    rejectedByPolicy: scala.Double,
    succeeded: scala.Double
  ): Conflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejectedByPolicy = rejectedByPolicy.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  
  @scala.inline
  implicit class ConflictsOps[Self <: Conflicts] (val x: Self) extends AnyVal {
    
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
    def setConflicts(value: scala.Double): Self = this.set("conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailure(value: scala.Double): Self = this.set("failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSet(value: scala.Double): Self = this.set("notSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueued(value: scala.Double): Self = this.set("queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedByPolicy(value: scala.Double): Self = this.set("rejectedByPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: scala.Double): Self = this.set("succeeded", value.asInstanceOf[js.Any])
  }
}
