package typings.victory.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined victory.victory.Omit<victory.victory.BlockProps, 'left' | 'right'> */
trait OmitBlockPropsleftright extends StObject {
  
  var bottom: js.UndefOr[Double] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
}
object OmitBlockPropsleftright {
  
  inline def apply(): OmitBlockPropsleftright = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitBlockPropsleftright]
  }
  
  extension [Self <: OmitBlockPropsleftright](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
