package typings.webpack.anon

import typings.webpack.dllReferencePluginMod.DllReferencePluginOptions
import typings.webpack.dllReferencePluginMod.DllReferencePluginOptionsManifest
import typings.webpack.dllReferencePluginMod.DllReferencePluginOptionsSourceType
import typings.webpack.webpackStrings.`object`
import typings.webpack.webpackStrings.require
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context
  extends StObject
     with DllReferencePluginOptions {
  
  /**
  			 * (absolute path) context of requests in the manifest (or content property)
  			 */
  var context: js.UndefOr[String] = js.undefined
  
  /**
  			 * Extensions used to resolve modules in the dll bundle (only used when using 'scope')
  			 */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  			 * An object containing content and name or a string to the absolute path of the JSON manifest to be loaded upon compilation
  			 */
  var manifest: DllReferencePluginOptionsManifest | String
  
  /**
  			 * The name where the dll is exposed (external name, defaults to manifest.name)
  			 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  			 * Prefix which is used for accessing the content of the dll
  			 */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
  			 * How the dll is exposed (libraryTarget, defaults to manifest.type)
  			 */
  var sourceType: js.UndefOr[DllReferencePluginOptionsSourceType] = js.undefined
  
  /**
  			 * The way how the export of the dll bundle is used
  			 */
  var `type`: js.UndefOr[require | `object`] = js.undefined
}
object Context {
  
  @scala.inline
  def apply(manifest: DllReferencePluginOptionsManifest | String): Context = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setManifest(value: DllReferencePluginOptionsManifest | String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSourceType(value: DllReferencePluginOptionsSourceType): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    @scala.inline
    def setType(value: require | `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
