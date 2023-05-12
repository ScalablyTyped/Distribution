package typings.thunderbirdWebextBrowser.anon

import org.scalablytyped.runtime.StringDictionary
import typings.thunderbirdWebextBrowser.browser.manifest.ExtensionID
import typings.thunderbirdWebextBrowser.browser.manifest.NativeManifest
import typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name
  extends StObject
     with NativeManifest {
  
  var data: StringDictionary[Any]
  
  var description: String
  
  var name: ExtensionID
  
  var `type`: storage
}
object Name {
  
  inline def apply(data: StringDictionary[Any], description: String, name: ExtensionID): Name = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("storage")
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: ExtensionID): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: storage): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
