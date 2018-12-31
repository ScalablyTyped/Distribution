package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PullRequestMergeFailureType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "PullRequestMergeFailureType")
@js.native
object PullRequestMergeFailureType extends js.Object {
  /**
    * Pull request merge failed due to case mismatch.
    */
  @js.native
  sealed trait CaseSensitive
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestMergeFailureType
  
  /**
    * Type is not set. Default type.
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestMergeFailureType
  
  /**
    * Pull request merge failed due to an object being too large.
    */
  @js.native
  sealed trait ObjectTooLarge
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestMergeFailureType
  
  /**
    * Pull request merge failure type unknown.
    */
  @js.native
  sealed trait Unknown
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestMergeFailureType
  
  /* 2 */ val CaseSensitive: CaseSensitive with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val ObjectTooLarge: ObjectTooLarge with scala.Double = js.native
  /* 1 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.PullRequestMergeFailureType with scala.Double
  ] = js.native
}

