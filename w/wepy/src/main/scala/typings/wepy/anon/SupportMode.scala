package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportMode extends js.Object {
  
  var supportMode: js.Array[String] = js.native
}
object SupportMode {
  
  @scala.inline
  def apply(supportMode: js.Array[String]): SupportMode = {
    val __obj = js.Dynamic.literal(supportMode = supportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportMode]
  }
  
  @scala.inline
  implicit class SupportModeOps[Self <: SupportMode] (val x: Self) extends AnyVal {
    
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
    def setSupportModeVarargs(value: String*): Self = this.set("supportMode", js.Array(value :_*))
    
    @scala.inline
    def setSupportMode(value: js.Array[String]): Self = this.set("supportMode", value.asInstanceOf[js.Any])
  }
}
