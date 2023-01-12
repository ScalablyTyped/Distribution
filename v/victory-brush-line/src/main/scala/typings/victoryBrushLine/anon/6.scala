package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  def mutation(): ActiveBrushesActiveHandle
}
object `6` {
  
  inline def apply(mutation: () => ActiveBrushesActiveHandle): `6` = {
    val __obj = js.Dynamic.literal(mutation = js.Any.fromFunction0(mutation))
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`] (val x: Self) extends AnyVal {
    
    inline def setMutation(value: () => ActiveBrushesActiveHandle): Self = StObject.set(x, "mutation", js.Any.fromFunction0(value))
  }
}
