package typings.stropheJs.stropheMod.global.Strophe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait SASLMechanism extends StObject {
  
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
  var priority: Double
  
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
    *  @returns (Boolean) If mechanism was able to run.
    */
  def test(connection: Connection): Boolean
}
object SASLMechanism {
  
  inline def apply(priority: Double, test: Connection => Boolean): SASLMechanism = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[SASLMechanism]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SASLMechanism] (val x: Self) extends AnyVal {
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Connection => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
  }
}
