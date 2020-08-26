package typings.vivus.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vivus", JSImport.Namespace)
@js.native
class ^ protected () extends Vivus {
  /**
    * @param element The DOM element, or the ID of a DOM element, to interact with.
    * @param options
    * @param callback Callback to call at the end of the animation
    */
  def this(element: String) = this()
  def this(element: HTMLElement) = this()
  def this(element: String, options: VivusOptions) = this()
  def this(element: HTMLElement, options: VivusOptions) = this()
  def this(
    element: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* vivusInstance */ Vivus, Unit]
  ) = this()
  def this(element: String, options: VivusOptions, callback: js.Function1[/* vivusInstance */ Vivus, Unit]) = this()
  def this(
    element: HTMLElement,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* vivusInstance */ Vivus, Unit]
  ) = this()
  def this(
    element: HTMLElement,
    options: VivusOptions,
    callback: js.Function1[/* vivusInstance */ Vivus, Unit]
  ) = this()
}

@JSImport("vivus", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("EASE_IN")
  var EASE_IN_Original: TimingFunction = js.native
  @JSName("EASE_OUT_BOUNCE")
  var EASE_OUT_BOUNCE_Original: TimingFunction = js.native
  @JSName("EASE_OUT")
  var EASE_OUT_Original: TimingFunction = js.native
  @JSName("EASE")
  var EASE_Original: TimingFunction = js.native
  @JSName("LINEAR")
  var LINEAR_Original: TimingFunction = js.native
  def EASE(input: Double): Double = js.native
  def EASE_IN(input: Double): Double = js.native
  def EASE_OUT(input: Double): Double = js.native
  def EASE_OUT_BOUNCE(input: Double): Double = js.native
  def LINEAR(input: Double): Double = js.native
}

