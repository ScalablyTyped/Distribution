package typings.utilityTypes

import org.scalablytyped.runtime.TopLevel
import typings.std.Pick
import typings.std.ReadonlyArray
import typings.utilityTypes.utilityTypesStrings._DeepReadonlyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility-types/dist/mapped-types", JSImport.Namespace)
@js.native
object mappedTypesMod extends js.Object {
  @js.native
  trait DeepReadonlyArray[T] extends ReadonlyArray[DeepReadonly[T]]
  
  type Assign[T /* <: js.Object */, U /* <: js.Object */, I] = Pick[I, /* keyof I */ String]
  type DeepReadonly[T] = T | DeepReadonlyObject[T] | (DeepReadonlyArray[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ])
  type DeepReadonlyObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in utility-types.utility-types/dist/mapped-types.NonFunctionKeys<T> ]: utility-types.utility-types/dist/mapped-types.DeepReadonly<T[P]>}
    */ _DeepReadonlyObject with TopLevel[T]
  type Diff[T /* <: js.Object */, U /* <: js.Object */] = Pick[T, SetDifference[/* keyof T */ String, /* keyof U */ String]]
  type FunctionKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  type Intersection[T /* <: js.Object */, U /* <: js.Object */] = Pick[T, SetIntersection[/* keyof T */ String, /* keyof U */ String]]
  type NonFunctionKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, SetComplement[/* keyof T */ String, K]]
  type Overwrite[T /* <: js.Object */, U /* <: js.Object */, I] = Pick[I, /* keyof I */ String]
  type PromiseType[T] = T
  type SetComplement[A, A1 /* <: A */] = SetDifference[A, A1]
  type SetDifference[A, B] = A
  type SetIntersection[A, B] = A
  type Subtract[T /* <: T1 */, T1 /* <: js.Object */] = Pick[T, SetComplement[/* keyof T */ String, /* keyof T1 */ String]]
  type SymmetricDifference[A, B] = SetDifference[A | B, A with B]
  type UnboxPromise[T] = PromiseType[T]
  type Unionize[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: {[ Q in P ]: T[P]}}[keyof T] */ js.Any
}

