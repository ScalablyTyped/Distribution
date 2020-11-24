package typings.uiBox.safeHrefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait URLInfo extends js.Object {
  
  var sameOrigin: Boolean = js.native
  
  var url: js.UndefOr[String] = js.native
}
object URLInfo {
  
  @scala.inline
  def apply(sameOrigin: Boolean): URLInfo = {
    val __obj = js.Dynamic.literal(sameOrigin = sameOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLInfo]
  }
  
  @scala.inline
  implicit class URLInfoOps[Self <: URLInfo] (val x: Self) extends AnyVal {
    
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
    def setSameOrigin(value: Boolean): Self = this.set("sameOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
