package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionMergeType extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionMergeType")
@js.native
object GitResolutionMergeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionMergeType with Double] = js.native
  
  @js.native
  sealed trait AutoMerged extends GitResolutionMergeType
  /* 3 */ @js.native
  object AutoMerged extends TopLevel[AutoMerged with Double]
  
  @js.native
  sealed trait TakeSourceContent extends GitResolutionMergeType
  /* 1 */ @js.native
  object TakeSourceContent extends TopLevel[TakeSourceContent with Double]
  
  @js.native
  sealed trait TakeTargetContent extends GitResolutionMergeType
  /* 2 */ @js.native
  object TakeTargetContent extends TopLevel[TakeTargetContent with Double]
  
  @js.native
  sealed trait Undecided extends GitResolutionMergeType
  /* 0 */ @js.native
  object Undecided extends TopLevel[Undecided with Double]
  
  @js.native
  sealed trait UserMerged extends GitResolutionMergeType
  /* 4 */ @js.native
  object UserMerged extends TopLevel[UserMerged with Double]
}
