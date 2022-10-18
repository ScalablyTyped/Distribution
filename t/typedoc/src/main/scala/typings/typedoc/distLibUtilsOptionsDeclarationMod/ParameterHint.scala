package typings.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterHint extends StObject
@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterHint")
@js.native
object ParameterHint extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterHint & Double] = js.native
  
  @js.native
  sealed trait Directory
    extends StObject
       with ParameterHint
  /* 1 */ val Directory: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterHint.Directory & Double = js.native
  
  @js.native
  sealed trait File
    extends StObject
       with ParameterHint
  /* 0 */ val File: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterHint.File & Double = js.native
}
