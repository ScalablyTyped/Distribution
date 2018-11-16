package typings
package wrenchLib.wrenchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wrench", "LineReader")
@js.native
class LineReader protected () extends js.Object {
  def this(filename: java.lang.String) = this()
  def this(filename: java.lang.String, bufferSize: scala.Double) = this()
  def getBufferAndSetCurrentPosition(position: scala.Double): scala.Double = js.native
  def getNextLine(): java.lang.String = js.native
  def hasNextLine(): scala.Boolean = js.native
}

