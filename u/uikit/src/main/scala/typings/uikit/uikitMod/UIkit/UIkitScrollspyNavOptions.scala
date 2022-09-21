package typings.uikit.uikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitScrollspyNavOptions extends StObject {
  
  var closest: js.UndefOr[String] = js.undefined
  
  var cls: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var overflow: js.UndefOr[Boolean] = js.undefined
  
  var scroll: js.UndefOr[Boolean] = js.undefined
}
object UIkitScrollspyNavOptions {
  
  inline def apply(): UIkitScrollspyNavOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitScrollspyNavOptions]
  }
  
  extension [Self <: UIkitScrollspyNavOptions](x: Self) {
    
    inline def setClosest(value: String): Self = StObject.set(x, "closest", value.asInstanceOf[js.Any])
    
    inline def setClosestUndefined: Self = StObject.set(x, "closest", js.undefined)
    
    inline def setCls(value: String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    inline def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
  }
}
