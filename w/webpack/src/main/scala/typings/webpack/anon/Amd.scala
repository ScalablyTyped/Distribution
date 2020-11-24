package typings.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Amd extends js.Object {
  
  /**
  				 * Set comment for `amd` section in UMD
  				 */
  var amd: js.UndefOr[String] = js.native
  
  /**
  				 * Set comment for `commonjs` (exports) section in UMD
  				 */
  var commonjs: js.UndefOr[String] = js.native
  
  /**
  				 * Set comment for `commonjs2` (module.exports) section in UMD
  				 */
  var commonjs2: js.UndefOr[String] = js.native
  
  /**
  				 * Set comment for `root` (global variable) section in UMD
  				 */
  var root: js.UndefOr[String] = js.native
}
object Amd {
  
  @scala.inline
  def apply(): Amd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Amd]
  }
  
  @scala.inline
  implicit class AmdOps[Self <: Amd] (val x: Self) extends AnyVal {
    
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
    def setAmd(value: String): Self = this.set("amd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmd: Self = this.set("amd", js.undefined)
    
    @scala.inline
    def setCommonjs(value: String): Self = this.set("commonjs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonjs: Self = this.set("commonjs", js.undefined)
    
    @scala.inline
    def setCommonjs2(value: String): Self = this.set("commonjs2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonjs2: Self = this.set("commonjs2", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
