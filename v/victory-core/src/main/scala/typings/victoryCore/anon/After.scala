package typings.victoryCore.anon

import typings.victoryCore.libTypesPropTypesMod.Datum
import typings.victoryCore.libVictoryAnimationVictoryAnimationMod.AnimationStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait After extends StObject {
  
  var after: js.UndefOr[
    js.Function3[/* datum */ Datum, /* index */ Double, /* data */ js.Array[Datum], AnimationStyle]
  ] = js.undefined
  
  var before: js.UndefOr[
    js.Function3[/* datum */ Datum, /* index */ Double, /* data */ js.Array[Datum], AnimationStyle]
  ] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
}
object After {
  
  inline def apply(): After = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[After]
  }
  
  extension [Self <: After](x: Self) {
    
    inline def setAfter(value: (/* datum */ Datum, /* index */ Double, /* data */ js.Array[Datum]) => AnimationStyle): Self = StObject.set(x, "after", js.Any.fromFunction3(value))
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: (/* datum */ Datum, /* index */ Double, /* data */ js.Array[Datum]) => AnimationStyle): Self = StObject.set(x, "before", js.Any.fromFunction3(value))
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
