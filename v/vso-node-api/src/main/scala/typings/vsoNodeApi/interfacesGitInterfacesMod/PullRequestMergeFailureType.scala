package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PullRequestMergeFailureType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "PullRequestMergeFailureType")
@js.native
object PullRequestMergeFailureType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PullRequestMergeFailureType & Double] = js.native
  
  /**
    * Pull request merge failed due to case mismatch.
    */
  @js.native
  sealed trait CaseSensitive
    extends StObject
       with PullRequestMergeFailureType
  /* 2 */ val CaseSensitive: typings.vsoNodeApi.interfacesGitInterfacesMod.PullRequestMergeFailureType.CaseSensitive & Double = js.native
  
  /**
    * Type is not set. Default type.
    */
  @js.native
  sealed trait None
    extends StObject
       with PullRequestMergeFailureType
  /* 0 */ val None: typings.vsoNodeApi.interfacesGitInterfacesMod.PullRequestMergeFailureType.None & Double = js.native
  
  /**
    * Pull request merge failed due to an object being too large.
    */
  @js.native
  sealed trait ObjectTooLarge
    extends StObject
       with PullRequestMergeFailureType
  /* 3 */ val ObjectTooLarge: typings.vsoNodeApi.interfacesGitInterfacesMod.PullRequestMergeFailureType.ObjectTooLarge & Double = js.native
  
  /**
    * Pull request merge failure type unknown.
    */
  @js.native
  sealed trait Unknown
    extends StObject
       with PullRequestMergeFailureType
  /* 1 */ val Unknown: typings.vsoNodeApi.interfacesGitInterfacesMod.PullRequestMergeFailureType.Unknown & Double = js.native
}
