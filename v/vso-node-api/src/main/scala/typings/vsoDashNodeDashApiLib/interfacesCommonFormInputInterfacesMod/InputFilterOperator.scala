package typings
package vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputFilterOperator extends js.Object

@JSImport("vso-node-api/interfaces/common/FormInputInterfaces", "InputFilterOperator")
@js.native
object InputFilterOperator extends js.Object {
  @js.native
  sealed trait Equals
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputFilterOperator
  
  @js.native
  sealed trait NotEquals
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputFilterOperator
  
  /* 0 */ val Equals: Equals with scala.Double = js.native
  /* 1 */ val NotEquals: NotEquals with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputFilterOperator with scala.Double
  ] = js.native
}

