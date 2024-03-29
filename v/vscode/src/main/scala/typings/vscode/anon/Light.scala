package typings.vscode.anon

import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Light extends StObject {
  
  var dark: String | Uri
  
  var light: String | Uri
}
object Light {
  
  inline def apply(dark: String | Uri, light: String | Uri): Light = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Light]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Light] (val x: Self) extends AnyVal {
    
    inline def setDark(value: String | Uri): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: String | Uri): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
