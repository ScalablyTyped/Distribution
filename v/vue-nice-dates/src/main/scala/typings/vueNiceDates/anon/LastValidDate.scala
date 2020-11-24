package typings.vueNiceDates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastValidDate extends js.Object {
  
  @JSName("$lastValidDate")
  var $lastValidDate: String = js.native
  
  var receivedDate: String = js.native
  
  var receivedIsFocus: Boolean = js.native
}
object LastValidDate {
  
  @scala.inline
  def apply($lastValidDate: String, receivedDate: String, receivedIsFocus: Boolean): LastValidDate = {
    val __obj = js.Dynamic.literal($lastValidDate = $lastValidDate.asInstanceOf[js.Any], receivedDate = receivedDate.asInstanceOf[js.Any], receivedIsFocus = receivedIsFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastValidDate]
  }
  
  @scala.inline
  implicit class LastValidDateOps[Self <: LastValidDate] (val x: Self) extends AnyVal {
    
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
    def set$lastValidDate(value: String): Self = this.set("$lastValidDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedDate(value: String): Self = this.set("receivedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedIsFocus(value: Boolean): Self = this.set("receivedIsFocus", value.asInstanceOf[js.Any])
  }
}
