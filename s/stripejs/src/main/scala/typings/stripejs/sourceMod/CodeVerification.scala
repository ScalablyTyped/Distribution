package typings.stripejs.sourceMod

import typings.stripejs.stripejsStrings.attempts_remaining
import typings.stripejs.stripejsStrings.failed
import typings.stripejs.stripejsStrings.pending
import typings.stripejs.stripejsStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeVerification extends js.Object {
  
  /**
    * The number of attempts remaining to authenticate the
    * source object with a verification code
    */
  var attempts_remaining: Double = js.native
  
  /**
    * The status of the code verification
    */
  var status: pending | attempts_remaining | succeeded | failed = js.native
}
object CodeVerification {
  
  @scala.inline
  def apply(attempts_remaining: Double, status: pending | attempts_remaining | succeeded | failed): CodeVerification = {
    val __obj = js.Dynamic.literal(attempts_remaining = attempts_remaining.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeVerification]
  }
  
  @scala.inline
  implicit class CodeVerificationOps[Self <: CodeVerification] (val x: Self) extends AnyVal {
    
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
    def setAttempts_remaining(value: Double): Self = this.set("attempts_remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: pending | attempts_remaining | succeeded | failed): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
