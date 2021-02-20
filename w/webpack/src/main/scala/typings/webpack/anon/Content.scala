package typings.webpack.anon

import typings.webpack.dllReferencePluginMod.DllReferencePluginOptions
import typings.webpack.dllReferencePluginMod.DllReferencePluginOptionsContent
import typings.webpack.dllReferencePluginMod.DllReferencePluginOptionsSourceType
import typings.webpack.webpackStrings.`object`
import typings.webpack.webpackStrings.require
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends DllReferencePluginOptions {
  
  /**
  			 * The mappings from request to module info
  			 */
  var content: DllReferencePluginOptionsContent = js.native
  
  /**
  			 * (absolute path) context of requests in the manifest (or content property)
  			 */
  var context: js.UndefOr[String] = js.native
  
  /**
  			 * Extensions used to resolve modules in the dll bundle (only used when using 'scope')
  			 */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
  			 * The name where the dll is exposed (external name)
  			 */
  var name: String = js.native
  
  /**
  			 * Prefix which is used for accessing the content of the dll
  			 */
  var scope: js.UndefOr[String] = js.native
  
  /**
  			 * How the dll is exposed (libraryTarget)
  			 */
  var sourceType: js.UndefOr[DllReferencePluginOptionsSourceType] = js.native
  
  /**
  			 * The way how the export of the dll bundle is used
  			 */
  var `type`: js.UndefOr[require | `object`] = js.native
}
object Content {
  
  @scala.inline
  def apply(content: DllReferencePluginOptionsContent, name: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: DllReferencePluginOptionsContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
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
