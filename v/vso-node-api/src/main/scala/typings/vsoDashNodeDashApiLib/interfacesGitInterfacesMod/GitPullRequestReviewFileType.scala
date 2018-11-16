package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitPullRequestReviewFileType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPullRequestReviewFileType")
@js.native
object GitPullRequestReviewFileType extends js.Object {
  @js.native
  sealed trait Attachment
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestReviewFileType
  
  @js.native
  sealed trait ChangeEntry
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestReviewFileType
  
  /* 1 */ val Attachment: Attachment with scala.Double = js.native
  /* 0 */ val ChangeEntry: ChangeEntry with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestReviewFileType with scala.Double
  ] = js.native
}

