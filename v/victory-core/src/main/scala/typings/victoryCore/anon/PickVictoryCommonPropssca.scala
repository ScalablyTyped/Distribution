package typings.victoryCore.anon

import typings.victoryCore.propTypesMod.D3Scale
import typings.victoryCore.propTypesMod.ScalePropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<victory-core.victory-core/lib/victory-util/common-props.VictoryCommonProps, 'scale' | 'horizontal'> */
trait PickVictoryCommonPropssca extends StObject {
  
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  var scale: js.UndefOr[ScalePropType | D3Scale[Any] | Y] = js.undefined
}
object PickVictoryCommonPropssca {
  
  inline def apply(): PickVictoryCommonPropssca = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickVictoryCommonPropssca]
  }
  
  extension [Self <: PickVictoryCommonPropssca](x: Self) {
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setScale(value: ScalePropType | D3Scale[Any] | Y): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
