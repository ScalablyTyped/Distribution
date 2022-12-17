package typings.victoryCore

import typings.std.Omit
import typings.victoryCore.anon.`1`
import typings.victoryCore.libTypesPropTypesMod.Datum
import typings.victoryCore.libTypesPropTypesMod.ID
import typings.victoryCore.libVictoryThemeTypesMod.BlockProps
import typings.victoryCore.libVictoryThemeTypesMod.OrientationTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesCallbacksMod {
  
  trait CallbackArgs extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[js.Array[Datum]] = js.undefined
    
    var datum: js.UndefOr[Datum] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[ID] = js.undefined
    
    var scale: js.UndefOr[`1`] = js.undefined
    
    var text: js.UndefOr[Any] = js.undefined
    
    var tick: js.UndefOr[Any] = js.undefined
    
    var ticks: js.UndefOr[Any] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object CallbackArgs {
    
    inline def apply(): CallbackArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackArgs]
    }
    
    extension [Self <: CallbackArgs](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDatum(value: Datum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setIndex(value: ID): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setScale(value: `1`): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTick(value: Any): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
      
      inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
      
      inline def setTicks(value: Any): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type NumberOrCallback = Double | VictoryNumberCallback
  
  type OrientationOrCallback = OrientationTypes | VictoryOrientationCallback
  
  type PaddingOrCallback = Double | BlockProps | VictoryPaddingCallback
  
  type SliceNumberOrCallback[T, P /* <: String | Double | js.Symbol */] = Double | (js.Function1[/* props */ Omit[T, P], Double])
  
  type StringOrCallback = String | VictoryStringCallback
  
  type StringOrNumberOrCallback = String | Double | VictoryStringOrNumberCallback
  
  type VictoryNumberCallback = js.Function1[/* args */ CallbackArgs, Double]
  
  type VictoryOrientationCallback = js.Function1[/* args */ CallbackArgs, OrientationTypes]
  
  type VictoryPaddingCallback = js.Function1[/* args */ CallbackArgs, Double | BlockProps]
  
  type VictoryStringCallback = js.Function1[/* args */ CallbackArgs, String]
  
  type VictoryStringOrNumberCallback = js.Function1[/* args */ CallbackArgs, String | Double]
}
