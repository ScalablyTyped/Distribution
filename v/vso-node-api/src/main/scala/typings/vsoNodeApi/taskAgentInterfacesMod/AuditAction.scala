package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuditAction extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "AuditAction")
@js.native
object AuditAction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuditAction with Double] = js.native
  
  @js.native
  sealed trait Add extends AuditAction
  /* 1 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  @js.native
  sealed trait Delete extends AuditAction
  /* 3 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  @js.native
  sealed trait Update extends AuditAction
  /* 2 */ @js.native
  object Update extends TopLevel[Update with Double]
}
