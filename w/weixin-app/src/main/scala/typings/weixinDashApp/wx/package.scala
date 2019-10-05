package typings.weixinDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wx {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Record
  import typings.std.ThisType
  import typings.weixinDashApp.Anon_Args
  import typings.weixinDashApp.Anon_Cursor
  import typings.weixinDashApp.Anon_Name
  import typings.weixinDashApp.weixinDashAppStrings.form
  import typings.weixinDashApp.weixinDashAppStrings.input
  import typings.weixinDashApp.weixinDashAppStrings.scroll
  import typings.weixinDashApp.weixinDashAppStrings.tap
  import typings.weixinDashApp.weixinDashAppStrings.touchcancel
  import typings.weixinDashApp.weixinDashAppStrings.touchend
  import typings.weixinDashApp.weixinDashAppStrings.touchforcechange
  import typings.weixinDashApp.weixinDashAppStrings.touchmove
  import typings.weixinDashApp.weixinDashAppStrings.touchstart

  type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, Unit]
  type AccelerometerOptions = BaseOptions[js.Any, js.Any]
  type ArrayPropsDefinition[T] = js.Array[String]
  type ArrayType[T /* <: js.Array[_] */] = js.Any
  type BuiltInEvent[T /* <: EventType */, Detail] = BaseEvent[T, Detail]
  type CheckSessionOption = BaseOptions[js.Any, js.Any]
  // CombinedInstance models the `this`, i.e. instance type for (user defined) component
  type CombinedInstance[Instance /* <: Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = Methods with Instance with UnboxBehaviorsMethods[Behaviors]
  type CompassChangeCallback = js.Function1[/* res */ CompassData, Unit]
  type CompassOptions = BaseOptions[js.Any, js.Any]
  type CustomEvent[T /* <: String */, Detail] = BaseEvent[T, Detail]
  // #endregion
  // #region Compontent组件
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultMethods[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = js.Object | (Record[String, js.Any])
  type FormEvent = BuiltInEvent[form, Anon_Name]
  /**
  	 * 指定focus时的光标位置
  	 * @version 1.5.0
  	 */
  type InputEvent = BuiltInEvent[input, Anon_Cursor]
  /**
  	 * https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/observer.html
  	 */
  type ObserversDefs[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type Prop[T] = js.Function0[T] | Anon_Args[T]
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
  type RecordPropsDefinition[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: weixin-app.wx.PropValidator<T[K]>}
    */ typings.weixinDashApp.weixinDashAppStrings.RecordPropsDefinition with T
  type RemoveSavedFileOptions = GetSavedFileInfoOptions
  // #endregion
  // #region 网络API列表
  // 发起请求
  type RequestHeader = StringDictionary[String]
  type RmdirOptions = MkdirOptions
  // #endregion
  // #region App里的onLaunch、onShow回调参数
  /* Rewritten from type alias, can be one of: 
    - typings.weixinDashApp.weixinDashAppNumbers.`1001`
    - typings.weixinDashApp.weixinDashAppNumbers.`1005`
    - typings.weixinDashApp.weixinDashAppNumbers.`1006`
    - typings.weixinDashApp.weixinDashAppNumbers.`1007`
    - typings.weixinDashApp.weixinDashAppNumbers.`1008`
    - typings.weixinDashApp.weixinDashAppNumbers.`1011`
    - typings.weixinDashApp.weixinDashAppNumbers.`1012`
    - typings.weixinDashApp.weixinDashAppNumbers.`1013`
    - typings.weixinDashApp.weixinDashAppNumbers.`1014`
    - typings.weixinDashApp.weixinDashAppNumbers.`1017`
    - typings.weixinDashApp.weixinDashAppNumbers.`1019`
    - typings.weixinDashApp.weixinDashAppNumbers.`1020`
    - typings.weixinDashApp.weixinDashAppNumbers.`1022`
    - typings.weixinDashApp.weixinDashAppNumbers.`1023`
    - typings.weixinDashApp.weixinDashAppNumbers.`1024`
    - typings.weixinDashApp.weixinDashAppNumbers.`1025`
    - typings.weixinDashApp.weixinDashAppNumbers.`1026`
    - typings.weixinDashApp.weixinDashAppNumbers.`1027`
    - typings.weixinDashApp.weixinDashAppNumbers.`1028`
    - typings.weixinDashApp.weixinDashAppNumbers.`1029`
    - typings.weixinDashApp.weixinDashAppNumbers.`1030`
    - typings.weixinDashApp.weixinDashAppNumbers.`1031`
    - typings.weixinDashApp.weixinDashAppNumbers.`1032`
    - typings.weixinDashApp.weixinDashAppNumbers.`1034`
    - typings.weixinDashApp.weixinDashAppNumbers.`1035`
    - typings.weixinDashApp.weixinDashAppNumbers.`1036`
    - typings.weixinDashApp.weixinDashAppNumbers.`1037`
    - typings.weixinDashApp.weixinDashAppNumbers.`1038`
    - typings.weixinDashApp.weixinDashAppNumbers.`1039`
    - typings.weixinDashApp.weixinDashAppNumbers.`1042`
    - typings.weixinDashApp.weixinDashAppNumbers.`1043`
    - typings.weixinDashApp.weixinDashAppNumbers.`1044`
    - typings.weixinDashApp.weixinDashAppNumbers.`1045`
    - typings.weixinDashApp.weixinDashAppNumbers.`1046`
    - typings.weixinDashApp.weixinDashAppNumbers.`1047`
    - typings.weixinDashApp.weixinDashAppNumbers.`1048`
    - typings.weixinDashApp.weixinDashAppNumbers.`1049`
    - typings.weixinDashApp.weixinDashAppNumbers.`1052`
    - typings.weixinDashApp.weixinDashAppNumbers.`1053`
    - typings.weixinDashApp.weixinDashAppNumbers.`1054`
    - typings.weixinDashApp.weixinDashAppNumbers.`1056`
    - typings.weixinDashApp.weixinDashAppNumbers.`1057`
    - typings.weixinDashApp.weixinDashAppNumbers.`1058`
    - typings.weixinDashApp.weixinDashAppNumbers.`1059`
    - typings.weixinDashApp.weixinDashAppNumbers.`1064`
    - typings.weixinDashApp.weixinDashAppNumbers.`1067`
    - typings.weixinDashApp.weixinDashAppNumbers.`1068`
    - typings.weixinDashApp.weixinDashAppNumbers.`1069`
    - typings.weixinDashApp.weixinDashAppNumbers.`1071`
    - typings.weixinDashApp.weixinDashAppNumbers.`1072`
    - typings.weixinDashApp.weixinDashAppNumbers.`1073`
    - typings.weixinDashApp.weixinDashAppNumbers.`1074`
    - typings.weixinDashApp.weixinDashAppNumbers.`1077`
    - typings.weixinDashApp.weixinDashAppNumbers.`1078`
    - typings.weixinDashApp.weixinDashAppNumbers.`1079`
    - typings.weixinDashApp.weixinDashAppNumbers.`1081`
    - typings.weixinDashApp.weixinDashAppNumbers.`1082`
    - typings.weixinDashApp.weixinDashAppNumbers.`1084`
    - typings.weixinDashApp.weixinDashAppNumbers.`1089`
    - typings.weixinDashApp.weixinDashAppNumbers.`1090`
    - typings.weixinDashApp.weixinDashAppNumbers.`1091`
    - typings.weixinDashApp.weixinDashAppNumbers.`1092`
    - typings.weixinDashApp.weixinDashAppNumbers.`1095`
    - typings.weixinDashApp.weixinDashAppNumbers.`1096`
    - typings.weixinDashApp.weixinDashAppNumbers.`1097`
    - typings.weixinDashApp.weixinDashAppNumbers.`1099`
    - typings.weixinDashApp.weixinDashAppNumbers.`1102`
    - typings.weixinDashApp.weixinDashAppNumbers.`1103`
    - typings.weixinDashApp.weixinDashAppNumbers.`1104`
    - scala.Double
  */
  type SceneValues = _SceneValues | Double
  type ScrollEvent = BuiltInEvent[scroll, js.Object]
  type TapEvent = TouchEvent[tap]
  type ThisTypedComponentOptionsWithRecordProps[V /* <: Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = js.Object with (ComponentOptions[V, Data, Methods, Props, Behaviors]) with (ThisType[CombinedInstance[V, Data, Methods, Props, Behaviors]])
  type TouchCancelEvent = TouchEvent[touchcancel]
  type TouchEndEvent = TouchEvent[touchend]
  type TouchForceChangeEvent = TouchEvent[touchforcechange]
  type TouchMoveEvent = TouchEvent[touchmove]
  type TouchStartEvent = TouchEvent[touchstart]
  type UnboxBehaviorData[T] = js.Object | (/* import warning: ImportType.apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_DATA'] */ js.Any)
  type UnboxBehaviorMethods[T] = js.Object | (/* import warning: ImportType.apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_METHODS'] */ js.Any)
  type UnboxBehaviorProps[T] = js.Object | (/* import warning: ImportType.apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_PROPS'] */ js.Any)
  type UnboxBehaviorsData[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = UnboxBehaviorData[UnionToIntersection[ArrayType[Behaviors]]]
  type UnboxBehaviorsMethods[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = UnboxBehaviorMethods[UnionToIntersection[ArrayType[Behaviors]]]
  type UnboxBehaviorsProps[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] = UnboxBehaviorProps[UnionToIntersection[ArrayType[Behaviors]]]
  type UnionToIntersection[U] = js.Any
  type WriteFileOptions = AppendFileOptions
}
