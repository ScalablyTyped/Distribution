package typings.three.ifcloaderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vector[T] extends StObject {
  
  def get(index: Double): T
  
  def size(): Double
}
object Vector {
  
  inline def apply[T](get: Double => T, size: () => Double): Vector[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[Vector[T]]
  }
  
  extension [Self <: Vector[?], T](x: Self & Vector[T]) {
    
    inline def setGet(value: Double => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
  }
}
