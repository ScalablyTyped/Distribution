package typings.stropheJs.mod.global.Strophe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCondition extends StObject
/** Constants: Error Condition Constants
  * Error conditions that occur commonly.
  *
  * ErrorCondition.BAD_FORMAT - Stanza has unspecified format
  * ErrorCondition.CONFLICT - Protocol conflict
  * ErrorCondition.MISSING_JID_NODE - No jid and anonymous users are now allowed on server
  * ErrorCondition.NO_AUTH_MECH - No authentication mechanism configured
  * ErrorCondition.UNKNOWN_REASON - Unknown error cause
  */
@JSGlobal("Strophe.ErrorCondition")
@js.native
object ErrorCondition extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCondition & String] = js.native
  
  @js.native
  sealed trait BAD_FORMAT
    extends StObject
       with ErrorCondition
  /* "bad-format" */ val BAD_FORMAT: typings.stropheJs.mod.global.Strophe.ErrorCondition.BAD_FORMAT & String = js.native
  
  @js.native
  sealed trait CONFLICT
    extends StObject
       with ErrorCondition
  /* "conflict" */ val CONFLICT: typings.stropheJs.mod.global.Strophe.ErrorCondition.CONFLICT & String = js.native
  
  @js.native
  sealed trait MISSING_JID_NODE
    extends StObject
       with ErrorCondition
  /* "x-strophe-bad-non-anon-jid" */ val MISSING_JID_NODE: typings.stropheJs.mod.global.Strophe.ErrorCondition.MISSING_JID_NODE & String = js.native
  
  @js.native
  sealed trait NO_AUTH_MECH
    extends StObject
       with ErrorCondition
  /* "no-auth-mech" */ val NO_AUTH_MECH: typings.stropheJs.mod.global.Strophe.ErrorCondition.NO_AUTH_MECH & String = js.native
  
  @js.native
  sealed trait UNKNOWN_REASON
    extends StObject
       with ErrorCondition
  /* "unknown" */ val UNKNOWN_REASON: typings.stropheJs.mod.global.Strophe.ErrorCondition.UNKNOWN_REASON & String = js.native
}
