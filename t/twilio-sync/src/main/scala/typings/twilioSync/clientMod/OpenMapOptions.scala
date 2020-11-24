package typings.twilioSync.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenMapOptions extends OpenOptions {
  
  var includeItems: js.UndefOr[Boolean] = js.native
}
object OpenMapOptions {
  
  @scala.inline
  def apply(): OpenMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenMapOptions]
  }
  
  @scala.inline
  implicit class OpenMapOptionsOps[Self <: OpenMapOptions] (val x: Self) extends AnyVal {
    
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
    def setIncludeItems(value: Boolean): Self = this.set("includeItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeItems: Self = this.set("includeItems", js.undefined)
  }
}
