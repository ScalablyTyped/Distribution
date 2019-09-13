package typings.vueDashScrollto.vueDashScrolltoMod

import typings.std.Element
import typings.vue.typesPluginMod.PluginObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueScrollToPlugin extends PluginObject[Options] {
  @JSName("scrollTo")
  var scrollTo_Original: VueStatic = js.native
  @JSName("setDefaults")
  var setDefaults_Original: VueStatic = js.native
  def scrollTo(element: String): Unit = js.native
  def scrollTo(element: String, duration: Double): Unit = js.native
  def scrollTo(element: String, duration: Double, options: Options): Unit = js.native
  def scrollTo(element: String, options: Options): Unit = js.native
  def scrollTo(element: Element): Unit = js.native
  def scrollTo(element: Element, duration: Double): Unit = js.native
  def scrollTo(element: Element, duration: Double, options: Options): Unit = js.native
  def scrollTo(element: Element, options: Options): Unit = js.native
  def scrollTo(options: Options): Unit = js.native
  def setDefaults(element: String): Unit = js.native
  def setDefaults(element: String, duration: Double): Unit = js.native
  def setDefaults(element: String, duration: Double, options: Options): Unit = js.native
  def setDefaults(element: String, options: Options): Unit = js.native
  def setDefaults(element: Element): Unit = js.native
  def setDefaults(element: Element, duration: Double): Unit = js.native
  def setDefaults(element: Element, duration: Double, options: Options): Unit = js.native
  def setDefaults(element: Element, options: Options): Unit = js.native
  def setDefaults(options: Options): Unit = js.native
}

