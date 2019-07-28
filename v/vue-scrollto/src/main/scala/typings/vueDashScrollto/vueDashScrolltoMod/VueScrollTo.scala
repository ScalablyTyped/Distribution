package typings.vueDashScrollto.vueDashScrolltoMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueScrollTo extends js.Object {
  @JSName("scrollTo")
  var scrollTo_Original: VueStatic = js.native
  def scrollTo(element: String): Unit = js.native
  def scrollTo(element: String, duration: Double): Unit = js.native
  def scrollTo(element: String, duration: Double, options: Options): Unit = js.native
  def scrollTo(element: String, options: Options): Unit = js.native
  def scrollTo(element: Element): Unit = js.native
  def scrollTo(element: Element, duration: Double): Unit = js.native
  def scrollTo(element: Element, duration: Double, options: Options): Unit = js.native
  def scrollTo(element: Element, options: Options): Unit = js.native
  def scrollTo(options: Options): Unit = js.native
}

