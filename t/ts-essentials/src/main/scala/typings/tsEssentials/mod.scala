package typings.tsEssentials

import org.scalablytyped.runtime.TopLevel
import typings.std.Array
import typings.std.Exclude
import typings.std.Extract
import typings.std.Pick
import typings.std.ReadonlyArray
import typings.tsEssentials.anon.TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-essentials", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait DeepReadonlyArray[T] extends ReadonlyArray[DeepReadonly[T]]
  
  @js.native
  trait DeepRequiredArray[T] extends Array[DeepRequired[T]]
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends std.Array<infer U>? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials.DeepPartial<U> * / object> : T[P] extends std.ReadonlyArray<infer U>? std.ReadonlyArray</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials.DeepPartial<U> * / object> : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials.DeepPartial<T[P]> * / object}
    */ typings.tsEssentials.tsEssentialsStrings.DeepPartial with TopLevel[js.Any]
  type DeepReadonly[T] = DeepReadonlyObject[T] | T | (DeepReadonlyArray[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ])
  type DeepReadonlyObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: ts-essentials.ts-essentials.DeepReadonly<T[P]>}
    */ typings.tsEssentials.tsEssentialsStrings.DeepReadonlyObject with TopLevel[T]
  type DeepRequired[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: -? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials.DeepRequired<ts-essentials.ts-essentials.NonNullable<T[K]>> * / object}
    */ typings.tsEssentials.tsEssentialsStrings.DeepRequired with TopLevel[js.Any]) | (DeepRequiredArray[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ]) | NonNullable[T]
  type Dictionary[T, K /* <: String | Double */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T}
    */ typings.tsEssentials.tsEssentialsStrings.Dictionary with TopLevel[js.Any]
  type DictionaryValues[T] = js.Any
  type Merge[M, N] = (Omit[M, Extract[/* keyof M */ String, /* keyof N */ String]]) with N
  type NonNullable[T] = T with js.Object
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  type Opaque[K, T] = T with TYPE[K]
  type Primitive = js.UndefOr[String | Double | Boolean | Null]
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}

