package typings.torrentDashStream.TorrentStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentFile extends js.Object {
  var length: Double = js.native
  var name: String = js.native
  var path: String = js.native
  def createReadStream(): js.Any = js.native
  def createReadStream(options: ReadStreamOptions): js.Any = js.native
  def deselect(): Unit = js.native
  def select(): Unit = js.native
}

