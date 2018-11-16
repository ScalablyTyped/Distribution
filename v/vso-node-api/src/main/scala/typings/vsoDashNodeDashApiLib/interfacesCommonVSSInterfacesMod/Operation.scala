package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Operation extends js.Object

@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "Operation")
@js.native
object Operation extends js.Object {
  @js.native
  sealed trait Add
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.Operation
  
  @js.native
  sealed trait Copy
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.Operation
  
  @js.native
  sealed trait Move
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.Operation
  
  @js.native
  sealed trait Remove
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.Operation
  
  @js.native
  sealed trait Replace
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.Operation
  
  @js.native
  sealed trait Test
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.Operation
  
  /* 0 */ val Add: Add with scala.Double = js.native
  /* 4 */ val Copy: Copy with scala.Double = js.native
  /* 3 */ val Move: Move with scala.Double = js.native
  /* 1 */ val Remove: Remove with scala.Double = js.native
  /* 2 */ val Replace: Replace with scala.Double = js.native
  /* 5 */ val Test: Test with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.Operation with scala.Double
  ] = js.native
}

