package typings.tsLoader.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpackError extends js.Object {
  
  var file: js.UndefOr[String] = js.native
  
  var loaderSource: String = js.native
  
  var location: js.UndefOr[FileLocation] = js.native
  
  var message: String = js.native
  
  var module: js.UndefOr[js.Any] = js.native
}
object WebpackError {
  
  @scala.inline
  def apply(loaderSource: String, message: String): WebpackError = {
    val __obj = js.Dynamic.literal(loaderSource = loaderSource.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpackError]
  }
  
  @scala.inline
  implicit class WebpackErrorOps[Self <: WebpackError] (val x: Self) extends AnyVal {
    
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
    def setLoaderSource(value: String): Self = this.set("loaderSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setLocation(value: FileLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setModule(value: js.Any): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
  }
}
