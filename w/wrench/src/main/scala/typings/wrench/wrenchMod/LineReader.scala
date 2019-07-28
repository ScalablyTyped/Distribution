package typings.wrench.wrenchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wrench", "LineReader")
@js.native
class LineReader protected () extends js.Object {
  def this(filename: String) = this()
  def this(filename: String, bufferSize: Double) = this()
  def getBufferAndSetCurrentPosition(position: Double): Double = js.native
  def getNextLine(): String = js.native
  def hasNextLine(): Boolean = js.native
}

