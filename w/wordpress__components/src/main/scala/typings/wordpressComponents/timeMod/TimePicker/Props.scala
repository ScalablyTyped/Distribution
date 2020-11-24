package typings.wordpressComponents.timeMod.TimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  /**
    * Date string to use as current time. If not set, current time is used.
    */
  var currentTime: js.UndefOr[String] = js.native
  
  /**
    * Whether we use a 12-hour clock. With a 12-hour clock, an AM/PM
    * widget is displayed and the time format is assumed to be MM-DD-YYYY.
    */
  var is12Hour: js.UndefOr[Boolean] = js.native
  
  /**
    * Function to call when the time value changes.
    */
  def onChange(time: String): Unit = js.native
}
object Props {
  
  @scala.inline
  def apply(onChange: String => Unit): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setOnChange(value: String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentTime(value: String): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTime: Self = this.set("currentTime", js.undefined)
    
    @scala.inline
    def setIs12Hour(value: Boolean): Self = this.set("is12Hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs12Hour: Self = this.set("is12Hour", js.undefined)
  }
}
