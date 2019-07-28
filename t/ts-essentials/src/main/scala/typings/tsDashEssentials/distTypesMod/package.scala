package typings.tsDashEssentials

import typings.std.Exclude
import typings.std.Extract
import typings.std.Pick
import typings.tsDashEssentials.Anon_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type DeepPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends std.Array<infer U>? std.Array<object> : T[P] extends std.ReadonlyArray<infer U>? std.ReadonlyArray<object> : object}
    */ typings.tsDashEssentials.tsDashEssentialsStrings.DeepPartial with js.Any
  type DeepReadonly[T] = DeepReadonlyObject[T] | T | (DeepReadonlyArray[/* import warning: ImportType.apply Failed type conversion: T[number] */ js.Any])
  type DeepReadonlyObject[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: ts-essentials.ts-essentials/dist/types.DeepReadonly<T[P]>}
    */ typings.tsDashEssentials.tsDashEssentialsStrings.DeepReadonlyObject with T
  type DeepRequired[T] = T | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: -? object}
    */ typings.tsDashEssentials.tsDashEssentialsStrings.DeepRequired with js.Any) | (DeepRequiredArray[
    NonNullable[/* import warning: ImportType.apply Failed type conversion: T[number] */ js.Any]
  ]) | NonNullable[T]
  type Dictionary[T, K /* <: String | Double */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: T}
    */ typings.tsDashEssentials.tsDashEssentialsStrings.Dictionary with js.Any
  type DictionaryValues[T] = js.Any
  type Merge[M, N] = (Omit[M, Extract[String, String]]) with N
  type NonNullable[T] = T with js.Object
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Opaque[K, T] = T with Anon_TYPE[K]
  type Primitive = js.UndefOr[String | Double | Boolean | Null]
  type ValueOf[T] = /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
}
