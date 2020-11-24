package typings.yogBigpipe.mod

import typings.yogBigpipe.mod.Pagelet.mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageletOption extends js.Object {
  
  var compiled: js.UndefOr[Boolean] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var `for`: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  var locals: js.UndefOr[js.Object] = js.native
  
  var mode: js.UndefOr[typings.yogBigpipe.mod.Pagelet.mode] = js.native
  
  var reqID: String = js.native
  
  var skipAnalysis: Boolean = js.native
}
object PageletOption {
  
  @scala.inline
  def apply(id: String, reqID: String, skipAnalysis: Boolean): PageletOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], reqID = reqID.asInstanceOf[js.Any], skipAnalysis = skipAnalysis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageletOption]
  }
  
  @scala.inline
  implicit class PageletOptionOps[Self <: PageletOption] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqID(value: String): Self = this.set("reqID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipAnalysis(value: Boolean): Self = this.set("skipAnalysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompiled(value: Boolean): Self = this.set("compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiled: Self = this.set("compiled", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setFor(value: String): Self = this.set("for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFor: Self = this.set("for", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    
    @scala.inline
    def setLocals(value: js.Object): Self = this.set("locals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocals: Self = this.set("locals", js.undefined)
    
    @scala.inline
    def setMode(value: mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
