package typings.webpack.anon

import typings.webpack.mod.DllReferencePluginOptions
import typings.webpack.mod.DllReferencePluginOptionsManifest
import typings.webpack.webpackStrings.`amd-require`
import typings.webpack.webpackStrings.`commonjs-module`
import typings.webpack.webpackStrings.`object`
import typings.webpack.webpackStrings.`this`
import typings.webpack.webpackStrings.`var`
import typings.webpack.webpackStrings.amd
import typings.webpack.webpackStrings.assign
import typings.webpack.webpackStrings.commonjs
import typings.webpack.webpackStrings.commonjs2
import typings.webpack.webpackStrings.global
import typings.webpack.webpackStrings.jsonp
import typings.webpack.webpackStrings.require
import typings.webpack.webpackStrings.system
import typings.webpack.webpackStrings.umd
import typings.webpack.webpackStrings.umd2
import typings.webpack.webpackStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context
  extends StObject
     with DllReferencePluginOptions {
  
  /**
  			 * Context of requests in the manifest (or content property) as absolute path.
  			 */
  var context: js.UndefOr[String] = js.undefined
  
  /**
  			 * Extensions used to resolve modules in the dll bundle (only used when using 'scope').
  			 */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  			 * An object containing content and name or a string to the absolute path of the JSON manifest to be loaded upon compilation.
  			 */
  var manifest: String | DllReferencePluginOptionsManifest
  
  /**
  			 * The name where the dll is exposed (external name, defaults to manifest.name).
  			 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  			 * Prefix which is used for accessing the content of the dll.
  			 */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
  			 * How the dll is exposed (libraryTarget, defaults to manifest.type).
  			 */
  var sourceType: js.UndefOr[
    `var` | assign | `this` | window | global | commonjs | commonjs2 | `commonjs-module` | amd | `amd-require` | umd | umd2 | jsonp | system
  ] = js.undefined
  
  /**
  			 * The way how the export of the dll bundle is used.
  			 */
  var `type`: js.UndefOr[`object` | require] = js.undefined
}
object Context {
  
  inline def apply(manifest: String | DllReferencePluginOptionsManifest): Context = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setManifest(value: String | DllReferencePluginOptionsManifest): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSourceType(
      value: `var` | assign | `this` | window | global | commonjs | commonjs2 | `commonjs-module` | amd | `amd-require` | umd | umd2 | jsonp | system
    ): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setType(value: `object` | require): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
