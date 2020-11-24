package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWallaby extends js.Object {
  
  var compilers: js.UndefOr[IWallabyBuiltInCompilers] = js.native
  
  var defaults: js.UndefOr[js.Any] = js.native
  
  var localProjectDir: js.UndefOr[String] = js.native
  
  var projectCacheDir: js.UndefOr[String] = js.native
}
object IWallaby {
  
  @scala.inline
  def apply(): IWallaby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWallaby]
  }
  
  @scala.inline
  implicit class IWallabyOps[Self <: IWallaby] (val x: Self) extends AnyVal {
    
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
    def setCompilers(value: IWallabyBuiltInCompilers): Self = this.set("compilers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilers: Self = this.set("compilers", js.undefined)
    
    @scala.inline
    def setDefaults(value: js.Any): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setLocalProjectDir(value: String): Self = this.set("localProjectDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalProjectDir: Self = this.set("localProjectDir", js.undefined)
    
    @scala.inline
    def setProjectCacheDir(value: String): Self = this.set("projectCacheDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectCacheDir: Self = this.set("projectCacheDir", js.undefined)
  }
}
