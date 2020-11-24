package typings.vexdb.cacheMod

import typings.vexdb.vexdbNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIFailure[T] extends APIResponse[T] {
  
  var error_code: Double = js.native
  
  var error_text: String = js.native
  
  var status: `0` = js.native
}
object APIFailure {
  
  @scala.inline
  def apply[T](error_code: Double, error_text: String, status: `0`): APIFailure[T] = {
    val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_text = error_text.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIFailure[T]]
  }
  
  @scala.inline
  implicit class APIFailureOps[Self <: APIFailure[_], T] (val x: Self with APIFailure[T]) extends AnyVal {
    
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
    def setError_code(value: Double): Self = this.set("error_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_text(value: String): Self = this.set("error_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `0`): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
