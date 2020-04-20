package typings.webtorrent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentPiece extends js.Object {
  val length: Double
  val missing: Double
}

object TorrentPiece {
  @scala.inline
  def apply(length: Double, missing: Double): TorrentPiece = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[TorrentPiece]
  }
}

