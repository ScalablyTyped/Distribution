package typings
package typedocLib.distLibUtilsOptionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterHint extends js.Object

@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterHint")
@js.native
object ParameterHint extends js.Object {
  @js.native
  sealed trait Directory
    extends typedocLib.distLibUtilsOptionsDeclarationMod.ParameterHint
  
  @js.native
  sealed trait File
    extends typedocLib.distLibUtilsOptionsDeclarationMod.ParameterHint
  
  /* 1 */ val Directory: Directory with scala.Double = js.native
  /* 0 */ val File: File with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typedocLib.distLibUtilsOptionsDeclarationMod.ParameterHint with scala.Double] = js.native
}

