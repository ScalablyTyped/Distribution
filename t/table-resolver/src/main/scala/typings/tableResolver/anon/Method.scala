package typings.tableResolver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Method[T] extends js.Object {
  
  var columns: js.Array[T] = js.native
  
  def method(args: Column[T]): T = js.native
}
object Method {
  
  @scala.inline
  def apply[T](columns: js.Array[T], method: Column[T] => T): Method[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], method = js.Any.fromFunction1(method))
    __obj.asInstanceOf[Method[T]]
  }
  
  @scala.inline
  implicit class MethodOps[Self <: Method[_], T] (val x: Self with Method[T]) extends AnyVal {
    
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
    def setColumnsVarargs(value: T*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[T]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: Column[T] => T): Self = this.set("method", js.Any.fromFunction1(value))
  }
}
