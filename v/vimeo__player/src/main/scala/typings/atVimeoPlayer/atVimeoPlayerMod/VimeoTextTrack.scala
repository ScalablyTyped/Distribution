package typings.atVimeoPlayer.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VimeoTextTrack extends js.Object {
  var kind: String
  var label: String
  var language: String
  var mode: js.UndefOr[String] = js.undefined
}

object VimeoTextTrack {
  @scala.inline
  def apply(kind: String, label: String, language: String, mode: String = null): VimeoTextTrack = {
    val __obj = js.Dynamic.literal(kind = kind, label = label, language = language)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[VimeoTextTrack]
  }
}

