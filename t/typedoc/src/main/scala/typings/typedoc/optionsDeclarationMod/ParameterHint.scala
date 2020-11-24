package typings.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterHint extends js.Object
@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterHint")
@js.native
object ParameterHint extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterHint with Double] = js.native
  
  @js.native
  sealed trait Directory extends ParameterHint
  /* 1 */ @js.native
  object Directory extends TopLevel[Directory with Double]
  
  @js.native
  sealed trait File extends ParameterHint
  /* 0 */ @js.native
  object File extends TopLevel[File with Double]
}
