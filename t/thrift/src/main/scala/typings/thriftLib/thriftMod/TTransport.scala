package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TTransport extends js.Object {
  def close(): scala.Boolean = js.native
  def commitPosition(): scala.Unit = js.native
  def ensureAvailable(len: scala.Double): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def isOpen(): scala.Boolean = js.native
  def open(): scala.Boolean = js.native
  def read(len: scala.Double): nodeLib.Buffer = js.native
  def readByte(): scala.Double = js.native
  def readDouble(): scala.Double = js.native
  def readI16(): scala.Double = js.native
  def readI32(): scala.Double = js.native
  def readString(): java.lang.String = js.native
  def rollbackPosition(): scala.Unit = js.native
  def setCurrSeqId(seqId: scala.Double): scala.Unit = js.native
  def write(buf: java.lang.String): scala.Unit = js.native
  def write(buf: nodeLib.Buffer): scala.Unit = js.native
}

