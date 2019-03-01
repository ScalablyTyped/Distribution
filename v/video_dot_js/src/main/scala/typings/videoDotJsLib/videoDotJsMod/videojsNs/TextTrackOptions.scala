package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackOptions extends TrackOptions {
  var default: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("kind")
  var kind_TextTrackOptions: js.UndefOr[videoDotJsLib.videoDotJsMod.videojsNs.TextTrackNs.Kind] = js.undefined
  var mode: js.UndefOr[videoDotJsLib.videoDotJsMod.videojsNs.TextTrackNs.Mode] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var srclang: js.UndefOr[java.lang.String] = js.undefined
  var tech: js.UndefOr[Tech] = js.undefined
}

object TextTrackOptions {
  @scala.inline
  def apply(
    default: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    kind: videoDotJsLib.videoDotJsMod.videojsNs.TextTrackNs.Kind = null,
    label: java.lang.String = null,
    language: java.lang.String = null,
    mode: videoDotJsLib.videoDotJsMod.videojsNs.TextTrackNs.Mode = null,
    src: java.lang.String = null,
    srclang: java.lang.String = null,
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

