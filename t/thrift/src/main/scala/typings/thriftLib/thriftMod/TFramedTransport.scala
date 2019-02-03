package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "TFramedTransport")
@js.native
class TFramedTransport () extends TTransport {
  def this(buffer: nodeLib.Buffer) = this()
  def this(buffer: nodeLib.Buffer, callback: TTransportCallback) = this()
}

/* static members */
@JSImport("thrift", "TFramedTransport")
@js.native
object TFramedTransport extends js.Object {
  def receiver(
    callback: js.Function2[/* trans */ this.type, /* seqid */ scala.Double, scala.Unit],
    seqid: scala.Double
  ): js.Function1[/* data */ nodeLib.Buffer, scala.Unit] = js.native
}

