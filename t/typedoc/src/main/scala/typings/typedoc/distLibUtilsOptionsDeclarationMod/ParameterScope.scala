package typings.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterScope with Double] = js.native
  /* 0 */ @js.native
  object TypeDoc extends TopLevel[TypeDoc with Double]
  
  /* 1 */ @js.native
  object TypeScript extends TopLevel[TypeScript with Double]
  
}

