package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconSequence extends StObject {
  
  var fixedRotation: js.UndefOr[Boolean | Null] = js.undefined
  
  var icon: js.UndefOr[SymbolIcon | Null] = js.undefined
  
  var offset: js.UndefOr[String | Null] = js.undefined
  
  var repeat: js.UndefOr[String | Null] = js.undefined
}
object IconSequence {
  
  inline def apply(): IconSequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSequence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconSequence] (val x: Self) extends AnyVal {
    
    inline def setFixedRotation(value: Boolean): Self = StObject.set(x, "fixedRotation", value.asInstanceOf[js.Any])
    
    inline def setFixedRotationNull: Self = StObject.set(x, "fixedRotation", null)
    
    inline def setFixedRotationUndefined: Self = StObject.set(x, "fixedRotation", js.undefined)
    
    inline def setIcon(value: SymbolIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRepeat(value: String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatNull: Self = StObject.set(x, "repeat", null)
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
