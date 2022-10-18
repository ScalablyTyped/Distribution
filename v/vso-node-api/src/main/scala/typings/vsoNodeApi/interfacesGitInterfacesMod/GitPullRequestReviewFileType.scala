package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitPullRequestReviewFileType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPullRequestReviewFileType")
@js.native
object GitPullRequestReviewFileType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPullRequestReviewFileType & Double] = js.native
  
  @js.native
  sealed trait Attachment
    extends StObject
       with GitPullRequestReviewFileType
  /* 1 */ val Attachment: typings.vsoNodeApi.interfacesGitInterfacesMod.GitPullRequestReviewFileType.Attachment & Double = js.native
  
  @js.native
  sealed trait ChangeEntry
    extends StObject
       with GitPullRequestReviewFileType
  /* 0 */ val ChangeEntry: typings.vsoNodeApi.interfacesGitInterfacesMod.GitPullRequestReviewFileType.ChangeEntry & Double = js.native
}
