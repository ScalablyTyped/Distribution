package typings.sumoLogger.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<sumo-logger.sumo-logger.PerMessageOptions> */
@js.native
trait PartialPerMessageOptions extends js.Object {
  
  var sessionKey: js.UndefOr[String] = js.native
  
  var timestamp: js.UndefOr[Date] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object PartialPerMessageOptions {
  
  @scala.inline
  def apply(): PartialPerMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPerMessageOptions]
  }
  
  @scala.inline
  implicit class PartialPerMessageOptionsOps[Self <: PartialPerMessageOptions] (val x: Self) extends AnyVal {
    
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
    def setSessionKey(value: String): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionKey: Self = this.set("sessionKey", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
