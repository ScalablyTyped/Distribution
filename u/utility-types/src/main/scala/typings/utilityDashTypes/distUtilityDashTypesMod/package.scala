package typings.utilityDashTypes

import typings.std.Pick
import typings.utilityDashTypes.distMappedDashTypesMod.DeepReadonly
import typings.utilityDashTypes.distMappedDashTypesMod.SetComplement
import typings.utilityDashTypes.utilityDashTypesStrings.DOLLARElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distUtilityDashTypesMod {
  type $Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type $Diff[T /* <: U */, U /* <: js.Object */] = Pick[T, SetComplement[String, String]]
  type $ElementType[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in K & any ]: any}
    */ DOLLARElementType with js.Any */, K /* <: String | Double */] = /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  type $Keys[T /* <: js.Object */] = String
  type $PropertyType[T /* <: js.Object */, K /* <: String */] = /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  type $ReadOnly[T /* <: js.Object */] = DeepReadonly[T]
  type $Values[T /* <: js.Object */] = /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
}
