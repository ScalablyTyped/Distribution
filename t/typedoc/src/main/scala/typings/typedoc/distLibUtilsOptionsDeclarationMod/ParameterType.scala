package typings.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.TopLevel
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Array
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Boolean
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Map
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Mixed
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Number
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterType extends js.Object

@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterType")
@js.native
object ParameterType extends js.Object {
  @js.native
  sealed trait Array extends ParameterType
  
  @js.native
  sealed trait Boolean extends ParameterType
  
  @js.native
  sealed trait Map extends ParameterType
  
  @js.native
  sealed trait Mixed extends ParameterType
  
  @js.native
  sealed trait Number extends ParameterType
  
  @js.native
  sealed trait String extends ParameterType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterType with Double] = js.native
  /* 5 */ @js.native
  object Array extends TopLevel[Array with Double]
  
  /* 2 */ @js.native
  object Boolean extends TopLevel[Boolean with Double]
  
  /* 3 */ @js.native
  object Map extends TopLevel[Map with Double]
  
  /* 4 */ @js.native
  object Mixed extends TopLevel[Mixed with Double]
  
  /* 1 */ @js.native
  object Number extends TopLevel[Number with Double]
  
  /* 0 */ @js.native
  object String extends TopLevel[String with Double]
  
}

