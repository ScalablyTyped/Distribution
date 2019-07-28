package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitPathActions extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPathActions")
@js.native
object GitPathActions extends js.Object {
  @js.native
  sealed trait Add extends GitPathActions
  
  @js.native
  sealed trait Delete extends GitPathActions
  
  @js.native
  sealed trait Edit extends GitPathActions
  
  @js.native
  sealed trait None extends GitPathActions
  
  @js.native
  sealed trait Rename extends GitPathActions
  
  /* 3 */ val Add: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPathActions.Add with Double = js.native
  /* 2 */ val Delete: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPathActions.Delete with Double = js.native
  /* 1 */ val Edit: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPathActions.Edit with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPathActions.None with Double = js.native
  /* 4 */ val Rename: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPathActions.Rename with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPathActions with Double] = js.native
}

