package typings
package atTanemSvgDashInjectorLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EvalScripts extends js.Object

@JSImport("@tanem/svg-injector/dist/types", "EvalScripts")
@js.native
object EvalScripts extends js.Object {
  @js.native
  sealed trait Always
    extends atTanemSvgDashInjectorLib.distTypesMod.EvalScripts
  
  @js.native
  sealed trait Never
    extends atTanemSvgDashInjectorLib.distTypesMod.EvalScripts
  
  @js.native
  sealed trait Once
    extends atTanemSvgDashInjectorLib.distTypesMod.EvalScripts
  
  /* "always" */ val Always: Always with java.lang.String = js.native
  /* "never" */ val Never: Never with java.lang.String = js.native
  /* "once" */ val Once: Once with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atTanemSvgDashInjectorLib.distTypesMod.EvalScripts with java.lang.String] = js.native
}

