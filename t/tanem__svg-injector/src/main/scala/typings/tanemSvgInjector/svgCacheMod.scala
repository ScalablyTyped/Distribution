package typings.tanemSvgInjector

import typings.std.Error
import typings.std.HTMLElement
import typings.std.Map
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector/dist/svg-cache", JSImport.Namespace)
@js.native
object svgCacheMod extends js.Object {
  val default: Map[String, js.UndefOr[Error | HTMLElement | SVGElement]] = js.native
}

