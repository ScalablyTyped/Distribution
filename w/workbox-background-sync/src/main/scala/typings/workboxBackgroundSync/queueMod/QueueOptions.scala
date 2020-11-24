package typings.workboxBackgroundSync.queueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueOptions extends js.Object {
  
  var maxRetentionTime: js.UndefOr[Double] = js.native
  
  var onSync: js.UndefOr[QueueOnSyncHandler] = js.native
}
object QueueOptions {
  
  @scala.inline
  def apply(): QueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueOptions]
  }
  
  @scala.inline
  implicit class QueueOptionsOps[Self <: QueueOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxRetentionTime(value: Double): Self = this.set("maxRetentionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetentionTime: Self = this.set("maxRetentionTime", js.undefined)
    
    @scala.inline
    def setOnSync(value: /* options */ QueueOnSyncEvent => Unit | js.Promise[Unit]): Self = this.set("onSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSync: Self = this.set("onSync", js.undefined)
  }
}
