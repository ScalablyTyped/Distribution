package typings
package tsDashEssentialsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type DeepPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends std.Array<infer U>? std.Array<object> : T[P] extends std.ReadonlyArray<infer U>? std.ReadonlyArray<object> : object}
    */ tsDashEssentialsLib.tsDashEssentialsLibStrings.DeepPartial with js.Any
  type DeepReadonly[T] = DeepReadonlyObject[T] | T | (DeepReadonlyArray[/* import warning: ImportType.apply Failed type conversion: T[number] */ js.Any])
  type DeepReadonlyObject[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: ts-essentials.ts-essentials/dist/types.DeepReadonly<T[P]>}
    */ tsDashEssentialsLib.tsDashEssentialsLibStrings.DeepReadonlyObject with T
  type DeepRequired[T] = T | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: -? object}
    */ tsDashEssentialsLib.tsDashEssentialsLibStrings.DeepRequired with js.Any) | (DeepRequiredArray[
    NonNullable[/* import warning: ImportType.apply Failed type conversion: T[number] */ js.Any]
  ]) | NonNullable[T]
  type Dictionary[T, K /* <: java.lang.String | scala.Double */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: T}
    */ tsDashEssentialsLib.tsDashEssentialsLibStrings.Dictionary with js.Any
  type DictionaryValues[T] = js.Any
  type Merge[M, N] = (Omit[M, stdLib.Extract[java.lang.String, java.lang.String]]) with N
  type NonNullable[T] = T with js.Object
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type Opaque[K, T] = T with tsDashEssentialsLib.Anon_TYPE[K]
  type Primitive = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
  type ValueOf[T] = /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
}
