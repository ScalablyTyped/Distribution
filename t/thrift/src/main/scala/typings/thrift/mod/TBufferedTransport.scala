package typings.thrift.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "TBufferedTransport")
@js.native
class TBufferedTransport ()
  extends StObject
     with TTransport {
  def this(buffer: Buffer) = this()
  def this(buffer: Unit, callback: TTransportCallback) = this()
  def this(buffer: Buffer, callback: TTransportCallback) = this()
}
/* static members */
object TBufferedTransport {
  
  @JSImport("thrift", "TBufferedTransport")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def receiver(callback: js.Function2[/* trans */ this.type, /* seqid */ Double, Unit], seqid: Double): js.Function1[/* data */ Buffer, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("receiver")(callback.asInstanceOf[js.Any], seqid.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* data */ Buffer, Unit]]
}
