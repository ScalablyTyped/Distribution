package typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputFilterOperator extends StObject
@JSImport("vso-node-api/interfaces/common/FormInputInterfaces", "InputFilterOperator")
@js.native
object InputFilterOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputFilterOperator & Double] = js.native
  
  @js.native
  sealed trait Equals
    extends StObject
       with InputFilterOperator
  /* 0 */ val Equals: typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputFilterOperator.Equals & Double = js.native
  
  @js.native
  sealed trait NotEquals
    extends StObject
       with InputFilterOperator
  /* 1 */ val NotEquals: typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputFilterOperator.NotEquals & Double = js.native
}
