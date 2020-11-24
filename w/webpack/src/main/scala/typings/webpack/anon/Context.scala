package typings.webpack.anon

import typings.webpack.dllReferencePluginMod.DllReferencePluginOptions
import typings.webpack.dllReferencePluginMod.DllReferencePluginOptionsManifest
import typings.webpack.dllReferencePluginMod.DllReferencePluginOptionsSourceType
import typings.webpack.webpackStrings.`object`
import typings.webpack.webpackStrings.require
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends DllReferencePluginOptions {
  
  /**
  			 * (absolute path) context of requests in the manifest (or content property)
  			 */
  var context: js.UndefOr[String] = js.native
  
  /**
  			 * Extensions used to resolve modules in the dll bundle (only used when using 'scope')
  			 */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
  			 * An object containing content and name or a string to the absolute path of the JSON manifest to be loaded upon compilation
  			 */
  var manifest: DllReferencePluginOptionsManifest | String = js.native
  
  /**
  			 * The name where the dll is exposed (external name, defaults to manifest.name)
  			 */
  var name: js.UndefOr[String] = js.native
  
  /**
  			 * Prefix which is used for accessing the content of the dll
  			 */
  var scope: js.UndefOr[String] = js.native
  
  /**
  			 * How the dll is exposed (libraryTarget, defaults to manifest.type)
  			 */
  var sourceType: js.UndefOr[DllReferencePluginOptionsSourceType] = js.native
  
  /**
  			 * The way how the export of the dll bundle is used
  			 */
  var `type`: js.UndefOr[require | `object`] = js.native
}
object Context {
  
  @scala.inline
  def apply(manifest: DllReferencePluginOptionsManifest | String): Context = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setManifest(value: DllReferencePluginOptionsManifest | String): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSourceType(value: DllReferencePluginOptionsSourceType): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    
    @scala.inline
    def setType(value: require | `object`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
