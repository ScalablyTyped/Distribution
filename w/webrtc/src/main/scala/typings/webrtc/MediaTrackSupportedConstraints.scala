package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackSupportedConstraints extends js.Object {
  var aspectRatio: js.UndefOr[Boolean] = js.undefined
  var deviceId: js.UndefOr[Boolean] = js.undefined
  var echoCancellation: js.UndefOr[Boolean] = js.undefined
  var facingMode: js.UndefOr[Boolean] = js.undefined
  var frameRate: js.UndefOr[Boolean] = js.undefined
  var groupId: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Boolean] = js.undefined
  var latency: js.UndefOr[Boolean] = js.undefined
  var sampleRate: js.UndefOr[Boolean] = js.undefined
  var sampleSize: js.UndefOr[Boolean] = js.undefined
  var volume: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Boolean] = js.undefined
}

object MediaTrackSupportedConstraints {
  @scala.inline
  def apply(
    aspectRatio: js.UndefOr[Boolean] = js.undefined,
    deviceId: js.UndefOr[Boolean] = js.undefined,
    echoCancellation: js.UndefOr[Boolean] = js.undefined,
    facingMode: js.UndefOr[Boolean] = js.undefined,
    frameRate: js.UndefOr[Boolean] = js.undefined,
    groupId: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Boolean] = js.undefined,
    latency: js.UndefOr[Boolean] = js.undefined,
    sampleRate: js.UndefOr[Boolean] = js.undefined,
    sampleSize: js.UndefOr[Boolean] = js.undefined,
    volume: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Boolean] = js.undefined
  ): MediaTrackSupportedConstraints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceId)) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (!js.isUndefined(echoCancellation)) __obj.updateDynamic("echoCancellation")(echoCancellation.asInstanceOf[js.Any])
    if (!js.isUndefined(facingMode)) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(frameRate)) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (!js.isUndefined(groupId)) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(latency)) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleSize)) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackSupportedConstraints]
  }
}

