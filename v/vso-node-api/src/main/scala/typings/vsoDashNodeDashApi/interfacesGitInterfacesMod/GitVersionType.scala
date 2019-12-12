package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitVersionType.Branch
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitVersionType.Commit
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitVersionType.Tag
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitVersionType with Double] = js.native
  /* 0 */ @js.native
  object Branch extends TopLevel[Branch with Double]
  
  /* 2 */ @js.native
  object Commit extends TopLevel[Commit with Double]
  
  /* 1 */ @js.native
  object Tag extends TopLevel[Tag with Double]
  
}

