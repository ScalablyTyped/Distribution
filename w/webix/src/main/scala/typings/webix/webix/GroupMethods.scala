package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupMethods extends js.Object {
  
  def any(property: String, data: js.Any): Unit = js.native
  
  def count(property: String, data: js.Any): Unit = js.native
  
  def max(property: String, data: js.Any): Unit = js.native
  
  def min(property: String, data: js.Any): Unit = js.native
  
  def string(property: String, data: js.Any): Unit = js.native
  
  def sum(property: String, data: js.Any): Unit = js.native
}
object GroupMethods {
  
  @scala.inline
  def apply(
    any: (String, js.Any) => Unit,
    count: (String, js.Any) => Unit,
    max: (String, js.Any) => Unit,
    min: (String, js.Any) => Unit,
    string: (String, js.Any) => Unit,
    sum: (String, js.Any) => Unit
  ): GroupMethods = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction2(any), count = js.Any.fromFunction2(count), max = js.Any.fromFunction2(max), min = js.Any.fromFunction2(min), string = js.Any.fromFunction2(string), sum = js.Any.fromFunction2(sum))
    __obj.asInstanceOf[GroupMethods]
  }
  
  @scala.inline
  implicit class GroupMethodsOps[Self <: GroupMethods] (val x: Self) extends AnyVal {
    
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
    def setAny(value: (String, js.Any) => Unit): Self = this.set("any", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCount(value: (String, js.Any) => Unit): Self = this.set("count", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMax(value: (String, js.Any) => Unit): Self = this.set("max", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMin(value: (String, js.Any) => Unit): Self = this.set("min", js.Any.fromFunction2(value))
    
    @scala.inline
    def setString(value: (String, js.Any) => Unit): Self = this.set("string", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSum(value: (String, js.Any) => Unit): Self = this.set("sum", js.Any.fromFunction2(value))
  }
}
