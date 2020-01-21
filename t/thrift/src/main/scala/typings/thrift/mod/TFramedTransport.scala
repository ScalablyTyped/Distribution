package typings.thrift.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "TFramedTransport")
@js.native
class TFramedTransport () extends TTransport {
  def this(buffer: Buffer) = this()
  def this(buffer: Buffer, callback: TTransportCallback) = this()
}

/* static members */
@JSImport("thrift", "TFramedTransport")
@js.native
object TFramedTransport extends js.Object {
  def receiver(callback: js.Function2[/* trans */ this.type, /* seqid */ Double, Unit], seqid: Double): js.Function1[/* data */ Buffer, Unit] = js.native
}

