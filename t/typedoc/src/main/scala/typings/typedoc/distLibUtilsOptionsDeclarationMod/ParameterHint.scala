package typings.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterHint with Double] = js.native
  /* 1 */ @js.native
  object Directory extends TopLevel[Directory with Double]
  
  /* 0 */ @js.native
  object File extends TopLevel[File with Double]
  
}

