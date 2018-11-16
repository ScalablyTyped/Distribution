package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectChangeType extends js.Object

@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProjectChangeType")
@js.native
object ProjectChangeType extends js.Object {
  @js.native
  sealed trait Added
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProjectChangeType
  
  @js.native
  sealed trait Deleted
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProjectChangeType
  
  @js.native
  sealed trait Modified
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProjectChangeType
  
  /* 2 */ val Added: Added with scala.Double = js.native
  /* 1 */ val Deleted: Deleted with scala.Double = js.native
  /* 0 */ val Modified: Modified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProjectChangeType with scala.Double
  ] = js.native
}

