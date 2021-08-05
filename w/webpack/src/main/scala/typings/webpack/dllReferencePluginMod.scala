package typings.webpack

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.anon.BuildMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dllReferencePluginMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpack.anon.Context
    - typings.webpack.anon.Content
  */
  trait DllReferencePluginOptions extends StObject
  object DllReferencePluginOptions {
    
    inline def Content(content: DllReferencePluginOptionsContent, name: String): typings.webpack.anon.Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.webpack.anon.Content]
    }
    
    inline def Context(manifest: DllReferencePluginOptionsManifest | String): typings.webpack.anon.Context = {
      val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.webpack.anon.Context]
    }
  }
  
  type DllReferencePluginOptionsContent = /**
  	 * Module info
  	 */
  StringDictionary[BuildMeta]
  
  trait DllReferencePluginOptionsManifest extends StObject {
    
    /**
    	 * The mappings from request to module info
    	 */
    var content: DllReferencePluginOptionsContent
    
    /**
    	 * The name where the dll is exposed (external name)
    	 */
    var name: js.UndefOr[String] = js.undefined
    
    /**
    	 * The type how the dll is exposed (external type)
    	 */
    var `type`: js.UndefOr[DllReferencePluginOptionsSourceType] = js.undefined
  }
  object DllReferencePluginOptionsManifest {
    
    inline def apply(content: DllReferencePluginOptionsContent): DllReferencePluginOptionsManifest = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[DllReferencePluginOptionsManifest]
    }
    
    extension [Self <: DllReferencePluginOptionsManifest](x: Self) {
      
      inline def setContent(value: DllReferencePluginOptionsContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: DllReferencePluginOptionsSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpack.webpackStrings.`var`
    - typings.webpack.webpackStrings.assign
    - typings.webpack.webpackStrings.`this`
    - typings.webpack.webpackStrings.window
    - typings.webpack.webpackStrings.global
    - typings.webpack.webpackStrings.commonjs
    - typings.webpack.webpackStrings.commonjs2
    - typings.webpack.webpackStrings.`commonjs-module`
    - typings.webpack.webpackStrings.amd
    - typings.webpack.webpackStrings.`amd-require`
    - typings.webpack.webpackStrings.umd
    - typings.webpack.webpackStrings.umd2
    - typings.webpack.webpackStrings.jsonp
  */
  trait DllReferencePluginOptionsSourceType extends StObject
  object DllReferencePluginOptionsSourceType {
    
    inline def amd: typings.webpack.webpackStrings.amd = "amd".asInstanceOf[typings.webpack.webpackStrings.amd]
    
    inline def `amd-require`: typings.webpack.webpackStrings.`amd-require` = "amd-require".asInstanceOf[typings.webpack.webpackStrings.`amd-require`]
    
    inline def assign: typings.webpack.webpackStrings.assign = "assign".asInstanceOf[typings.webpack.webpackStrings.assign]
    
    inline def commonjs: typings.webpack.webpackStrings.commonjs = "commonjs".asInstanceOf[typings.webpack.webpackStrings.commonjs]
    
    inline def `commonjs-module`: typings.webpack.webpackStrings.`commonjs-module` = "commonjs-module".asInstanceOf[typings.webpack.webpackStrings.`commonjs-module`]
    
    inline def commonjs2: typings.webpack.webpackStrings.commonjs2 = "commonjs2".asInstanceOf[typings.webpack.webpackStrings.commonjs2]
    
    inline def global: typings.webpack.webpackStrings.global = "global".asInstanceOf[typings.webpack.webpackStrings.global]
    
    inline def jsonp: typings.webpack.webpackStrings.jsonp = "jsonp".asInstanceOf[typings.webpack.webpackStrings.jsonp]
    
    inline def `this`: typings.webpack.webpackStrings.`this` = "this".asInstanceOf[typings.webpack.webpackStrings.`this`]
    
    inline def umd: typings.webpack.webpackStrings.umd = "umd".asInstanceOf[typings.webpack.webpackStrings.umd]
    
    inline def umd2: typings.webpack.webpackStrings.umd2 = "umd2".asInstanceOf[typings.webpack.webpackStrings.umd2]
    
    inline def `var`: typings.webpack.webpackStrings.`var` = "var".asInstanceOf[typings.webpack.webpackStrings.`var`]
    
    inline def window: typings.webpack.webpackStrings.window = "window".asInstanceOf[typings.webpack.webpackStrings.window]
  }
}
