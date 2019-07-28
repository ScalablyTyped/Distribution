package typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputFilterOperator extends js.Object

@JSImport("vso-node-api/interfaces/common/FormInputInterfaces", "InputFilterOperator")
@js.native
object InputFilterOperator extends js.Object {
  @js.native
  sealed trait Equals extends InputFilterOperator
  
  @js.native
  sealed trait NotEquals extends InputFilterOperator
  
  /* 0 */ val Equals: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputFilterOperator.Equals with Double = js.native
  /* 1 */ val NotEquals: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputFilterOperator.NotEquals with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputFilterOperator with Double] = js.native
}

