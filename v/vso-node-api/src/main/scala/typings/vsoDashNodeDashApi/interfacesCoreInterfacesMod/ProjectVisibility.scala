package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectVisibility extends js.Object

@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProjectVisibility")
@js.native
object ProjectVisibility extends js.Object {
  @js.native
  sealed trait Organization extends ProjectVisibility
  
  @js.native
  sealed trait Private extends ProjectVisibility
  
  @js.native
  sealed trait Public extends ProjectVisibility
  
  @js.native
  sealed trait Unchanged extends ProjectVisibility
  
  /* 1 */ val Organization: typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ProjectVisibility.Organization with Double = js.native
  /* 0 */ val Private: typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ProjectVisibility.Private with Double = js.native
  /* 2 */ val Public: typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ProjectVisibility.Public with Double = js.native
  /* -1 */ val Unchanged: typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ProjectVisibility.Unchanged with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectVisibility with Double] = js.native
}

