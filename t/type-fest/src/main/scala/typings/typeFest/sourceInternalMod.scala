package typings.typeFest

import typings.std.Exclude
import typings.std.PropertyKey
import typings.std.Record
import typings.typeFest.sourcePrimitiveMod.Primitive
import typings.typeFest.sourceSimplifyMod.Simplify
import typings.typeFest.typeFestBooleans.`false`
import typings.typeFest.typeFestBooleans.`true`
import typings.typeFest.typeFestStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceInternalMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends std.Array<unknown> ? T[0] : never
    }}}
    */
  @js.native
  trait ArrayElement[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    TArray extends [unknown, ...infer TTail] ? TTail : []
    }}}
    */
  type ArrayTail[TArray /* <: UnknownArrayOrTuple */] = js.Array[Any]
  
  // Returns `never` if the key or property is not jsonable without testing whether the property is required or optional otherwise return the key.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Key extends symbol ? never : Type[Key] extends symbol ? never : [(arguments_ : ...any): any] extends [Type[Key]] ? never : Key
    }}}
    */
  type BaseKeyFilter[Type, Key /* <: /* keyof Type */ String */] = Key
  
  /**
  Create a tuple type of the given length `<L>`.
  @link https://itnext.io/implementing-arithmetic-within-typescripts-type-system-a1ef140a6f6f
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends { readonly length :L} ? T : type-fest.type-fest/source/internal.BuildTuple<L, [...T, unknown]>
    }}}
    */
  type BuildTuple[L /* <: Double */, T /* <: js.Array[Any] */] = T
  
  type BuiltIns = Primitive | js.Date | js.RegExp
  
  /**
  Returns the required keys.
  */
  type FilterDefinedKeys[T /* <: js.Object */] = Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: type-fest.type-fest/source/is-any.IsAny<T[Key]> extends true? Key : undefined extends T[Key]? never : T[Key] extends undefined? never : type-fest.type-fest/source/internal.BaseKeyFilter<T, Key>}[keyof T] */ js.Any, 
    Unit
  ]
  
  /**
  Returns the optional keys.
  */
  type FilterOptionalKeys[T /* <: js.Object */] = Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: type-fest.type-fest/source/is-any.IsAny<T[Key]> extends true? never : undefined extends T[Key]? T[Key] extends undefined? never : type-fest.type-fest/source/internal.BaseKeyFilter<T, Key> : never}[keyof T] */ js.Any, 
    Unit
  ]
  
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
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends {None (arguments : infer A): unknown, None (arguments : ...any): unknown} ? std.Array<unknown> extends A ? false : true : false
    }}}
    */
  type HasMultipleCallSignatures[T /* <: js.Function1[/* repeated */ Any, Any] */] = `false`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    FirstType extends BaseType ? SecondType extends BaseType ? true : false : false
    }}}
    */
  type IsBothExtends[BaseType, FirstType, SecondType] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Lowercase<T> ? true : false
    }}}
    */
  type IsLowerCase[T /* <: String */] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [false] ? false : true
    }}}
    */
  type IsNotFalse[T /* <: Boolean */] = `false`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [null] ? true : false
    }}}
    */
  type IsNull[T] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends / * template literal string: ${number} * / string ? type-fest.type-fest/source/trim.Trim<T> extends T ? true : false : false
    }}}
    */
  type IsNumeric[T /* <: String */] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Uppercase<T> ? true : false
    }}}
    */
  type IsUpperCase[T /* <: String */] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends type-fest.type-fest/source/internal.Whitespace ? true : T extends / * template literal string: ${Whitespace}${inferRest} * / string ? type-fest.type-fest/source/internal.IsWhitespace</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : false
    }}}
    */
  type IsWhitespace[T /* <: String */] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends T ? keyof T : never
    }}}
    */
  type KeysOfUnion[T] = /* keyof T */ String
  
  type NonEmptyTuple = Array[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    K extends keyof T ? T[K] : never
    }}}
    */
  @js.native
  trait ObjectValue[T, K] extends StObject
  
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
  
  type UndefinedToOptional[T /* <: js.Object */] = Simplify[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof std.Pick<T, type-fest.type-fest/source/internal.FilterDefinedKeys<T>> ]: T[Key]} */ js.Any
  ]
  
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
    - typings.typeFest.typeFestStrings.uLeftcurlybracket9Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracketARightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracketBRightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracketCRightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracketDRightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket20Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket85Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracketA0Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket1680Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2000Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2001Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2002Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2003Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2004Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2005Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2006Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2007Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2008Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2009Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket200ARightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2028Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2029Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket202FRightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket205FRightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket3000Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracketFEFFRightcurlybracket
  */
  trait Whitespace extends StObject
  object Whitespace {
    
    inline def uLeftcurlybracket1680Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket1680Rightcurlybracket = "u{1680}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket1680Rightcurlybracket]
    
    inline def uLeftcurlybracket2000Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2000Rightcurlybracket = "u{2000}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2000Rightcurlybracket]
    
    inline def uLeftcurlybracket2001Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2001Rightcurlybracket = "u{2001}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2001Rightcurlybracket]
    
    inline def uLeftcurlybracket2002Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2002Rightcurlybracket = "u{2002}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2002Rightcurlybracket]
    
    inline def uLeftcurlybracket2003Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2003Rightcurlybracket = "u{2003}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2003Rightcurlybracket]
    
    inline def uLeftcurlybracket2004Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2004Rightcurlybracket = "u{2004}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2004Rightcurlybracket]
    
    inline def uLeftcurlybracket2005Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2005Rightcurlybracket = "u{2005}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2005Rightcurlybracket]
    
    inline def uLeftcurlybracket2006Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2006Rightcurlybracket = "u{2006}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2006Rightcurlybracket]
    
    inline def uLeftcurlybracket2007Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2007Rightcurlybracket = "u{2007}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2007Rightcurlybracket]
    
    inline def uLeftcurlybracket2008Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2008Rightcurlybracket = "u{2008}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2008Rightcurlybracket]
    
    inline def uLeftcurlybracket2009Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2009Rightcurlybracket = "u{2009}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2009Rightcurlybracket]
    
    inline def uLeftcurlybracket200ARightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket200ARightcurlybracket = "u{200A}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket200ARightcurlybracket]
    
    inline def uLeftcurlybracket2028Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2028Rightcurlybracket = "u{2028}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2028Rightcurlybracket]
    
    inline def uLeftcurlybracket2029Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2029Rightcurlybracket = "u{2029}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2029Rightcurlybracket]
    
    inline def uLeftcurlybracket202FRightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket202FRightcurlybracket = "u{202F}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket202FRightcurlybracket]
    
    inline def uLeftcurlybracket205FRightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket205FRightcurlybracket = "u{205F}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket205FRightcurlybracket]
    
    inline def uLeftcurlybracket20Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket20Rightcurlybracket = "u{20}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket20Rightcurlybracket]
    
    inline def uLeftcurlybracket3000Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket3000Rightcurlybracket = "u{3000}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket3000Rightcurlybracket]
    
    inline def uLeftcurlybracket85Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket85Rightcurlybracket = "u{85}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket85Rightcurlybracket]
    
    inline def uLeftcurlybracket9Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket9Rightcurlybracket = "u{9}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket9Rightcurlybracket]
    
    inline def uLeftcurlybracketA0Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracketA0Rightcurlybracket = "u{A0}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracketA0Rightcurlybracket]
    
    inline def uLeftcurlybracketARightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracketARightcurlybracket = "u{A}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracketARightcurlybracket]
    
    inline def uLeftcurlybracketBRightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracketBRightcurlybracket = "u{B}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracketBRightcurlybracket]
    
    inline def uLeftcurlybracketCRightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracketCRightcurlybracket = "u{C}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracketCRightcurlybracket]
    
    inline def uLeftcurlybracketDRightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracketDRightcurlybracket = "u{D}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracketDRightcurlybracket]
    
    inline def uLeftcurlybracketFEFFRightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracketFEFFRightcurlybracket = "u{FEFF}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracketFEFFRightcurlybracket]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeFest.typeFestStrings.`-_`
    - typings.typeFest.typeFestStrings._underscore
    - typings.typeFest.typeFestStrings.uLeftcurlybracket9Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracketARightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracketBRightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracketCRightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracketDRightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket20Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket85Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracketA0Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket1680Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2000Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2001Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2002Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2003Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2004Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2005Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2006Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2007Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2008Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2009Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket200ARightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2028Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket2029Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket202FRightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket205FRightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracket3000Rightcurlybracket
    - typings.typeFest.typeFestStrings.uLeftcurlybracketFEFFRightcurlybracket
  */
  trait WordSeparators extends StObject
  object WordSeparators {
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
    
    inline def _underscore: typings.typeFest.typeFestStrings._underscore = "_".asInstanceOf[typings.typeFest.typeFestStrings._underscore]
    
    inline def uLeftcurlybracket1680Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket1680Rightcurlybracket = "u{1680}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket1680Rightcurlybracket]
    
    inline def uLeftcurlybracket2000Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2000Rightcurlybracket = "u{2000}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2000Rightcurlybracket]
    
    inline def uLeftcurlybracket2001Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2001Rightcurlybracket = "u{2001}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2001Rightcurlybracket]
    
    inline def uLeftcurlybracket2002Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2002Rightcurlybracket = "u{2002}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2002Rightcurlybracket]
    
    inline def uLeftcurlybracket2003Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2003Rightcurlybracket = "u{2003}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2003Rightcurlybracket]
    
    inline def uLeftcurlybracket2004Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2004Rightcurlybracket = "u{2004}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2004Rightcurlybracket]
    
    inline def uLeftcurlybracket2005Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2005Rightcurlybracket = "u{2005}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2005Rightcurlybracket]
    
    inline def uLeftcurlybracket2006Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2006Rightcurlybracket = "u{2006}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2006Rightcurlybracket]
    
    inline def uLeftcurlybracket2007Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2007Rightcurlybracket = "u{2007}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2007Rightcurlybracket]
    
    inline def uLeftcurlybracket2008Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2008Rightcurlybracket = "u{2008}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2008Rightcurlybracket]
    
    inline def uLeftcurlybracket2009Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2009Rightcurlybracket = "u{2009}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2009Rightcurlybracket]
    
    inline def uLeftcurlybracket200ARightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket200ARightcurlybracket = "u{200A}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket200ARightcurlybracket]
    
    inline def uLeftcurlybracket2028Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2028Rightcurlybracket = "u{2028}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2028Rightcurlybracket]
    
    inline def uLeftcurlybracket2029Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket2029Rightcurlybracket = "u{2029}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket2029Rightcurlybracket]
    
    inline def uLeftcurlybracket202FRightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket202FRightcurlybracket = "u{202F}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket202FRightcurlybracket]
    
    inline def uLeftcurlybracket205FRightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket205FRightcurlybracket = "u{205F}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket205FRightcurlybracket]
    
    inline def uLeftcurlybracket20Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket20Rightcurlybracket = "u{20}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket20Rightcurlybracket]
    
    inline def uLeftcurlybracket3000Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket3000Rightcurlybracket = "u{3000}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket3000Rightcurlybracket]
    
    inline def uLeftcurlybracket85Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket85Rightcurlybracket = "u{85}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket85Rightcurlybracket]
    
    inline def uLeftcurlybracket9Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracket9Rightcurlybracket = "u{9}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracket9Rightcurlybracket]
    
    inline def uLeftcurlybracketA0Rightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracketA0Rightcurlybracket = "u{A0}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracketA0Rightcurlybracket]
    
    inline def uLeftcurlybracketARightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracketARightcurlybracket = "u{A}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracketARightcurlybracket]
    
    inline def uLeftcurlybracketBRightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracketBRightcurlybracket = "u{B}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracketBRightcurlybracket]
    
    inline def uLeftcurlybracketCRightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracketCRightcurlybracket = "u{C}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracketCRightcurlybracket]
    
    inline def uLeftcurlybracketDRightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracketDRightcurlybracket = "u{D}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracketDRightcurlybracket]
    
    inline def uLeftcurlybracketFEFFRightcurlybracket: typings.typeFest.typeFestStrings.uLeftcurlybracketFEFFRightcurlybracket = "u{FEFF}".asInstanceOf[typings.typeFest.typeFestStrings.uLeftcurlybracketFEFFRightcurlybracket]
  }
}
