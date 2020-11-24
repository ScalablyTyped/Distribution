package typings.typedRestClient.interfacesMod

import typings.node.httpMod.RequestOptions
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRequestInfo extends js.Object {
  
  var httpModule: js.Any = js.native
  
  var options: RequestOptions = js.native
  
  var parsedUrl: Url = js.native
}
object IRequestInfo {
  
  @scala.inline
  def apply(httpModule: js.Any, options: RequestOptions, parsedUrl: Url): IRequestInfo = {
    val __obj = js.Dynamic.literal(httpModule = httpModule.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parsedUrl = parsedUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestInfo]
  }
  
  @scala.inline
  implicit class IRequestInfoOps[Self <: IRequestInfo] (val x: Self) extends AnyVal {
    
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
    def setHttpModule(value: js.Any): Self = this.set("httpModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: RequestOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedUrl(value: Url): Self = this.set("parsedUrl", value.asInstanceOf[js.Any])
  }
}
