package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  def mutation(): StartPosition
}
object `5` {
  
  inline def apply(mutation: () => StartPosition): `5` = {
    val __obj = js.Dynamic.literal(mutation = js.Any.fromFunction0(mutation))
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setMutation(value: () => StartPosition): Self = StObject.set(x, "mutation", js.Any.fromFunction0(value))
  }
}
