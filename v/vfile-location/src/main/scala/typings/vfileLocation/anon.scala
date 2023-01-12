package typings.vfileLocation

import typings.vfileLocation.mod.FullPoint
import typings.vfileLocation.mod.Offset
import typings.vfileLocation.mod.PositionalPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ToOffset extends StObject {
    
    def toOffset(point: PositionalPoint): Offset
    
    def toPoint(offset: Offset): FullPoint
  }
  object ToOffset {
    
    inline def apply(toOffset: PositionalPoint => Offset, toPoint: Offset => FullPoint): ToOffset = {
      val __obj = js.Dynamic.literal(toOffset = js.Any.fromFunction1(toOffset), toPoint = js.Any.fromFunction1(toPoint))
      __obj.asInstanceOf[ToOffset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToOffset] (val x: Self) extends AnyVal {
      
      inline def setToOffset(value: PositionalPoint => Offset): Self = StObject.set(x, "toOffset", js.Any.fromFunction1(value))
      
      inline def setToPoint(value: Offset => FullPoint): Self = StObject.set(x, "toPoint", js.Any.fromFunction1(value))
    }
  }
}
