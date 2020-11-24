package typings.stropheJs.mod.Strophe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface: Strophe.SASLMechanism
  *
  *  encapsulates SASL authentication mechanisms.
  *
  *  User code may override the priority for each mechanism or disable it completely.
  *  See <priority> for information about changing priority and <test> for informatian on
  *  how to disable a mechanism.
  *
  *  By default, all mechanisms are enabled and the priorities are
  *
  *  SCRAM-SHA1 - 40
  *  DIGEST-MD5 - 30
  *  Plain - 20
  */
@js.native
trait SASLMechanism extends js.Object {
  
  /** Variable: priority
    *  Determines which <SASLMechanism> is chosen for authentication (Higher is better).
    *  Users may override this to prioritize mechanisms differently.
    *
    *  In the default configuration the priorities are
    *
    *  SCRAM-SHA1 - 40
    *  DIGEST-MD5 - 30
    *  Plain - 20
    *
    *  Example: (This will cause Strophe to choose the mechanism that the server sent first)
    *
    *  > Strophe.SASLMD5.priority = Strophe.SASLSHA1.priority;
    *
    *  See <SASL mechanisms> for a list of available mechanisms.
    *
    */
  var priority: Double = js.native
  
  /**
    *  Function: test
    *  Checks if mechanism able to run.
    *  To disable a mechanism, make this return false;
    *
    *  To disable plain authentication run
    *  > Strophe.SASLPlain.test = function() {
    *  >   return false;
    *  > }
    *
    *  See <SASL mechanisms> for a list of available mechanisms.
    *
    *  Parameters:
    *    (Strophe.Connection) connection - Target Connection.
    *
    *  Returns:
    *    (Boolean) If mechanism was able to run.
    */
  def test(connection: Connection): Boolean = js.native
}
object SASLMechanism {
  
  @scala.inline
  def apply(priority: Double, test: Connection => Boolean): SASLMechanism = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[SASLMechanism]
  }
  
  @scala.inline
  implicit class SASLMechanismOps[Self <: SASLMechanism] (val x: Self) extends AnyVal {
    
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
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Connection => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
  }
}
