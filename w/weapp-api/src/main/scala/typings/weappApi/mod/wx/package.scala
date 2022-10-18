package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StringDictionary
import typings.weappApi.anon.TapIndex
import typings.weappApi.weappApiStrings.MD5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, Unit]

// 界面
// 交互
// tapIndex为用户点击的按钮序号，从上到下的顺序，从0开始
type ActionSheetSuccessCallback = js.Function1[/* res */ TapIndex, Unit]

type CompassChangeCallback = js.Function1[/* res */ CompassData, Unit]

type DataResponseCallback = js.Function1[/* res */ DataResponse, Unit]

type ErrorCallback = js.Function1[/* error */ Any, Unit]

type EventCallback = js.Function1[/* event */ Any, Unit]

type GetBackgroundAudioPlayerStateSuccessCallback = js.Function1[/* state */ BackgroundAudioPlayerState, Unit]

// import startPullDownRefresh = swan.startPullDownRefresh;
type NoneParamCallback = js.Function0[Unit]

type OneParamCallback = js.Function1[/* data */ Any, Unit]

type PaymentSignType = MD5

//  网络
//  发起请求
type RequestHeader = StringDictionary[String]

type ResponseCallback = js.Function1[/* res */ Any, Unit]

type StorageInfoCallback = js.Function1[/* res */ StorageInfoOptions, Unit]

type TempFileResponseCallback = js.Function1[/* res */ TempFileResponse, Unit]

type onLaunchCallback = js.Function1[/* options */ onLaunchOptions, Unit]

type onShowOptions = onLaunchOptions
