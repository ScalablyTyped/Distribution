package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wxNs {
  type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, scala.Unit]
  type AccelerometerOptions = BaseOptions[js.Any, js.Any]
  type ArrayPropsDefinition[T] = js.Array[java.lang.String]
  type AuthModes = weixinDashAppLib.weixinDashAppLibStrings.fingerPrint | weixinDashAppLib.weixinDashAppLibStrings.facial | weixinDashAppLib.weixinDashAppLibStrings.speech
  type BuiltInEvent[T /* <: EventType */, Detail] = BaseEvent[T, Detail]
  type CameraDevice = weixinDashAppLib.weixinDashAppLibStrings.front | weixinDashAppLib.weixinDashAppLibStrings.back
  type CheckSessionOption = BaseOptions[js.Any, js.Any]
  // CombinedInstance models the `this`, i.e. instance type for (user defined) component
  type CombinedInstance[Instance /* <: Component[Data, Props] */, Data, Methods, Props] = Methods with Instance
  type CompassChangeCallback = js.Function1[/* res */ CompassData, scala.Unit]
  type CompassOptions = BaseOptions[js.Any, js.Any]
  type CustomEvent[T /* <: java.lang.String */, Detail] = BaseEvent[T, Detail]
  // #endregion
  // #region Compontent组件
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultProps = js.Object | (stdLib.Record[java.lang.String, js.Any])
  type EncodeBitRate = weixinDashAppLib.weixinDashAppLibNumbers.`8000` | weixinDashAppLib.weixinDashAppLibNumbers.`11025` | weixinDashAppLib.weixinDashAppLibNumbers.`12000` | weixinDashAppLib.weixinDashAppLibNumbers.`16000` | weixinDashAppLib.weixinDashAppLibNumbers.`22050` | weixinDashAppLib.weixinDashAppLibNumbers.`24000` | weixinDashAppLib.weixinDashAppLibNumbers.`32000` | weixinDashAppLib.weixinDashAppLibNumbers.`44100` | weixinDashAppLib.weixinDashAppLibNumbers.`48000`
  type EventType = weixinDashAppLib.weixinDashAppLibStrings.input | weixinDashAppLib.weixinDashAppLibStrings.form | weixinDashAppLib.weixinDashAppLibStrings.submit | weixinDashAppLib.weixinDashAppLibStrings.scroll | TouchEventType | TransitionEventType | weixinDashAppLib.weixinDashAppLibStrings.tap | weixinDashAppLib.weixinDashAppLibStrings.longpress
  type FormEvent = BuiltInEvent[weixinDashAppLib.weixinDashAppLibStrings.form, weixinDashAppLib.Anon_Name]
  // #endregion
  // #region 媒体API列表
  // 媒体-----图片
  type ImageSizeType = weixinDashAppLib.weixinDashAppLibStrings.original | weixinDashAppLib.weixinDashAppLibStrings.compressed
  type ImageSourceType = weixinDashAppLib.weixinDashAppLibStrings.album | weixinDashAppLib.weixinDashAppLibStrings.camera
  /**
  	 * 指定focus时的光标位置
  	 * @version 1.5.0
  	 */
  type InputEvent = BuiltInEvent[weixinDashAppLib.weixinDashAppLibStrings.input, weixinDashAppLib.Anon_Cursor]
  type LineCapType = weixinDashAppLib.weixinDashAppLibStrings.butt | weixinDashAppLib.weixinDashAppLibStrings.round | weixinDashAppLib.weixinDashAppLibStrings.square
  type LineJoinType = weixinDashAppLib.weixinDashAppLibStrings.bevel | weixinDashAppLib.weixinDashAppLibStrings.round | weixinDashAppLib.weixinDashAppLibStrings.miter
  // 开放接口-----微信支付
  type PaymentSignType = weixinDashAppLib.weixinDashAppLibStrings.MD5 | weixinDashAppLib.weixinDashAppLibStrings.`HMAC-SHA256`
  type Prop[T] = js.Function0[T] | weixinDashAppLib.Anon_Args[T]
  type PropValidator[T] = PropOptions[T] | Prop[T] | js.Array[Prop[T]]
  /**
  	 * There are two valid ways to define the type of data / properties:
  	 *
  	 * 1. { name: valueType }
  	 * 2. { name: { type: valueType, value?: value } }
  	 *
  	 * and this conditional type will extract that out so the call-site will typecheck.
  	 *
  	 * Note this is different from PropOptions as it is the definitions you passed to Component function
  	 * whereas this type is for call-site.
  	 */
  type PropValueType[Def] = js.Any
  type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = weixinDashAppLib.weixinDashAppLibStrings.RecordPropsDefinition with T
  type RemoveSavedFileOptions = GetSavedFileInfoOptions
  // #endregion
  // #region App里的onLaunch、onShow回调参数
  type SceneValues = /* import warning: LimitUnionLength.enterTypeRef Was union type with length 70 */ js.Any
  // scope 列表
  type Scope = weixinDashAppLib.weixinDashAppLibStrings.scopeDOTuserInfo | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTuserLocation | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTaddress | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTinvoiceTitle | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTinvoice | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTwerun | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTrecord | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTwritePhotosAlbum | weixinDashAppLib.weixinDashAppLibStrings.scopeDOTcamera
  type ScrollEvent = BuiltInEvent[weixinDashAppLib.weixinDashAppLibStrings.scroll, js.Object]
  type TapEvent = TouchEvent[weixinDashAppLib.weixinDashAppLibStrings.tap]
  type ThisTypedComponentOptionsWithRecordProps[V /* <: Component[Data, Props] */, Data, Methods, Props] = js.Object with (ComponentOptions[V, Data, Methods, Props]) with (stdLib.ThisType[CombinedInstance[V, Data, Methods, stdLib.Readonly[Props]]])
  // 界面-----动画
  type TimingFunction = weixinDashAppLib.weixinDashAppLibStrings.linear | weixinDashAppLib.weixinDashAppLibStrings.ease | weixinDashAppLib.weixinDashAppLibStrings.`ease-in` | weixinDashAppLib.weixinDashAppLibStrings.`ease-in-out` | weixinDashAppLib.weixinDashAppLibStrings.`ease-out` | weixinDashAppLib.weixinDashAppLibStrings.`step-start` | weixinDashAppLib.weixinDashAppLibStrings.`step-end`
  type TouchCancelEvent = TouchEvent[weixinDashAppLib.weixinDashAppLibStrings.touchcancel]
  type TouchEndEvent = TouchEvent[weixinDashAppLib.weixinDashAppLibStrings.touchend]
  type TouchEventType = weixinDashAppLib.weixinDashAppLibStrings.tap | weixinDashAppLib.weixinDashAppLibStrings.touchstart | weixinDashAppLib.weixinDashAppLibStrings.touchmove | weixinDashAppLib.weixinDashAppLibStrings.touchcancel | weixinDashAppLib.weixinDashAppLibStrings.touchend | weixinDashAppLib.weixinDashAppLibStrings.touchforcechange
  type TouchForceChangeEvent = TouchEvent[weixinDashAppLib.weixinDashAppLibStrings.touchforcechange]
  type TouchMoveEvent = TouchEvent[weixinDashAppLib.weixinDashAppLibStrings.touchmove]
  type TouchStartEvent = TouchEvent[weixinDashAppLib.weixinDashAppLibStrings.touchstart]
  type TransitionEventType = weixinDashAppLib.weixinDashAppLibStrings.transitionend | weixinDashAppLib.weixinDashAppLibStrings.animationstart | weixinDashAppLib.weixinDashAppLibStrings.animationiteration | weixinDashAppLib.weixinDashAppLibStrings.animationend
  type VideoSourceType = weixinDashAppLib.weixinDashAppLibStrings.album | weixinDashAppLib.weixinDashAppLibStrings.camera
  // 设备-----网络状态
  type networkType = weixinDashAppLib.weixinDashAppLibStrings.`2g` | weixinDashAppLib.weixinDashAppLibStrings.`3g` | weixinDashAppLib.weixinDashAppLibStrings.`4g` | weixinDashAppLib.weixinDashAppLibStrings.wifi | weixinDashAppLib.weixinDashAppLibStrings.unknown | weixinDashAppLib.weixinDashAppLibStrings.none
  // 设备-----扫码
  type scanType = weixinDashAppLib.weixinDashAppLibStrings.qrCode | weixinDashAppLib.weixinDashAppLibStrings.barCode
}
