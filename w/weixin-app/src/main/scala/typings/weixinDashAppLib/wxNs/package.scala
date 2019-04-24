package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wxNs {
  type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, scala.Unit]
  type AccelerometerOptions = BaseOptions[js.Any, js.Any]
  type ArrayPropsDefinition[T] = js.Array[java.lang.String]
  type ArrayType[T /* <: js.Array[_] */] = js.Any
  type BuiltInEvent[T /* <: EventType */, Detail] = BaseEvent[T, Detail]
  type CheckSessionOption = BaseOptions[js.Any, js.Any]
  // CombinedInstance models the `this`, i.e. instance type for (user defined) component
  type CombinedInstance[Instance /* <: Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | java.lang.String] */] = Methods with Instance with UnboxBehaviorsMethods[Behaviors]
  type CompassChangeCallback = js.Function1[/* res */ CompassData, scala.Unit]
  type CompassOptions = BaseOptions[js.Any, js.Any]
  type CustomEvent[T /* <: java.lang.String */, Detail] = BaseEvent[T, Detail]
  // #endregion
  // #region Compontent组件
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultMethods[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = js.Object | (stdLib.Record[java.lang.String, js.Any])
  type FormEvent = BuiltInEvent[weixinDashAppLib.weixinDashAppLibStrings.form, weixinDashAppLib.Anon_Name]
  /**
  	 * 指定focus时的光标位置
  	 * @version 1.5.0
  	 */
  type InputEvent = BuiltInEvent[weixinDashAppLib.weixinDashAppLibStrings.input, weixinDashAppLib.Anon_Cursor]
  /**
  	 * https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/observer.html
  	 */
  type ObserversDefs[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
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
  type RecordPropsDefinition[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: weixin-app.wx.PropValidator<T[K]>}
    */ weixinDashAppLib.weixinDashAppLibStrings.RecordPropsDefinition with T
  type RemoveSavedFileOptions = GetSavedFileInfoOptions
  // #endregion
  // #region 网络API列表
  // 发起请求
  type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RmdirOptions = MkdirOptions
  // #endregion
  // #region App里的onLaunch、onShow回调参数
  /* Rewritten from type alias, can be one of: 
    - weixinDashAppLib.weixinDashAppLibNumbers.`1001`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1005`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1006`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1007`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1008`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1011`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1012`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1013`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1014`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1017`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1019`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1020`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1022`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1023`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1024`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1025`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1026`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1027`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1028`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1029`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1030`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1031`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1032`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1034`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1035`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1036`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1037`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1038`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1039`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1042`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1043`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1044`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1045`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1046`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1047`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1048`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1049`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1052`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1053`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1054`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1056`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1057`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1058`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1059`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1064`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1067`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1068`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1069`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1071`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1072`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1073`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1074`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1077`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1078`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1079`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1081`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1082`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1084`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1089`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1090`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1091`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1092`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1095`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1096`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1097`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1099`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1102`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1103`
    - weixinDashAppLib.weixinDashAppLibNumbers.`1104`
    - scala.Double
  */
  type SceneValues = _SceneValues | scala.Double
  type ScrollEvent = BuiltInEvent[weixinDashAppLib.weixinDashAppLibStrings.scroll, js.Object]
  type TapEvent = TouchEvent[weixinDashAppLib.weixinDashAppLibStrings.tap]
  type ThisTypedComponentOptionsWithRecordProps[V /* <: Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | java.lang.String] */] = js.Object with (ComponentOptions[V, Data, Methods, Props, Behaviors]) with (stdLib.ThisType[CombinedInstance[V, Data, Methods, stdLib.Readonly[Props], Behaviors]])
  type TouchCancelEvent = TouchEvent[weixinDashAppLib.weixinDashAppLibStrings.touchcancel]
  type TouchEndEvent = TouchEvent[weixinDashAppLib.weixinDashAppLibStrings.touchend]
  type TouchForceChangeEvent = TouchEvent[weixinDashAppLib.weixinDashAppLibStrings.touchforcechange]
  type TouchMoveEvent = TouchEvent[weixinDashAppLib.weixinDashAppLibStrings.touchmove]
  type TouchStartEvent = TouchEvent[weixinDashAppLib.weixinDashAppLibStrings.touchstart]
  type UnboxBehaviorData[T] = js.Object | (/* import warning: ImportType.apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_DATA'] */ js.Any)
  type UnboxBehaviorMethods[T] = js.Object | (/* import warning: ImportType.apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_METHODS'] */ js.Any)
  type UnboxBehaviorProps[T] = js.Object | (/* import warning: ImportType.apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_PROPS'] */ js.Any)
  type UnboxBehaviorsData[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | java.lang.String] */] = UnboxBehaviorData[UnionToIntersection[ArrayType[Behaviors]]]
  type UnboxBehaviorsMethods[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | java.lang.String] */] = UnboxBehaviorMethods[UnionToIntersection[ArrayType[Behaviors]]]
  type UnboxBehaviorsProps[Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | java.lang.String] */] = UnboxBehaviorProps[UnionToIntersection[ArrayType[Behaviors]]]
  type UnionToIntersection[U] = js.Any
  type WriteFileOptions = AppendFileOptions
}
