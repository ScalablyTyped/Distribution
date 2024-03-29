package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Point extends StObject {
  
  /**
    * Indicates whether some other object is "equal to" this one.
    */
  def equals(other: Point): Boolean
}
object Point {
  
  inline def apply(equals_ : Point => Boolean): Point = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
    
    inline def setEquals_(value: Point => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
  }
}
