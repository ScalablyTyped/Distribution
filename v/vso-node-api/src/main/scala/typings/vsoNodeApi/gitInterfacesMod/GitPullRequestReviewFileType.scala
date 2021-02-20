package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitPullRequestReviewFileType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPullRequestReviewFileType")
@js.native
object GitPullRequestReviewFileType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPullRequestReviewFileType with Double] = js.native
  
  @js.native
  sealed trait Attachment extends GitPullRequestReviewFileType
  /* 1 */ val Attachment: typings.vsoNodeApi.gitInterfacesMod.GitPullRequestReviewFileType.Attachment with Double = js.native
  
  @js.native
  sealed trait ChangeEntry extends GitPullRequestReviewFileType
  /* 0 */ val ChangeEntry: typings.vsoNodeApi.gitInterfacesMod.GitPullRequestReviewFileType.ChangeEntry with Double = js.native
}
