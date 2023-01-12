package typings.victoryCore.anon

import typings.victoryCore.libVictoryAnimationVictoryAnimationMod.AnimationStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Before extends StObject {
  
  var before: js.UndefOr[
    js.Function3[
      /* datum */ typings.victoryCore.libTypesPropTypesMod.Datum, 
      /* index */ Double, 
      /* data */ js.Array[typings.victoryCore.libTypesPropTypesMod.Datum], 
      AnimationStyle
    ]
  ] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
}
object Before {
  
  inline def apply(): Before = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Before]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Before] (val x: Self) extends AnyVal {
    
    inline def setBefore(
      value: (/* datum */ typings.victoryCore.libTypesPropTypesMod.Datum, /* index */ Double, /* data */ js.Array[typings.victoryCore.libTypesPropTypesMod.Datum]) => AnimationStyle
    ): Self = StObject.set(x, "before", js.Any.fromFunction3(value))
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
