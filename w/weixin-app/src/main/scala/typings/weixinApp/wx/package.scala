package typings.weixinApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object wx {
  
  type AccelerometerChangeCallback = js.Function1[/* res */ typings.weixinApp.wx.AccelerometerData, scala.Unit]
  
  type AccelerometerOptions = typings.weixinApp.wx.BaseOptions[js.Any, js.Any]
  
  type ArrayPropsDefinition[T] = js.Array[/* keyof T */ java.lang.String]
  
  type ArrayType[T /* <: js.Array[_] */] = js.Any
  
  type BuiltInEvent[T /* <: typings.weixinApp.wx.EventType */, Detail] = typings.weixinApp.wx.BaseEvent[T, Detail]
  
  type CheckSessionOption = typings.weixinApp.wx.BaseOptions[js.Any, js.Any]
  
  // CombinedInstance models the `this`, i.e. instance type for (user defined) component
  type CombinedInstance[Instance /* <: typings.weixinApp.wx.Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[
    (typings.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = Methods with Instance with typings.weixinApp.wx.UnboxBehaviorsMethods[Behaviors]
  
  type CompassChangeCallback = js.Function1[/* res */ typings.weixinApp.wx.CompassData, scala.Unit]
  
  type CompassOptions = typings.weixinApp.wx.BaseOptions[js.Any, js.Any]
  
  type CustomEvent[T /* <: java.lang.String */, Detail] = typings.weixinApp.wx.BaseEvent[T, Detail]
  
  // #endregion
  // #region Compontent组件
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  
  type DefaultMethods[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  
  type DefaultProps = js.Object | (typings.std.Record[java.lang.String, js.Any])
  
  type FormEvent = typings.weixinApp.wx.BuiltInEvent[typings.weixinApp.weixinAppStrings.form, typings.weixinApp.anon.Value]
  
  /**
    * 指定focus时的光标位置
    * @version 1.5.0
    */
  type InputEvent = typings.weixinApp.wx.BuiltInEvent[typings.weixinApp.weixinAppStrings.input, typings.weixinApp.anon.Cursor]
  
  /**
    * https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/observer.html
    */
  type ObserversDefs[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  
  type Prop[T] = js.Function0[T] | typings.weixinApp.anon.Instantiable[T]
  
  type PropValidator[T] = typings.weixinApp.wx.PropOptions[T] | typings.weixinApp.wx.Prop[T] | js.Array[typings.weixinApp.wx.Prop[T]]
  
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
  
  type PropsDefinition[T] = typings.weixinApp.wx.ArrayPropsDefinition[T] | typings.weixinApp.wx.RecordPropsDefinition[T]
  
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: weixin-app.wx.PropValidator<T[K]>}
    */ typings.weixinApp.weixinAppStrings.RecordPropsDefinition with org.scalablytyped.runtime.TopLevel[T]
  
  type RemoveSavedFileOptions = typings.weixinApp.wx.GetSavedFileInfoOptions
  
  // #endregion
  // #region 网络API列表
  // 发起请求
  type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type RmdirOptions = typings.weixinApp.wx.MkdirOptions
  
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
  type SceneValues = typings.weixinApp.wx._SceneValues | scala.Double
  
  type ScrollEvent = typings.weixinApp.wx.BuiltInEvent[typings.weixinApp.weixinAppStrings.scroll, js.Object]
  
  type TapEvent = typings.weixinApp.wx.TouchEvent[typings.weixinApp.weixinAppStrings.tap]
  
  type ThisTypedComponentOptionsWithRecordProps[V /* <: typings.weixinApp.wx.Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[
    (typings.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = js.Object with (typings.weixinApp.wx.ComponentOptions[V, Data, Methods, Props, Behaviors]) with (typings.std.ThisType[typings.weixinApp.wx.CombinedInstance[V, Data, Methods, Props, Behaviors]])
  
  type TouchCancelEvent = typings.weixinApp.wx.TouchEvent[typings.weixinApp.weixinAppStrings.touchcancel]
  
  type TouchEndEvent = typings.weixinApp.wx.TouchEvent[typings.weixinApp.weixinAppStrings.touchend]
  
  type TouchForceChangeEvent = typings.weixinApp.wx.TouchEvent[typings.weixinApp.weixinAppStrings.touchforcechange]
  
  type TouchMoveEvent = typings.weixinApp.wx.TouchEvent[typings.weixinApp.weixinAppStrings.touchmove]
  
  type TouchStartEvent = typings.weixinApp.wx.TouchEvent[typings.weixinApp.weixinAppStrings.touchstart]
  
  type UnboxBehaviorData[T] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_DATA'] */ js.Any)
  
  type UnboxBehaviorMethods[T] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_METHODS'] */ js.Any)
  
  type UnboxBehaviorProps[T] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: T['__DO_NOT_USE_INTERNAL_FIELD_PROPS'] */ js.Any)
  
  type UnboxBehaviorsData[Behaviors /* <: js.Array[
    (typings.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = typings.weixinApp.wx.UnboxBehaviorData[
    typings.weixinApp.wx.UnionToIntersection[typings.weixinApp.wx.ArrayType[Behaviors]]
  ]
  
  type UnboxBehaviorsMethods[Behaviors /* <: js.Array[
    (typings.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = typings.weixinApp.wx.UnboxBehaviorMethods[
    typings.weixinApp.wx.UnionToIntersection[typings.weixinApp.wx.ArrayType[Behaviors]]
  ]
  
  type UnboxBehaviorsProps[Behaviors /* <: js.Array[
    (typings.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String
  ] */] = typings.weixinApp.wx.UnboxBehaviorProps[
    typings.weixinApp.wx.UnionToIntersection[typings.weixinApp.wx.ArrayType[Behaviors]]
  ]
  
  type UnionToIntersection[U] = js.Any
  
  type WriteFileOptions = typings.weixinApp.wx.AppendFileOptions
}
