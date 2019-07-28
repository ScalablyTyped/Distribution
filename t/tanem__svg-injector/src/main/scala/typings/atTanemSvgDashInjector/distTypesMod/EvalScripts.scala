package typings.atTanemSvgDashInjector.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EvalScripts extends js.Object

@JSImport("@tanem/svg-injector/dist/types", "EvalScripts")
@js.native
object EvalScripts extends js.Object {
  @js.native
  sealed trait Always extends EvalScripts
  
  @js.native
  sealed trait Never extends EvalScripts
  
  @js.native
  sealed trait Once extends EvalScripts
  
  /* "always" */ val Always: typings.atTanemSvgDashInjector.distTypesMod.EvalScripts.Always with String = js.native
  /* "never" */ val Never: typings.atTanemSvgDashInjector.distTypesMod.EvalScripts.Never with String = js.native
  /* "once" */ val Once: typings.atTanemSvgDashInjector.distTypesMod.EvalScripts.Once with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EvalScripts with String] = js.native
}

