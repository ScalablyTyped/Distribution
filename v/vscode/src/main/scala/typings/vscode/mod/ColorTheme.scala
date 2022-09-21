package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorTheme extends StObject {
  
  /**
    * The kind of this color theme: light, dark, high contrast dark and high contrast light.
    */
  val kind: ColorThemeKind
}
object ColorTheme {
  
  inline def apply(kind: ColorThemeKind): ColorTheme = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorTheme]
  }
  
  extension [Self <: ColorTheme](x: Self) {
    
    inline def setKind(value: ColorThemeKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
