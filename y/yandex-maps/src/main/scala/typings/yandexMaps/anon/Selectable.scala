package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selectable extends StObject {
  
  var selectable: js.UndefOr[Boolean] = js.undefined
}
object Selectable {
  
  inline def apply(): Selectable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Selectable]
  }
  
  extension [Self <: Selectable](x: Self) {
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
  }
}
