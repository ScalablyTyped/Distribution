package typings
package torrentDashStreamLib.TorrentStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentFile extends js.Object {
  var length: scala.Double = js.native
  var name: java.lang.String = js.native
  var path: java.lang.String = js.native
  def createReadStream(): js.Any = js.native
  def createReadStream(options: ReadStreamOptions): js.Any = js.native
  def deselect(): scala.Unit = js.native
  def select(): scala.Unit = js.native
}

