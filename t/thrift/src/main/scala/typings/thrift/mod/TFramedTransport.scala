package typings.thrift.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "TFramedTransport")
@js.native
class TFramedTransport () extends TTransport {
  def this(buffer: Buffer) = this()
  def this(buffer: js.UndefOr[scala.Nothing], callback: TTransportCallback) = this()
  def this(buffer: Buffer, callback: TTransportCallback) = this()
}
/* static members */
object TFramedTransport {
  
  @JSImport("thrift", "TFramedTransport.receiver")
  @js.native
  def receiver(callback: js.Function2[/* trans */ this.type, /* seqid */ Double, Unit], seqid: Double): js.Function1[/* data */ Buffer, Unit] = js.native
}
