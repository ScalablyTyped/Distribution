package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def mutation(): IsSelecting
}
object `2` {
  
  inline def apply(mutation: () => IsSelecting): `2` = {
    val __obj = js.Dynamic.literal(mutation = js.Any.fromFunction0(mutation))
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setMutation(value: () => IsSelecting): Self = StObject.set(x, "mutation", js.Any.fromFunction0(value))
  }
}
