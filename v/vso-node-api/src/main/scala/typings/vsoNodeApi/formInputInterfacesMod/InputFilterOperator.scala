package typings.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputFilterOperator extends StObject
@JSImport("vso-node-api/interfaces/common/FormInputInterfaces", "InputFilterOperator")
@js.native
object InputFilterOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputFilterOperator with Double] = js.native
  
  @js.native
  sealed trait Equals extends InputFilterOperator
  /* 0 */ val Equals: typings.vsoNodeApi.formInputInterfacesMod.InputFilterOperator.Equals with Double = js.native
  
  @js.native
  sealed trait NotEquals extends InputFilterOperator
  /* 1 */ val NotEquals: typings.vsoNodeApi.formInputInterfacesMod.InputFilterOperator.NotEquals with Double = js.native
}
