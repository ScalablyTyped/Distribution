package typings.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateViews extends StObject {
  
  var activateViews: js.Function
  
  var addCoreResolves: js.Function
  
  var eagerResolve: js.Function
  
  var ignored: js.Function
  
  var invalid: js.Function
  
  var lazyLoad: js.Function
  
  var lazyResolve: js.Function
  
  var loadViews: js.Function
  
  var onEnter: js.Function
  
  var onExit: js.Function
  
  var onRetain: js.Function
  
  var redirectTo: js.Function
  
  var resolveAll: js.Function
  
  var updateGlobals: js.Function
  
  var updateUrl: js.Function
}
object ActivateViews {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ActivateViews] (val x: Self) extends AnyVal {
    
    inline def setActivateViews(value: js.Function): Self = StObject.set(x, "activateViews", value.asInstanceOf[js.Any])
    
    inline def setAddCoreResolves(value: js.Function): Self = StObject.set(x, "addCoreResolves", value.asInstanceOf[js.Any])
    
    inline def setEagerResolve(value: js.Function): Self = StObject.set(x, "eagerResolve", value.asInstanceOf[js.Any])
    
    inline def setIgnored(value: js.Function): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setInvalid(value: js.Function): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setLazyLoad(value: js.Function): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
    
    inline def setLazyResolve(value: js.Function): Self = StObject.set(x, "lazyResolve", value.asInstanceOf[js.Any])
    
    inline def setLoadViews(value: js.Function): Self = StObject.set(x, "loadViews", value.asInstanceOf[js.Any])
    
    inline def setOnEnter(value: js.Function): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    inline def setOnExit(value: js.Function): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
    
    inline def setOnRetain(value: js.Function): Self = StObject.set(x, "onRetain", value.asInstanceOf[js.Any])
    
    inline def setRedirectTo(value: js.Function): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
    
    inline def setResolveAll(value: js.Function): Self = StObject.set(x, "resolveAll", value.asInstanceOf[js.Any])
    
    inline def setUpdateGlobals(value: js.Function): Self = StObject.set(x, "updateGlobals", value.asInstanceOf[js.Any])
    
    inline def setUpdateUrl(value: js.Function): Self = StObject.set(x, "updateUrl", value.asInstanceOf[js.Any])
  }
}
