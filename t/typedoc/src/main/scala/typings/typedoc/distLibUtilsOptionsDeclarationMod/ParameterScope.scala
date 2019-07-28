package typings.typedoc.distLibUtilsOptionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterScope extends js.Object

@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterScope")
@js.native
object ParameterScope extends js.Object {
  @js.native
  sealed trait TypeDoc extends ParameterScope
  
  @js.native
  sealed trait TypeScript extends ParameterScope
  
  /* 0 */ val TypeDoc: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterScope.TypeDoc with Double = js.native
  /* 1 */ val TypeScript: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterScope.TypeScript with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterScope with Double] = js.native
}

