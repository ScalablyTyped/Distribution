package typings
package utilityDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distUtilityDashTypesMod {
  type $Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type $Diff[T /* <: U */, U /* <: js.Object */] = stdLib.Pick[
    T, 
    utilityDashTypesLib.distMappedDashTypesMod.SetComplement[java.lang.String, java.lang.String]
  ]
  type $ElementType[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in K & any ]: any}
    */ utilityDashTypesLib.utilityDashTypesLibStrings.DOLLARElementType with js.Any */, K /* <: java.lang.String | scala.Double */] = /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  type $Keys[T /* <: js.Object */] = java.lang.String
  type $PropertyType[T /* <: js.Object */, K /* <: java.lang.String */] = /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  type $ReadOnly[T /* <: js.Object */] = utilityDashTypesLib.distMappedDashTypesMod.DeepReadonly[T]
  type $Values[T /* <: js.Object */] = /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
}
