package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.AudioTrack.Kind
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
  var enabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[Kind] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
}

object AudioTrackOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: Kind = null,
    label: String = null,
    language: String = null
  ): AudioTrackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrackOptions]
  }
}

