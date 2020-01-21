package typings.vimeoPlayer.mod

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
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VimeoTextTrack]
  }
}

