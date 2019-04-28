package typings
package utilityDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distMappedDashTypesMod {
  type Assign[T /* <: js.Object */, U /* <: js.Object */, I] = stdLib.Pick[I, java.lang.String]
  type DeepReadonly[T] = T | _DeepReadonlyObject[T] | (_DeepReadonlyArray[/* import warning: ImportType.apply Failed type conversion: T[number] */ js.Any])
  type Diff[T /* <: js.Object */, U /* <: js.Object */] = stdLib.Pick[T, SetDifference[java.lang.String, java.lang.String]]
  type FunctionKeys[T] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: K}[keyof T] */ js.Any
  type Intersection[T /* <: js.Object */, U /* <: js.Object */] = stdLib.Pick[T, SetIntersection[java.lang.String, java.lang.String]]
  type NonFunctionKeys[T] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: K}[keyof T] */ js.Any
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, SetComplement[java.lang.String, K]]
  type Overwrite[T /* <: js.Object */, U /* <: js.Object */, I] = stdLib.Pick[I, java.lang.String]
  type PromiseType[T] = T
  type SetComplement[A, A1 /* <: A */] = SetDifference[A, A1]
  type SetDifference[A, B] = A
  type SetIntersection[A, B] = A
  type Subtract[T /* <: T1 */, T1 /* <: js.Object */] = stdLib.Pick[T, SetComplement[java.lang.String, java.lang.String]]
  type SymmetricDifference[A, B] = SetDifference[A | B, A with B]
  type UnboxPromise[T] = PromiseType[T]
  type Unionize[T] = /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: {[ Q in P ]: T[P]}}[keyof T] */ js.Any
}
