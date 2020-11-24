package typings.uglifyjsWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UglifyJsOptions extends js.Object {
  
  var compress: js.UndefOr[Boolean | js.Object] = js.native
  
  var ecma: js.UndefOr[Double] = js.native
  
  var ie8: js.UndefOr[Boolean] = js.native
  
  var keep_classnames: js.UndefOr[Boolean] = js.native
  
  var keep_fnames: js.UndefOr[Boolean] = js.native
  
  var mangle: js.UndefOr[Boolean | js.Object] = js.native
  
  var nameCache: js.UndefOr[js.Object] = js.native
  
  var output: js.UndefOr[js.Object] = js.native
  
  var parse: js.UndefOr[js.Object] = js.native
  
  var safari10: js.UndefOr[Boolean] = js.native
  
  var toplevel: js.UndefOr[Boolean] = js.native
  
  var warnings: js.UndefOr[Boolean] = js.native
}
object UglifyJsOptions {
  
  @scala.inline
  def apply(): UglifyJsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UglifyJsOptions]
  }
  
  @scala.inline
  implicit class UglifyJsOptionsOps[Self <: UglifyJsOptions] (val x: Self) extends AnyVal {
    
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
    def setCompress(value: Boolean | js.Object): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setEcma(value: Double): Self = this.set("ecma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcma: Self = this.set("ecma", js.undefined)
    
    @scala.inline
    def setIe8(value: Boolean): Self = this.set("ie8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIe8: Self = this.set("ie8", js.undefined)
    
    @scala.inline
    def setKeep_classnames(value: Boolean): Self = this.set("keep_classnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep_classnames: Self = this.set("keep_classnames", js.undefined)
    
    @scala.inline
    def setKeep_fnames(value: Boolean): Self = this.set("keep_fnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep_fnames: Self = this.set("keep_fnames", js.undefined)
    
    @scala.inline
    def setMangle(value: Boolean | js.Object): Self = this.set("mangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMangle: Self = this.set("mangle", js.undefined)
    
    @scala.inline
    def setNameCache(value: js.Object): Self = this.set("nameCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameCache: Self = this.set("nameCache", js.undefined)
    
    @scala.inline
    def setOutput(value: js.Object): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setParse(value: js.Object): Self = this.set("parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    
    @scala.inline
    def setSafari10(value: Boolean): Self = this.set("safari10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafari10: Self = this.set("safari10", js.undefined)
    
    @scala.inline
    def setToplevel(value: Boolean): Self = this.set("toplevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToplevel: Self = this.set("toplevel", js.undefined)
    
    @scala.inline
    def setWarnings(value: Boolean): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
