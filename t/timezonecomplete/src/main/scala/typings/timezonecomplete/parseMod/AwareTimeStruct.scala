package typings.timezonecomplete.parseMod

import typings.timezonecomplete.basicsMod.TimeStruct
import typings.timezonecomplete.timezoneMod.TimeZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwareTimeStruct extends js.Object {
  
  /**
    * The time struct
    */
  var time: TimeStruct = js.native
  
  /**
    * The time zone (can be undefined)
    */
  var zone: js.UndefOr[TimeZone] = js.native
}
object AwareTimeStruct {
  
  @scala.inline
  def apply(time: TimeStruct): AwareTimeStruct = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwareTimeStruct]
  }
  
  @scala.inline
  implicit class AwareTimeStructOps[Self <: AwareTimeStruct] (val x: Self) extends AnyVal {
    
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
    def setTime(value: TimeStruct): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZone(value: TimeZone): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
