package typings.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputFilterOperator extends js.Object
@JSImport("vso-node-api/interfaces/common/FormInputInterfaces", "InputFilterOperator")
@js.native
object InputFilterOperator extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputFilterOperator with Double] = js.native
  
  @js.native
  sealed trait Equals extends InputFilterOperator
  /* 0 */ @js.native
  object Equals extends TopLevel[Equals with Double]
  
  @js.native
  sealed trait NotEquals extends InputFilterOperator
  /* 1 */ @js.native
  object NotEquals extends TopLevel[NotEquals with Double]
}
