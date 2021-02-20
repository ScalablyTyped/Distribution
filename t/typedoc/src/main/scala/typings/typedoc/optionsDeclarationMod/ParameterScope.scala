package typings.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterScope extends StObject
@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterScope")
@js.native
object ParameterScope extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterScope with Double] = js.native
  
  @js.native
  sealed trait TypeDoc extends ParameterScope
  /* 0 */ val TypeDoc: typings.typedoc.optionsDeclarationMod.ParameterScope.TypeDoc with Double = js.native
  
  @js.native
  sealed trait TypeScript extends ParameterScope
  /* 1 */ val TypeScript: typings.typedoc.optionsDeclarationMod.ParameterScope.TypeScript with Double = js.native
}
