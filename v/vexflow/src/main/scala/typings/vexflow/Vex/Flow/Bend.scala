package typings.vexflow.Vex.Flow

import typings.vexflow.Anon_Leftshift
import typings.vexflow.Anon_Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Bend")
@js.native
class Bend protected () extends Modifier {
  def this(text: String) = this()
  def this(text: String, release: Boolean) = this()
  def this(text: String, release: Boolean, phrase: js.Array[Anon_Text]) = this()
  def getText(): String = js.native
  def setFont(font: String): Bend = js.native
  def updateWidth(): Bend = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Bend")
@js.native
object Bend extends js.Object {
  val CATEGORY: String = js.native
  var DOWN: Double = js.native
  var UP: Double = js.native
  def format(bends: js.Array[Bend], state: Anon_Leftshift): Boolean = js.native
}

