package typings.vscode.anon

import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DarkLight extends StObject {
  
  val dark: Uri
  
  val light: Uri
}
object DarkLight {
  
  inline def apply(dark: Uri, light: Uri): DarkLight = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[DarkLight]
  }
  
  extension [Self <: DarkLight](x: Self) {
    
    inline def setDark(value: Uri): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: Uri): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
