package typings.tanemSvgInjector

import typings.std.Element
import typings.std.HTMLCollectionOf
import typings.std.NodeListOf
import typings.std.SVGSVGElement
import typings.tanemSvgInjector.distTypesMod.AfterAll
import typings.tanemSvgInjector.distTypesMod.BeforeEach
import typings.tanemSvgInjector.distTypesMod.Errback
import typings.tanemSvgInjector.distTypesMod.EvalScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSvgInjectorMod {
  
  @JSImport("@tanem/svg-injector/dist/svg-injector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(elements: Elements): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(elements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(elements: Elements, param1: OptionalArgs): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elements.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Elements = HTMLCollectionOf[Element] | NodeListOf[Element] | Element | Null
  
  trait OptionalArgs extends StObject {
    
    var afterAll: js.UndefOr[AfterAll] = js.undefined
    
    var afterEach: js.UndefOr[Errback] = js.undefined
    
    var beforeEach: js.UndefOr[BeforeEach] = js.undefined
    
    var cacheRequests: js.UndefOr[Boolean] = js.undefined
    
    var evalScripts: js.UndefOr[EvalScripts] = js.undefined
    
    var httpRequestWithCredentials: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setAfterEach(value: (/* error */ js.Error | Null, /* svg */ js.UndefOr[SVGSVGElement]) => Unit): Self = StObject.set(x, "afterEach", js.Any.fromFunction2(value))
      
      inline def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
      
      inline def setBeforeEach(value: /* svg */ SVGSVGElement => Unit): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1(value))
      
      inline def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
      
      inline def setCacheRequests(value: Boolean): Self = StObject.set(x, "cacheRequests", value.asInstanceOf[js.Any])
      
      inline def setCacheRequestsUndefined: Self = StObject.set(x, "cacheRequests", js.undefined)
      
      inline def setEvalScripts(value: EvalScripts): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      inline def setEvalScriptsUndefined: Self = StObject.set(x, "evalScripts", js.undefined)
      
      inline def setHttpRequestWithCredentials(value: Boolean): Self = StObject.set(x, "httpRequestWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setHttpRequestWithCredentialsUndefined: Self = StObject.set(x, "httpRequestWithCredentials", js.undefined)
      
      inline def setRenumerateIRIElements(value: Boolean): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      inline def setRenumerateIRIElementsUndefined: Self = StObject.set(x, "renumerateIRIElements", js.undefined)
    }
  }
}
