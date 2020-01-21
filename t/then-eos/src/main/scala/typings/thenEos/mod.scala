package typings.thenEos

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("then-eos", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(stream: Stream): js.Promise[Unit] = js.native
  type Stream = ReadableStream | WritableStream
}

