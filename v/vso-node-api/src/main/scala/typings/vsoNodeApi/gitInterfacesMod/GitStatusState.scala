package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitStatusState extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitStatusState")
@js.native
object GitStatusState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitStatusState with Double] = js.native
  
  /**
    * Status with an error.
    */
  @js.native
  sealed trait Error extends GitStatusState
  /* 4 */ val Error: typings.vsoNodeApi.gitInterfacesMod.GitStatusState.Error with Double = js.native
  
  /**
    * Status failed.
    */
  @js.native
  sealed trait Failed extends GitStatusState
  /* 3 */ val Failed: typings.vsoNodeApi.gitInterfacesMod.GitStatusState.Failed with Double = js.native
  
  /**
    * Status is not applicable to the target object.
    */
  @js.native
  sealed trait NotApplicable extends GitStatusState
  /* 5 */ val NotApplicable: typings.vsoNodeApi.gitInterfacesMod.GitStatusState.NotApplicable with Double = js.native
  
  /**
    * Status state not set. Default state.
    */
  @js.native
  sealed trait NotSet extends GitStatusState
  /* 0 */ val NotSet: typings.vsoNodeApi.gitInterfacesMod.GitStatusState.NotSet with Double = js.native
  
  /**
    * Status pending.
    */
  @js.native
  sealed trait Pending extends GitStatusState
  /* 1 */ val Pending: typings.vsoNodeApi.gitInterfacesMod.GitStatusState.Pending with Double = js.native
  
  /**
    * Status succeeded.
    */
  @js.native
  sealed trait Succeeded extends GitStatusState
  /* 2 */ val Succeeded: typings.vsoNodeApi.gitInterfacesMod.GitStatusState.Succeeded with Double = js.native
}
