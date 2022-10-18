package typings.weixinApp.wx

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.weixinApp.anon.Cursor
import typings.weixinApp.anon.Instantiable
import typings.weixinApp.anon.Value
import typings.weixinApp.weixinAppStrings.form
import typings.weixinApp.weixinAppStrings.input
import typings.weixinApp.weixinAppStrings.scroll
import typings.weixinApp.weixinAppStrings.tap
import typings.weixinApp.weixinAppStrings.touchcancel
import typings.weixinApp.weixinAppStrings.touchend
import typings.weixinApp.weixinAppStrings.touchforcechange
import typings.weixinApp.weixinAppStrings.touchmove
import typings.weixinApp.weixinAppStrings.touchstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, Unit]

type AccelerometerOptions = BaseOptions[Any, Any]

type ArrayPropsDefinition[T] = js.Array[/* keyof T */ String]

type BuiltInEvent[T /* <: EventType */, Detail] = BaseEvent[T, Detail]

type CheckSessionOption = BaseOptions[Any, Any]

// CombinedInstance models the `this`, i.e. instance type for (user defined) component
type CombinedInstance[Instance /* <: Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = Methods & Instance & UnboxBehaviorsMethods[Behaviors]

type CompassChangeCallback = js.Function1[/* res */ CompassData, Unit]

type CompassOptions = BaseOptions[Any, Any]

type CustomEvent[T /* <: String */, Detail] = BaseEvent[T, Detail]

// #endregion
// #region Compontent组件
type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])

type DefaultMethods[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ Any, Any]]

type DefaultProps = js.Object | (Record[String, Any])

type FormEvent = BuiltInEvent[form, Value]

/**
  * 指定focus时的光标位置
  * @version 1.5.0
  */
type InputEvent = BuiltInEvent[input, Cursor]

/**
  * https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/observer.html
  */
type ObserversDefs[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ Any, Any]]

type Prop[T] = js.Function0[T] | Instantiable[T]

type PropValidator[T] = PropOptions[T] | Prop[T] | js.Array[Prop[T]]

type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]

type RemoveSavedFileOptions = GetSavedFileInfoOptions

// #endregion
// #region 网络API列表
// 发起请求
type RequestHeader = StringDictionary[String]

type RmdirOptions = MkdirOptions

// #endregion
// #region App里的onLaunch、onShow回调参数
/* Rewritten from type alias, can be one of: 
  - typings.weixinApp.weixinAppInts.`1001`
  - typings.weixinApp.weixinAppInts.`1005`
  - typings.weixinApp.weixinAppInts.`1006`
  - typings.weixinApp.weixinAppInts.`1007`
  - typings.weixinApp.weixinAppInts.`1008`
  - typings.weixinApp.weixinAppInts.`1011`
  - typings.weixinApp.weixinAppInts.`1012`
  - typings.weixinApp.weixinAppInts.`1013`
  - typings.weixinApp.weixinAppInts.`1014`
  - typings.weixinApp.weixinAppInts.`1017`
  - typings.weixinApp.weixinAppInts.`1019`
  - typings.weixinApp.weixinAppInts.`1020`
  - typings.weixinApp.weixinAppInts.`1022`
  - typings.weixinApp.weixinAppInts.`1023`
  - typings.weixinApp.weixinAppInts.`1024`
  - typings.weixinApp.weixinAppInts.`1025`
  - typings.weixinApp.weixinAppInts.`1026`
  - typings.weixinApp.weixinAppInts.`1027`
  - typings.weixinApp.weixinAppInts.`1028`
  - typings.weixinApp.weixinAppInts.`1029`
  - typings.weixinApp.weixinAppInts.`1030`
  - typings.weixinApp.weixinAppInts.`1031`
  - typings.weixinApp.weixinAppInts.`1032`
  - typings.weixinApp.weixinAppInts.`1034`
  - typings.weixinApp.weixinAppInts.`1035`
  - typings.weixinApp.weixinAppInts.`1036`
  - typings.weixinApp.weixinAppInts.`1037`
  - typings.weixinApp.weixinAppInts.`1038`
  - typings.weixinApp.weixinAppInts.`1039`
  - typings.weixinApp.weixinAppInts.`1042`
  - typings.weixinApp.weixinAppInts.`1043`
  - typings.weixinApp.weixinAppInts.`1044`
  - typings.weixinApp.weixinAppInts.`1045`
  - typings.weixinApp.weixinAppInts.`1046`
  - typings.weixinApp.weixinAppInts.`1047`
  - typings.weixinApp.weixinAppInts.`1048`
  - typings.weixinApp.weixinAppInts.`1049`
  - typings.weixinApp.weixinAppInts.`1052`
  - typings.weixinApp.weixinAppInts.`1053`
  - typings.weixinApp.weixinAppInts.`1054`
  - typings.weixinApp.weixinAppInts.`1056`
  - typings.weixinApp.weixinAppInts.`1057`
  - typings.weixinApp.weixinAppInts.`1058`
  - typings.weixinApp.weixinAppInts.`1059`
  - typings.weixinApp.weixinAppInts.`1064`
  - typings.weixinApp.weixinAppInts.`1067`
  - typings.weixinApp.weixinAppInts.`1068`
  - typings.weixinApp.weixinAppInts.`1069`
  - typings.weixinApp.weixinAppInts.`1071`
  - typings.weixinApp.weixinAppInts.`1072`
  - typings.weixinApp.weixinAppInts.`1073`
  - typings.weixinApp.weixinAppInts.`1074`
  - typings.weixinApp.weixinAppInts.`1077`
  - typings.weixinApp.weixinAppInts.`1078`
  - typings.weixinApp.weixinAppInts.`1079`
  - typings.weixinApp.weixinAppInts.`1081`
  - typings.weixinApp.weixinAppInts.`1082`
  - typings.weixinApp.weixinAppInts.`1084`
  - typings.weixinApp.weixinAppInts.`1089`
  - typings.weixinApp.weixinAppInts.`1090`
  - typings.weixinApp.weixinAppInts.`1091`
  - typings.weixinApp.weixinAppInts.`1092`
  - typings.weixinApp.weixinAppInts.`1095`
  - typings.weixinApp.weixinAppInts.`1096`
  - typings.weixinApp.weixinAppInts.`1097`
  - typings.weixinApp.weixinAppInts.`1099`
  - typings.weixinApp.weixinAppInts.`1102`
  - typings.weixinApp.weixinAppInts.`1103`
  - typings.weixinApp.weixinAppInts.`1104`
  - scala.Double
*/
type SceneValues = _SceneValues | Double

type ScrollEvent = BuiltInEvent[scroll, js.Object]

type TapEvent = TouchEvent[tap]

type TouchCancelEvent = TouchEvent[touchcancel]

type TouchEndEvent = TouchEvent[touchend]

type TouchForceChangeEvent = TouchEvent[touchforcechange]

type TouchMoveEvent = TouchEvent[touchmove]

type TouchStartEvent = TouchEvent[touchstart]

type UnboxBehaviorsData[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = UnboxBehaviorData[UnionToIntersection[ArrayType[Behaviors]]]

type UnboxBehaviorsMethods[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = UnboxBehaviorMethods[UnionToIntersection[ArrayType[Behaviors]]]

type UnboxBehaviorsProps[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = UnboxBehaviorProps[UnionToIntersection[ArrayType[Behaviors]]]

type WriteFileOptions = AppendFileOptions
