package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.`redirect-warn`
import typings.webpack.webpackStrings.default
import typings.webpack.webpackStrings.dynamic
import typings.webpack.webpackStrings.flagged
import typings.webpack.webpackStrings.namespace
import typings.webpack.webpackStrings.redirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownBuildMeta extends StObject {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var defaultObject: js.UndefOr[`false` | redirect | `redirect-warn`] = js.undefined
  
  var exportsArgument: js.UndefOr[String] = js.undefined
  
  var exportsType: js.UndefOr[namespace | dynamic | default | flagged] = js.undefined
  
  var moduleArgument: js.UndefOr[String] = js.undefined
  
  var moduleConcatenationBailout: js.UndefOr[String] = js.undefined
  
  var sideEffectFree: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var strictHarmonyModule: js.UndefOr[Boolean] = js.undefined
}
object KnownBuildMeta {
  
  inline def apply(): KnownBuildMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownBuildMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnownBuildMeta] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setDefaultObject(value: `false` | redirect | `redirect-warn`): Self = StObject.set(x, "defaultObject", value.asInstanceOf[js.Any])
    
    inline def setDefaultObjectUndefined: Self = StObject.set(x, "defaultObject", js.undefined)
    
    inline def setExportsArgument(value: String): Self = StObject.set(x, "exportsArgument", value.asInstanceOf[js.Any])
    
    inline def setExportsArgumentUndefined: Self = StObject.set(x, "exportsArgument", js.undefined)
    
    inline def setExportsType(value: namespace | dynamic | default | flagged): Self = StObject.set(x, "exportsType", value.asInstanceOf[js.Any])
    
    inline def setExportsTypeUndefined: Self = StObject.set(x, "exportsType", js.undefined)
    
    inline def setModuleArgument(value: String): Self = StObject.set(x, "moduleArgument", value.asInstanceOf[js.Any])
    
    inline def setModuleArgumentUndefined: Self = StObject.set(x, "moduleArgument", js.undefined)
    
    inline def setModuleConcatenationBailout(value: String): Self = StObject.set(x, "moduleConcatenationBailout", value.asInstanceOf[js.Any])
    
    inline def setModuleConcatenationBailoutUndefined: Self = StObject.set(x, "moduleConcatenationBailout", js.undefined)
    
    inline def setSideEffectFree(value: Boolean): Self = StObject.set(x, "sideEffectFree", value.asInstanceOf[js.Any])
    
    inline def setSideEffectFreeUndefined: Self = StObject.set(x, "sideEffectFree", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictHarmonyModule(value: Boolean): Self = StObject.set(x, "strictHarmonyModule", value.asInstanceOf[js.Any])
    
    inline def setStrictHarmonyModuleUndefined: Self = StObject.set(x, "strictHarmonyModule", js.undefined)
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
