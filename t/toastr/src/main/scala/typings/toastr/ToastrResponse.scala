package typings.toastr

import typings.std.Date
import typings.toastr.toastrStrings.hidden
import typings.toastr.toastrStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastrResponse extends StObject {
  
  /**
    * The datetime the toast was closed, if the state is hidden.
    */
  var endTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The event's toast details.
    */
  var map: ToastMap
  
  /**
    * The toastr options.
    */
  var options: ToastrOptions
  
  /**
    * The datetime the toast was opened.
    */
  var startTime: Date
  
  /**
    * The current state of the toast.
    */
  var state: visible | hidden
  
  /**
    * The internal toast id.
    */
  var toastId: Double
}
object ToastrResponse {
  
  inline def apply(map: ToastMap, options: ToastrOptions, startTime: Date, state: visible | hidden, toastId: Double): ToastrResponse = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], toastId = toastId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastrResponse]
  }
  
  extension [Self <: ToastrResponse](x: Self) {
    
    inline def setEndTime(value: Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMap(value: ToastMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ToastrOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setState(value: visible | hidden): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setToastId(value: Double): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
  }
}
