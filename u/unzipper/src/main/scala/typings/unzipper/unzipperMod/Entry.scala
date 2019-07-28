package typings.unzipper.unzipperMod

import typings.node.Buffer
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Transform
import typings.unzipper.Anon_CompressedSize
import typings.unzipper.Anon_CompressedSizeDisknum
import typings.unzipper.Anon_Path
import typings.unzipper.Anon_Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends PassThrough {
  var extra: Anon_CompressedSizeDisknum = js.native
  var path: String = js.native
  var props: Anon_Path = js.native
  var `type`: String = js.native
  var vars: Anon_CompressedSize = js.native
  def autodrain(): Transform with Anon_Promise = js.native
  def buffer(): js.Promise[Buffer] = js.native
}

