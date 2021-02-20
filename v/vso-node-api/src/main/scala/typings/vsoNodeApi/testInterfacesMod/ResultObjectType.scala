package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResultObjectType extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "ResultObjectType")
@js.native
object ResultObjectType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResultObjectType with Double] = js.native
  
  @js.native
  sealed trait TestPlan extends ResultObjectType
  /* 1 */ val TestPlan: typings.vsoNodeApi.testInterfacesMod.ResultObjectType.TestPlan with Double = js.native
  
  @js.native
  sealed trait TestSuite extends ResultObjectType
  /* 0 */ val TestSuite: typings.vsoNodeApi.testInterfacesMod.ResultObjectType.TestSuite with Double = js.native
}
