package typings.tanemSvgInjector

import typings.std.Element
import typings.std.HTMLElement
import typings.std.NonNullable
import typings.tanemSvgInjector.typesMod.BeforeEach
import typings.tanemSvgInjector.typesMod.Errback
import typings.tanemSvgInjector.typesMod.EvalScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectElementMod {
  
  @JSImport("@tanem/svg-injector/dist/inject-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    el: NonNullable[ElementType],
    evalScripts: EvalScripts,
    renumerateIRIElements: Boolean,
    cacheRequests: Boolean,
    beforeEach: BeforeEach,
    callback: Errback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any], evalScripts.asInstanceOf[js.Any], renumerateIRIElements.asInstanceOf[js.Any], cacheRequests.asInstanceOf[js.Any], beforeEach.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ElementType = Element | HTMLElement | Null
}
