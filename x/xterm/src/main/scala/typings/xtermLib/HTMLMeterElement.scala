package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLMeterElement extends HTMLElement {
  var high: scala.Double = js.native
  val labels: NodeListOf[HTMLLabelElement] = js.native
  var low: scala.Double = js.native
  var max: scala.Double = js.native
  var min: scala.Double = js.native
  var optimum: scala.Double = js.native
  var value: scala.Double = js.native
}

@JSGlobal("HTMLMeterElement")
@js.native
object HTMLMeterElement
  extends ScalablyTyped.runtime.Instantiable0[HTMLMeterElement]

