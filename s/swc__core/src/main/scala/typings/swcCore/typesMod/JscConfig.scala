package typings.swcCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.swcCore.anon.CacheRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JscConfig extends StObject {
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var experimental: js.UndefOr[CacheRoot] = js.undefined
  
  /**
    * Use `@swc/helpers` instead of inline helpers.
    */
  var externalHelpers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Keep class names.
    */
  var keepClassNames: js.UndefOr[Boolean] = js.undefined
  
  var loose: js.UndefOr[Boolean] = js.undefined
  
  var minify: js.UndefOr[JsMinifyOptions] = js.undefined
  
  /**
    * Defaults to EsParserConfig
    */
  var parser: js.UndefOr[ParserConfig] = js.undefined
  
  var paths: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  var preserveAllComments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to `es3` (which enabled **all** pass).
    */
  var target: js.UndefOr[JscTarget] = js.undefined
  
  var transform: js.UndefOr[TransformConfig] = js.undefined
}
object JscConfig {
  
  inline def apply(): JscConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JscConfig]
  }
  
  extension [Self <: JscConfig](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setExperimental(value: CacheRoot): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setExternalHelpers(value: Boolean): Self = StObject.set(x, "externalHelpers", value.asInstanceOf[js.Any])
    
    inline def setExternalHelpersUndefined: Self = StObject.set(x, "externalHelpers", js.undefined)
    
    inline def setKeepClassNames(value: Boolean): Self = StObject.set(x, "keepClassNames", value.asInstanceOf[js.Any])
    
    inline def setKeepClassNamesUndefined: Self = StObject.set(x, "keepClassNames", js.undefined)
    
    inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
    
    inline def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    
    inline def setMinify(value: JsMinifyOptions): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setParser(value: ParserConfig): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPreserveAllComments(value: Boolean): Self = StObject.set(x, "preserveAllComments", value.asInstanceOf[js.Any])
    
    inline def setPreserveAllCommentsUndefined: Self = StObject.set(x, "preserveAllComments", js.undefined)
    
    inline def setTarget(value: JscTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTransform(value: TransformConfig): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
