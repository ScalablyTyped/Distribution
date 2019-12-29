package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CloneOperationState extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "CloneOperationState")
@js.native
object CloneOperationState extends js.Object {
  @js.native
  sealed trait Failed extends CloneOperationState
  
  @js.native
  sealed trait InProgress extends CloneOperationState
  
  @js.native
  sealed trait Queued extends CloneOperationState
  
  @js.native
  sealed trait Succeeded extends CloneOperationState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloneOperationState with Double] = js.native
  /* 2 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 1 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 0 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  /* 3 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
}

