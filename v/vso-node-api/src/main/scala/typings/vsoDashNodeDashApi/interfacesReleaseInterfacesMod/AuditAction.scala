package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuditAction extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AuditAction")
@js.native
object AuditAction extends js.Object {
  @js.native
  sealed trait Add extends AuditAction
  
  @js.native
  sealed trait Delete extends AuditAction
  
  @js.native
  sealed trait Undelete extends AuditAction
  
  @js.native
  sealed trait Update extends AuditAction
  
  /* 1 */ val Add: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AuditAction.Add with Double = js.native
  /* 3 */ val Delete: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AuditAction.Delete with Double = js.native
  /* 4 */ val Undelete: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AuditAction.Undelete with Double = js.native
  /* 2 */ val Update: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AuditAction.Update with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuditAction with Double] = js.native
}

