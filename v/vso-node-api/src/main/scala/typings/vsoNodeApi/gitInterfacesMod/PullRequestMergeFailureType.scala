package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  sealed trait CaseSensitive extends PullRequestMergeFailureType
  
  /**
    * Type is not set. Default type.
    */
  @js.native
  sealed trait None extends PullRequestMergeFailureType
  
  /**
    * Pull request merge failed due to an object being too large.
    */
  @js.native
  sealed trait ObjectTooLarge extends PullRequestMergeFailureType
  
  /**
    * Pull request merge failure type unknown.
    */
  @js.native
  sealed trait Unknown extends PullRequestMergeFailureType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PullRequestMergeFailureType with Double] = js.native
  /* 2 */ @js.native
  object CaseSensitive extends TopLevel[CaseSensitive with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object ObjectTooLarge extends TopLevel[ObjectTooLarge with Double]
  
  /* 1 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}

