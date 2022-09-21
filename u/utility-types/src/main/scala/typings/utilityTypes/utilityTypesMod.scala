package typings.utilityTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.std.NonNullable
import typings.std.Partial
import typings.std.Pick
import typings.utilityTypes.mappedTypesMod.SetComplement
import typings.utilityTypes.utilityTypesStrings.$ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityTypesMod {
  
  type Call[Fn /* <: js.Function1[/* repeated */ Any, Any] */] = Any
  
  type Class[T] = Instantiable1[/* args (repeated) */ Any, T]
  
  type Diff[T /* <: U */, U /* <: js.Object */] = Pick[T, SetComplement[/* keyof T */ String, /* keyof U */ String]]
  
  type ElementType[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K & any ]: any}
    */ $ElementType & TopLevel[Any] */, K /* <: (/* keyof T */ String) | Double */] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  
  type Keys[T /* <: js.Object */] = /* keyof T */ String
  
  type NonMaybeType[T] = NonNullable[T]
  
  type PropertyType[T /* <: js.Object */, K /* <: /* keyof T */ String */] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped T extends (args : ...any): any | utility-types.utility-types/dist/aliases-and-guards.Primitive ? T : T extends utility-types.utility-types/dist/mapped-types._DeepReadonlyArray<infer U> ? utility-types.utility-types/dist/mapped-types._DeepReadonlyArray<any> : T extends utility-types.utility-types/dist/mapped-types._DeepReadonlyObject<infer V> ? utility-types.utility-types/dist/mapped-types._DeepReadonlyObject<any> : T */ trait ReadOnly[T /* <: js.Object */] extends StObject
  
  type Shape[T /* <: js.Object */] = Partial[T]
  
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type mixed = Any
}
