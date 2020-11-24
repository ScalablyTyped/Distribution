package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CloneOperationState extends js.Object
@JSImport("vso-node-api/interfaces/TestInterfaces", "CloneOperationState")
@js.native
object CloneOperationState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloneOperationState with Double] = js.native
  
  @js.native
  sealed trait Failed extends CloneOperationState
  /* 2 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  @js.native
  sealed trait InProgress extends CloneOperationState
  /* 1 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  @js.native
  sealed trait Queued extends CloneOperationState
  /* 0 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  @js.native
  sealed trait Succeeded extends CloneOperationState
  /* 3 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
}
