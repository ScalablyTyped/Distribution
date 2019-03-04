package typings
package vscodeDashJsonrpcLib.libPipeSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeTransport extends js.Object {
  def onConnected(): vscodeDashJsonrpcLib.Thenable[
    js.Tuple2[
      vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
      vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
    ]
  ]
}

object PipeTransport {
  @scala.inline
  def apply(
    onConnected: js.Function0[
      vscodeDashJsonrpcLib.Thenable[
        js.Tuple2[
          vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
          vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
        ]
      ]
    ]
  ): PipeTransport = {
    val __obj = js.Dynamic.literal(onConnected = onConnected)
  
    __obj.asInstanceOf[PipeTransport]
  }
}

