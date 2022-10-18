package typings.utilityTypes

import org.scalablytyped.runtime.Instantiable1
import typings.std.NonNullable
import typings.std.Partial
import typings.std.Pick
import typings.utilityTypes.distMappedTypesMod.DeepReadonly
import typings.utilityTypes.distMappedTypesMod.SetComplement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilityTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Fn extends (arg : any): infer RT ? RT : never
    }}}
    */
  @js.native
  trait Call[Fn /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject
  
  type Class[T] = Instantiable1[/* args (repeated) */ Any, T]
  
  type Diff[T /* <: U */, U /* <: js.Object */] = Pick[T, SetComplement[/* keyof T */ String, /* keyof U */ String]]
  
  type ElementType[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in K & any ]: any} */ js.Any */, K /* <: (/* keyof T */ String) | Double */] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  
  type Keys[T /* <: js.Object */] = /* keyof T */ String
  
  type NonMaybeType[T] = NonNullable[T]
  
  type PropertyType[T /* <: js.Object */, K /* <: /* keyof T */ String */] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  
  type ReadOnly[T /* <: js.Object */] = DeepReadonly[T]
  
  type Shape[T /* <: js.Object */] = Partial[T]
  
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type mixed = Any
}
