package typings.thrift.thriftMod

import typings.thrift.thriftMod.Thrift.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TMessage extends js.Object {
  var fname: String
  var mtype: MessageType
  var rseqid: Double
}

object TMessage {
  @scala.inline
  def apply(fname: String, mtype: MessageType, rseqid: Double): TMessage = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], mtype = mtype.asInstanceOf[js.Any], rseqid = rseqid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TMessage]
  }
}

