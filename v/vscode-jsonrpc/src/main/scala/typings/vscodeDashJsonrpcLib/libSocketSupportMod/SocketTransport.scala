package typings
package vscodeDashJsonrpcLib.libSocketSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SocketTransport extends js.Object {
  def onConnected(): vscodeDashJsonrpcLib.Thenable[
    js.Tuple2[
      vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
      vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
    ]
  ]
}

