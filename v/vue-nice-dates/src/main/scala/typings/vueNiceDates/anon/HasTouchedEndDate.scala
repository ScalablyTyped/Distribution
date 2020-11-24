package typings.vueNiceDates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasTouchedEndDate extends js.Object {
  
  @JSName("$hasTouchedEndDate")
  var $hasTouchedEndDate: Boolean = js.native
  
  @JSName("$hasTouchedStartDate")
  var $hasTouchedStartDate: Boolean = js.native
  
  @JSName("$lastValidEndDate")
  var $lastValidEndDate: String = js.native
  
  @JSName("$lastValidStartDate")
  var $lastValidStartDate: String = js.native
  
  var receivedEndDate: String = js.native
  
  var receivedFocusName: String = js.native
  
  var receivedIsFocus: Boolean = js.native
  
  var receivedStartDate: String = js.native
}
object HasTouchedEndDate {
  
  @scala.inline
  def apply(
    $hasTouchedEndDate: Boolean,
    $hasTouchedStartDate: Boolean,
    $lastValidEndDate: String,
    $lastValidStartDate: String,
    receivedEndDate: String,
    receivedFocusName: String,
    receivedIsFocus: Boolean,
    receivedStartDate: String
  ): HasTouchedEndDate = {
    val __obj = js.Dynamic.literal($hasTouchedEndDate = $hasTouchedEndDate.asInstanceOf[js.Any], $hasTouchedStartDate = $hasTouchedStartDate.asInstanceOf[js.Any], $lastValidEndDate = $lastValidEndDate.asInstanceOf[js.Any], $lastValidStartDate = $lastValidStartDate.asInstanceOf[js.Any], receivedEndDate = receivedEndDate.asInstanceOf[js.Any], receivedFocusName = receivedFocusName.asInstanceOf[js.Any], receivedIsFocus = receivedIsFocus.asInstanceOf[js.Any], receivedStartDate = receivedStartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasTouchedEndDate]
  }
  
  @scala.inline
  implicit class HasTouchedEndDateOps[Self <: HasTouchedEndDate] (val x: Self) extends AnyVal {
    
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
    def set$hasTouchedEndDate(value: Boolean): Self = this.set("$hasTouchedEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$hasTouchedStartDate(value: Boolean): Self = this.set("$hasTouchedStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$lastValidEndDate(value: String): Self = this.set("$lastValidEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$lastValidStartDate(value: String): Self = this.set("$lastValidStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedEndDate(value: String): Self = this.set("receivedEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedFocusName(value: String): Self = this.set("receivedFocusName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedIsFocus(value: Boolean): Self = this.set("receivedIsFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedStartDate(value: String): Self = this.set("receivedStartDate", value.asInstanceOf[js.Any])
  }
}
