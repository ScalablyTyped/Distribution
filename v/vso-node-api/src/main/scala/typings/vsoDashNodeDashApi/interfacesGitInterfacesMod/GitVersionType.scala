package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
  sealed trait Branch extends GitVersionType
  
  /**
    * Interpret the version as a commit ID (SHA1)
    */
  @js.native
  sealed trait Commit extends GitVersionType
  
  /**
    * Interpret the version as a tag name
    */
  @js.native
  sealed trait Tag extends GitVersionType
  
  /* 0 */ val Branch: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitVersionType.Branch with Double = js.native
  /* 2 */ val Commit: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitVersionType.Commit with Double = js.native
  /* 1 */ val Tag: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitVersionType.Tag with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitVersionType with Double] = js.native
}

