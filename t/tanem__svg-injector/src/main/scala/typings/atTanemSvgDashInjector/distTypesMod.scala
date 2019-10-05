package typings.atTanemSvgDashInjector

import typings.atTanemSvgDashInjector.distTypesMod.EvalScripts
import typings.std.Element
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector/dist/types", JSImport.Namespace)
@js.native
object distTypesMod extends js.Object {
  @js.native
  sealed trait EvalScripts extends js.Object
  
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
  
  type AfterAll = js.Function1[/* elementsLoaded */ Double, Unit]
  type BeforeEach = js.Function1[/* svg */ Element, Unit]
  type Errback = js.Function2[/* error */ Error | Null, /* svg */ js.UndefOr[Element], Unit]
}

