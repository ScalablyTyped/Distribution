package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.Boolean
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.DateTime
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.Double
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.Integer
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.PlainText
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.String
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.FieldType.TreePath
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
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[FieldType with scala.Double] = js.native
  /* 5 */ @js.native
  object Boolean
    extends TopLevel[Boolean with scala.Double]
  
  /* 3 */ @js.native
  object DateTime
    extends TopLevel[DateTime with scala.Double]
  
  /* 6 */ @js.native
  object Double
    extends TopLevel[Double with scala.Double]
  
  /* 2 */ @js.native
  object Integer
    extends TopLevel[Integer with scala.Double]
  
  /* 1 */ @js.native
  object PlainText
    extends TopLevel[PlainText with scala.Double]
  
  /* 0 */ @js.native
  object String
    extends TopLevel[String with scala.Double]
  
  /* 4 */ @js.native
  object TreePath
    extends TopLevel[TreePath with scala.Double]
  
}

