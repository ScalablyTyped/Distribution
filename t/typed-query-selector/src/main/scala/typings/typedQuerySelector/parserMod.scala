package typings.typedQuerySelector

import typings.std.Uppercase
import typings.typedQuerySelector.strictMod.global.Element
import typings.typedQuerySelector.typedQuerySelectorBooleans.`true`
import typings.typedQuerySelector.typedQuerySelectorStrings.Quotationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedQuerySelector.typedQuerySelectorStrings.Space
    - typings.typedQuerySelector.typedQuerySelectorStrings.Greaterthansign
    - typings.typedQuerySelector.typedQuerySelectorStrings.Tilde
    - typings.typedQuerySelector.typedQuerySelectorStrings.Plussign
  */
  trait Combinators extends StObject
  object Combinators {
    
    inline def Greaterthansign: typings.typedQuerySelector.typedQuerySelectorStrings.Greaterthansign = ">".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.Greaterthansign]
    
    inline def Plussign: typings.typedQuerySelector.typedQuerySelectorStrings.Plussign = "+".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.Plussign]
    
    inline def Space: typings.typedQuerySelector.typedQuerySelectorStrings.Space = (" ").asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.Space]
    
    inline def Tilde: typings.typedQuerySelector.typedQuerySelectorStrings.Tilde = "~".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.Tilde]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedQuerySelector.typedQuerySelectorStrings.`0`
    - typings.typedQuerySelector.typedQuerySelectorStrings.`1`
    - typings.typedQuerySelector.typedQuerySelectorStrings.`2`
    - typings.typedQuerySelector.typedQuerySelectorStrings.`3`
    - typings.typedQuerySelector.typedQuerySelectorStrings.`4`
    - typings.typedQuerySelector.typedQuerySelectorStrings.`5`
    - typings.typedQuerySelector.typedQuerySelectorStrings.`6`
    - typings.typedQuerySelector.typedQuerySelectorStrings.`7`
    - typings.typedQuerySelector.typedQuerySelectorStrings.`8`
    - typings.typedQuerySelector.typedQuerySelectorStrings.`9`
  */
  trait Digit
    extends StObject
       with _IdentifierChar
  object Digit {
    
    inline def `0`: typings.typedQuerySelector.typedQuerySelectorStrings.`0` = "0".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.`0`]
    
    inline def `1`: typings.typedQuerySelector.typedQuerySelectorStrings.`1` = "1".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.`1`]
    
    inline def `2`: typings.typedQuerySelector.typedQuerySelectorStrings.`2` = "2".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.`2`]
    
    inline def `3`: typings.typedQuerySelector.typedQuerySelectorStrings.`3` = "3".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.`3`]
    
    inline def `4`: typings.typedQuerySelector.typedQuerySelectorStrings.`4` = "4".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.`4`]
    
    inline def `5`: typings.typedQuerySelector.typedQuerySelectorStrings.`5` = "5".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.`5`]
    
    inline def `6`: typings.typedQuerySelector.typedQuerySelectorStrings.`6` = "6".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.`6`]
    
    inline def `7`: typings.typedQuerySelector.typedQuerySelectorStrings.`7` = "7".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.`7`]
    
    inline def `8`: typings.typedQuerySelector.typedQuerySelectorStrings.`8` = "8".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.`8`]
    
    inline def `9`: typings.typedQuerySelector.typedQuerySelectorStrings.`9` = "9".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.`9`]
  }
  
  /**
    * Wrapper for `...&...` syntax expander.
    *
    * `&` is valid, but the expander will return the default result which is `unknown`,
    * so we must check the result and if it's `unknown` we will turn it into `Fallback`.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    unknown extends typed-query-selector.typed-query-selector/parser.ExpandAndInner<I, Fallback, unknown> ? Fallback : typed-query-selector.typed-query-selector/parser.ExpandAndInner<I, Fallback, unknown>
    }}}
    */
  type ExpandAnd[I /* <: String */, Fallback /* <: Element */] = Fallback
  
  /**
    * Actually expand the `...&...` syntax.
    *
    * The reason why we choose `unknown` as initial type is
    * that `unknown & T` equals to `T`.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    I extends / * template literal string: ${|*}&${inferRest} * / string ? typed-query-selector.typed-query-selector/parser.ExpandAndInner</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any, Fallback, Result> : I extends / * template literal string: ${inferTag}&${inferRest} * / string ? typed-query-selector.typed-query-selector/parser.ExpandAndInner</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any, Fallback, Result & typed-query-selector.typed-query-selector/parser.TagNameToElement</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tag * / any, Fallback>> : I extends '' | '*' ? Result : typed-query-selector.typed-query-selector/parser.ExpandAndInner<'', Fallback, Result & typed-query-selector.typed-query-selector/parser.TagNameToElement<I, Fallback>>
    }}}
    */
  type ExpandAndInner[I /* <: String */, Fallback /* <: Element */, Result /* <: Element | Any */] = Result
  
  /** Parse `:is()` and `:where()` */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    I extends / * template literal string: ${inferL}:is(${inferArgs})${inferR} * / string ? typed-query-selector.typed-query-selector/parser.ExpandFunctions</ * template literal string: ${L}&${Split<Trim<Args>>}${R} * / string> : I extends / * template literal string: ${inferL}:where(${inferArgs})${inferR} * / string ? typed-query-selector.typed-query-selector/parser.ExpandFunctions</ * template literal string: ${L}&${Split<Trim<Args>>}${R} * / string> : I extends / * template literal string: ${inferL}:${inferPseudo}(${string})${inferR} * / string ? typed-query-selector.typed-query-selector/parser.IsIdentifier</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pseudo * / any> extends true ? typed-query-selector.typed-query-selector/parser.ExpandFunctions</ * template literal string: ${L}${R} * / string> : I : I
    }}}
    */
  type ExpandFunctions[I] = I
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    I extends / * template literal string: ${string}${Combinators}${inferRight} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Right * / any extends '' ? unknown : typed-query-selector.typed-query-selector/parser.GetLastTag</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Right * / any> : I
    }}}
    */
  type GetLastTag[I] = I
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedQuerySelector.parserMod.IdentifierFirstChar
    - typings.typedQuerySelector.parserMod.Digit
  */
  type IdentifierChar = _IdentifierChar | Uppercase[LowerCaseLetter]
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedQuerySelector.parserMod.LowerCaseLetter
    - typings.std.Uppercase[typings.typedQuerySelector.parserMod.LowerCaseLetter]
    - typings.typedQuerySelector.typedQuerySelectorStrings.`-_`
    - typings.typedQuerySelector.typedQuerySelectorStrings._underscore
  */
  type IdentifierFirstChar = _IdentifierFirstChar | Uppercase[LowerCaseLetter]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferFirstChar}${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstChar * / any extends typed-query-selector.typed-query-selector/parser.IdentifierFirstChar ? typed-query-selector.typed-query-selector/parser.IsValidRestChars</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : false : false
    }}}
    */
  type IsIdentifier[S] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferH}${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H * / any extends typed-query-selector.typed-query-selector/parser.IdentifierChar ? typed-query-selector.typed-query-selector/parser.IsValidRestChars</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : false : true
    }}}
    */
  type IsValidRestChars[S /* <: String */] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends '' | '*' ? true : S extends / * template literal string: ${inferH}${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H * / any extends typed-query-selector.typed-query-selector/parser.IdentifierFirstChar ? typed-query-selector.typed-query-selector/parser.IsValidRestChars</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : false : string extends S ? true : false
    }}}
    */
  type IsValidTagName[S] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferHead}&${inferRest} * / string ? typed-query-selector.typed-query-selector/parser.IsValidTagName</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Head * / any> extends true ? typed-query-selector.typed-query-selector/parser.IsValidTags</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : false : typed-query-selector.typed-query-selector/parser.IsValidTagName<S>
    }}}
    */
  type IsValidTags[S] = IsValidTagName[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest */ Any
  ]
  
  // --------------------------------------------------------
  // Strict Parser
  // --------------------------------------------------------
  // Specification is here: https://drafts.csswg.org/css-syntax-3/#ident-token-diagram
  // but we don't plan to comply that fully,
  // otherwise it will increase type-checking time and the complexity of parser.
  /* Rewritten from type alias, can be one of: 
    - typings.typedQuerySelector.typedQuerySelectorStrings.a
    - typings.typedQuerySelector.typedQuerySelectorStrings.b
    - typings.typedQuerySelector.typedQuerySelectorStrings.c
    - typings.typedQuerySelector.typedQuerySelectorStrings.d
    - typings.typedQuerySelector.typedQuerySelectorStrings.e
    - typings.typedQuerySelector.typedQuerySelectorStrings.f
    - typings.typedQuerySelector.typedQuerySelectorStrings.g
    - typings.typedQuerySelector.typedQuerySelectorStrings.h
    - typings.typedQuerySelector.typedQuerySelectorStrings.i
    - typings.typedQuerySelector.typedQuerySelectorStrings.j
    - typings.typedQuerySelector.typedQuerySelectorStrings.k
    - typings.typedQuerySelector.typedQuerySelectorStrings.l
    - typings.typedQuerySelector.typedQuerySelectorStrings.m
    - typings.typedQuerySelector.typedQuerySelectorStrings.n
    - typings.typedQuerySelector.typedQuerySelectorStrings.o
    - typings.typedQuerySelector.typedQuerySelectorStrings.p
    - typings.typedQuerySelector.typedQuerySelectorStrings.q
    - typings.typedQuerySelector.typedQuerySelectorStrings.r
    - typings.typedQuerySelector.typedQuerySelectorStrings.s
    - typings.typedQuerySelector.typedQuerySelectorStrings.t
    - typings.typedQuerySelector.typedQuerySelectorStrings.u
    - typings.typedQuerySelector.typedQuerySelectorStrings.v
    - typings.typedQuerySelector.typedQuerySelectorStrings.w
    - typings.typedQuerySelector.typedQuerySelectorStrings.x
    - typings.typedQuerySelector.typedQuerySelectorStrings.y
    - typings.typedQuerySelector.typedQuerySelectorStrings.z
  */
  trait LowerCaseLetter
    extends StObject
       with _IdentifierFirstChar
  object LowerCaseLetter {
    
    inline def a: typings.typedQuerySelector.typedQuerySelectorStrings.a = "a".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.a]
    
    inline def b: typings.typedQuerySelector.typedQuerySelectorStrings.b = "b".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.b]
    
    inline def c: typings.typedQuerySelector.typedQuerySelectorStrings.c = "c".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.c]
    
    inline def d: typings.typedQuerySelector.typedQuerySelectorStrings.d = "d".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.d]
    
    inline def e: typings.typedQuerySelector.typedQuerySelectorStrings.e = "e".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.e]
    
    inline def f: typings.typedQuerySelector.typedQuerySelectorStrings.f = "f".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.f]
    
    inline def g: typings.typedQuerySelector.typedQuerySelectorStrings.g = "g".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.g]
    
    inline def h: typings.typedQuerySelector.typedQuerySelectorStrings.h = "h".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.h]
    
    inline def i: typings.typedQuerySelector.typedQuerySelectorStrings.i = "i".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.i]
    
    inline def j: typings.typedQuerySelector.typedQuerySelectorStrings.j = "j".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.j]
    
    inline def k: typings.typedQuerySelector.typedQuerySelectorStrings.k = "k".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.k]
    
    inline def l: typings.typedQuerySelector.typedQuerySelectorStrings.l = "l".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.l]
    
    inline def m: typings.typedQuerySelector.typedQuerySelectorStrings.m = "m".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.m]
    
    inline def n: typings.typedQuerySelector.typedQuerySelectorStrings.n = "n".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.n]
    
    inline def o: typings.typedQuerySelector.typedQuerySelectorStrings.o = "o".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.o]
    
    inline def p: typings.typedQuerySelector.typedQuerySelectorStrings.p = "p".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.p]
    
    inline def q: typings.typedQuerySelector.typedQuerySelectorStrings.q = "q".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.q]
    
    inline def r: typings.typedQuerySelector.typedQuerySelectorStrings.r = "r".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.r]
    
    inline def s: typings.typedQuerySelector.typedQuerySelectorStrings.s = "s".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.s]
    
    inline def t: typings.typedQuerySelector.typedQuerySelectorStrings.t = "t".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.t]
    
    inline def u: typings.typedQuerySelector.typedQuerySelectorStrings.u = "u".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.u]
    
    inline def v: typings.typedQuerySelector.typedQuerySelectorStrings.v = "v".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.v]
    
    inline def w: typings.typedQuerySelector.typedQuerySelectorStrings.w = "w".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.w]
    
    inline def x: typings.typedQuerySelector.typedQuerySelectorStrings.x = "x".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.x]
    
    inline def y: typings.typedQuerySelector.typedQuerySelectorStrings.y = "y".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.y]
    
    inline def z: typings.typedQuerySelector.typedQuerySelectorStrings.z = "z".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.z]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    typed-query-selector.typed-query-selector/parser.ParseSelectorToTagNames<I> extends string ? typed-query-selector.typed-query-selector/parser.ExpandAnd<typed-query-selector.typed-query-selector/parser.ParseSelectorToTagNames<I>, Fallback> : Fallback
    }}}
    */
  type ParseSelector[I /* <: String */, Fallback /* <: Element */] = Fallback
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    typed-query-selector.typed-query-selector/parser.Trim<I> extends '' ? unknown : typed-query-selector.typed-query-selector/parser.Postprocess<typed-query-selector.typed-query-selector/parser.Split<typed-query-selector.typed-query-selector/parser.ExpandFunctions<typed-query-selector.typed-query-selector/parser.Preprocess<typed-query-selector.typed-query-selector/parser.PreprocessGrouping<typed-query-selector.typed-query-selector/parser.Trim<I>>>>>>
    }}}
    */
  @js.native
  trait ParseSelectorToTagNames[I /* <: String */] extends StObject
  
  /** Check whether each tag is valid or not. */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    typed-query-selector.typed-query-selector/parser.PostprocessEach<typed-query-selector.typed-query-selector/parser.GetLastTag<Tags>> extends string ? typed-query-selector.typed-query-selector/parser.PostprocessEach<typed-query-selector.typed-query-selector/parser.GetLastTag<Tags>> : unknown
    }}}
    */
  type Postprocess[Tags] = PostprocessEachUnchecked[GetLastTag[Tags]]
  
  /** Postprocess each tag with simple validation. */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    I extends / * template literal string: ${string}. * / string ? unknown : I extends / * template literal string: ${string}# * / string ? unknown : typed-query-selector.typed-query-selector/parser.PostprocessEachUnchecked<I>
    }}}
    */
  type PostprocessEach[I] = PostprocessEachUnchecked[/* template literal string: ${Tag}&${Rest} */ String]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    I extends / * template literal string: ${inferTag}.${string}&${inferRest} * / string ? typed-query-selector.typed-query-selector/parser.PostprocessEachUnchecked</ * template literal string: ${Tag}&${Rest} * / string> : I extends / * template literal string: ${inferTag}.${string} * / string ? typed-query-selector.typed-query-selector/parser.PostprocessEachUnchecked</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tag * / any> : I extends / * template literal string: ${inferTag}#${string}&${inferRest} * / string ? typed-query-selector.typed-query-selector/parser.PostprocessEachUnchecked</ * template literal string: ${Tag}&${Rest} * / string> : I extends / * template literal string: ${inferTag}#${string} * / string ? typed-query-selector.typed-query-selector/parser.PostprocessEachUnchecked</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tag * / any> : I extends / * template literal string: ${inferTag}:${PseudoClassesFirstChar}${string}&${inferRest} * / string ? typed-query-selector.typed-query-selector/parser.PostprocessEachUnchecked</ * template literal string: ${Tag}&${Rest} * / string> : I extends / * template literal string: ${inferTag}:${PseudoClassesFirstChar}${string} * / string ? typed-query-selector.typed-query-selector/parser.PostprocessEachUnchecked</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tag * / any> : I extends / * template literal string: ${string}|${inferTag} * / string ? typed-query-selector.typed-query-selector/parser.PostprocessEachUnchecked</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tag * / any> : I
    }}}
    */
  @js.native
  trait PostprocessEachUnchecked[I] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    I extends / * template literal string: ${string}[]${string} * / string ? unknown : typed-query-selector.typed-query-selector/parser.PreprocessUnchecked<I>
    }}}
    */
  type Preprocess[I] = PreprocessUnchecked[/* template literal string: ${L}${R} */ String]
  
  // DO NOT use union type like `${infer L},${Whitespace}${infer R}` here,
  // or it may cause OOM when running tsc in downstream projects.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    I extends / * template literal string: ${inferL}, ${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessGrouping</ * template literal string: ${L},${R} * / string> : I extends / * template literal string: ${inferL},\n${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessGrouping</ * template literal string: ${L},${R} * / string> : I extends / * template literal string: ${inferL},\r${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessGrouping</ * template literal string: ${L},${R} * / string> : I extends / * template literal string: ${inferL},\f${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessGrouping</ * template literal string: ${L},${R} * / string> : I extends / * template literal string: ${inferL},\t${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessGrouping</ * template literal string: ${L},${R} * / string> : I
    }}}
    */
  @js.native
  trait PreprocessGrouping[I] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    I extends / * template literal string: ${inferL}\\${Quotes}${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessUnchecked</ * template literal string: ${L}${R} * / string> : I extends / * template literal string: ${inferL}"${string}"${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessUnchecked</ * template literal string: ${L}${R} * / string> : I extends / * template literal string: ${inferL}'${string}'${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessUnchecked</ * template literal string: ${L}${R} * / string> : I extends / * template literal string: ${inferL}[${string}]${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PreprocessUnchecked</ * template literal string: ${L}#x${R} * / string> : I
    }}}
    */
  @js.native
  trait PreprocessUnchecked[I] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedQuerySelector.typedQuerySelectorStrings.a
    - typings.typedQuerySelector.typedQuerySelectorStrings.b
    - typings.typedQuerySelector.typedQuerySelectorStrings.c
    - typings.typedQuerySelector.typedQuerySelectorStrings.d
    - typings.typedQuerySelector.typedQuerySelectorStrings.e
    - typings.typedQuerySelector.typedQuerySelectorStrings.f
    - typings.typedQuerySelector.typedQuerySelectorStrings.h
    - typings.typedQuerySelector.typedQuerySelectorStrings.i
    - typings.typedQuerySelector.typedQuerySelectorStrings.l
    - typings.typedQuerySelector.typedQuerySelectorStrings.n
    - typings.typedQuerySelector.typedQuerySelectorStrings.o
    - typings.typedQuerySelector.typedQuerySelectorStrings.p
    - typings.typedQuerySelector.typedQuerySelectorStrings.r
    - typings.typedQuerySelector.typedQuerySelectorStrings.s
    - typings.typedQuerySelector.typedQuerySelectorStrings.t
    - typings.typedQuerySelector.typedQuerySelectorStrings.u
    - typings.typedQuerySelector.typedQuerySelectorStrings.v
    - typings.typedQuerySelector.typedQuerySelectorStrings.w
  */
  trait PseudoClassesFirstChar extends StObject
  object PseudoClassesFirstChar {
    
    inline def a: typings.typedQuerySelector.typedQuerySelectorStrings.a = "a".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.a]
    
    inline def b: typings.typedQuerySelector.typedQuerySelectorStrings.b = "b".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.b]
    
    inline def c: typings.typedQuerySelector.typedQuerySelectorStrings.c = "c".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.c]
    
    inline def d: typings.typedQuerySelector.typedQuerySelectorStrings.d = "d".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.d]
    
    inline def e: typings.typedQuerySelector.typedQuerySelectorStrings.e = "e".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.e]
    
    inline def f: typings.typedQuerySelector.typedQuerySelectorStrings.f = "f".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.f]
    
    inline def h: typings.typedQuerySelector.typedQuerySelectorStrings.h = "h".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.h]
    
    inline def i: typings.typedQuerySelector.typedQuerySelectorStrings.i = "i".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.i]
    
    inline def l: typings.typedQuerySelector.typedQuerySelectorStrings.l = "l".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.l]
    
    inline def n: typings.typedQuerySelector.typedQuerySelectorStrings.n = "n".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.n]
    
    inline def o: typings.typedQuerySelector.typedQuerySelectorStrings.o = "o".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.o]
    
    inline def p: typings.typedQuerySelector.typedQuerySelectorStrings.p = "p".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.p]
    
    inline def r: typings.typedQuerySelector.typedQuerySelectorStrings.r = "r".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.r]
    
    inline def s: typings.typedQuerySelector.typedQuerySelectorStrings.s = "s".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.s]
    
    inline def t: typings.typedQuerySelector.typedQuerySelectorStrings.t = "t".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.t]
    
    inline def u: typings.typedQuerySelector.typedQuerySelectorStrings.u = "u".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.u]
    
    inline def v: typings.typedQuerySelector.typedQuerySelectorStrings.v = "v".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.v]
    
    inline def w: typings.typedQuerySelector.typedQuerySelectorStrings.w = "w".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.w]
  }
  
  object Quotes {
    
    inline def Apostrophe: /* ' */ String = "'".asInstanceOf[/* ' */ String]
    
    inline def Quotationmark: typings.typedQuerySelector.typedQuerySelectorStrings.Quotationmark = "\"".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.Quotationmark]
  }
  type Quotes = Quotationmark | (/* ' */ String)
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${string}, * / string ? unknown : typed-query-selector.typed-query-selector/parser.SplitRec<S, never>
    }}}
    */
  type Split[S] = SplitRec[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Right */ Any, 
    scala.Nothing | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Left */ Any)
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferLeft},${inferRight} * / string ? typed-query-selector.typed-query-selector/parser.SplitRec</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Right * / any, Acc | / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Left * / any> : S extends '' ? Acc : typed-query-selector.typed-query-selector/parser.SplitRec<'', Acc | S>
    }}}
    */
  type SplitRec[S, Acc] = Acc
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    string extends S ? Fallback : typed-query-selector.typed-query-selector/parser.ParseSelectorToTagNames<S> extends infer Tags ? typed-query-selector.typed-query-selector/parser.IsValidTags<Tags> extends true ? Tags extends string ? typed-query-selector.typed-query-selector/parser.ExpandAnd<Tags, Fallback> : never : never : never
    }}}
    */
  type StrictlyParseSelector[S /* <: String */, Fallback /* <: Element */] = Fallback
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Tag extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'search' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' ? std.HTMLElementTagNameMap[Tag] : Tag extends 'a' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'script' | 'set' | 'stop' | 'style' | 'svg' | 'switch' | 'symbol' | 'text' | 'textPath' | 'title' | 'tspan' | 'use' | 'view' ? std.SVGElementTagNameMap[Tag] : Fallback
    }}}
    */
  type TagNameToElement[Tag /* <: String */, Fallback /* <: Element */] = Fallback
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferT}${Whitespace} * / string ? typed-query-selector.typed-query-selector/parser.Trim</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify T * / any> : S extends / * template literal string: ${Whitespace}${inferT} * / string ? typed-query-selector.typed-query-selector/parser.Trim</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify T * / any> : S
    }}}
    */
  type Trim[S /* <: String */] = S
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedQuerySelector.typedQuerySelectorStrings.Space
    - typings.typedQuerySelector.typedQuerySelectorStrings.Linefeed
    - typings.typedQuerySelector.typedQuerySelectorStrings.Carriagereturn
    - typings.typedQuerySelector.typedQuerySelectorStrings.Formfeed
    - typings.typedQuerySelector.typedQuerySelectorStrings.Charactertabulation
  */
  trait Whitespace extends StObject
  object Whitespace {
    
    inline def Carriagereturn: typings.typedQuerySelector.typedQuerySelectorStrings.Carriagereturn = "\r".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.Carriagereturn]
    
    inline def Charactertabulation: typings.typedQuerySelector.typedQuerySelectorStrings.Charactertabulation = "\t".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.Charactertabulation]
    
    inline def Formfeed: typings.typedQuerySelector.typedQuerySelectorStrings.Formfeed = "\f".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.Formfeed]
    
    inline def Linefeed: typings.typedQuerySelector.typedQuerySelectorStrings.Linefeed = "\n".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.Linefeed]
    
    inline def Space: typings.typedQuerySelector.typedQuerySelectorStrings.Space = (" ").asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.Space]
  }
  
  trait _IdentifierChar extends StObject
  
  trait _IdentifierFirstChar
    extends StObject
       with _IdentifierChar
}
