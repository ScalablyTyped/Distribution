package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitVersionType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitVersionType")
@js.native
object GitVersionType extends js.Object {
  /**
    * Interpret the version as a branch name
    */
  @js.native
  sealed trait Branch
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionType
  
  /**
    * Interpret the version as a commit ID (SHA1)
    */
  @js.native
  sealed trait Commit
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionType
  
  /**
    * Interpret the version as a tag name
    */
  @js.native
  sealed trait Tag
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionType
  
  /* 0 */ val Branch: Branch with scala.Double = js.native
  /* 2 */ val Commit: Commit with scala.Double = js.native
  /* 1 */ val Tag: Tag with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionType with scala.Double
  ] = js.native
}

