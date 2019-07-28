package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
  sealed trait Cloak extends WorkspaceMappingType
  
  /**
    * The path is mapped in the workspace.
    */
  @js.native
  sealed trait Map extends WorkspaceMappingType
  
  /* 1 */ val Cloak: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.WorkspaceMappingType.Cloak with Double = js.native
  /* 0 */ val Map: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.WorkspaceMappingType.Map with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkspaceMappingType with Double] = js.native
}

