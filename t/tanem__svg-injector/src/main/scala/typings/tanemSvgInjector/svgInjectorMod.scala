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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgInjectorMod {
  
  @JSImport("@tanem/svg-injector/dist/svg-injector", JSImport.Default)
  @js.native
  def default(elements: Elements): Unit = js.native
  @JSImport("@tanem/svg-injector/dist/svg-injector", JSImport.Default)
  @js.native
  def default(
    elements: Elements,
    hasAfterAllAfterEachBeforeEachCacheRequestsEvalScriptsRenumerateIRIElements: OptionalArgs
  ): Unit = js.native
  
  type Elements = HTMLCollectionOf[Element] | NodeListOf[Element] | Element | Null
  
  @js.native
  trait OptionalArgs extends StObject {
    
    var afterAll: js.UndefOr[AfterAll] = js.native
    
    var afterEach: js.UndefOr[Errback] = js.native
    
    var beforeEach: js.UndefOr[BeforeEach] = js.native
    
    var cacheRequests: js.UndefOr[Boolean] = js.native
    
    var evalScripts: js.UndefOr[EvalScripts] = js.native
    
    var renumerateIRIElements: js.UndefOr[Boolean] = js.native
  }
  object OptionalArgs {
    
    @scala.inline
    def apply(): OptionalArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalArgs]
    }
    
    @scala.inline
    implicit class OptionalArgsMutableBuilder[Self <: OptionalArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterAll(value: /* elementsLoaded */ Double => Unit): Self = StObject.set(x, "afterAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterAllUndefined: Self = StObject.set(x, "afterAll", js.undefined)
      
      @scala.inline
      def setAfterEach(value: (/* error */ Error | Null, /* svg */ js.UndefOr[SVGElement]) => Unit): Self = StObject.set(x, "afterEach", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
      
      @scala.inline
      def setBeforeEach(value: /* svg */ SVGElement => Unit): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
      
      @scala.inline
      def setCacheRequests(value: Boolean): Self = StObject.set(x, "cacheRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheRequestsUndefined: Self = StObject.set(x, "cacheRequests", js.undefined)
      
      @scala.inline
      def setEvalScripts(value: EvalScripts): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalScriptsUndefined: Self = StObject.set(x, "evalScripts", js.undefined)
      
      @scala.inline
      def setRenumerateIRIElements(value: Boolean): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenumerateIRIElementsUndefined: Self = StObject.set(x, "renumerateIRIElements", js.undefined)
    }
  }
}
