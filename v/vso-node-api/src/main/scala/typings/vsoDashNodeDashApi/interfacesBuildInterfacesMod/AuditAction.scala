package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuditAction extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "AuditAction")
@js.native
object AuditAction extends js.Object {
  @js.native
  sealed trait Add extends AuditAction
  
  @js.native
  sealed trait Delete extends AuditAction
  
  @js.native
  sealed trait Update extends AuditAction
  
  /* 1 */ val Add: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.AuditAction.Add with Double = js.native
  /* 3 */ val Delete: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.AuditAction.Delete with Double = js.native
  /* 2 */ val Update: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.AuditAction.Update with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuditAction with Double] = js.native
}

