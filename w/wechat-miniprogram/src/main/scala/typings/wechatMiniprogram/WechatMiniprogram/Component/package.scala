package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AllFullProperty = typings.wechatMiniprogram.WechatMiniprogram.Component.FullProperty[
typings.std.ArrayConstructor | typings.std.BooleanConstructor | scala.Null | typings.std.NumberConstructor | typings.std.ObjectConstructor | typings.std.StringConstructor]

type AllProperty = typings.wechatMiniprogram.WechatMiniprogram.Component.AllFullProperty | typings.wechatMiniprogram.WechatMiniprogram.Component.ShortProperty

type Constructor = js.Function1[
/* options */ typings.wechatMiniprogram.WechatMiniprogram.Component.Options[
  typings.wechatMiniprogram.WechatMiniprogram.Component.DataOption, 
  typings.wechatMiniprogram.WechatMiniprogram.Component.PropertyOption, 
  typings.wechatMiniprogram.WechatMiniprogram.Component.MethodOption, 
  js.Object, 
  typings.wechatMiniprogram.wechatMiniprogramBooleans.`false`
], 
java.lang.String]

type DataOption = typings.std.Record[java.lang.String, js.Any]

type DefinitionFilter = js.Function2[
/* defFields */ typings.wechatMiniprogram.WechatMiniprogram.Component.TrivialOption, 
/* definitionFilterArr */ js.UndefOr[
  js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias wechat-miniprogram.WechatMiniprogram.Component.DefinitionFilter */ js.Object
  ]
], 
scala.Unit]

type FullPropertyToData[T /* <: typings.wechatMiniprogram.WechatMiniprogram.Component.AllFullProperty */] = typings.wechatMiniprogram.WechatMiniprogram.Component.ValueType[
/* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any]

type Instance[TData /* <: typings.wechatMiniprogram.WechatMiniprogram.Component.DataOption */, TProperty /* <: typings.wechatMiniprogram.WechatMiniprogram.Component.PropertyOption */, TMethod /* <: typings.std.Partial[typings.wechatMiniprogram.WechatMiniprogram.Component.MethodOption] */, TCustomInstanceProperty /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */, TIsPage /* <: scala.Boolean */] = typings.wechatMiniprogram.WechatMiniprogram.Component.InstanceProperties & typings.wechatMiniprogram.WechatMiniprogram.Component.InstanceMethods[TData] & TMethod & (js.Object | typings.wechatMiniprogram.WechatMiniprogram.Page.ILifetime) & TCustomInstanceProperty & (typings.wechatMiniprogram.anon.Data[TData, TProperty])

type MethodOption = typings.std.Record[java.lang.String, js.Function1[/* repeated */ js.Any, js.Any]]

type PropertyOption = typings.std.Record[
java.lang.String, 
typings.wechatMiniprogram.WechatMiniprogram.Component.AllProperty]

type PropertyOptionToData[P /* <: typings.wechatMiniprogram.WechatMiniprogram.Component.PropertyOption */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ name in keyof P ]: wechat-miniprogram.WechatMiniprogram.Component.PropertyToData<P[name]>}
  */ typings.wechatMiniprogram.wechatMiniprogramStrings.PropertyOptionToData & org.scalablytyped.runtime.TopLevel[P]

type PropertyToData[T /* <: typings.wechatMiniprogram.WechatMiniprogram.Component.AllProperty */] = (typings.wechatMiniprogram.WechatMiniprogram.Component.FullPropertyToData[
typings.std.Exclude[T, typings.wechatMiniprogram.WechatMiniprogram.Component.ShortProperty]]) | typings.wechatMiniprogram.WechatMiniprogram.Component.ValueType[T]

type PropertyType = typings.std.StringConstructor | typings.std.NumberConstructor | typings.std.BooleanConstructor | typings.std.ArrayConstructor | typings.std.ObjectConstructor | scala.Null

type ShortProperty = typings.std.StringConstructor | typings.std.NumberConstructor | typings.std.BooleanConstructor | typings.std.ArrayConstructor | typings.std.ObjectConstructor | scala.Null

type TrivialInstance = typings.wechatMiniprogram.WechatMiniprogram.Component.Instance[
typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
typings.wechatMiniprogram.wechatMiniprogramBooleans.`false`]

type ValueType[T /* <: typings.wechatMiniprogram.WechatMiniprogram.Component.PropertyType */] = typings.wechatMiniprogram.WechatMiniprogram.IAnyObject | js.Array[js.Any] | scala.Boolean | scala.Double | java.lang.String
