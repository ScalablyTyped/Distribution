package typings.thunderbirdWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.pkcs11
import typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.stdio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.thunderbirdWebextBrowser.anon.Description
  - typings.thunderbirdWebextBrowser.anon.Name
*/
trait NativeManifest extends StObject
object NativeManifest {
  
  inline def Description(
    allowed_extensions: js.Array[ExtensionID],
    description: String,
    name: String,
    path: String,
    `type`: pkcs11 | stdio
  ): typings.thunderbirdWebextBrowser.anon.Description = {
    val __obj = js.Dynamic.literal(allowed_extensions = allowed_extensions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.thunderbirdWebextBrowser.anon.Description]
  }
  
  inline def Name(data: StringDictionary[Any], description: String, name: ExtensionID): typings.thunderbirdWebextBrowser.anon.Name = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("storage")
    __obj.asInstanceOf[typings.thunderbirdWebextBrowser.anon.Name]
  }
}
