package typings.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OESElementIndexUint extends js.Object {
  
  val __OESElementIndexUint: Unit = js.native
}
object OESElementIndexUint {
  
  @scala.inline
  def apply(__OESElementIndexUint: Unit): OESElementIndexUint = {
    val __obj = js.Dynamic.literal(__OESElementIndexUint = __OESElementIndexUint.asInstanceOf[js.Any])
    __obj.asInstanceOf[OESElementIndexUint]
  }
  
  @scala.inline
  implicit class OESElementIndexUintOps[Self <: OESElementIndexUint] (val x: Self) extends AnyVal {
    
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
    def set__OESElementIndexUint(value: Unit): Self = this.set("__OESElementIndexUint", value.asInstanceOf[js.Any])
  }
}
