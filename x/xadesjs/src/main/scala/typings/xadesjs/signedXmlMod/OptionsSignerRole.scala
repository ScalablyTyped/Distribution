package typings.xadesjs.signedXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsSignerRole extends js.Object {
  
  var certified: js.UndefOr[js.Array[String]] = js.native
  
  var claimed: js.UndefOr[js.Array[String]] = js.native
}
object OptionsSignerRole {
  
  @scala.inline
  def apply(): OptionsSignerRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSignerRole]
  }
  
  @scala.inline
  implicit class OptionsSignerRoleOps[Self <: OptionsSignerRole] (val x: Self) extends AnyVal {
    
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
    def setCertifiedVarargs(value: String*): Self = this.set("certified", js.Array(value :_*))
    
    @scala.inline
    def setCertified(value: js.Array[String]): Self = this.set("certified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertified: Self = this.set("certified", js.undefined)
    
    @scala.inline
    def setClaimedVarargs(value: String*): Self = this.set("claimed", js.Array(value :_*))
    
    @scala.inline
    def setClaimed(value: js.Array[String]): Self = this.set("claimed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimed: Self = this.set("claimed", js.undefined)
  }
}
