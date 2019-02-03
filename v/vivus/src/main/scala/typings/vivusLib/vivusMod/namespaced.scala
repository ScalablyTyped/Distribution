package typings
package vivusLib.vivusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vivus", JSImport.Namespace)
@js.native
class namespaced protected () extends Vivus {
  /**
    * @param element The DOM element, or the ID of a DOM element, to interact with.
    * @param options
    * @param callback Callback to call at the end of the animation
    */
  def this(element: java.lang.String) = this()
  def this(element: stdLib.HTMLElement) = this()
  def this(element: java.lang.String, options: vivusLib.vivusMod.VivusNs.VivusOptions) = this()
  def this(element: stdLib.HTMLElement, options: vivusLib.vivusMod.VivusNs.VivusOptions) = this()
  def this(element: java.lang.String, options: vivusLib.vivusMod.VivusNs.VivusOptions, callback: js.Function1[/* vivusInstance */ Vivus, scala.Unit]) = this()
  def this(element: stdLib.HTMLElement, options: vivusLib.vivusMod.VivusNs.VivusOptions, callback: js.Function1[/* vivusInstance */ Vivus, scala.Unit]) = this()
}

/* static members */
@JSImport("vivus", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  @JSName("EASE_IN")
  var EASE_IN_Original: vivusLib.vivusMod.VivusNs.TimingFunction = js.native
  @JSName("EASE_OUT_BOUNCE")
  var EASE_OUT_BOUNCE_Original: vivusLib.vivusMod.VivusNs.TimingFunction = js.native
  @JSName("EASE_OUT")
  var EASE_OUT_Original: vivusLib.vivusMod.VivusNs.TimingFunction = js.native
  @JSName("EASE")
  var EASE_Original: vivusLib.vivusMod.VivusNs.TimingFunction = js.native
  @JSName("LINEAR")
  var LINEAR_Original: vivusLib.vivusMod.VivusNs.TimingFunction = js.native
  def EASE(input: scala.Double): scala.Double = js.native
  def EASE_IN(input: scala.Double): scala.Double = js.native
  def EASE_OUT(input: scala.Double): scala.Double = js.native
  def EASE_OUT_BOUNCE(input: scala.Double): scala.Double = js.native
  def LINEAR(input: scala.Double): scala.Double = js.native
}

