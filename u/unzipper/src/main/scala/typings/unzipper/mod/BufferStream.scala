package typings.unzipper.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unzipper", "BufferStream")
@js.native
object BufferStream extends js.Object {
  def apply(entry: Entry): js.Promise[Buffer] = js.native
}

