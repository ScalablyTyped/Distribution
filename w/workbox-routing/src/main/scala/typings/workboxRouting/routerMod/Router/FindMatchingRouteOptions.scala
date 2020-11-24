package typings.workboxRouting.routerMod.Router

import typings.std.Request
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindMatchingRouteOptions extends HandleRequestOptions {
  
  var url: URL = js.native
}
object FindMatchingRouteOptions {
  
  @scala.inline
  def apply(request: Request, url: URL): FindMatchingRouteOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindMatchingRouteOptions]
  }
  
  @scala.inline
  implicit class FindMatchingRouteOptionsOps[Self <: FindMatchingRouteOptions] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: URL): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
