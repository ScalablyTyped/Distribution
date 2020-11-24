package typings.trouter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindResult[T] extends js.Object {
  
  var handlers: js.Array[T] = js.native
  
  var params: StringDictionary[String] = js.native
}
object FindResult {
  
  @scala.inline
  def apply[T](handlers: js.Array[T], params: StringDictionary[String]): FindResult[T] = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindResult[T]]
  }
  
  @scala.inline
  implicit class FindResultOps[Self <: FindResult[_], T] (val x: Self with FindResult[T]) extends AnyVal {
    
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
    def setHandlersVarargs(value: T*): Self = this.set("handlers", js.Array(value :_*))
    
    @scala.inline
    def setHandlers(value: js.Array[T]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: StringDictionary[String]): Self = this.set("params", value.asInstanceOf[js.Any])
  }
}
