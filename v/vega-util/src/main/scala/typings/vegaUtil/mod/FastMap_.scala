package typings.vegaUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastMap_ extends js.Object {
  
  def clean(): Unit = js.native
  
  def delete(f: String): Unit = js.native
  
  var empty: Double = js.native
  
  def get(f: String): js.Any = js.native
  
  def has(f: String): Boolean = js.native
  
  def set(f: String, v: js.Any): Unit = js.native
  
  var size: Double = js.native
}
object FastMap_ {
  
  @scala.inline
  def apply(
    clean: () => Unit,
    delete: String => Unit,
    empty: Double,
    get: String => js.Any,
    has: String => Boolean,
    set: (String, js.Any) => Unit,
    size: Double
  ): FastMap_ = {
    val __obj = js.Dynamic.literal(clean = js.Any.fromFunction0(clean), delete = js.Any.fromFunction1(delete), empty = empty.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastMap_]
  }
  
  @scala.inline
  implicit class FastMap_Ops[Self <: FastMap_] (val x: Self) extends AnyVal {
    
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
    def setClean(value: () => Unit): Self = this.set("clean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: String => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmpty(value: Double): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
