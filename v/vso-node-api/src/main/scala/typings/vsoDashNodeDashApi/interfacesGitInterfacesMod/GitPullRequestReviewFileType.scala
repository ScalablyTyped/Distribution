package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitPullRequestReviewFileType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPullRequestReviewFileType")
@js.native
object GitPullRequestReviewFileType extends js.Object {
  @js.native
  sealed trait Attachment extends GitPullRequestReviewFileType
  
  @js.native
  sealed trait ChangeEntry extends GitPullRequestReviewFileType
  
  /* 1 */ val Attachment: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPullRequestReviewFileType.Attachment with Double = js.native
  /* 0 */ val ChangeEntry: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPullRequestReviewFileType.ChangeEntry with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPullRequestReviewFileType with Double] = js.native
}

