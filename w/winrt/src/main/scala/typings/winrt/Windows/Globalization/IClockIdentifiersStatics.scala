package typings.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClockIdentifiersStatics extends js.Object {
  
  var twelveHour: String = js.native
  
  var twentyFourHour: String = js.native
}
object IClockIdentifiersStatics {
  
  @scala.inline
  def apply(twelveHour: String, twentyFourHour: String): IClockIdentifiersStatics = {
    val __obj = js.Dynamic.literal(twelveHour = twelveHour.asInstanceOf[js.Any], twentyFourHour = twentyFourHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClockIdentifiersStatics]
  }
  
  @scala.inline
  implicit class IClockIdentifiersStaticsOps[Self <: IClockIdentifiersStatics] (val x: Self) extends AnyVal {
    
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
    def setTwelveHour(value: String): Self = this.set("twelveHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwentyFourHour(value: String): Self = this.set("twentyFourHour", value.asInstanceOf[js.Any])
  }
}
