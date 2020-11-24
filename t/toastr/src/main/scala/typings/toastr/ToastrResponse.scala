package typings.toastr

import typings.std.Date
import typings.toastr.toastrStrings.hidden
import typings.toastr.toastrStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastrResponse extends js.Object {
  
  /**
    * The datetime the toast was closed, if the state is hidden.
    */
  var endTime: js.UndefOr[Date] = js.native
  
  /**
    * The event's toast details.
    */
  var map: ToastMap = js.native
  
  /**
    * The toastr options.
    */
  var options: ToastrOptions = js.native
  
  /**
    * The datetime the toast was opened.
    */
  var startTime: Date = js.native
  
  /**
    * The current state of the toast.
    */
  var state: visible | hidden = js.native
  
  /**
    * The internal toast id.
    */
  var toastId: Double = js.native
}
object ToastrResponse {
  
  @scala.inline
  def apply(map: ToastMap, options: ToastrOptions, startTime: Date, state: visible | hidden, toastId: Double): ToastrResponse = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], toastId = toastId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastrResponse]
  }
  
  @scala.inline
  implicit class ToastrResponseOps[Self <: ToastrResponse] (val x: Self) extends AnyVal {
    
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
    def setMap(value: ToastMap): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ToastrOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: visible | hidden): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToastId(value: Double): Self = this.set("toastId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: Date): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
  }
}
