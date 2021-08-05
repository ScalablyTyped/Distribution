package typings.tanemSvgInjector

import typings.std.Element
import typings.std.Error
import typings.std.HTMLCollectionOf
import typings.std.NodeListOf
import typings.std.SVGElement
import typings.tanemSvgInjector.typesMod.AfterAll
import typings.tanemSvgInjector.typesMod.BeforeEach
import typings.tanemSvgInjector.typesMod.Errback
import typings.tanemSvgInjector.typesMod.EvalScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgInjectorMod {
  
  @JSImport("@tanem/svg-injector/dist/svg-injector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(elements: Elements): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(elements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(
    elements: Elements,
    hasAfterAllAfterEachBeforeEachCacheRequestsEvalScriptsRenumerateIRIElements: OptionalArgs
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elements.asInstanceOf[js.Any], hasAfterAllAfterEachBeforeEachCacheRequestsEvalScriptsRenumerateIRIElements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Elements = HTMLCollectionOf[Element] | NodeListOf[Element] | Element | Null
  
  trait OptionalArgs extends StObject {
    
    var afterAll: js.UndefOr[AfterAll] = js.undefined
    
    var afterEach: js.UndefOr[Errback] = js.undefined
    
    var beforeEach: js.UndefOr[BeforeEach] = js.undefined
    
    var cacheRequests: js.UndefOr[Boolean] = js.undefined
    
    var evalScripts: js.UndefOr[EvalScripts] = js.undefined
    
    var renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
  }
  object OptionalArgs {
    
    inline def apply(): OptionalArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalArgs]
    }
    
    extension [Self <: OptionalArgs](x: Self) {
      
      inline def setAfterAll(value: /* elementsLoaded */ Double => Unit): Self = StObject.set(x, "afterAll", js.Any.fromFunction1(value))
      
      inline def setAfterAllUndefined: Self = StObject.set(x, "afterAll", js.undefined)
      
      inline def setAfterEach(value: (/* error */ Error | Null, /* svg */ js.UndefOr[SVGElement]) => Unit): Self = StObject.set(x, "afterEach", js.Any.fromFunction2(value))
      
      inline def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
      
      inline def setBeforeEach(value: /* svg */ SVGElement => Unit): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1(value))
      
      inline def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
      
      inline def setCacheRequests(value: Boolean): Self = StObject.set(x, "cacheRequests", value.asInstanceOf[js.Any])
      
      inline def setCacheRequestsUndefined: Self = StObject.set(x, "cacheRequests", js.undefined)
      
      inline def setEvalScripts(value: EvalScripts): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      inline def setEvalScriptsUndefined: Self = StObject.set(x, "evalScripts", js.undefined)
      
      inline def setRenumerateIRIElements(value: Boolean): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      inline def setRenumerateIRIElementsUndefined: Self = StObject.set(x, "renumerateIRIElements", js.undefined)
    }
  }
}
