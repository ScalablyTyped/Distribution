package typings.vueScrollto

import typings.vueScrollto.mod.ElementDescriptor
import typings.vueScrollto.mod.ScrollOptions
import typings.vueScrollto.mod.ScrollToFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScrollTo extends js.Object {
  @JSName("scrollTo")
  var scrollTo_Original: ScrollToFunction = js.native
  @JSName("setDefaults")
  var setDefaults_Original: ScrollToFunction = js.native
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

