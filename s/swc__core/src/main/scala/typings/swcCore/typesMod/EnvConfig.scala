package typings.swcCore.typesMod

import typings.swcCore.swcCoreStrings.entry
import typings.swcCore.swcCoreStrings.usage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvConfig extends StObject {
  
  /**
    * The version of the used core js.
    *
    */
  var coreJs: js.UndefOr[String] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var dynamicImport: js.UndefOr[Boolean] = js.undefined
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Enable all transforms
    */
  var forceAllTransforms: js.UndefOr[Boolean] = js.undefined
  
  var include: js.UndefOr[js.Array[String]] = js.undefined
  
  var loose: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[usage | entry] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var shippedProposals: js.UndefOr[Boolean] = js.undefined
  
  var skip: js.UndefOr[js.Array[String]] = js.undefined
  
  var targets: js.UndefOr[Any] = js.undefined
}
object EnvConfig {
  
  inline def apply(): EnvConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvConfig]
  }
  
  extension [Self <: EnvConfig](x: Self) {
    
    inline def setCoreJs(value: String): Self = StObject.set(x, "coreJs", value.asInstanceOf[js.Any])
    
    inline def setCoreJsUndefined: Self = StObject.set(x, "coreJs", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDynamicImport(value: Boolean): Self = StObject.set(x, "dynamicImport", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportUndefined: Self = StObject.set(x, "dynamicImport", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setForceAllTransforms(value: Boolean): Self = StObject.set(x, "forceAllTransforms", value.asInstanceOf[js.Any])
    
    inline def setForceAllTransformsUndefined: Self = StObject.set(x, "forceAllTransforms", js.undefined)
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
    
    inline def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    
    inline def setMode(value: usage | entry): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setShippedProposals(value: Boolean): Self = StObject.set(x, "shippedProposals", value.asInstanceOf[js.Any])
    
    inline def setShippedProposalsUndefined: Self = StObject.set(x, "shippedProposals", js.undefined)
    
    inline def setSkip(value: js.Array[String]): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSkipVarargs(value: String*): Self = StObject.set(x, "skip", js.Array(value*))
    
    inline def setTargets(value: Any): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
  }
}
