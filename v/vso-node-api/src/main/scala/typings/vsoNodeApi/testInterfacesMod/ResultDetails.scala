package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResultDetails extends js.Object
@JSImport("vso-node-api/interfaces/TestInterfaces", "ResultDetails")
@js.native
object ResultDetails extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResultDetails with Double] = js.native
  
  @js.native
  sealed trait Iterations extends ResultDetails
  /* 1 */ @js.native
  object Iterations extends TopLevel[Iterations with Double]
  
  @js.native
  sealed trait None extends ResultDetails
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait WorkItems extends ResultDetails
  /* 2 */ @js.native
  object WorkItems extends TopLevel[WorkItems with Double]
}
