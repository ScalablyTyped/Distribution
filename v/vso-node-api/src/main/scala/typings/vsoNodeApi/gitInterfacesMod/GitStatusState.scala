package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitStatusState extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitStatusState")
@js.native
object GitStatusState extends js.Object {
  /**
    * Status with an error.
    */
  @js.native
  sealed trait Error extends GitStatusState
  
  /**
    * Status failed.
    */
  @js.native
  sealed trait Failed extends GitStatusState
  
  /**
    * Status is not applicable to the target object.
    */
  @js.native
  sealed trait NotApplicable extends GitStatusState
  
  /**
    * Status state not set. Default state.
    */
  @js.native
  sealed trait NotSet extends GitStatusState
  
  /**
    * Status pending.
    */
  @js.native
  sealed trait Pending extends GitStatusState
  
  /**
    * Status succeeded.
    */
  @js.native
  sealed trait Succeeded extends GitStatusState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitStatusState with Double] = js.native
  /* 4 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 3 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 5 */ @js.native
  object NotApplicable extends TopLevel[NotApplicable with Double]
  
  /* 0 */ @js.native
  object NotSet extends TopLevel[NotSet with Double]
  
  /* 1 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  /* 2 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
}

