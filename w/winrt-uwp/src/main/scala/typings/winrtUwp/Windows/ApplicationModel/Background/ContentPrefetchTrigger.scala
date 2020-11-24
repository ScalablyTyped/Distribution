package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to run custom handlers when prefetching web resources. */
@js.native
trait ContentPrefetchTrigger extends js.Object {
  
  /** Retrieves the time interval for prefetching web content. */
  var waitInterval: Double = js.native
}
object ContentPrefetchTrigger {
  
  @scala.inline
  def apply(waitInterval: Double): ContentPrefetchTrigger = {
    val __obj = js.Dynamic.literal(waitInterval = waitInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentPrefetchTrigger]
  }
  
  @scala.inline
  implicit class ContentPrefetchTriggerOps[Self <: ContentPrefetchTrigger] (val x: Self) extends AnyVal {
    
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
    def setWaitInterval(value: Double): Self = this.set("waitInterval", value.asInstanceOf[js.Any])
  }
}
