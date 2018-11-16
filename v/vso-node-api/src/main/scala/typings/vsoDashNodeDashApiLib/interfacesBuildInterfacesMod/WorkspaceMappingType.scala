package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkspaceMappingType extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "WorkspaceMappingType")
@js.native
object WorkspaceMappingType extends js.Object {
  /**
       * The path is cloaked in the workspace.
       */
  @js.native
  sealed trait Cloak
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.WorkspaceMappingType
  
  /**
       * The path is mapped in the workspace.
       */
  @js.native
  sealed trait Map
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.WorkspaceMappingType
  
  /* 1 */ val Cloak: Cloak with scala.Double = js.native
  /* 0 */ val Map: Map with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.WorkspaceMappingType with scala.Double
  ] = js.native
}

