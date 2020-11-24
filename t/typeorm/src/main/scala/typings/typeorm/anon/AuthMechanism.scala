package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthMechanism extends js.Object {
  
  var authMechanism: String = js.native
}
object AuthMechanism {
  
  @scala.inline
  def apply(authMechanism: String): AuthMechanism = {
    val __obj = js.Dynamic.literal(authMechanism = authMechanism.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthMechanism]
  }
  
  @scala.inline
  implicit class AuthMechanismOps[Self <: AuthMechanism] (val x: Self) extends AnyVal {
    
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
    def setAuthMechanism(value: String): Self = this.set("authMechanism", value.asInstanceOf[js.Any])
  }
}
