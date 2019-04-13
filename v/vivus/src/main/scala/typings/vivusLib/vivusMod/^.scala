package typings
package vivusLib.vivusMod

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
  def this(element: java.lang.String) = this()
  def this(element: stdLib.HTMLElement) = this()
  def this(element: java.lang.String, options: VivusOptions) = this()
  def this(element: stdLib.HTMLElement, options: VivusOptions) = this()
  def this(element: java.lang.String, options: VivusOptions, callback: js.Function1[/* vivusInstance */ Vivus, scala.Unit]) = this()
  def this(element: stdLib.HTMLElement, options: VivusOptions, callback: js.Function1[/* vivusInstance */ Vivus, scala.Unit]) = this()
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
  def EASE(input: scala.Double): scala.Double = js.native
  def EASE_IN(input: scala.Double): scala.Double = js.native
  def EASE_OUT(input: scala.Double): scala.Double = js.native
  def EASE_OUT_BOUNCE(input: scala.Double): scala.Double = js.native
  def LINEAR(input: scala.Double): scala.Double = js.native
}

