package typings.tsEssentials

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.std.Exclude
import typings.std.Extract
import typings.std.Map
import typings.std.NonNullable
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Record
import typings.std.Required
import typings.std.Set
import typings.std.WeakMap
import typings.std.WeakSet
import typings.tsEssentials.anon.OPAQUETYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AnyArray[T] = js.Array[T]
  
  type AnyRecord[T] = Record[KeyofBase, T]
  
  type ArrayOrSingle[T] = T | js.Array[T]
  
  type AsyncOrSync[T] = js.Thenable[T] | T
  
  type AsyncOrSyncType[T] = Any
  
  type Awaited[T] = Any
  
  type Buildable[T] = DeepPartial[DeepWritable[T]]
  
  type Builtin = Primitive | js.Function | js.Date | js.Error | js.RegExp
  
  type DeepModify[T] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? undefined extends {[ K2 in keyof T ]: K2}[K]? ts-essentials.ts-essentials/dist/types.NonUndefinable<T[K]> extends object? true | any : true : T[K] extends object? true | any : true}
    */ typings.tsEssentials.tsEssentialsStrings.DeepModify & TopLevel[Any]) | js.Array[Any] | js.Promise[Any] | Set[Any] | ReadonlySet[Any] | WeakSet[Any] | (Map[Any, Any]) | (ReadonlyMap[Any, Any]) | (WeakMap[Any, Any])
  
  type DeepNonNullable[T] = NonNullable[T] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: any}
    */ typings.tsEssentials.tsEssentialsStrings.DeepNonNullable & TopLevel[Any]) | js.Promise[Any] | WeakSet[Any] | ReadonlySet[Any] | Set[Any] | (WeakMap[Any, Any]) | (ReadonlyMap[Any, Any]) | (Map[Any, Any])
  
  type DeepNullable[T] = T | Null | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: any}
    */ typings.tsEssentials.tsEssentialsStrings.DeepNullable & TopLevel[Any]) | js.Promise[Any] | js.Array[Any] | WeakSet[Any] | ReadonlySet[Any] | Set[Any] | (WeakMap[Any, Any]) | (ReadonlyMap[Any, Any]) | (Map[Any, Any])
  
  type DeepOmit[T, Filter /* <: DeepModify[T] */] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T as K extends keyof Filter? Filter[K] extends true? never : K : K ]: K extends keyof Filter? Filter[K] extends ts-essentials.ts-essentials/dist/types.DeepModify<T[K]>? any : T[K] : T[K]}
    */ typings.tsEssentials.tsEssentialsStrings.DeepOmit & TopLevel[Any]) | T | js.Promise[Any] | js.Array[Any] | WeakSet[Any] | ReadonlySet[Any] | Set[Any] | (WeakMap[Any, Any]) | (ReadonlyMap[Any, Any]) | (Map[Any, Any])
  
  type DeepPartial[T] = Partial[T] | Any | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ typings.tsEssentials.tsEssentialsStrings.DeepPartial & TopLevel[Any]) | js.Promise[Any] | js.Array[js.UndefOr[Any]] | WeakSet[Any] | ReadonlySet[Any] | Set[Any] | (WeakMap[Any, Any]) | (ReadonlyMap[Any, Any]) | (Map[Any, Any]) | T
  
  type DeepPick[T, Filter /* <: DeepModify[T] */] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T as K extends keyof Filter? K : never ]: Filter[K & keyof Filter] extends true? T[K] : K extends keyof Filter? Filter[K] extends ts-essentials.ts-essentials/dist/types.DeepModify<T[K]>? any : never : never}
    */ typings.tsEssentials.tsEssentialsStrings.DeepPick & TopLevel[Any]) | T | js.Promise[Any] | js.Array[Any] | WeakSet[Any] | ReadonlySet[Any] | Set[Any] | (WeakMap[Any, Any]) | (ReadonlyMap[Any, Any]) | (Map[Any, Any])
  
  type DeepReadonly[T] = T | Any | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof T ]: any}
    */ typings.tsEssentials.tsEssentialsStrings.DeepReadonly & TopLevel[Any]) | js.Array[Any] | js.Promise[Any] | WeakSet[Any] | ReadonlySet[Any] | (WeakMap[Any, Any]) | (ReadonlyMap[Any, Any])
  
  type DeepRequired[T] = Required[T] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: -? any}
    */ typings.tsEssentials.tsEssentialsStrings.DeepRequired & TopLevel[Any]) | js.Promise[Any] | WeakSet[Any] | ReadonlySet[Any] | Set[Any] | (WeakMap[Any, Any]) | (ReadonlyMap[Any, Any]) | (Map[Any, Any]) | T
  
  type DeepUndefinable[T] = js.UndefOr[
    T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: any}
    */ typings.tsEssentials.tsEssentialsStrings.DeepUndefinable & TopLevel[Any]) | js.Promise[Any] | js.Array[Any] | WeakSet[Any] | ReadonlySet[Any] | Set[Any] | (WeakMap[Any, Any]) | (ReadonlyMap[Any, Any]) | (Map[Any, Any])
  ]
  
  type DeepWritable[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ K in keyof T ]: any}
    */ typings.tsEssentials.tsEssentialsStrings.DeepWritable & TopLevel[Any]) | js.Promise[Any] | WeakSet[Any] | Set[Any] | (WeakMap[Any, Any]) | (Map[Any, Any])
  
  type Dictionary[T, K /* <: KeyofBase */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T}
    */ typings.tsEssentials.tsEssentialsStrings.Dictionary & TopLevel[Any]
  
  type DictionaryValues[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type ElementOf[T /* <: js.Array[Any] */] = Any
  
  type Exact[T, SHAPE] = T
  
  type Head[T /* <: AnyArray[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsEssentials.tsEssentialsBooleans.`false`
    - typings.tsEssentials.tsEssentialsBooleans.`true`
  */
  trait IsAny[T] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsEssentials.tsEssentialsBooleans.`false`
    - typings.tsEssentials.tsEssentialsBooleans.`true`
  */
  trait IsEqualConsideringWritability[X, Y] extends StObject
  
  type IsFullyWritable[T /* <: js.Object */] = IsEqualConsideringWritability[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Q in keyof T ]: T[Q]}
    */ typings.tsEssentials.tsEssentialsStrings.IsFullyWritable & TopLevel[T], 
    Writable[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Q in keyof T ]: T[Q]}
    */ typings.tsEssentials.tsEssentialsStrings.IsFullyWritable & TopLevel[T]
    ]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsEssentials.tsEssentialsBooleans.`false`
    - typings.tsEssentials.tsEssentialsBooleans.`true`
  */
  trait IsNever[T] extends StObject
  
  type IsTuple[T] = T
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsEssentials.tsEssentialsBooleans.`false`
    - typings.tsEssentials.tsEssentialsBooleans.`true`
  */
  trait IsUnknown[T] extends StObject
  
  type KeyofBase = /* keyof any */ String
  
  type MarkOptional[T, K /* <: /* keyof T */ String */] = (Omit[T, K]) & (Partial[Pick[T, K]])
  
  type MarkReadonly[T, K /* <: /* keyof T */ String */] = (Omit[T, K]) & (Pick[T, K])
  
  type MarkRequired[T, RK /* <: /* keyof T */ String */] = (Omit[T, RK]) & (Required[Pick[T, RK]])
  
  type MarkWritable[T, K /* <: /* keyof T */ String */] = (Omit[T, K]) & (Writable[Pick[T, K]])
  
  type Merge[M, N] = (Omit[M, /* keyof N */ String]) & N
  
  type MergeN[T /* <: js.Array[Any] */] = _MergeN[T, js.Object]
  
  @js.native
  trait Newable[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
  
  type NonEmptyArray[T] = Array[T]
  
  type NonEmptyObject[T /* <: js.Object */] = T
  
  type NonNever[T /* <: js.Object */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends never? never : K}[keyof T] */ js.Any
  ]
  
  type NonUndefinable[T] = T
  
  type OmitProperties[T, P] = Omit[T, PickKeysByValue[T, P]]
  
  type Opaque[Type, Token /* <: String */] = Type & OPAQUETYPE[Token]
  
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends {[ K2 in keyof T ]: K2}[K]? K : never}[keyof T] */ js.Any
  
  type PickKeys[T, P] = Exclude[
    /* keyof ts-essentials.ts-essentials/dist/types.PickProperties<T, P> */ String, 
    Unit
  ]
  
  type PickKeysByValue[T, V] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends V? K : never}[keyof T] */ js.Any
  
  type PickProperties[T, P] = Pick[T, PickKeysByValue[T, P]]
  
  @js.native
  trait PredicateFunction extends StObject {
    
    def apply(x: Any, _z: Any*): /* is any */ Boolean = js.native
  }
  
  type PredicateType[T /* <: PredicateFunction */] = Any
  
  type Primitive = js.UndefOr[String | Double | Boolean | js.BigInt | js.Symbol | Null]
  
  type ReadonlyArrayOrSingle[T] = T | js.Array[T]
  
  type ReadonlyKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? ts-essentials.ts-essentials/dist/types.IsFullyWritable<std.Pick<T, P>> extends true? never : P}[keyof T] */ js.Any
  
  type RequiredKeys[T] = Exclude[/* keyof T */ String, OptionalKeys[T]]
  
  type SafeDictionary[T, K /* <: KeyofBase */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]:? T}
    */ typings.tsEssentials.tsEssentialsStrings.SafeDictionary & TopLevel[Any]
  
  type StrictExclude[T, U /* <: T */] = Exclude[T, U]
  
  type StrictExtract[T, U /* <: Partial[T] */] = Extract[T, U]
  
  type StrictOmit[T /* <: AnyRecord[Any] */, K /* <: /* keyof T */ String */] = Omit[T, K]
  
  type StringLiteral[T] = T
  
  type Tail[T /* <: AnyArray[Any] */] = Any
  
  type Tuple[T] = js.Array[T]
  
  type UnionToIntersection[U] = Any
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  /** Mark some properties which only the former including as optional and set the value to never */
  type Without[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof T, keyof U> ]:? never}
    */ typings.tsEssentials.tsEssentialsStrings.Without & TopLevel[Any]
  
  type Writable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typings.tsEssentials.tsEssentialsStrings.Writable & TopLevel[T]
  
  type WritableKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? ts-essentials.ts-essentials/dist/types.IsFullyWritable<std.Pick<T, P>> extends true? P : never}[keyof T] */ js.Any
  
  type XOR[T, U] = T | U | ((Without[T, U]) & U) | ((Without[U, T]) & T)
  
  type _MergeN[T /* <: js.Array[Any] */, Result] = Result
}
