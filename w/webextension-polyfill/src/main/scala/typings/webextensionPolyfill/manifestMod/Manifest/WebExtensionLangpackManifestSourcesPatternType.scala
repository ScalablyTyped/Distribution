package typings.webextensionPolyfill.manifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionLangpackManifestSourcesPatternType extends StObject {
  
  var base_path: ExtensionURL
  
  /**
    * Optional.
    */
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}
object WebExtensionLangpackManifestSourcesPatternType {
  
  inline def apply(base_path: ExtensionURL): WebExtensionLangpackManifestSourcesPatternType = {
    val __obj = js.Dynamic.literal(base_path = base_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionLangpackManifestSourcesPatternType]
  }
  
  extension [Self <: WebExtensionLangpackManifestSourcesPatternType](x: Self) {
    
    inline def setBase_path(value: ExtensionURL): Self = StObject.set(x, "base_path", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
