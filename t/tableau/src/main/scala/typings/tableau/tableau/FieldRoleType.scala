package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldRoleType extends js.Object

@JSGlobal("tableau.FieldRoleType")
@js.native
object FieldRoleType extends js.Object {
  @js.native
  sealed trait DIMENSION extends FieldRoleType
  
  @js.native
  sealed trait MEASURE extends FieldRoleType
  
  @js.native
  sealed trait UKNOWN extends FieldRoleType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldRoleType with Double] = js.native
  /* 0 */ @js.native
  object DIMENSION extends TopLevel[DIMENSION with Double]
  
  /* 1 */ @js.native
  object MEASURE extends TopLevel[MEASURE with Double]
  
  /* 2 */ @js.native
  object UKNOWN extends TopLevel[UKNOWN with Double]
  
}

