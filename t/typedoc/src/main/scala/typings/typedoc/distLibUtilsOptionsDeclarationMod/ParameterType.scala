package typings.typedoc.distLibUtilsOptionsDeclarationMod

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
  
  /* 5 */ val Array: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Array with Double = js.native
  /* 2 */ val Boolean: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Boolean with Double = js.native
  /* 3 */ val Map: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Map with Double = js.native
  /* 4 */ val Mixed: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Mixed with Double = js.native
  /* 1 */ val Number: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Number with Double = js.native
  /* 0 */ val String: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.String with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterType with Double] = js.native
}

