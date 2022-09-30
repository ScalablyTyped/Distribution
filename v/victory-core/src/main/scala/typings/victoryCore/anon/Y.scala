package typings.victoryCore.anon

import typings.victoryCore.propTypesMod.D3Scale
import typings.victoryCore.propTypesMod.ScalePropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y extends StObject {
  
  var x: js.UndefOr[ScalePropType | D3Scale[Any]] = js.undefined
  
  var y: js.UndefOr[ScalePropType | D3Scale[Any]] = js.undefined
}
object Y {
  
  inline def apply(): Y = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Y]
  }
  
  extension [Self <: Y](x: Self) {
    
    inline def setX(value: ScalePropType | D3Scale[Any]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: ScalePropType | D3Scale[Any]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
