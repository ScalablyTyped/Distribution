package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuditAction extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AuditAction")
@js.native
object AuditAction extends js.Object {
  @js.native
  sealed trait Add
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AuditAction
  
  @js.native
  sealed trait Delete
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AuditAction
  
  @js.native
  sealed trait Undelete
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AuditAction
  
  @js.native
  sealed trait Update
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AuditAction
  
  /* 1 */ val Add: Add with scala.Double = js.native
  /* 3 */ val Delete: Delete with scala.Double = js.native
  /* 4 */ val Undelete: Undelete with scala.Double = js.native
  /* 2 */ val Update: Update with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AuditAction with scala.Double
  ] = js.native
}

