package typings.wampy.mod

import typings.wampy.wampyStrings.prefix
import typings.wampy.wampyStrings.wildcard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeAdvancedOptions extends js.Object {
  
  var `match`: js.UndefOr[prefix | wildcard] = js.native
}
object SubscribeAdvancedOptions {
  
  @scala.inline
  def apply(): SubscribeAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeAdvancedOptions]
  }
  
  @scala.inline
  implicit class SubscribeAdvancedOptionsOps[Self <: SubscribeAdvancedOptions] (val x: Self) extends AnyVal {
    
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
    def setMatch(value: prefix | wildcard): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
  }
}
