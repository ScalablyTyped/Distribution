package typings
package typedocLib.distLibUtilsOptionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterScope extends js.Object

@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterScope")
@js.native
object ParameterScope extends js.Object {
  @js.native
  sealed trait TypeDoc
    extends typedocLib.distLibUtilsOptionsDeclarationMod.ParameterScope
  
  @js.native
  sealed trait TypeScript
    extends typedocLib.distLibUtilsOptionsDeclarationMod.ParameterScope
  
  /* 0 */ val TypeDoc: TypeDoc with scala.Double = js.native
  /* 1 */ val TypeScript: TypeScript with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typedocLib.distLibUtilsOptionsDeclarationMod.ParameterScope with scala.Double] = js.native
}

