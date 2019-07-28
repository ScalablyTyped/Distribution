package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Extraleftpx
import typings.vexflow.Anon_Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.ModifierContext")
@js.native
class ModifierContext () extends js.Object {
  def addModifier(modifier: Modifier): ModifierContext = js.native
  def getExtraLeftPx(): Double = js.native
  def getExtraRightPx(): Double = js.native
  def getMetrics(): Anon_Extraleftpx = js.native
  def getModifiers(`type`: String): js.Array[Modifier] = js.native
  def getState(): Anon_Leftshift = js.native
  def getWidth(): Double = js.native
  def postFormat(): Unit = js.native
  def preFormat(): Unit = js.native
}

/* static members */
@JSGlobal("Vex.Flow.ModifierContext")
@js.native
object ModifierContext extends js.Object {
  var DEBUG: Boolean = js.native
}

