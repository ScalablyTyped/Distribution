package typings.typeZoo

import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends U ? never : T
    }}}
    */
  type ExcludeStrict[T, U /* <: T */] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends U ? T : never
    }}}
    */
  type ExtractStrict[T, U /* <: T */] = T
  
  type NoInfer[T] = T & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any)
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends any ? std.Pick<T, std.Exclude<keyof T, K>> : never
    }}}
    */
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends any ? std.Pick<T, std.Exclude<keyof T, K>> : never
    }}}
    */
  type OmitStrict[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type Overwrite[T, U] = (Omit[T, /* keyof T */ String]) & U
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Func extends (a : infer T, args : ...any): any ? T : never
    }}}
    */
  @js.native
  trait Param0[Func] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Func extends (a : any, b : infer T, args : ...any): any ? T : never
    }}}
    */
  @js.native
  trait Param1[Func] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Func extends (a : any, b : any, c : infer T, args : ...any): any ? T : never
    }}}
    */
  @js.native
  trait Param2[Func] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Func extends (a : any, b : any, c : any, d : infer T, args : ...any): any ? T : never
    }}}
    */
  @js.native
  trait Param3[Func] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    F extends (): any ? {} : F extends (p0 : infer P0): any ? [P0] : F extends (p0 : infer P0, p1 : infer P1): any ? [P0, P1] : F extends (p0 : infer P0, p1 : infer P1, p2 : infer P2): any ? [P0, P1, P2] : F extends (p0 : infer P0, p1 : infer P1, p2 : infer P2, p3 : infer P3): any ? [P0, P1, P2, P3] : never
    }}}
    */
  @js.native
  trait ParamTypes[F /* <: js.Function */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P1 in K1 ]: {[ P2 in K2 ]: T[K1][P2]}}
    }}}
    */
  @js.native
  trait Pick2[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P1 in K1 ]: {[ P2 in K2 ]: {[ P3 in K3 ]: T[K1][K2][P3]}}}
    }}}
    */
  @js.native
  trait Pick3[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P1 in K1 ]: {[ P2 in K2 ]: {[ P3 in K3 ]: {[ P4 in K4 ]: T[K1][K2][K3][P4]}}}}
    }}}
    */
  @js.native
  trait Pick4[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ P in keyof T ]: T[P]}
    }}}
    */
  type Public[T] = T
  
  type Purify[T /* <: String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: T}[T] */ js.Any
}
