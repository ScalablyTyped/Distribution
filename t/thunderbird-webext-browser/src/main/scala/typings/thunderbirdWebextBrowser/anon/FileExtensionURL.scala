package typings.thunderbirdWebextBrowser.anon

import typings.thunderbirdWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import typings.thunderbirdWebextBrowser.browser.manifest.ExtensionURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileExtensionURL
  extends StObject
     with ExtensionFileOrCode {
  
  var file: ExtensionURL
}
object FileExtensionURL {
  
  inline def apply(file: ExtensionURL): FileExtensionURL = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileExtensionURL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileExtensionURL] (val x: Self) extends AnyVal {
    
    inline def setFile(value: ExtensionURL): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
