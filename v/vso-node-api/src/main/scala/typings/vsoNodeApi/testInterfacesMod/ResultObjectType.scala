package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResultObjectType extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "ResultObjectType")
@js.native
object ResultObjectType extends js.Object {
  @js.native
  sealed trait TestPlan extends ResultObjectType
  
  @js.native
  sealed trait TestSuite extends ResultObjectType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResultObjectType with Double] = js.native
  /* 1 */ @js.native
  object TestPlan
    extends TopLevel[typings.vsoNodeApi.testInterfacesMod.ResultObjectType.TestPlan with Double]
  
  /* 0 */ @js.native
  object TestSuite
    extends TopLevel[typings.vsoNodeApi.testInterfacesMod.ResultObjectType.TestSuite with Double]
  
}

