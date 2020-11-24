package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ptr extends js.Object {
  
  var ptr: MetaCardRulemin1max1 = js.native
  
  var set: MetaCardRuleminnumbermaxn = js.native
}
object Ptr {
  
  @scala.inline
  def apply(ptr: MetaCardRulemin1max1, set: MetaCardRuleminnumbermaxn): Ptr = {
    val __obj = js.Dynamic.literal(ptr = ptr.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ptr]
  }
  
  @scala.inline
  implicit class PtrOps[Self <: Ptr] (val x: Self) extends AnyVal {
    
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
    def setPtr(value: MetaCardRulemin1max1): Self = this.set("ptr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: MetaCardRuleminnumbermaxn): Self = this.set("set", value.asInstanceOf[js.Any])
  }
}
