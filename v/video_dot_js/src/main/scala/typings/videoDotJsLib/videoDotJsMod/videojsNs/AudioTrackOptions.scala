package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Object of option names and values
	 *
	 * @param [options.kind='']
	 *        A valid audio track kind
	 *
	 * @param [options.id='vjs_track_' + Guid.newGUID()]
	 *        A unique id for this AudioTrack.
	 *
	 * @param [options.label='']
	 *        The menu label for this track.
	 *
	 * @param [options.language='']
	 *        A valid two character language code.
	 *
	 * @param [options.enabled]
	 *        If this track is the one that is currently playing. If this track is part of
	 *        an {@link AudioTrackList}, only one {@link AudioTrack} will be enabled.
	 */
trait AudioTrackOptions extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[videoDotJsLib.videoDotJsMod.videojsNs.AudioTrackNs.Kind] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
}

object AudioTrackOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    kind: videoDotJsLib.videoDotJsMod.videojsNs.AudioTrackNs.Kind = null,
    label: java.lang.String = null,
    language: java.lang.String = null
  ): AudioTrackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (label != null) __obj.updateDynamic("label")(label)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[AudioTrackOptions]
  }
}

