package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TMessage extends js.Object {
  var fname: java.lang.String
  var mtype: thriftLib.thriftMod.ThriftNs.MessageType
  var rseqid: scala.Double
}

object TMessage {
  @scala.inline
  def apply(fname: java.lang.String, mtype: thriftLib.thriftMod.ThriftNs.MessageType, rseqid: scala.Double): TMessage = {
    val __obj = js.Dynamic.literal(fname = fname, mtype = mtype, rseqid = rseqid)
  
    __obj.asInstanceOf[TMessage]
  }
}

