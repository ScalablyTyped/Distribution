package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResultDetails extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "ResultDetails")
@js.native
object ResultDetails extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResultDetails with Double] = js.native
  
  @js.native
  sealed trait Iterations extends ResultDetails
  /* 1 */ val Iterations: typings.vsoNodeApi.testInterfacesMod.ResultDetails.Iterations with Double = js.native
  
  @js.native
  sealed trait None extends ResultDetails
  /* 0 */ val None: typings.vsoNodeApi.testInterfacesMod.ResultDetails.None with Double = js.native
  
  @js.native
  sealed trait WorkItems extends ResultDetails
  /* 2 */ val WorkItems: typings.vsoNodeApi.testInterfacesMod.ResultDetails.WorkItems with Double = js.native
}
