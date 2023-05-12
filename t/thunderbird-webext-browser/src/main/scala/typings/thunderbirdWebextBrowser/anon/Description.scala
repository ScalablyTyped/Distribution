package typings.thunderbirdWebextBrowser.anon

import typings.thunderbirdWebextBrowser.browser.manifest.ExtensionID
import typings.thunderbirdWebextBrowser.browser.manifest.NativeManifest
import typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.pkcs11
import typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.stdio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description
  extends StObject
     with NativeManifest {
  
  var allowed_extensions: js.Array[ExtensionID]
  
  var description: String
  
  var name: String
  
  var path: String
  
  var `type`: pkcs11 | stdio
}
object Description {
  
  inline def apply(
    allowed_extensions: js.Array[ExtensionID],
    description: String,
    name: String,
    path: String,
    `type`: pkcs11 | stdio
  ): Description = {
    val __obj = js.Dynamic.literal(allowed_extensions = allowed_extensions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
    
    inline def setAllowed_extensions(value: js.Array[ExtensionID]): Self = StObject.set(x, "allowed_extensions", value.asInstanceOf[js.Any])
    
    inline def setAllowed_extensionsVarargs(value: ExtensionID*): Self = StObject.set(x, "allowed_extensions", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setType(value: pkcs11 | stdio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
