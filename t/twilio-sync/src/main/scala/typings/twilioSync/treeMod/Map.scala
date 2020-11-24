package typings.twilioSync.treeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map[K, V] extends js.Object {
  
  def get(key: K): V = js.native
  
  def set(key: K, value: V): Unit = js.native
}
object Map {
  
  @scala.inline
  def apply[K, V](get: K => V, set: (K, V) => Unit): Map[K, V] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Map[K, V]]
  }
  
  @scala.inline
  implicit class MapOps[Self <: Map[_, _], K, V] (val x: Self with (Map[K, V])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: K => V): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (K, V) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
