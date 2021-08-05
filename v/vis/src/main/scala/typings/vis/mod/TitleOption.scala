package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleOption extends StObject {
  
  var style: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object TitleOption {
  
  inline def apply(): TitleOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleOption]
  }
  
  extension [Self <: TitleOption](x: Self) {
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
