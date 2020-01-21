package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuditAction extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "AuditAction")
@js.native
object AuditAction extends js.Object {
  @js.native
  sealed trait Add extends AuditAction
  
  @js.native
  sealed trait Delete extends AuditAction
  
  @js.native
  sealed trait Update extends AuditAction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuditAction with Double] = js.native
  /* 1 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  /* 3 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 2 */ @js.native
  object Update extends TopLevel[Update with Double]
  
}

