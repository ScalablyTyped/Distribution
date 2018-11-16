package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldType extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "FieldType")
@js.native
object FieldType extends js.Object {
  @js.native
  sealed trait Boolean
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.FieldType
  
  @js.native
  sealed trait DateTime
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.FieldType
  
  @js.native
  sealed trait Double
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.FieldType
  
  @js.native
  sealed trait Integer
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.FieldType
  
  @js.native
  sealed trait PlainText
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.FieldType
  
  @js.native
  sealed trait String
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.FieldType
  
  @js.native
  sealed trait TreePath
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.FieldType
  
  /* 5 */ val Boolean: Boolean with scala.Double = js.native
  /* 3 */ val DateTime: DateTime with scala.Double = js.native
  /* 6 */ val Double: Double with scala.Double = js.native
  /* 2 */ val Integer: Integer with scala.Double = js.native
  /* 1 */ val PlainText: PlainText with scala.Double = js.native
  /* 0 */ val String: String with scala.Double = js.native
  /* 4 */ val TreePath: TreePath with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.FieldType with scala.Double] = js.native
}

