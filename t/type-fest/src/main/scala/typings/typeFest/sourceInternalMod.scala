package typings.typeFest

import typings.std.PropertyKey
import typings.std.Record
import typings.typeFest.sourcePrimitiveMod.Primitive
import typings.typeFest.typeFestStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceInternalMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TArray extends [unknown, ...infer TTail] ? TTail : []
    }}}
    */
  @js.native
  trait ArrayTail[TArray /* <: UnknownArrayOrTuple */] extends StObject
  
  /**
  Create a tuple type of the given length `<L>`.
  @link https://itnext.io/implementing-arithmetic-within-typescripts-type-system-a1ef140a6f6f
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends { readonly length :L} ? T : type-fest.type-fest/source/internal.BuildTuple<L, [...T, unknown]>
    }}}
    */
  @js.native
  trait BuildTuple[L /* <: Double */, T /* <: js.Array[Any] */] extends StObject
  
  type BuiltIns = Primitive | js.Date | js.RegExp
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TArray extends [infer THead, ...std.Array<unknown>] ? THead : never
    }}}
    */
  @js.native
  trait FirstArrayElement[TArray /* <: UnknownArrayOrTuple */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    FirstType extends BaseType ? SecondType extends BaseType ? true : false : false
    }}}
    */
  @js.native
  trait IsBothExtends[BaseType, FirstType, SecondType] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    <G>(): G extends T ? 1 : 2 extends <G>(): G extends U ? 1 : 2 ? true : false
    }}}
    */
  @js.native
  trait IsEqual[T, U] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends T ? keyof T : never
    }}}
    */
  @js.native
  trait KeysOfUnion[T] extends StObject
  
  type NonEmptyTuple = Array[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeFest.typeFestStrings.`0`
    - typings.typeFest.typeFestStrings.`1`
    - typings.typeFest.typeFestStrings.`2`
    - typings.typeFest.typeFestStrings.`3`
    - typings.typeFest.typeFestStrings.`4`
    - typings.typeFest.typeFestStrings.`5`
    - typings.typeFest.typeFestStrings.`6`
    - typings.typeFest.typeFestStrings.`7`
    - typings.typeFest.typeFestStrings.`8`
    - typings.typeFest.typeFestStrings.`9`
  */
  trait StringDigit extends StObject
  object StringDigit {
    
    inline def `0`: typings.typeFest.typeFestStrings.`0` = "0".asInstanceOf[typings.typeFest.typeFestStrings.`0`]
    
    inline def `1`: typings.typeFest.typeFestStrings.`1` = "1".asInstanceOf[typings.typeFest.typeFestStrings.`1`]
    
    inline def `2`: typings.typeFest.typeFestStrings.`2` = "2".asInstanceOf[typings.typeFest.typeFestStrings.`2`]
    
    inline def `3`: typings.typeFest.typeFestStrings.`3` = "3".asInstanceOf[typings.typeFest.typeFestStrings.`3`]
    
    inline def `4`: typings.typeFest.typeFestStrings.`4` = "4".asInstanceOf[typings.typeFest.typeFestStrings.`4`]
    
    inline def `5`: typings.typeFest.typeFestStrings.`5` = "5".asInstanceOf[typings.typeFest.typeFestStrings.`5`]
    
    inline def `6`: typings.typeFest.typeFestStrings.`6` = "6".asInstanceOf[typings.typeFest.typeFestStrings.`6`]
    
    inline def `7`: typings.typeFest.typeFestStrings.`7` = "7".asInstanceOf[typings.typeFest.typeFestStrings.`7`]
    
    inline def `8`: typings.typeFest.typeFestStrings.`8` = "8".asInstanceOf[typings.typeFest.typeFestStrings.`8`]
    
    inline def `9`: typings.typeFest.typeFestStrings.`9` = "9".asInstanceOf[typings.typeFest.typeFestStrings.`9`]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    type-fest.type-fest/source/internal.BuildTuple<A, []> extends [...infer U, ...type-fest.type-fest/source/internal.BuildTuple<B, []>] ? type-fest.type-fest/source/internal.TupleLength<U> : never
    }}}
    */
  @js.native
  trait Subtract[A /* <: Double */, B /* <: Double */] extends StObject
  
  /**
  Infer the length of the given array `<T>`.
  @link https://itnext.io/implementing-arithmetic-within-typescripts-type-system-a1ef140a6f6f
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends { readonly length :infer L} ? L : never
    }}}
    */
  @js.native
  trait TupleLength[T /* <: js.Array[Any] */] extends StObject
  
  type UnknownArrayOrTuple = Array[Any]
  
  type UnknownRecord = Record[PropertyKey, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeFest.typeFestStrings.A
    - typings.typeFest.typeFestStrings.B
    - typings.typeFest.typeFestStrings.C
    - typings.typeFest.typeFestStrings.D
    - typings.typeFest.typeFestStrings.E
    - typings.typeFest.typeFestStrings.F
    - typings.typeFest.typeFestStrings.G
    - typings.typeFest.typeFestStrings.H
    - typings.typeFest.typeFestStrings.I
    - typings.typeFest.typeFestStrings.J
    - typings.typeFest.typeFestStrings.K
    - typings.typeFest.typeFestStrings.L
    - typings.typeFest.typeFestStrings.M
    - typings.typeFest.typeFestStrings.N
    - typings.typeFest.typeFestStrings.O
    - typings.typeFest.typeFestStrings.P
    - typings.typeFest.typeFestStrings.Q
    - typings.typeFest.typeFestStrings.R
    - typings.typeFest.typeFestStrings.S
    - typings.typeFest.typeFestStrings.T
    - typings.typeFest.typeFestStrings.U
    - typings.typeFest.typeFestStrings.V
    - typings.typeFest.typeFestStrings.W
    - typings.typeFest.typeFestStrings.X
    - typings.typeFest.typeFestStrings.Y
    - typings.typeFest.typeFestStrings.Z
  */
  trait UpperCaseCharacters extends StObject
  object UpperCaseCharacters {
    
    inline def A: typings.typeFest.typeFestStrings.A = "A".asInstanceOf[typings.typeFest.typeFestStrings.A]
    
    inline def B: typings.typeFest.typeFestStrings.B = "B".asInstanceOf[typings.typeFest.typeFestStrings.B]
    
    inline def C: typings.typeFest.typeFestStrings.C = "C".asInstanceOf[typings.typeFest.typeFestStrings.C]
    
    inline def D: typings.typeFest.typeFestStrings.D = "D".asInstanceOf[typings.typeFest.typeFestStrings.D]
    
    inline def E: typings.typeFest.typeFestStrings.E = "E".asInstanceOf[typings.typeFest.typeFestStrings.E]
    
    inline def F: typings.typeFest.typeFestStrings.F = "F".asInstanceOf[typings.typeFest.typeFestStrings.F]
    
    inline def G: typings.typeFest.typeFestStrings.G = "G".asInstanceOf[typings.typeFest.typeFestStrings.G]
    
    inline def H: typings.typeFest.typeFestStrings.H = "H".asInstanceOf[typings.typeFest.typeFestStrings.H]
    
    inline def I: typings.typeFest.typeFestStrings.I = "I".asInstanceOf[typings.typeFest.typeFestStrings.I]
    
    inline def J: typings.typeFest.typeFestStrings.J = "J".asInstanceOf[typings.typeFest.typeFestStrings.J]
    
    inline def K: typings.typeFest.typeFestStrings.K = "K".asInstanceOf[typings.typeFest.typeFestStrings.K]
    
    inline def L: typings.typeFest.typeFestStrings.L = "L".asInstanceOf[typings.typeFest.typeFestStrings.L]
    
    inline def M: typings.typeFest.typeFestStrings.M = "M".asInstanceOf[typings.typeFest.typeFestStrings.M]
    
    inline def N: typings.typeFest.typeFestStrings.N = "N".asInstanceOf[typings.typeFest.typeFestStrings.N]
    
    inline def O: typings.typeFest.typeFestStrings.O = "O".asInstanceOf[typings.typeFest.typeFestStrings.O]
    
    inline def P: typings.typeFest.typeFestStrings.P = "P".asInstanceOf[typings.typeFest.typeFestStrings.P]
    
    inline def Q: typings.typeFest.typeFestStrings.Q = "Q".asInstanceOf[typings.typeFest.typeFestStrings.Q]
    
    inline def R: typings.typeFest.typeFestStrings.R = "R".asInstanceOf[typings.typeFest.typeFestStrings.R]
    
    inline def S: typings.typeFest.typeFestStrings.S = "S".asInstanceOf[typings.typeFest.typeFestStrings.S]
    
    inline def T: typings.typeFest.typeFestStrings.T = "T".asInstanceOf[typings.typeFest.typeFestStrings.T]
    
    inline def U: typings.typeFest.typeFestStrings.U = "U".asInstanceOf[typings.typeFest.typeFestStrings.U]
    
    inline def V: typings.typeFest.typeFestStrings.V = "V".asInstanceOf[typings.typeFest.typeFestStrings.V]
    
    inline def W: typings.typeFest.typeFestStrings.W = "W".asInstanceOf[typings.typeFest.typeFestStrings.W]
    
    inline def X: typings.typeFest.typeFestStrings.X = "X".asInstanceOf[typings.typeFest.typeFestStrings.X]
    
    inline def Y: typings.typeFest.typeFestStrings.Y = "Y".asInstanceOf[typings.typeFest.typeFestStrings.Y]
    
    inline def Z: typings.typeFest.typeFestStrings.Z = "Z".asInstanceOf[typings.typeFest.typeFestStrings.Z]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeFest.typeFestStrings.`-_`
    - typings.typeFest.typeFestStrings._underscore
    - typings.typeFest.typeFestStrings.Space
  */
  trait WordSeparators extends StObject
  object WordSeparators {
    
    inline def Space: typings.typeFest.typeFestStrings.Space = (" ").asInstanceOf[typings.typeFest.typeFestStrings.Space]
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
    
    inline def _underscore: typings.typeFest.typeFestStrings._underscore = "_".asInstanceOf[typings.typeFest.typeFestStrings._underscore]
  }
}
