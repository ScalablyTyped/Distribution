package typings.stylableWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reasons extends js.Object {
  
  var reasons: js.Array[ModuleType] = js.native
}
object Reasons {
  
  @scala.inline
  def apply(reasons: js.Array[ModuleType]): Reasons = {
    val __obj = js.Dynamic.literal(reasons = reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reasons]
  }
  
  @scala.inline
  implicit class ReasonsOps[Self <: Reasons] (val x: Self) extends AnyVal {
    
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
    def setReasonsVarargs(value: ModuleType*): Self = this.set("reasons", js.Array(value :_*))
    
    @scala.inline
    def setReasons(value: js.Array[ModuleType]): Self = this.set("reasons", value.asInstanceOf[js.Any])
  }
}
