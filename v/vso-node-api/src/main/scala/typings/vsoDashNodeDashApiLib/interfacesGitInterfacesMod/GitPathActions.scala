package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitPathActions extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPathActions")
@js.native
object GitPathActions extends js.Object {
  @js.native
  sealed trait Add
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPathActions
  
  @js.native
  sealed trait Delete
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPathActions
  
  @js.native
  sealed trait Edit
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPathActions
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPathActions
  
  @js.native
  sealed trait Rename
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPathActions
  
  /* 3 */ val Add: Add with scala.Double = js.native
  /* 2 */ val Delete: Delete with scala.Double = js.native
  /* 1 */ val Edit: Edit with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 4 */ val Rename: Rename with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPathActions with scala.Double
  ] = js.native
}

