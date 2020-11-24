package typings.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivateViews extends js.Object {
  
  var activateViews: js.Function = js.native
  
  var addCoreResolves: js.Function = js.native
  
  var eagerResolve: js.Function = js.native
  
  var ignored: js.Function = js.native
  
  var invalid: js.Function = js.native
  
  var lazyLoad: js.Function = js.native
  
  var lazyResolve: js.Function = js.native
  
  var loadViews: js.Function = js.native
  
  var onEnter: js.Function = js.native
  
  var onExit: js.Function = js.native
  
  var onRetain: js.Function = js.native
  
  var redirectTo: js.Function = js.native
  
  var resolveAll: js.Function = js.native
  
  var updateGlobals: js.Function = js.native
  
  var updateUrl: js.Function = js.native
}
object ActivateViews {
  
  @scala.inline
  def apply(
    activateViews: js.Function,
    addCoreResolves: js.Function,
    eagerResolve: js.Function,
    ignored: js.Function,
    invalid: js.Function,
    lazyLoad: js.Function,
    lazyResolve: js.Function,
    loadViews: js.Function,
    onEnter: js.Function,
    onExit: js.Function,
    onRetain: js.Function,
    redirectTo: js.Function,
    resolveAll: js.Function,
    updateGlobals: js.Function,
    updateUrl: js.Function
  ): ActivateViews = {
    val __obj = js.Dynamic.literal(activateViews = activateViews.asInstanceOf[js.Any], addCoreResolves = addCoreResolves.asInstanceOf[js.Any], eagerResolve = eagerResolve.asInstanceOf[js.Any], ignored = ignored.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], lazyLoad = lazyLoad.asInstanceOf[js.Any], lazyResolve = lazyResolve.asInstanceOf[js.Any], loadViews = loadViews.asInstanceOf[js.Any], onEnter = onEnter.asInstanceOf[js.Any], onExit = onExit.asInstanceOf[js.Any], onRetain = onRetain.asInstanceOf[js.Any], redirectTo = redirectTo.asInstanceOf[js.Any], resolveAll = resolveAll.asInstanceOf[js.Any], updateGlobals = updateGlobals.asInstanceOf[js.Any], updateUrl = updateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateViews]
  }
  
  @scala.inline
  implicit class ActivateViewsOps[Self <: ActivateViews] (val x: Self) extends AnyVal {
    
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
    def setActivateViews(value: js.Function): Self = this.set("activateViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddCoreResolves(value: js.Function): Self = this.set("addCoreResolves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEagerResolve(value: js.Function): Self = this.set("eagerResolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnored(value: js.Function): Self = this.set("ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid(value: js.Function): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyLoad(value: js.Function): Self = this.set("lazyLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyResolve(value: js.Function): Self = this.set("lazyResolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadViews(value: js.Function): Self = this.set("loadViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnter(value: js.Function): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExit(value: js.Function): Self = this.set("onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRetain(value: js.Function): Self = this.set("onRetain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectTo(value: js.Function): Self = this.set("redirectTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveAll(value: js.Function): Self = this.set("resolveAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateGlobals(value: js.Function): Self = this.set("updateGlobals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUrl(value: js.Function): Self = this.set("updateUrl", value.asInstanceOf[js.Any])
  }
}
