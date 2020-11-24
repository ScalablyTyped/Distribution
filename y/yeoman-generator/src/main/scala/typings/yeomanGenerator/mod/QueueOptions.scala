package typings.yeomanGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for queues.
  */
@js.native
trait QueueOptions extends js.Object {
  
  /**
    * A value indicating whether the queue should be executed only once per namespace and task-name.
    */
  var once: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the queue.
    */
  var queueName: js.UndefOr[String] = js.native
  
  /**
    * A value indicating whether the queue should be executed if not running yet.
    */
  var run: js.UndefOr[Boolean] = js.native
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
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    
    @scala.inline
    def setQueueName(value: String): Self = this.set("queueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueName: Self = this.set("queueName", js.undefined)
    
    @scala.inline
    def setRun(value: Boolean): Self = this.set("run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
  }
}
