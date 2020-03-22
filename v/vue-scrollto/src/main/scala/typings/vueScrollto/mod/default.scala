package typings.vueScrollto.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vue.optionsMod.DirectiveFunction
import typings.vue.pluginMod.PluginFunction
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-scrollto", JSImport.Default)
@js.native
object default
  extends /* key */ StringDictionary[js.Any] {
  var bind: js.UndefOr[DirectiveFunction] = js.native
  var componentUpdated: js.UndefOr[DirectiveFunction] = js.native
  var inserted: js.UndefOr[DirectiveFunction] = js.native
  @JSName("install")
  var install_Original: PluginFunction[ScrollOptions] = js.native
  @JSName("scrollTo")
  var scrollTo_Original: ScrollToFunction = js.native
  @JSName("setDefaults")
  var setDefaults_Original: ScrollToFunction = js.native
  var unbind: js.UndefOr[DirectiveFunction] = js.native
  var update: js.UndefOr[DirectiveFunction] = js.native
  def install(Vue: VueConstructor[Vue]): Unit = js.native
  def install(Vue: VueConstructor[Vue], options: ScrollOptions): Unit = js.native
  def scrollTo(element: ElementDescriptor): js.Function0[Unit] = js.native
  def scrollTo(element: ElementDescriptor, duration: Double): js.Function0[Unit] = js.native
  def scrollTo(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit] = js.native
  def scrollTo(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit] = js.native
  def scrollTo(options: ScrollOptions): js.Function0[Unit] = js.native
  def setDefaults(element: ElementDescriptor): js.Function0[Unit] = js.native
  def setDefaults(element: ElementDescriptor, duration: Double): js.Function0[Unit] = js.native
  def setDefaults(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit] = js.native
  def setDefaults(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit] = js.native
  def setDefaults(options: ScrollOptions): js.Function0[Unit] = js.native
}

