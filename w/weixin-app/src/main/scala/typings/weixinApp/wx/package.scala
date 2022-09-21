package typings.weixinApp.wx

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
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

type ArrayType[T /* <: js.Array[Any] */] = Any

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
type PropValueType[Def] = Any

type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]

type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: weixin-app.wx.PropValidator<T[K]>}
  */ typings.weixinApp.weixinAppStrings.RecordPropsDefinition & TopLevel[T]

type RemoveSavedFileOptions = GetSavedFileInfoOptions

// #endregion
// #region 网络API列表
// 发起请求
type RequestHeader = StringDictionary[String]

type RmdirOptions = MkdirOptions

// #endregion
// #region App里的onLaunch、onShow回调参数
/* Rewritten from type alias, can be one of: 
  - typings.weixinApp.weixinAppNumbers.`1001`
  - typings.weixinApp.weixinAppNumbers.`1005`
  - typings.weixinApp.weixinAppNumbers.`1006`
  - typings.weixinApp.weixinAppNumbers.`1007`
  - typings.weixinApp.weixinAppNumbers.`1008`
  - typings.weixinApp.weixinAppNumbers.`1011`
  - typings.weixinApp.weixinAppNumbers.`1012`
  - typings.weixinApp.weixinAppNumbers.`1013`
  - typings.weixinApp.weixinAppNumbers.`1014`
  - typings.weixinApp.weixinAppNumbers.`1017`
  - typings.weixinApp.weixinAppNumbers.`1019`
  - typings.weixinApp.weixinAppNumbers.`1020`
  - typings.weixinApp.weixinAppNumbers.`1022`
  - typings.weixinApp.weixinAppNumbers.`1023`
  - typings.weixinApp.weixinAppNumbers.`1024`
  - typings.weixinApp.weixinAppNumbers.`1025`
  - typings.weixinApp.weixinAppNumbers.`1026`
  - typings.weixinApp.weixinAppNumbers.`1027`
  - typings.weixinApp.weixinAppNumbers.`1028`
  - typings.weixinApp.weixinAppNumbers.`1029`
  - typings.weixinApp.weixinAppNumbers.`1030`
  - typings.weixinApp.weixinAppNumbers.`1031`
  - typings.weixinApp.weixinAppNumbers.`1032`
  - typings.weixinApp.weixinAppNumbers.`1034`
  - typings.weixinApp.weixinAppNumbers.`1035`
  - typings.weixinApp.weixinAppNumbers.`1036`
  - typings.weixinApp.weixinAppNumbers.`1037`
  - typings.weixinApp.weixinAppNumbers.`1038`
  - typings.weixinApp.weixinAppNumbers.`1039`
  - typings.weixinApp.weixinAppNumbers.`1042`
  - typings.weixinApp.weixinAppNumbers.`1043`
  - typings.weixinApp.weixinAppNumbers.`1044`
  - typings.weixinApp.weixinAppNumbers.`1045`
  - typings.weixinApp.weixinAppNumbers.`1046`
  - typings.weixinApp.weixinAppNumbers.`1047`
  - typings.weixinApp.weixinAppNumbers.`1048`
  - typings.weixinApp.weixinAppNumbers.`1049`
  - typings.weixinApp.weixinAppNumbers.`1052`
  - typings.weixinApp.weixinAppNumbers.`1053`
  - typings.weixinApp.weixinAppNumbers.`1054`
  - typings.weixinApp.weixinAppNumbers.`1056`
  - typings.weixinApp.weixinAppNumbers.`1057`
  - typings.weixinApp.weixinAppNumbers.`1058`
  - typings.weixinApp.weixinAppNumbers.`1059`
  - typings.weixinApp.weixinAppNumbers.`1064`
  - typings.weixinApp.weixinAppNumbers.`1067`
  - typings.weixinApp.weixinAppNumbers.`1068`
  - typings.weixinApp.weixinAppNumbers.`1069`
  - typings.weixinApp.weixinAppNumbers.`1071`
  - typings.weixinApp.weixinAppNumbers.`1072`
  - typings.weixinApp.weixinAppNumbers.`1073`
  - typings.weixinApp.weixinAppNumbers.`1074`
  - typings.weixinApp.weixinAppNumbers.`1077`
  - typings.weixinApp.weixinAppNumbers.`1078`
  - typings.weixinApp.weixinAppNumbers.`1079`
  - typings.weixinApp.weixinAppNumbers.`1081`
  - typings.weixinApp.weixinAppNumbers.`1082`
  - typings.weixinApp.weixinAppNumbers.`1084`
  - typings.weixinApp.weixinAppNumbers.`1089`
  - typings.weixinApp.weixinAppNumbers.`1090`
  - typings.weixinApp.weixinAppNumbers.`1091`
  - typings.weixinApp.weixinAppNumbers.`1092`
  - typings.weixinApp.weixinAppNumbers.`1095`
  - typings.weixinApp.weixinAppNumbers.`1096`
  - typings.weixinApp.weixinAppNumbers.`1097`
  - typings.weixinApp.weixinAppNumbers.`1099`
  - typings.weixinApp.weixinAppNumbers.`1102`
  - typings.weixinApp.weixinAppNumbers.`1103`
  - typings.weixinApp.weixinAppNumbers.`1104`
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

type UnboxBehaviorData[T] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_DATA'] */ js.Any)

type UnboxBehaviorMethods[T] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_METHODS'] */ js.Any)

type UnboxBehaviorProps[T] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_PROPS'] */ js.Any)

type UnboxBehaviorsData[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = UnboxBehaviorData[UnionToIntersection[ArrayType[Behaviors]]]

type UnboxBehaviorsMethods[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = UnboxBehaviorMethods[UnionToIntersection[ArrayType[Behaviors]]]

type UnboxBehaviorsProps[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = UnboxBehaviorProps[UnionToIntersection[ArrayType[Behaviors]]]

type UnionToIntersection[U] = Any

type WriteFileOptions = AppendFileOptions
