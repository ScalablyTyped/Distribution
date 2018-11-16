package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuditAction extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "AuditAction")
@js.native
object AuditAction extends js.Object {
  @js.native
  sealed trait Add
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.AuditAction
  
  @js.native
  sealed trait Delete
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.AuditAction
  
  @js.native
  sealed trait Update
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.AuditAction
  
  /* 1 */ val Add: Add with scala.Double = js.native
  /* 3 */ val Delete: Delete with scala.Double = js.native
  /* 2 */ val Update: Update with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.AuditAction with scala.Double] = js.native
}

