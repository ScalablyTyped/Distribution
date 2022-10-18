package typings.sucrase

import typings.sucrase.sucraseStrings.automatic
import typings.sucrase.sucraseStrings.classic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOptionsMod {
  
  @JSImport("sucrase/dist/types/Options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateOptions(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
      * Opts out of all ES syntax transformations: optional chaining, nullish
      * coalescing, class fields, numeric separators, optional catch binding.
      */
    var disableESTransforms: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, replicate the import behavior Babel 5 and babel-plugin-add-module-exports.
      */
    var enableLegacyBabel5ModuleInterop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, replicate the import behavior of TypeScript's esModuleInterop: false.
      */
    var enableLegacyTypeScriptModuleInterop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * File path to use in error messages, React display names, and source maps.
      */
    var filePath: js.UndefOr[String] = js.undefined
    
    /**
      * Only relevant when targeting ESM (i.e. when the imports transform is *not*
      * specified). This flag changes the behavior of TS require imports:
      *
      * import Foo = require("foo");
      *
      * to import createRequire, create a require function, and use that function.
      * This is the TS behavior with module: nodenext and makes it easier for the
      * same code to target ESM and CJS.
      */
    var injectCreateRequireForImportRequire: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If specified, function name to use in place of React.Fragment when
      * compiling JSX with the classic runtime.
      */
    var jsxFragmentPragma: js.UndefOr[String] = js.undefined
    
    /**
      * If specified, import path prefix to use in place of "react" when compiling
      * JSX with the automatic runtime.
      */
    var jsxImportSource: js.UndefOr[String] = js.undefined
    
    /**
      * If specified, function name to use in place of React.createClass when
      * compiling JSX with the classic runtime.
      */
    var jsxPragma: js.UndefOr[String] = js.undefined
    
    /**
      * Transformation mode for the JSX transform. The automatic transform refers
      * to the transform behavior released with React 17, where the `jsx` function
      * (or a variation) is automatically imported. The classic transform refers to
      * the previous behavior using `React.createElement`.
      *
      * Default value: "classic"
      */
    var jsxRuntime: js.UndefOr[classic | automatic] = js.undefined
    
    /**
      * If specified, the imports transform does not attempt to change dynamic
      * import() expressions into require() calls.
      */
    var preserveDynamicImport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Compile code for production use. Currently only applies to the JSX
      * transform.
      */
    var production: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If specified, we also return a RawSourceMap object alongside the code.
      * Currently, source maps simply map each line to the original line without
      * any mappings within lines, since Sucrase preserves line numbers. filePath
      * must be specified if this option is enabled.
      */
    var sourceMapOptions: js.UndefOr[SourceMapOptions] = js.undefined
    
    /**
      * Unordered array of transform names describing both the allowed syntax
      * (where applicable) and the transformation behavior.
      */
    var transforms: js.Array[Transform]
  }
  object Options {
    
    inline def apply(transforms: js.Array[Transform]): Options = {
      val __obj = js.Dynamic.literal(transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDisableESTransforms(value: Boolean): Self = StObject.set(x, "disableESTransforms", value.asInstanceOf[js.Any])
      
      inline def setDisableESTransformsUndefined: Self = StObject.set(x, "disableESTransforms", js.undefined)
      
      inline def setEnableLegacyBabel5ModuleInterop(value: Boolean): Self = StObject.set(x, "enableLegacyBabel5ModuleInterop", value.asInstanceOf[js.Any])
      
      inline def setEnableLegacyBabel5ModuleInteropUndefined: Self = StObject.set(x, "enableLegacyBabel5ModuleInterop", js.undefined)
      
      inline def setEnableLegacyTypeScriptModuleInterop(value: Boolean): Self = StObject.set(x, "enableLegacyTypeScriptModuleInterop", value.asInstanceOf[js.Any])
      
      inline def setEnableLegacyTypeScriptModuleInteropUndefined: Self = StObject.set(x, "enableLegacyTypeScriptModuleInterop", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setInjectCreateRequireForImportRequire(value: Boolean): Self = StObject.set(x, "injectCreateRequireForImportRequire", value.asInstanceOf[js.Any])
      
      inline def setInjectCreateRequireForImportRequireUndefined: Self = StObject.set(x, "injectCreateRequireForImportRequire", js.undefined)
      
      inline def setJsxFragmentPragma(value: String): Self = StObject.set(x, "jsxFragmentPragma", value.asInstanceOf[js.Any])
      
      inline def setJsxFragmentPragmaUndefined: Self = StObject.set(x, "jsxFragmentPragma", js.undefined)
      
      inline def setJsxImportSource(value: String): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
      
      inline def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
      
      inline def setJsxPragma(value: String): Self = StObject.set(x, "jsxPragma", value.asInstanceOf[js.Any])
      
      inline def setJsxPragmaUndefined: Self = StObject.set(x, "jsxPragma", js.undefined)
      
      inline def setJsxRuntime(value: classic | automatic): Self = StObject.set(x, "jsxRuntime", value.asInstanceOf[js.Any])
      
      inline def setJsxRuntimeUndefined: Self = StObject.set(x, "jsxRuntime", js.undefined)
      
      inline def setPreserveDynamicImport(value: Boolean): Self = StObject.set(x, "preserveDynamicImport", value.asInstanceOf[js.Any])
      
      inline def setPreserveDynamicImportUndefined: Self = StObject.set(x, "preserveDynamicImport", js.undefined)
      
      inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      inline def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      inline def setSourceMapOptions(value: SourceMapOptions): Self = StObject.set(x, "sourceMapOptions", value.asInstanceOf[js.Any])
      
      inline def setSourceMapOptionsUndefined: Self = StObject.set(x, "sourceMapOptions", js.undefined)
      
      inline def setTransforms(value: js.Array[Transform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsVarargs(value: Transform*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
  
  trait SourceMapOptions extends StObject {
    
    /**
      * The name to use in the "file" field of the source map. This should be the name of the compiled
      * file.
      */
    var compiledFilename: String
  }
  object SourceMapOptions {
    
    inline def apply(compiledFilename: String): SourceMapOptions = {
      val __obj = js.Dynamic.literal(compiledFilename = compiledFilename.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapOptions]
    }
    
    extension [Self <: SourceMapOptions](x: Self) {
      
      inline def setCompiledFilename(value: String): Self = StObject.set(x, "compiledFilename", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sucrase.sucraseStrings.jsx
    - typings.sucrase.sucraseStrings.typescript
    - typings.sucrase.sucraseStrings.flow
    - typings.sucrase.sucraseStrings.imports
    - typings.sucrase.sucraseStrings.`react-hot-loader`
    - typings.sucrase.sucraseStrings.jest
  */
  trait Transform extends StObject
  object Transform {
    
    inline def flow: typings.sucrase.sucraseStrings.flow = "flow".asInstanceOf[typings.sucrase.sucraseStrings.flow]
    
    inline def imports: typings.sucrase.sucraseStrings.imports = "imports".asInstanceOf[typings.sucrase.sucraseStrings.imports]
    
    inline def jest: typings.sucrase.sucraseStrings.jest = "jest".asInstanceOf[typings.sucrase.sucraseStrings.jest]
    
    inline def jsx: typings.sucrase.sucraseStrings.jsx = "jsx".asInstanceOf[typings.sucrase.sucraseStrings.jsx]
    
    inline def `react-hot-loader`: typings.sucrase.sucraseStrings.`react-hot-loader` = "react-hot-loader".asInstanceOf[typings.sucrase.sucraseStrings.`react-hot-loader`]
    
    inline def typescript: typings.sucrase.sucraseStrings.typescript = "typescript".asInstanceOf[typings.sucrase.sucraseStrings.typescript]
  }
}
