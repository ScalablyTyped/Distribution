package typings.utilityTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.std.NonNullable
import typings.std.Partial
import typings.std.Pick
import typings.utilityTypes.mappedTypesMod.DeepReadonly
import typings.utilityTypes.mappedTypesMod.SetComplement
import typings.utilityTypes.utilityTypesStrings.$ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("utility-types/dist/utility-types", JSImport.Namespace)
@js.native
object utilityTypesMod extends js.Object {
  
  type Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  
  type Class[T] = Instantiable1[/* args (repeated) */ js.Any, T]
  
  type Diff[T /* <: U */, U /* <: js.Object */] = Pick[T, SetComplement[/* keyof T */ String, /* keyof U */ String]]
  
  type ElementType[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K & any ]: any}
    */ $ElementType with TopLevel[js.Any] */, K /* <: (/* keyof T */ String) | Double */] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  
  type Keys[T /* <: js.Object */] = /* keyof T */ String
  
  type NonMaybeType[T] = NonNullable[T]
  
  type PropertyType[T /* <: js.Object */, K /* <: /* keyof T */ String */] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  
  type ReadOnly[T /* <: js.Object */] = DeepReadonly[T]
  
  type Shape[T /* <: js.Object */] = Partial[T]
  
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type mixed = js.Any
}
