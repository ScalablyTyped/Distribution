package typings.tsEssentials

import org.scalablytyped.runtime.TopLevel
import typings.std.Array
import typings.std.Exclude
import typings.std.Extract
import typings.std.NonNullable
import typings.std.Pick
import typings.std.ReadonlyArray
import typings.std.Required
import typings.tsEssentials.anon.TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AsyncOrSync[T] = js.Thenable[T] | T
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends ts-essentials.ts-essentials/dist/types.Primitive? T[P] : T[P] extends std.Function? T[P] : T[P] extends std.Date? T[P] : T[P] extends std.Array<infer U>? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials/dist/types.DeepPartial<U> * / object> : T[P] extends std.ReadonlyArray<infer U>? std.ReadonlyArray</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials/dist/types.DeepPartial<U> * / object> : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials/dist/types.DeepPartial<T[P]> * / object}
    */ typings.tsEssentials.tsEssentialsStrings.DeepPartial with TopLevel[js.Any]
  
  type DeepReadonly[T] = js.Any | DeepReadonlyObject[T] | T | (DeepReadonlyArray[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ])
  
  @js.native
  trait DeepReadonlyArray[T] extends ReadonlyArray[DeepReadonly[T]]
  
  type DeepReadonlyObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: ts-essentials.ts-essentials/dist/types.DeepReadonly<T[P]>}
    */ typings.tsEssentials.tsEssentialsStrings.DeepReadonlyObject with TopLevel[T]
  
  type DeepRequired[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: -? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials/dist/types.DeepRequired<std.NonNullable<T[K]>> * / object}
    */ typings.tsEssentials.tsEssentialsStrings.DeepRequired with TopLevel[js.Any]) | (DeepRequiredArray[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ]) | NonNullable[T]
  
  @js.native
  trait DeepRequiredArray[T] extends Array[DeepRequired[T]]
  
  type DeepWritable[T] = DeepWritableObject[T] | T | (WritableArray[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ])
  
  type DeepWritableObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: ts-essentials.ts-essentials/dist/types.DeepWritable<T[P]>}
    */ typings.tsEssentials.tsEssentialsStrings.DeepWritableObject with TopLevel[T]
  
  type Dictionary[T, K /* <: String | Double */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T}
    */ typings.tsEssentials.tsEssentialsStrings.Dictionary with TopLevel[js.Any]
  
  type DictionaryValues[T] = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsEssentials.tsEssentialsBooleans.`false`
    - typings.tsEssentials.tsEssentialsBooleans.`true`
  */
  trait IsEqualConsideringWritability[X, Y] extends StObject
  
  type IsFullyWritable[T /* <: js.Object */] = IsEqualConsideringWritability[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Q in keyof T ]: T[Q]}
    */ typings.tsEssentials.tsEssentialsStrings.IsFullyWritable with TopLevel[T], 
    Writable[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Q in keyof T ]: T[Q]}
    */ typings.tsEssentials.tsEssentialsStrings.IsFullyWritable with TopLevel[T]
    ]
  ]
  
  type MarkRequired[T, RK /* <: /* keyof T */ String */] = (Exclude[T, RK]) with (Required[Pick[T, RK]])
  
  type Merge[M, N] = (Omit[M, Extract[/* keyof M */ String, /* keyof N */ String]]) with N
  
  type NonNever[T /* <: js.Object */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends never? never : K}[keyof T] */ js.Any
  ]
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type OmitProperties[T, P] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends P? never : K}[keyof T] */ js.Any
  ]
  
  type Opaque[K, T] = T with TYPE[K]
  
  type Primitive = js.UndefOr[String | Double | Boolean | js.BigInt | js.Symbol | Null]
  
  type ReadonlyKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? ts-essentials.ts-essentials/dist/types.IsFullyWritable<std.Pick<T, P>> extends true? never : P}[keyof T] */ js.Any
  
  type Tuple[T] = js.Array[T]
  
  type UnionToIntersection[U] = js.Any
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type Writable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typings.tsEssentials.tsEssentialsStrings.Writable with TopLevel[T]
  
  @js.native
  trait WritableArray[T] extends Array[DeepWritable[T]]
  
  type WritableKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? ts-essentials.ts-essentials/dist/types.IsFullyWritable<std.Pick<T, P>> extends true? P : never}[keyof T] */ js.Any
}
