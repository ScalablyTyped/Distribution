package typings.tanemSvgInjector

import typings.std.Element
import typings.std.HTMLElement
import typings.std.NonNullable
import typings.tanemSvgInjector.typesMod.BeforeEach
import typings.tanemSvgInjector.typesMod.Errback
import typings.tanemSvgInjector.typesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector/dist/inject-element", JSImport.Namespace)
@js.native
object injectElementMod extends js.Object {
  def default(
    el: NonNullable[ElementType],
    evalScripts: EvalScripts,
    renumerateIRIElements: Boolean,
    beforeEach: BeforeEach,
    callback: Errback
  ): Unit = js.native
  type ElementType = Element | HTMLElement | Null
}

