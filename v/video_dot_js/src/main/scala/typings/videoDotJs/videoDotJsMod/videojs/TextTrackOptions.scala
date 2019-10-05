package typings.videoDotJs.videoDotJsMod.videojs

import typings.videoDotJs.videoDotJsMod.videojs.TextTrack.Kind
import typings.videoDotJs.videoDotJsMod.videojs.TextTrack.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackOptions extends TrackOptions {
  var default: js.UndefOr[Boolean] = js.undefined
  @JSName("kind")
  var kind_TextTrackOptions: js.UndefOr[Kind] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srclang: js.UndefOr[String] = js.undefined
  var tech: js.UndefOr[Tech] = js.undefined
}

object TextTrackOptions {
  @scala.inline
  def apply(
    default: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: Kind = null,
    label: String = null,
    language: String = null,
    mode: Mode = null,
    src: String = null,
    srclang: String = null,
    tech: Tech = null
  ): TextTrackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (label != null) __obj.updateDynamic("label")(label)
    if (language != null) __obj.updateDynamic("language")(language)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (src != null) __obj.updateDynamic("src")(src)
    if (srclang != null) __obj.updateDynamic("srclang")(srclang)
    if (tech != null) __obj.updateDynamic("tech")(tech)
    __obj.asInstanceOf[TextTrackOptions]
  }
}

