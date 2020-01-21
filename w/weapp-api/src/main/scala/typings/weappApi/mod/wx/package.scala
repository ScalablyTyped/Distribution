package typings.weappApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wx {
  type AccelerometerChangeCallback = js.Function1[/* res */ typings.weappApi.mod.wx.AccelerometerData, scala.Unit]
  // 界面
  // 交互
  // tapIndex为用户点击的按钮序号，从上到下的顺序，从0开始
  type ActionSheetSuccessCallback = js.Function1[/* res */ typings.weappApi.AnonTapIndex, scala.Unit]
  type CompassChangeCallback = js.Function1[/* res */ typings.weappApi.mod.wx.CompassData, scala.Unit]
  type DataResponseCallback = js.Function1[/* res */ typings.weappApi.mod.wx.DataResponse, scala.Unit]
  type ErrorCallback = js.Function1[/* error */ js.Any, scala.Unit]
  type EventCallback = js.Function1[/* event */ js.Any, scala.Unit]
  type GetBackgroundAudioPlayerStateSuccessCallback = js.Function1[/* state */ typings.weappApi.mod.wx.BackgroundAudioPlayerState, scala.Unit]
  // import startPullDownRefresh = swan.startPullDownRefresh;
  type NoneParamCallback = js.Function0[scala.Unit]
  type OneParamCallback = js.Function1[/* data */ js.Any, scala.Unit]
  type PaymentSignType = typings.weappApi.weappApiStrings.MD5
  //  网络
  //  发起请求
  type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ResponseCallback = js.Function1[/* res */ js.Any, scala.Unit]
  type StorageInfoCallback = js.Function1[/* res */ typings.weappApi.mod.wx.StorageInfoOptions, scala.Unit]
  type TempFileResponseCallback = js.Function1[/* res */ typings.weappApi.mod.wx.TempFileResponse, scala.Unit]
  type onLaunchCallback = js.Function1[/* options */ typings.weappApi.mod.wx.onLaunchOptions, scala.Unit]
  type onShowOptions = typings.weappApi.mod.wx.onLaunchOptions
}
