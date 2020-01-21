package typings.tanemSvgInjector

import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector/dist/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EvalScripts with String] = js.native
    /* "always" */ @js.native
    object Always extends TopLevel[Always with String]
    
    /* "never" */ @js.native
    object Never extends TopLevel[Never with String]
    
    /* "once" */ @js.native
    object Once extends TopLevel[Once with String]
    
  }
  
  type AfterAll = js.Function1[/* elementsLoaded */ Double, Unit]
  type BeforeEach = js.Function1[/* svg */ Element, Unit]
  type Errback = js.Function2[/* error */ Error | Null, /* svg */ js.UndefOr[Element], Unit]
}

