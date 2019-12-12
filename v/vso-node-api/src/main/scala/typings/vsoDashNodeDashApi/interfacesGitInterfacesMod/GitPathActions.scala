package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPathActions.Add
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPathActions.Delete
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPathActions.Edit
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPathActions.None
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPathActions.Rename
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPathActions with Double] = js.native
  /* 3 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  /* 2 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 1 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4 */ @js.native
  object Rename extends TopLevel[Rename with Double]
  
}

