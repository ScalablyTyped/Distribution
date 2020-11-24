package typings.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterScope extends js.Object
@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterScope")
@js.native
object ParameterScope extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterScope with Double] = js.native
  
  @js.native
  sealed trait TypeDoc extends ParameterScope
  /* 0 */ @js.native
  object TypeDoc extends TopLevel[TypeDoc with Double]
  
  @js.native
  sealed trait TypeScript extends ParameterScope
  /* 1 */ @js.native
  object TypeScript extends TopLevel[TypeScript with Double]
}
