package typings.useGestureCore.distDeclarationsSrcTypesConfigMod

import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.NonUndefined
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureOptions[T /* <: GestureKey */]
  extends StObject
     with GenericOptions {
  
  /**
    * The position `offset` will start from.
    */
  var from: js.UndefOr[
    Vector2 | (js.Function1[
      /* state */ NonUndefined[
        /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[T] */ js.Any
      ], 
      Vector2
    ])
  ] = js.undefined
  
  /**
    * The handler will preventDefault all events when `true`.
    */
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The elasticity coefficient of the gesture when going out of bounds. When
    * set to true, the elasticiy coefficient will be defaulted to 0.15
    */
  var rubberband: js.UndefOr[Boolean | Double | Vector2] = js.undefined
  
  /**
    * The handler will fire only when the gesture displacement is greater than
    * the threshold.
    */
  var threshold: js.UndefOr[Double | Vector2] = js.undefined
  
  /**
    * Forces the handler to fire even for non intentional displacement (ignores
    * the threshold). In that case, the intentional attribute from state will
    * remain false until the threshold is reached.
    */
  var triggerAllEvents: js.UndefOr[Boolean] = js.undefined
}
object GestureOptions {
  
  inline def apply[T /* <: GestureKey */](): GestureOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureOptions[T]]
  }
  
  extension [Self <: GestureOptions[?], T /* <: GestureKey */](x: Self & GestureOptions[T]) {
    
    inline def setFrom(
      value: Vector2 | (js.Function1[
          /* state */ NonUndefined[
            /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[T] */ js.Any
          ], 
          Vector2
        ])
    ): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromFunction1(
      value: /* state */ NonUndefined[
          /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[T] */ js.Any
        ] => Vector2
    ): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setRubberband(value: Boolean | Double | Vector2): Self = StObject.set(x, "rubberband", value.asInstanceOf[js.Any])
    
    inline def setRubberbandUndefined: Self = StObject.set(x, "rubberband", js.undefined)
    
    inline def setThreshold(value: Double | Vector2): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setTriggerAllEvents(value: Boolean): Self = StObject.set(x, "triggerAllEvents", value.asInstanceOf[js.Any])
    
    inline def setTriggerAllEventsUndefined: Self = StObject.set(x, "triggerAllEvents", js.undefined)
  }
}
