package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Bend")
@js.native
class Bend protected () extends Modifier {
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, release: scala.Boolean) = this()
  def this(text: java.lang.String, release: scala.Boolean, phrase: js.Array[vexflowLib.Anon_Text]) = this()
  def getText(): java.lang.String = js.native
  def setFont(font: java.lang.String): Bend = js.native
  def updateWidth(): Bend = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Bend")
@js.native
object Bend extends js.Object {
  var DOWN: scala.Double = js.native
  var UP: scala.Double = js.native
  def format(bends: js.Array[vexflowLib.VexNs.FlowNs.Bend], state: vexflowLib.Anon_Leftshift): scala.Boolean = js.native
}

