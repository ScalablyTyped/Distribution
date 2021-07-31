package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResultDetails extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "ResultDetails")
@js.native
object ResultDetails extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResultDetails & Double] = js.native
  
  @js.native
  sealed trait Iterations
    extends StObject
       with ResultDetails
  /* 1 */ val Iterations: typings.vsoNodeApi.testInterfacesMod.ResultDetails.Iterations & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ResultDetails
  /* 0 */ val None: typings.vsoNodeApi.testInterfacesMod.ResultDetails.None & Double = js.native
  
  @js.native
  sealed trait WorkItems
    extends StObject
       with ResultDetails
  /* 2 */ val WorkItems: typings.vsoNodeApi.testInterfacesMod.ResultDetails.WorkItems & Double = js.native
}
