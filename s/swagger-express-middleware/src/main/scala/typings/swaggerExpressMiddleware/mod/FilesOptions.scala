package typings.swaggerExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesOptions extends js.Object {
  
  var apiPath: js.UndefOr[String] = js.native
  
  var rawFilesPath: js.UndefOr[String] = js.native
  
  var useBasePath: js.UndefOr[Boolean] = js.native
}
object FilesOptions {
  
  @scala.inline
  def apply(): FilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilesOptions]
  }
  
  @scala.inline
  implicit class FilesOptionsOps[Self <: FilesOptions] (val x: Self) extends AnyVal {
    
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
    def setApiPath(value: String): Self = this.set("apiPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiPath: Self = this.set("apiPath", js.undefined)
    
    @scala.inline
    def setRawFilesPath(value: String): Self = this.set("rawFilesPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawFilesPath: Self = this.set("rawFilesPath", js.undefined)
    
    @scala.inline
    def setUseBasePath(value: Boolean): Self = this.set("useBasePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBasePath: Self = this.set("useBasePath", js.undefined)
  }
}
