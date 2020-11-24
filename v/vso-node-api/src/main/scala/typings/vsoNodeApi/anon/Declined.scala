package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Declined extends js.Object {
  
  var completed: scala.Double = js.native
  
  var declined: scala.Double = js.native
  
  var inProgress: scala.Double = js.native
  
  var notStarted: scala.Double = js.native
  
  var paused: scala.Double = js.native
  
  var unspecified: scala.Double = js.native
}
object Declined {
  
  @scala.inline
  def apply(
    completed: scala.Double,
    declined: scala.Double,
    inProgress: scala.Double,
    notStarted: scala.Double,
    paused: scala.Double,
    unspecified: scala.Double
  ): Declined = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], declined = declined.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declined]
  }
  
  @scala.inline
  implicit class DeclinedOps[Self <: Declined] (val x: Self) extends AnyVal {
    
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
    def setCompleted(value: scala.Double): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclined(value: scala.Double): Self = this.set("declined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgress(value: scala.Double): Self = this.set("inProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotStarted(value: scala.Double): Self = this.set("notStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaused(value: scala.Double): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnspecified(value: scala.Double): Self = this.set("unspecified", value.asInstanceOf[js.Any])
  }
}
