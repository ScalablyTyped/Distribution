package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldType extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "FieldType")
@js.native
object FieldType extends js.Object {
  @js.native
  sealed trait Boolean extends FieldType
  
  @js.native
  sealed trait DateTime extends FieldType
  
  @js.native
  sealed trait Double extends FieldType
  
  @js.native
  sealed trait Integer extends FieldType
  
  @js.native
  sealed trait PlainText extends FieldType
  
  @js.native
  sealed trait String extends FieldType
  
  @js.native
  sealed trait TreePath extends FieldType
  
  /* 5 */ val Boolean: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.Boolean with scala.Double = js.native
  /* 3 */ val DateTime: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.DateTime with scala.Double = js.native
  /* 6 */ val Double: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.Double with scala.Double = js.native
  /* 2 */ val Integer: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.Integer with scala.Double = js.native
  /* 1 */ val PlainText: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.PlainText with scala.Double = js.native
  /* 0 */ val String: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.String with scala.Double = js.native
  /* 4 */ val TreePath: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.TreePath with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[FieldType with scala.Double] = js.native
}

