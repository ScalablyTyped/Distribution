package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestResultsContextType extends js.Object
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestResultsContextType")
@js.native
object TestResultsContextType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestResultsContextType with Double] = js.native
  
  @js.native
  sealed trait Build extends TestResultsContextType
  /* 1 */ @js.native
  object Build extends TopLevel[Build with Double]
  
  @js.native
  sealed trait Release extends TestResultsContextType
  /* 2 */ @js.native
  object Release extends TopLevel[Release with Double]
}
