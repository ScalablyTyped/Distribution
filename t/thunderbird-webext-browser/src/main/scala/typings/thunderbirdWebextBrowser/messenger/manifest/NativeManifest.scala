package typings.thunderbirdWebextBrowser.messenger.manifest

import org.scalablytyped.runtime.StringDictionary
import typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.pkcs11
import typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.stdio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.thunderbirdWebextBrowser.anon.Allowedextensions
  - typings.thunderbirdWebextBrowser.anon.Data
*/
trait NativeManifest extends StObject
object NativeManifest {
  
  inline def Allowedextensions(
    allowed_extensions: js.Array[ExtensionID],
    description: String,
    name: String,
    path: String,
    `type`: pkcs11 | stdio
  ): typings.thunderbirdWebextBrowser.anon.Allowedextensions = {
    val __obj = js.Dynamic.literal(allowed_extensions = allowed_extensions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.thunderbirdWebextBrowser.anon.Allowedextensions]
  }
  
  inline def Data(data: StringDictionary[Any], description: String, name: ExtensionID): typings.thunderbirdWebextBrowser.anon.Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("storage")
    __obj.asInstanceOf[typings.thunderbirdWebextBrowser.anon.Data]
  }
}
