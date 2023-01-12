package typings.swcNodeCore

import org.scalablytyped.runtime.StringDictionary
import typings.swcCore.typesMod.JscTarget
import typings.swcCore.typesMod.Output
import typings.swcNodeCore.anon.PartialReactConfig
import typings.swcNodeCore.swcNodeCoreStrings.`inline`
import typings.swcNodeCore.swcNodeCoreStrings.amd
import typings.swcNodeCore.swcNodeCoreStrings.commonjs
import typings.swcNodeCore.swcNodeCoreStrings.es6
import typings.swcNodeCore.swcNodeCoreStrings.umd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@swc-node/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transform(source: String, path: String): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(source.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]
  inline def transform(source: String, path: String, options: Options): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(source.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]
  
  inline def transformJest(source: String, path: String): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("transformJest")(source.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Output]
  inline def transformJest(source: String, path: String, options: Options): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("transformJest")(source.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  inline def transformSync(source: String, path: String): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(source.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Output]
  inline def transformSync(source: String, path: String, options: Options): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(source.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  trait Options extends StObject {
    
    var dynamicImport: js.UndefOr[Boolean] = js.undefined
    
    var emitDecoratorMetadata: js.UndefOr[Boolean] = js.undefined
    
    var esModuleInterop: js.UndefOr[Boolean] = js.undefined
    
    var experimentalDecorators: js.UndefOr[Boolean] = js.undefined
    
    var jsx: js.UndefOr[Boolean] = js.undefined
    
    var keepClassNames: js.UndefOr[Boolean] = js.undefined
    
    var module: js.UndefOr[commonjs | umd | amd | es6] = js.undefined
    
    var paths: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
    
    var react: js.UndefOr[PartialReactConfig] = js.undefined
    
    var sourcemap: js.UndefOr[Boolean | `inline`] = js.undefined
    
    var swc: js.UndefOr[typings.swcCore.typesMod.Options] = js.undefined
    
    var target: js.UndefOr[JscTarget] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDynamicImport(value: Boolean): Self = StObject.set(x, "dynamicImport", value.asInstanceOf[js.Any])
      
      inline def setDynamicImportUndefined: Self = StObject.set(x, "dynamicImport", js.undefined)
      
      inline def setEmitDecoratorMetadata(value: Boolean): Self = StObject.set(x, "emitDecoratorMetadata", value.asInstanceOf[js.Any])
      
      inline def setEmitDecoratorMetadataUndefined: Self = StObject.set(x, "emitDecoratorMetadata", js.undefined)
      
      inline def setEsModuleInterop(value: Boolean): Self = StObject.set(x, "esModuleInterop", value.asInstanceOf[js.Any])
      
      inline def setEsModuleInteropUndefined: Self = StObject.set(x, "esModuleInterop", js.undefined)
      
      inline def setExperimentalDecorators(value: Boolean): Self = StObject.set(x, "experimentalDecorators", value.asInstanceOf[js.Any])
      
      inline def setExperimentalDecoratorsUndefined: Self = StObject.set(x, "experimentalDecorators", js.undefined)
      
      inline def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      inline def setKeepClassNames(value: Boolean): Self = StObject.set(x, "keepClassNames", value.asInstanceOf[js.Any])
      
      inline def setKeepClassNamesUndefined: Self = StObject.set(x, "keepClassNames", js.undefined)
      
      inline def setModule(value: commonjs | umd | amd | es6): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setReact(value: PartialReactConfig): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
      
      inline def setReactUndefined: Self = StObject.set(x, "react", js.undefined)
      
      inline def setSourcemap(value: Boolean | `inline`): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
      
      inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
      
      inline def setSwc(value: typings.swcCore.typesMod.Options): Self = StObject.set(x, "swc", value.asInstanceOf[js.Any])
      
      inline def setSwcUndefined: Self = StObject.set(x, "swc", js.undefined)
      
      inline def setTarget(value: JscTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
