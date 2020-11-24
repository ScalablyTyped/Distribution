package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitPullRequestReviewFileType extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPullRequestReviewFileType")
@js.native
object GitPullRequestReviewFileType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPullRequestReviewFileType with Double] = js.native
  
  @js.native
  sealed trait Attachment extends GitPullRequestReviewFileType
  /* 1 */ @js.native
  object Attachment
    extends TopLevel[
          typings.vsoNodeApi.gitInterfacesMod.GitPullRequestReviewFileType.Attachment with Double
        ]
  
  @js.native
  sealed trait ChangeEntry extends GitPullRequestReviewFileType
  /* 0 */ @js.native
  object ChangeEntry extends TopLevel[ChangeEntry with Double]
}
