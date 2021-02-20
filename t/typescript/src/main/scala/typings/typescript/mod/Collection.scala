package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Common write methods for ES6 Map/Set. */
@js.native
trait Collection[K] extends ReadonlyCollection[K] {
  
  def clear(): Unit = js.native
  
  def delete(key: K): Boolean = js.native
}
object Collection {
  
  @scala.inline
  def apply[K](clear: () => Unit, delete: K => Boolean, has: K => Boolean, keys: () => Iterator[K], size: Double): Collection[K] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection[K]]
  }
  
  @scala.inline
  implicit class CollectionMutableBuilder[Self <: Collection[_], K] (val x: Self with Collection[K]) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: K => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
  }
}
