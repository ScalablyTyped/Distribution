package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PullRequestMergeFailureType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "PullRequestMergeFailureType")
@js.native
object PullRequestMergeFailureType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PullRequestMergeFailureType with Double] = js.native
  
  /**
    * Pull request merge failed due to case mismatch.
    */
  @js.native
  sealed trait CaseSensitive extends PullRequestMergeFailureType
  /* 2 */ val CaseSensitive: typings.vsoNodeApi.gitInterfacesMod.PullRequestMergeFailureType.CaseSensitive with Double = js.native
  
  /**
    * Type is not set. Default type.
    */
  @js.native
  sealed trait None extends PullRequestMergeFailureType
  /* 0 */ val None: typings.vsoNodeApi.gitInterfacesMod.PullRequestMergeFailureType.None with Double = js.native
  
  /**
    * Pull request merge failed due to an object being too large.
    */
  @js.native
  sealed trait ObjectTooLarge extends PullRequestMergeFailureType
  /* 3 */ val ObjectTooLarge: typings.vsoNodeApi.gitInterfacesMod.PullRequestMergeFailureType.ObjectTooLarge with Double = js.native
  
  /**
    * Pull request merge failure type unknown.
    */
  @js.native
  sealed trait Unknown extends PullRequestMergeFailureType
  /* 1 */ val Unknown: typings.vsoNodeApi.gitInterfacesMod.PullRequestMergeFailureType.Unknown with Double = js.native
}
