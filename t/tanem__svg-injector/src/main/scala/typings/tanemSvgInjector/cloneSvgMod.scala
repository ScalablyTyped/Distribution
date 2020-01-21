package typings.tanemSvgInjector

import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector/dist/clone-svg", JSImport.Namespace)
@js.native
object cloneSvgMod extends js.Object {
  def default(sourceSvg: HTMLElement): Element = js.native
  def default(sourceSvg: SVGSVGElement): Element = js.native
}

