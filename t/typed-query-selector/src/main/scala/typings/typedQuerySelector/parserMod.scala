package typings.typedQuerySelector

import typings.typedQuerySelector.strictMod.global.Element
import typings.typedQuerySelector.typedQuerySelectorStrings.Quotationmark
import typings.typedQuerySelector.typedQuerySelectorStrings._empty
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
  
  /** Parse `:is()` and `:where()` */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    I extends / * template literal string: ${inferL}:${inferPseudo}(${inferArgs})${inferR} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pseudo * / any extends 'is' | 'where' ? typed-query-selector.typed-query-selector/parser.ExpandFunctions</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args * / any, [...LeftParts, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify L * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : typed-query-selector.typed-query-selector/parser.ExpandFunctions</ * template literal string: ${L}${R} * / string, Seen, LeftParts, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : typed-query-selector.typed-query-selector/parser.Join<typed-query-selector.typed-query-selector/parser.Expander<typed-query-selector.typed-query-selector/parser.Split<Seen>, typed-query-selector.typed-query-selector/parser.Join<LeftParts>, Right>> extends / * template literal string: ${inferS}, * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify S * / any : I
    }}}
    */
  type ExpandFunctions[I, Seen, LeftParts /* <: js.Array[String] */, Right /* <: String */] = I
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Args extends [] ? [] : Args extends [infer Head, ...infer Rest] ? [/ * template literal string: ${PostprocessEach<L>}${Head}${R}, * / string, ...typed-query-selector.typed-query-selector/parser.Expander<Rest, L, R>] : never
    }}}
    */
  type Expander[Args, L /* <: String */, R /* <: String */] = js.Array[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    I extends / * template literal string: ${string}${Combinators}${inferRight} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Right * / any extends '' ? unknown : typed-query-selector.typed-query-selector/parser.GetLastTag</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Right * / any> : I
    }}}
    */
  type GetLastTag[I] = I
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Seq extends [] ? '' : Seq extends [infer Head, ...infer Rest] ? / * template literal string: ${Head}${Join<Rest>} * / string : never
    }}}
    */
  type Join[Seq] = _empty
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    typed-query-selector.typed-query-selector/parser.ParseSelectorToTagNames<I> extends infer TagNames ? TagNames extends [] ? typed-query-selector.typed-query-selector/parser.TagNameToElement<'', Fallback> : TagNames extends std.Array<string> ? typed-query-selector.typed-query-selector/parser.TagNameToElement<TagNames[number], Fallback> : Fallback : never
    }}}
    */
  type ParseSelector[I /* <: String */, Fallback /* <: Element */] = Fallback
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    typed-query-selector.typed-query-selector/parser.Trim<I> extends infer I ? I extends '' ? unknown : typed-query-selector.typed-query-selector/parser.Split<typed-query-selector.typed-query-selector/parser.ExpandFunctions<typed-query-selector.typed-query-selector/parser.Preprocess<typed-query-selector.typed-query-selector/parser.PreprocessGrouping<I>>, '', [], ''>> extends infer PreprocessedTagNames ? PreprocessedTagNames extends std.Array<string> ? typed-query-selector.typed-query-selector/parser.Postprocess<PreprocessedTagNames, []> : unknown : never : never
    }}}
    */
  @js.native
  trait ParseSelectorToTagNames[I /* <: String */] extends StObject
  
  /** Check whether each tag is valid or not. */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Tags extends [] ? R : Tags extends [infer H, ...infer Rest] ? typed-query-selector.typed-query-selector/parser.PostprocessEach<typed-query-selector.typed-query-selector/parser.GetLastTag<H>> extends infer T ? T extends string ? Rest extends std.Array<string> ? typed-query-selector.typed-query-selector/parser.Postprocess<Rest, [...R, T]> : never : unknown : never : Tags
    }}}
    */
  type Postprocess[Tags /* <: js.Array[String] */, R /* <: js.Array[String] */] = R
  
  /** Postprocess each tag with simple validation. */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    I extends / * template literal string: ${inferTag}.${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any extends '' ? unknown : typed-query-selector.typed-query-selector/parser.PostprocessEach</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tag * / any> : I extends / * template literal string: ${inferTag}#${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any extends '' ? unknown : typed-query-selector.typed-query-selector/parser.PostprocessEach</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tag * / any> : I extends / * template literal string: ${inferTag}:${PseudoClassesFirstChar}${string} * / string ? typed-query-selector.typed-query-selector/parser.PostprocessEach</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tag * / any> : I extends / * template literal string: ${string}|${inferR} * / string ? typed-query-selector.typed-query-selector/parser.PostprocessEach</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : I
    }}}
    */
  @js.native
  trait PostprocessEach[I] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    I extends / * template literal string: ${inferL}\\${Quotes}${inferR} * / string ? typed-query-selector.typed-query-selector/parser.Preprocess</ * template literal string: ${L}${R} * / string> : I extends / * template literal string: ${inferL}"${string}"${inferR} * / string ? typed-query-selector.typed-query-selector/parser.Preprocess</ * template literal string: ${L}${R} * / string> : I extends / * template literal string: ${inferL}'${string}'${inferR} * / string ? typed-query-selector.typed-query-selector/parser.Preprocess</ * template literal string: ${L}${R} * / string> : I extends / * template literal string: ${string}[]${string} * / string ? unknown : I extends / * template literal string: ${inferL}[${string}]${inferR} * / string ? typed-query-selector.typed-query-selector/parser.Preprocess</ * template literal string: ${L}#x${R} * / string> : I
    }}}
    */
  @js.native
  trait Preprocess[I] extends StObject
  
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
    S extends / * template literal string: ${string}, * / string ? unknown : S extends '' ? [] : S extends / * template literal string: ${inferLeft},${inferRight} * / string ? [/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Left * / any, ...typed-query-selector.typed-query-selector/parser.Split</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Right * / any>] : [S]
    }}}
    */
  type Split[S] = js.Array[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Tag extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' ? std.HTMLElementTagNameMap[Tag] : Tag extends 'a' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'script' | 'set' | 'stop' | 'style' | 'svg' | 'switch' | 'symbol' | 'text' | 'textPath' | 'title' | 'tspan' | 'use' | 'view' ? std.SVGElementTagNameMap[Tag] : Fallback
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
}
