package typings.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inherit extends js.Object {
  
  var inherit: js.UndefOr[Boolean] = js.native
  
  var matchingKeys: js.UndefOr[js.Any] = js.native
}
object Inherit {
  
  @scala.inline
  def apply(): Inherit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inherit]
  }
  
  @scala.inline
  implicit class InheritOps[Self <: Inherit] (val x: Self) extends AnyVal {
    
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
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    
    @scala.inline
    def setMatchingKeys(value: js.Any): Self = this.set("matchingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchingKeys: Self = this.set("matchingKeys", js.undefined)
  }
}
