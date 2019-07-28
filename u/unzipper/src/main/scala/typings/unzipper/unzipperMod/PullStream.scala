package typings.unzipper.unzipperMod

import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.node.streamMod.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullStream extends Duplex {
  def pull(eof: String, includeEof: Boolean): js.Promise[Buffer] = js.native
  def pull(eof: Double, includeEof: Boolean): js.Promise[Buffer] = js.native
  def stream(eof: String, includeEof: Boolean): PassThrough = js.native
  def stream(eof: Double, includeEof: Boolean): PassThrough = js.native
}

