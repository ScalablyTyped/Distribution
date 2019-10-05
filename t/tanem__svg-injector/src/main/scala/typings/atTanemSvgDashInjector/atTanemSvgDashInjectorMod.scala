package typings.atTanemSvgDashInjector

import typings.atTanemSvgDashInjector.distSvgDashInjectorMod.Elements
import typings.atTanemSvgDashInjector.distSvgDashInjectorMod.OptionalArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector", JSImport.Namespace)
@js.native
object atTanemSvgDashInjectorMod extends js.Object {
  def SVGInjector(elements: Elements): Unit = js.native
  def SVGInjector(elements: Elements, hasAfterAllAfterEachBeforeEachEvalScriptsRenumerateIRIElements: OptionalArgs): Unit = js.native
  @js.native
  object EvalScripts extends js.Object {
    /* "always" */ val Always: typings.atTanemSvgDashInjector.distTypesMod.EvalScripts.Always with String = js.native
    /* "never" */ val Never: typings.atTanemSvgDashInjector.distTypesMod.EvalScripts.Never with String = js.native
    /* "once" */ val Once: typings.atTanemSvgDashInjector.distTypesMod.EvalScripts.Once with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.atTanemSvgDashInjector.distTypesMod.EvalScripts with String] = js.native
  }
  
}

