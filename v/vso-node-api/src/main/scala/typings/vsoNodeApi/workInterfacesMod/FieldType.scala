package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends js.Object
@JSImport("vso-node-api/interfaces/WorkInterfaces", "FieldType")
@js.native
object FieldType extends js.Object {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[FieldType with scala.Double] = js.native
  
  @js.native
  sealed trait Boolean extends FieldType
  /* 5 */ @js.native
  object Boolean
    extends TopLevel[Boolean with scala.Double]
  
  @js.native
  sealed trait DateTime extends FieldType
  /* 3 */ @js.native
  object DateTime
    extends TopLevel[DateTime with scala.Double]
  
  @js.native
  sealed trait Double extends FieldType
  /* 6 */ @js.native
  object Double
    extends TopLevel[Double with scala.Double]
  
  @js.native
  sealed trait Integer extends FieldType
  /* 2 */ @js.native
  object Integer
    extends TopLevel[Integer with scala.Double]
  
  @js.native
  sealed trait PlainText extends FieldType
  /* 1 */ @js.native
  object PlainText
    extends TopLevel[PlainText with scala.Double]
  
  @js.native
  sealed trait String extends FieldType
  /* 0 */ @js.native
  object String
    extends TopLevel[String with scala.Double]
  
  @js.native
  sealed trait TreePath extends FieldType
  /* 4 */ @js.native
  object TreePath
    extends TopLevel[TreePath with scala.Double]
}
