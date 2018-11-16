package typings
package weappDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wxNs {
  type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, scala.Unit]
  type CameraDevice = weappDashApiLib.weappDashApiLibStrings.front | weappDashApiLib.weappDashApiLibStrings.back
  type CompassChangeCallback = js.Function1[/* res */ CompassData, scala.Unit]
  type DataResponseCallback = js.Function1[/* res */ DataResponse, scala.Unit]
  type ErrorCallback = js.Function1[/* error */ js.Any, scala.Unit]
  type EventCallback = js.Function1[/* event */ js.Any, scala.Unit]
  type GetBackgroundAudioPlayerStateSuccessCallback = js.Function1[/* state */ BackgroundAudioPlayerState, scala.Unit]
  type ImageSizeType = weappDashApiLib.weappDashApiLibStrings.original | weappDashApiLib.weappDashApiLibStrings.compressed
  type ImageSourceType = weappDashApiLib.weappDashApiLibStrings.album | weappDashApiLib.weappDashApiLibStrings.camera
  type LineCapType = weappDashApiLib.weappDashApiLibStrings.butt | weappDashApiLib.weappDashApiLibStrings.round | weappDashApiLib.weappDashApiLibStrings.square
  type LineJoinType = weappDashApiLib.weappDashApiLibStrings.bevel | weappDashApiLib.weappDashApiLibStrings.round | weappDashApiLib.weappDashApiLibStrings.miter
  type NoneParamCallback = js.Function0[scala.Unit]
  type OneParamCallback = js.Function1[/* data */ js.Any, scala.Unit]
  type PaymentSignType = weappDashApiLib.weappDashApiLibStrings.MD5
  type ResponseCallback = js.Function1[/* res */ js.Any, scala.Unit]
  type TempFileResponseCallback = js.Function1[/* res */ TempFileResponse, scala.Unit]
  type TimingFunction = weappDashApiLib.weappDashApiLibStrings.linear | weappDashApiLib.weappDashApiLibStrings.ease | weappDashApiLib.weappDashApiLibStrings.`ease-in` | weappDashApiLib.weappDashApiLibStrings.`ease-in-out` | weappDashApiLib.weappDashApiLibStrings.`ease-out` | weappDashApiLib.weappDashApiLibStrings.`step-start` | weappDashApiLib.weappDashApiLibStrings.`step-end`
  type VideoSourceType = weappDashApiLib.weappDashApiLibStrings.album | weappDashApiLib.weappDashApiLibStrings.camera
}
