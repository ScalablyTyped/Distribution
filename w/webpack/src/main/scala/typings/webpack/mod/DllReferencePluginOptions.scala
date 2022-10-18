package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webpack.anon.Extensions
  - typings.webpack.anon.Content
*/
trait DllReferencePluginOptions extends StObject
object DllReferencePluginOptions {
  
  inline def Content(content: DllReferencePluginOptionsContent, name: String): typings.webpack.anon.Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webpack.anon.Content]
  }
  
  inline def Extensions(manifest: String | DllReferencePluginOptionsManifest): typings.webpack.anon.Extensions = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webpack.anon.Extensions]
  }
}
