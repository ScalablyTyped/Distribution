package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPullRequestReviewFileType with Double] = js.native
  /* 1 */ @js.native
  object Attachment
    extends TopLevel[
          typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPullRequestReviewFileType.Attachment with Double
        ]
  
  /* 0 */ @js.native
  object ChangeEntry extends TopLevel[ChangeEntry with Double]
  
}

