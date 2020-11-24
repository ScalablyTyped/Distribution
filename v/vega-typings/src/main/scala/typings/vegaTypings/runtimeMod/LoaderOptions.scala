package typings.vegaTypings.runtimeMod

import typings.std.RequestInit
import typings.vegaTypings.vegaTypingsStrings.file
import typings.vegaTypings.vegaTypingsStrings.http
import typings.vegaTypings.vegaTypingsStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderOptions extends js.Object {
  
  var baseURL: js.UndefOr[String] = js.native
  
  var defaultProtocol: js.UndefOr[http | https | String] = js.native
  
  var http: js.UndefOr[RequestInit] = js.native
  
  var mode: js.UndefOr[file | http] = js.native
  
  var target: js.UndefOr[String] = js.native
}
object LoaderOptions {
  
  @scala.inline
  def apply(): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderOptions]
  }
  
  @scala.inline
  implicit class LoaderOptionsOps[Self <: LoaderOptions] (val x: Self) extends AnyVal {
    
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
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseURL: Self = this.set("baseURL", js.undefined)
    
    @scala.inline
    def setDefaultProtocol(value: http | https | String): Self = this.set("defaultProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultProtocol: Self = this.set("defaultProtocol", js.undefined)
    
    @scala.inline
    def setHttp(value: RequestInit): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setMode(value: file | http): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
