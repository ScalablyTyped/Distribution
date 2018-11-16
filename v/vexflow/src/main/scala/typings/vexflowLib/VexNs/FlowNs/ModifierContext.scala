package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.ModifierContext")
@js.native
class ModifierContext () extends js.Object {
  def addModifier(modifier: Modifier): ModifierContext = js.native
  def getExtraLeftPx(): scala.Double = js.native
  def getExtraRightPx(): scala.Double = js.native
  def getMetrics(): vexflowLib.Anon_Extraleftpx = js.native
  def getModifiers(`type`: java.lang.String): js.Array[Modifier] = js.native
  def getState(): vexflowLib.Anon_Rightshift = js.native
  def getWidth(): scala.Double = js.native
  def postFormat(): scala.Unit = js.native
  def preFormat(): scala.Unit = js.native
}

@JSGlobal("Vex.Flow.ModifierContext")
@js.native
object ModifierContext extends js.Object {
  var DEBUG: scala.Boolean = js.native
}

