package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  def mutation(): IsPanning
}
object `3` {
  
  inline def apply(mutation: () => IsPanning): `3` = {
    val __obj = js.Dynamic.literal(mutation = js.Any.fromFunction0(mutation))
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setMutation(value: () => IsPanning): Self = StObject.set(x, "mutation", js.Any.fromFunction0(value))
  }
}
