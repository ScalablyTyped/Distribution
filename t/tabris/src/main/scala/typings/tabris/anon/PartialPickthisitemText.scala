package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<this, 'itemText'>> */
trait PartialPickthisitemText extends StObject {
  
  var itemText: js.UndefOr[js.Any] = js.undefined
}
object PartialPickthisitemText {
  
  inline def apply(): PartialPickthisitemText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickthisitemText]
  }
  
  extension [Self <: PartialPickthisitemText](x: Self) {
    
    inline def setItemText(value: js.Any): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
    
    inline def setItemTextUndefined: Self = StObject.set(x, "itemText", js.undefined)
  }
}
