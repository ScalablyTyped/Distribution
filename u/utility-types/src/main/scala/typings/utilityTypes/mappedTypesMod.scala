package typings.utilityTypes

import org.scalablytyped.runtime.TopLevel
import typings.std.Array
import typings.std.ArrayLike
import typings.std.Extract
import typings.std.NonNullable
import typings.std.Partial
import typings.std.Pick
import typings.std.ReadonlyArray
import typings.std.Record
import typings.std.Required
import typings.utilityTypes.anon.BrandU
import typings.utilityTypes.utilityTypesStrings._DeepNonNullableObject
import typings.utilityTypes.utilityTypesStrings._DeepPartialObject
import typings.utilityTypes.utilityTypesStrings._DeepReadonlyObject
import typings.utilityTypes.utilityTypesStrings._DeepRequiredObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mappedTypesMod {
  
  type Assign[T /* <: js.Object */, U /* <: js.Object */, I] = Pick[I, /* keyof I */ String]
  
  type AugmentedRequired[T /* <: js.Object */, K /* <: /* keyof T */ String */] = (Omit[T, K]) & (Required[Pick[T, K]])
  
  type Brand[T, U] = T & BrandU[U]
  
  type DeepNonNullable[T] = T | DeepNonNullableObject[T] | (DeepNonNullableArray[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ])
  
  @js.native
  trait DeepNonNullableArray[T]
    extends StObject
       with Array[DeepNonNullable[NonNullable[T]]]
  
  type DeepNonNullableObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? utility-types.utility-types/dist/mapped-types.DeepNonNullable<std.NonNullable<T[P]>>}
    */ _DeepNonNullableObject & TopLevel[T]
  
  type DeepPartial[T] = js.UndefOr[T | DeepPartialObject[T] | DeepPartialArray[js.Any]]
  
  @js.native
  trait DeepPartialArray[T]
    extends StObject
       with Array[DeepPartial[T]]
  
  type DeepPartialObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? utility-types.utility-types/dist/mapped-types.DeepPartial<T[P]>}
    */ _DeepPartialObject & TopLevel[T]
  
  type DeepReadonly[T] = T | DeepReadonlyObject[js.Any] | DeepReadonlyArray[js.Any]
  
  @js.native
  trait DeepReadonlyArray[T]
    extends StObject
       with ReadonlyArray[DeepReadonly[T]]
  
  type DeepReadonlyObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: utility-types.utility-types/dist/mapped-types.DeepReadonly<T[P]>}
    */ _DeepReadonlyObject & TopLevel[T]
  
  type DeepRequired[T] = T | DeepRequiredObject[T] | (DeepRequiredArray[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ])
  
  @js.native
  trait DeepRequiredArray[T]
    extends StObject
       with Array[DeepRequired[NonUndefined[T]]]
  
  type DeepRequiredObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? utility-types.utility-types/dist/mapped-types.DeepRequired<utility-types.utility-types/dist/mapped-types.NonUndefined<T[P]>>}
    */ _DeepRequiredObject & TopLevel[T]
  
  type Diff[T /* <: js.Object */, U /* <: js.Object */] = Pick[T, SetDifference[/* keyof T */ String, /* keyof U */ String]]
  
  type Exact[A /* <: js.Object */] = A & typings.utilityTypes.anon.Brand[A]
  
  type FunctionKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? utility-types.utility-types/dist/mapped-types.NonUndefined<T[K]> extends std.Function? K : never}[keyof T] */ js.Any
  
  type IfEquals[X, Y, A, B] = B | A
  
  type Intersection[T /* <: js.Object */, U /* <: js.Object */] = Pick[T, Extract[/* keyof T */ String, /* keyof U */ String]]
  
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typings.utilityTypes.utilityTypesStrings.Mutable & TopLevel[T]
  
  type MutableKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? utility-types.utility-types/dist/mapped-types.IfEquals<{[ Q in P ]: T[P]}, {-readonly [ Q in P ]: T[P]}, P, never>}[keyof T] */ js.Any
  
  type NonFunctionKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? utility-types.utility-types/dist/mapped-types.NonUndefined<T[K]> extends std.Function? never : K}[keyof T] */ js.Any
  
  type NonUndefined[A] = A
  
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, SetDifference[/* keyof T */ String, K]]
  
  type OmitByValue[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: -? T[Key] extends ValueType? never : Key}[keyof T] */ js.Any
  ]
  
  type OmitByValueExact[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: -? [ValueType] extends [T[Key]]? [T[Key]] extends [ValueType]? never : Key : Key}[keyof T] */ js.Any
  ]
  
  type Optional[T /* <: js.Object */, K /* <: /* keyof T */ String */] = (Omit[T, K]) & (Partial[Pick[T, K]])
  
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? {} extends std.Pick<T, K>? K : never}[keyof T] */ js.Any
  
  type Overwrite[T /* <: js.Object */, U /* <: js.Object */, I] = Pick[I, /* keyof I */ String]
  
  type PickByValue[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: -? T[Key] extends ValueType? Key : never}[keyof T] */ js.Any
  ]
  
  type PickByValueExact[T, ValueType] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: -? [ValueType] extends [T[Key]]? [T[Key]] extends [ValueType]? Key : never : never}[keyof T] */ js.Any
  ]
  
  type PromiseType[T /* <: js.Promise[js.Any] */] = js.Any
  
  type ReadonlyKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? utility-types.utility-types/dist/mapped-types.IfEquals<{[ Q in P ]: T[P]}, {-readonly [ Q in P ]: T[P]}, never, P>}[keyof T] */ js.Any
  
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? {} extends std.Pick<T, K>? never : K}[keyof T] */ js.Any
  
  type SetComplement[A, A1 /* <: A */] = SetDifference[A, A1]
  
  type SetDifference[A, B] = A
  
  type SetIntersection[A, B] = A
  
  type Subtract[T /* <: T1 */, T1 /* <: js.Object */] = Pick[T, SetComplement[/* keyof T */ String, /* keyof T1 */ String]]
  
  type SymmetricDifference[A, B] = SetDifference[A | B, A & B]
  
  type UnionToIntersection[U] = js.Any
  
  type Unionize[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: {[ Q in P ]: T[P]}}[keyof T] */ js.Any
  
  type ValuesType[T /* <: js.Array[js.Any] | ArrayLike[js.Any] | (Record[js.Any, js.Any]) */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type Writable[T] = Mutable[T]
  
  type WritableKeys[T /* <: js.Object */] = MutableKeys[T]
}
