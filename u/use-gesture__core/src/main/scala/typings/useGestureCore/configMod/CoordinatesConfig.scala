package typings.useGestureCore.configMod

import typings.useGestureCore.useGestureCoreStrings.lock
import typings.useGestureCore.useGestureCoreStrings.x
import typings.useGestureCore.useGestureCoreStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinatesConfig[Key /* <: CoordinatesKey */]
  extends StObject
     with GestureOptions[Key] {
  
  /**
    * The handler will only trigger if a movement is detected on the specified
    * axis.
    */
  var axis: js.UndefOr[x | y | lock] = js.undefined
  
  /**
    * Determines the number of pixels in one direction needed for axises to be
    * calculated.
    */
  var axisThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Limits the gesture `offset` to the specified bounds.
    */
  var bounds: js.UndefOr[
    Bounds | (js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any, 
      Bounds
    ])
  ] = js.undefined
}
object CoordinatesConfig {
  
  inline def apply[Key /* <: CoordinatesKey */](): CoordinatesConfig[Key] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordinatesConfig[Key]]
  }
  
  extension [Self <: CoordinatesConfig[?], Key /* <: CoordinatesKey */](x: Self & CoordinatesConfig[Key]) {
    
    inline def setAxis(value: typings.useGestureCore.useGestureCoreStrings.x | y | lock): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisThreshold(value: Double): Self = StObject.set(x, "axisThreshold", value.asInstanceOf[js.Any])
    
    inline def setAxisThresholdUndefined: Self = StObject.set(x, "axisThreshold", js.undefined)
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setBounds(
      value: Bounds | (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any, 
          Bounds
        ])
    ): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsFunction1(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any => Bounds
    ): Self = StObject.set(x, "bounds", js.Any.fromFunction1(value))
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
  }
}
