package typings.tanemSvgInjector

import typings.std.Element
import typings.std.HTMLElement
import typings.std.NonNullable
import typings.tanemSvgInjector.typesMod.BeforeEach
import typings.tanemSvgInjector.typesMod.Errback
import typings.tanemSvgInjector.typesMod.EvalScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectElementMod {
  
  @JSImport("@tanem/svg-injector/dist/inject-element", JSImport.Default)
  @js.native
  def default(
    el: NonNullable[ElementType],
    evalScripts: EvalScripts,
    renumerateIRIElements: Boolean,
    cacheRequests: Boolean,
    beforeEach: BeforeEach,
    callback: Errback
  ): Unit = js.native
  
  type ElementType = Element | HTMLElement | Null
}
