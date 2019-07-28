package typings.typedoc.distLibUtilsOptionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParameterHint extends js.Object

@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterHint")
@js.native
object ParameterHint extends js.Object {
  @js.native
  sealed trait Directory extends ParameterHint
  
  @js.native
  sealed trait File extends ParameterHint
  
  /* 1 */ val Directory: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterHint.Directory with Double = js.native
  /* 0 */ val File: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterHint.File with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterHint with Double] = js.native
}

