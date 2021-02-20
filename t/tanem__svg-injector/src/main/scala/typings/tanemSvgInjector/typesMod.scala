package typings.tanemSvgInjector

import typings.std.Error
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AfterAll = js.Function1[/* elementsLoaded */ Double, Unit]
  
  type BeforeEach = js.Function1[/* svg */ SVGElement, Unit]
  
  type Errback = js.Function2[/* error */ Error | Null, /* svg */ js.UndefOr[SVGElement], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tanemSvgInjector.tanemSvgInjectorStrings.always
    - typings.tanemSvgInjector.tanemSvgInjectorStrings.once
    - typings.tanemSvgInjector.tanemSvgInjectorStrings.never
  */
  trait EvalScripts extends StObject
  object EvalScripts {
    
    @scala.inline
    def always: typings.tanemSvgInjector.tanemSvgInjectorStrings.always = "always".asInstanceOf[typings.tanemSvgInjector.tanemSvgInjectorStrings.always]
    
    @scala.inline
    def never: typings.tanemSvgInjector.tanemSvgInjectorStrings.never = "never".asInstanceOf[typings.tanemSvgInjector.tanemSvgInjectorStrings.never]
    
    @scala.inline
    def once: typings.tanemSvgInjector.tanemSvgInjectorStrings.once = "once".asInstanceOf[typings.tanemSvgInjector.tanemSvgInjectorStrings.once]
  }
}
