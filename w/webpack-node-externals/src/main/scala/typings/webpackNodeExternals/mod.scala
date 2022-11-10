package typings.webpackNodeExternals

import typings.webpack.mod.Externals
import typings.webpackNodeExternals.webpackNodeExternalsStrings.`this`
import typings.webpackNodeExternals.webpackNodeExternalsStrings.`var`
import typings.webpackNodeExternals.webpackNodeExternalsStrings.amd
import typings.webpackNodeExternals.webpackNodeExternalsStrings.commonjs
import typings.webpackNodeExternals.webpackNodeExternalsStrings.umd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExternalItem = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExternalItem]
  inline def apply(options: Options): ExternalItem = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ExternalItem]
  
  @JSImport("webpack-node-externals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** a function that accepts the module name and returns whether it should be included */
  type AllowlistFunctionType = js.Function1[/* moduleName */ String, Boolean]
  
  type AllowlistOption = String | js.RegExp | AllowlistFunctionType
  
  /** The webpack types don't export this so we have to derive it. */
  type ExternalItem = GetArrayInnerType[Externals]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends std.Array<infer U> ? U : never
    }}}
    */
  @js.native
  trait GetArrayInnerType[T] extends StObject
  
  type ImportTypeCallback = js.Function1[/* moduleName */ String, String]
  
  trait ModulesFromFileType extends StObject {
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var include: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ModulesFromFileType {
    
    inline def apply(): ModulesFromFileType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModulesFromFileType]
    }
    
    extension [Self <: ModulesFromFileType](x: Self) {
      
      inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: String | js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Additional folders to look for node modules.
      */
    var additionalModuleDirs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An array for the externals to allow, so they will be included in the bundle.
      * Can accept exact strings ('module_name'), regex patterns (/^module_name/), or a
      * function that accepts the module name and returns whether it should be included.
      * Important - if you have set aliases in your webpack config with the exact
      * same names as modules in node_modules, you need to allowlist them so Webpack will know
      * they should be bundled.
      * @default []
      */
    var allowlist: js.UndefOr[js.Array[AllowlistOption] | AllowlistOption] = js.undefined
    
    /**
      * @default ['.bin']
      */
    var binaryDirs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The method in which unbundled modules will be required in the code. Best to leave as
      * 'commonjs' for node modules.
      * @default 'commonjs'
      */
    var importType: js.UndefOr[`var` | `this` | commonjs | amd | umd | ImportTypeCallback] = js.undefined
    
    /**
      * @default false
      */
    var includeAbsolutePaths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The folder in which to search for the node modules.
      * @default 'node_modules'
      */
    var modulesDir: js.UndefOr[String] = js.undefined
    
    /**
      * Read the modules from the package.json file instead of the node_modules folder.
      * @default false
      */
    var modulesFromFile: js.UndefOr[Boolean | ModulesFromFileType] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAdditionalModuleDirs(value: js.Array[String]): Self = StObject.set(x, "additionalModuleDirs", value.asInstanceOf[js.Any])
      
      inline def setAdditionalModuleDirsUndefined: Self = StObject.set(x, "additionalModuleDirs", js.undefined)
      
      inline def setAdditionalModuleDirsVarargs(value: String*): Self = StObject.set(x, "additionalModuleDirs", js.Array(value*))
      
      inline def setAllowlist(value: js.Array[AllowlistOption] | AllowlistOption): Self = StObject.set(x, "allowlist", value.asInstanceOf[js.Any])
      
      inline def setAllowlistFunction1(value: /* moduleName */ String => Boolean): Self = StObject.set(x, "allowlist", js.Any.fromFunction1(value))
      
      inline def setAllowlistUndefined: Self = StObject.set(x, "allowlist", js.undefined)
      
      inline def setAllowlistVarargs(value: AllowlistOption*): Self = StObject.set(x, "allowlist", js.Array(value*))
      
      inline def setBinaryDirs(value: js.Array[String]): Self = StObject.set(x, "binaryDirs", value.asInstanceOf[js.Any])
      
      inline def setBinaryDirsUndefined: Self = StObject.set(x, "binaryDirs", js.undefined)
      
      inline def setBinaryDirsVarargs(value: String*): Self = StObject.set(x, "binaryDirs", js.Array(value*))
      
      inline def setImportType(value: `var` | `this` | commonjs | amd | umd | ImportTypeCallback): Self = StObject.set(x, "importType", value.asInstanceOf[js.Any])
      
      inline def setImportTypeFunction1(value: /* moduleName */ String => String): Self = StObject.set(x, "importType", js.Any.fromFunction1(value))
      
      inline def setImportTypeUndefined: Self = StObject.set(x, "importType", js.undefined)
      
      inline def setIncludeAbsolutePaths(value: Boolean): Self = StObject.set(x, "includeAbsolutePaths", value.asInstanceOf[js.Any])
      
      inline def setIncludeAbsolutePathsUndefined: Self = StObject.set(x, "includeAbsolutePaths", js.undefined)
      
      inline def setModulesDir(value: String): Self = StObject.set(x, "modulesDir", value.asInstanceOf[js.Any])
      
      inline def setModulesDirUndefined: Self = StObject.set(x, "modulesDir", js.undefined)
      
      inline def setModulesFromFile(value: Boolean | ModulesFromFileType): Self = StObject.set(x, "modulesFromFile", value.asInstanceOf[js.Any])
      
      inline def setModulesFromFileUndefined: Self = StObject.set(x, "modulesFromFile", js.undefined)
    }
  }
}
