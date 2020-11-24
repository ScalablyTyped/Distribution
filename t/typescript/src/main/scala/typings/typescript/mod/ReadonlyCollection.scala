package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Common read methods for ES6 Map/Set. */
@js.native
trait ReadonlyCollection[K] extends js.Object {
  
  def has(key: K): Boolean = js.native
  
  def keys(): Iterator[K] = js.native
  
  val size: Double = js.native
}
object ReadonlyCollection {
  
  @scala.inline
  def apply[K](has: K => Boolean, keys: () => Iterator[K], size: Double): ReadonlyCollection[K] = {
    val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyCollection[K]]
  }
  
  @scala.inline
  implicit class ReadonlyCollectionOps[Self <: ReadonlyCollection[_], K] (val x: Self with ReadonlyCollection[K]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHas(value: K => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeys(value: () => Iterator[K]): Self = this.set("keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
