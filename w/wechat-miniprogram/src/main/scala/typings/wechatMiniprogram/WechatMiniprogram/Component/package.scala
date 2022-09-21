package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.Exclude
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.Partial
import typings.std.Record
import typings.std.StringConstructor
import typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
import typings.wechatMiniprogram.WechatMiniprogram.Page.ILifetime
import typings.wechatMiniprogram.wechatMiniprogramBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AllFullProperty = FullProperty[
ArrayConstructor | BooleanConstructor | Null | NumberConstructor | ObjectConstructor | StringConstructor]

type AllProperty = AllFullProperty | ShortProperty

type Constructor = js.Function1[
/* options */ Options[DataOption, PropertyOption, MethodOption, js.Object, `false`], 
String]

type DataOption = Record[String, Any]

type FullPropertyToData[T /* <: AllFullProperty */] = ValueType[
/* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any]

type Instance[TData /* <: DataOption */, TProperty /* <: PropertyOption */, TMethod /* <: Partial[MethodOption] */, TCustomInstanceProperty /* <: IAnyObject */, TIsPage /* <: Boolean */] = InstanceProperties & InstanceMethods[TData] & TMethod & (js.Object | ILifetime) & TCustomInstanceProperty & (typings.wechatMiniprogram.anon.Data[TData, TProperty])

// tslint:disable-next-line:ban-types
type MethodOption = Record[String, js.Function]

type PropertyOption = Record[String, AllProperty]

type PropertyOptionToData[P /* <: PropertyOption */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ name in keyof P ]: wechat-miniprogram.WechatMiniprogram.Component.PropertyToData<P[name]>}
  */ typings.wechatMiniprogram.wechatMiniprogramStrings.PropertyOptionToData & TopLevel[P]

type PropertyToData[T /* <: AllProperty */] = (FullPropertyToData[Exclude[T, ShortProperty]]) | ValueType[T]

type PropertyType = StringConstructor | NumberConstructor | BooleanConstructor | ArrayConstructor | ObjectConstructor | Null

type ShortProperty = StringConstructor | NumberConstructor | BooleanConstructor | ArrayConstructor | ObjectConstructor | Null

type TrivialInstance = Instance[IAnyObject, IAnyObject, IAnyObject, IAnyObject, `false`]

type ValueType[T /* <: PropertyType */] = IAnyObject | js.Array[Any] | Boolean | Double | String
