package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuditAction extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "AuditAction")
@js.native
object AuditAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuditAction & Double] = js.native
  
  @js.native
  sealed trait Add
    extends StObject
       with AuditAction
  /* 1 */ val Add: typings.vsoNodeApi.taskAgentInterfacesMod.AuditAction.Add & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with AuditAction
  /* 3 */ val Delete: typings.vsoNodeApi.taskAgentInterfacesMod.AuditAction.Delete & Double = js.native
  
  @js.native
  sealed trait Update
    extends StObject
       with AuditAction
  /* 2 */ val Update: typings.vsoNodeApi.taskAgentInterfacesMod.AuditAction.Update & Double = js.native
}
