package typings.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterHint extends StObject
@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterHint")
@js.native
object ParameterHint extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterHint with Double] = js.native
  
  @js.native
  sealed trait Directory extends ParameterHint
  /* 1 */ val Directory: typings.typedoc.optionsDeclarationMod.ParameterHint.Directory with Double = js.native
  
  @js.native
  sealed trait File extends ParameterHint
  /* 0 */ val File: typings.typedoc.optionsDeclarationMod.ParameterHint.File with Double = js.native
}
