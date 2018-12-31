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

