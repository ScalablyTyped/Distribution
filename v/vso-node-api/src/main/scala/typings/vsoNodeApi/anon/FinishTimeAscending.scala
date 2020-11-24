package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishTimeAscending extends js.Object {
  
  var finishTimeAscending: scala.Double = js.native
  
  var finishTimeDescending: scala.Double = js.native
  
  var queueTimeAscending: scala.Double = js.native
  
  var queueTimeDescending: scala.Double = js.native
  
  var startTimeAscending: scala.Double = js.native
  
  var startTimeDescending: scala.Double = js.native
}
object FinishTimeAscending {
  
  @scala.inline
  def apply(
    finishTimeAscending: scala.Double,
    finishTimeDescending: scala.Double,
    queueTimeAscending: scala.Double,
    queueTimeDescending: scala.Double,
    startTimeAscending: scala.Double,
    startTimeDescending: scala.Double
  ): FinishTimeAscending = {
    val __obj = js.Dynamic.literal(finishTimeAscending = finishTimeAscending.asInstanceOf[js.Any], finishTimeDescending = finishTimeDescending.asInstanceOf[js.Any], queueTimeAscending = queueTimeAscending.asInstanceOf[js.Any], queueTimeDescending = queueTimeDescending.asInstanceOf[js.Any], startTimeAscending = startTimeAscending.asInstanceOf[js.Any], startTimeDescending = startTimeDescending.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishTimeAscending]
  }
  
  @scala.inline
  implicit class FinishTimeAscendingOps[Self <: FinishTimeAscending] (val x: Self) extends AnyVal {
    
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
    def setFinishTimeAscending(value: scala.Double): Self = this.set("finishTimeAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTimeDescending(value: scala.Double): Self = this.set("finishTimeDescending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTimeAscending(value: scala.Double): Self = this.set("queueTimeAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTimeDescending(value: scala.Double): Self = this.set("queueTimeDescending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeAscending(value: scala.Double): Self = this.set("startTimeAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeDescending(value: scala.Double): Self = this.set("startTimeDescending", value.asInstanceOf[js.Any])
  }
}
