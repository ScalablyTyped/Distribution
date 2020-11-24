package typings.webpack.dllReferencePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webpack.anon.Context
  - typings.webpack.anon.Content
*/
trait DllReferencePluginOptions extends js.Object
object DllReferencePluginOptions {
  
  @scala.inline
  def Context(manifest: DllReferencePluginOptionsManifest | String): DllReferencePluginOptions = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DllReferencePluginOptions]
  }
  
  @scala.inline
  def Content(content: DllReferencePluginOptionsContent, name: String): DllReferencePluginOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DllReferencePluginOptions]
  }
}
