package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomTestFieldType extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "CustomTestFieldType")
@js.native
object CustomTestFieldType extends js.Object {
  @js.native
  sealed trait Bit
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldType
  
  @js.native
  sealed trait DateTime
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldType
  
  @js.native
  sealed trait Float
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldType
  
  @js.native
  sealed trait Guid
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldType
  
  @js.native
  sealed trait Int
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldType
  
  @js.native
  sealed trait String
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldType
  
  /* 2 */ val Bit: Bit with scala.Double = js.native
  /* 4 */ val DateTime: DateTime with scala.Double = js.native
  /* 6 */ val Float: Float with scala.Double = js.native
  /* 14 */ val Guid: Guid with scala.Double = js.native
  /* 8 */ val Int: Int with scala.Double = js.native
  /* 12 */ val String: String with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldType with scala.Double
  ] = js.native
}

