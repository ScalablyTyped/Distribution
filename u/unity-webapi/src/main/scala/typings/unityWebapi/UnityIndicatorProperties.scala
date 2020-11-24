package typings.unityWebapi

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnityIndicatorProperties extends js.Object {
  
  var count: Double = js.native
  
  var iconURI: String = js.native
  
  var onIndicatorActivated: js.Function = js.native
  
  var time: Date = js.native
}
object UnityIndicatorProperties {
  
  @scala.inline
  def apply(count: Double, iconURI: String, onIndicatorActivated: js.Function, time: Date): UnityIndicatorProperties = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], iconURI = iconURI.asInstanceOf[js.Any], onIndicatorActivated = onIndicatorActivated.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnityIndicatorProperties]
  }
  
  @scala.inline
  implicit class UnityIndicatorPropertiesOps[Self <: UnityIndicatorProperties] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconURI(value: String): Self = this.set("iconURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnIndicatorActivated(value: js.Function): Self = this.set("onIndicatorActivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Date): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
