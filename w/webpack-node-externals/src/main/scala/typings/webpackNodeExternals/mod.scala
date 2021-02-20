package typings.webpackNodeExternals

import typings.std.RegExp
import typings.webpackNodeExternals.webpackNodeExternalsStrings.`this`
import typings.webpackNodeExternals.webpackNodeExternalsStrings.`var`
import typings.webpackNodeExternals.webpackNodeExternalsStrings.amd
import typings.webpackNodeExternals.webpackNodeExternalsStrings.commonjs
import typings.webpackNodeExternals.webpackNodeExternalsStrings.umd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-node-externals", JSImport.Namespace)
  @js.native
  def apply(): js.Any = js.native
  @JSImport("webpack-node-externals", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Any = js.native
  
  /** a function that accepts the module name and returns whether it should be included */
  type AllowlistFunctionType = js.Function1[/* moduleName */ String, Boolean]
  
  type AllowlistOption = String | RegExp | AllowlistFunctionType
  
  type ImportTypeCallback = js.Function1[/* moduleName */ String, String]
  
  @js.native
  trait ModulesFromFileType extends StObject {
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.native
    
    var include: js.UndefOr[String | js.Array[String]] = js.native
  }
  object ModulesFromFileType {
    
    @scala.inline
    def apply(): ModulesFromFileType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModulesFromFileType]
    }
    
    @scala.inline
    implicit class ModulesFromFileTypeMutableBuilder[Self <: ModulesFromFileType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: String | js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Additional folders to look for node modules.
      */
    var additionalModuleDirs: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * An array for the externals to allow, so they will be included in the bundle.
      * Can accept exact strings ('module_name'), regex patterns (/^module_name/), or a
      * function that accepts the module name and returns whether it should be included.
      * Important - if you have set aliases in your webpack config with the exact
      * same names as modules in node_modules, you need to allowlist them so Webpack will know
      * they should be bundled.
      * @default []
      */
    var allowlist: js.UndefOr[js.Array[AllowlistOption] | AllowlistOption] = js.native
    
    /**
      * @default ['.bin']
      */
    var binaryDirs: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The method in which unbundled modules will be required in the code. Best to leave as
      * 'commonjs' for node modules.
      * @default 'commonjs'
      */
    var importType: js.UndefOr[`var` | `this` | commonjs | amd | umd | ImportTypeCallback] = js.native
    
    /**
      * @default false
      */
    var includeAbsolutePaths: js.UndefOr[Boolean] = js.native
    
    /**
      * The folder in which to search for the node modules.
      * @default 'node_modules'
      */
    var modulesDir: js.UndefOr[String] = js.native
    
    /**
      * Read the modules from the package.json file instead of the node_modules folder.
      * @default false
      */
    var modulesFromFile: js.UndefOr[Boolean | ModulesFromFileType] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalModuleDirs(value: js.Array[String]): Self = StObject.set(x, "additionalModuleDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalModuleDirsUndefined: Self = StObject.set(x, "additionalModuleDirs", js.undefined)
      
      @scala.inline
      def setAdditionalModuleDirsVarargs(value: String*): Self = StObject.set(x, "additionalModuleDirs", js.Array(value :_*))
      
      @scala.inline
      def setAllowlist(value: js.Array[AllowlistOption] | AllowlistOption): Self = StObject.set(x, "allowlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowlistFunction1(value: /* moduleName */ String => Boolean): Self = StObject.set(x, "allowlist", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAllowlistUndefined: Self = StObject.set(x, "allowlist", js.undefined)
      
      @scala.inline
      def setAllowlistVarargs(value: AllowlistOption*): Self = StObject.set(x, "allowlist", js.Array(value :_*))
      
      @scala.inline
      def setBinaryDirs(value: js.Array[String]): Self = StObject.set(x, "binaryDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryDirsUndefined: Self = StObject.set(x, "binaryDirs", js.undefined)
      
      @scala.inline
      def setBinaryDirsVarargs(value: String*): Self = StObject.set(x, "binaryDirs", js.Array(value :_*))
      
      @scala.inline
      def setImportType(value: `var` | `this` | commonjs | amd | umd | ImportTypeCallback): Self = StObject.set(x, "importType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportTypeFunction1(value: /* moduleName */ String => String): Self = StObject.set(x, "importType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setImportTypeUndefined: Self = StObject.set(x, "importType", js.undefined)
      
      @scala.inline
      def setIncludeAbsolutePaths(value: Boolean): Self = StObject.set(x, "includeAbsolutePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeAbsolutePathsUndefined: Self = StObject.set(x, "includeAbsolutePaths", js.undefined)
      
      @scala.inline
      def setModulesDir(value: String): Self = StObject.set(x, "modulesDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesDirUndefined: Self = StObject.set(x, "modulesDir", js.undefined)
      
      @scala.inline
      def setModulesFromFile(value: Boolean | ModulesFromFileType): Self = StObject.set(x, "modulesFromFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesFromFileUndefined: Self = StObject.set(x, "modulesFromFile", js.undefined)
    }
  }
}
