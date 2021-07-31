package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Common read methods for ES6 Map/Set. */
trait ReadonlyCollection[K] extends StObject {
  
  def has(key: K): Boolean
  
  def keys(): Iterator[K]
  
  val size: Double
}
object ReadonlyCollection {
  
  @scala.inline
  def apply[K](has: K => Boolean, keys: () => Iterator[K], size: Double): ReadonlyCollection[K] = {
    val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyCollection[K]]
  }
  
  @scala.inline
  implicit class ReadonlyCollectionMutableBuilder[Self <: ReadonlyCollection[?], K] (val x: Self & ReadonlyCollection[K]) extends AnyVal {
    
    @scala.inline
    def setHas(value: K => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeys(value: () => Iterator[K]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
