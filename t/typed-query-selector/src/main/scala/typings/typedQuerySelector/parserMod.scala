package typings.typedQuerySelector

import typings.typedQuerySelector.strictMod.global.Element
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
  type ExpandFunctions[I, Seen, LeftParts /* <: js.Array[String] */, Right /* <: String */] = I | Any
  
  type Expander[Args, L /* <: String */, R /* <: String */] = /* import warning: importer.ImportType#apply c repeated non-array type: any */ js.Array[Any]
  
  type GetLastTag[I] = I | Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedQuerySelector.typedQuerySelectorStrings.DollarLeftcurlybracketHeadRightcurlybracketDollarLeftcurlybracketJoinLessthansignRestGreaterthansignRightcurlybracket
    - typings.typedQuerySelector.typedQuerySelectorStrings._empty
  */
  trait Join[Seq] extends StObject
  
  type ParseSelector[I /* <: String */, Fallback /* <: Element */] = Fallback | (TagNameToElement[
    _empty | (/* import warning: importer.ImportType#apply Failed type conversion: any[number] */ js.Any), 
    Fallback
  ])
  
  type ParseSelectorToTagNames[I /* <: String */] = Any | (Postprocess[Any, js.Array[Any]])
  
  /** Check whether each tag is valid or not. */
  type Postprocess[Tags /* <: js.Array[String] */, R /* <: js.Array[String] */] = Tags | Any | R
  
  /** Postprocess each tag with simple validation. */
  type PostprocessEach[I] = I | Any
  
  type Preprocess[I] = I | Any
  
  // DO NOT use union type like `${infer L},${Whitespace}${infer R}` here,
  // or it may cause OOM when running tsc in downstream projects.
  type PreprocessGrouping[I] = I
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedQuerySelector.typedQuerySelectorStrings.Quotationmark
    - typings.typedQuerySelector.typedQuerySelectorStrings.Apostrophe
  */
  trait Quotes extends StObject
  object Quotes {
    
    inline def Apostrophe: typings.typedQuerySelector.typedQuerySelectorStrings.Apostrophe = "'".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.Apostrophe]
    
    inline def Quotationmark: typings.typedQuerySelector.typedQuerySelectorStrings.Quotationmark = "\"".asInstanceOf[typings.typedQuerySelector.typedQuerySelectorStrings.Quotationmark]
  }
  
  type Split[S] = (js.Array[Any | S]) | Any
  
  type TagNameToElement[Tag /* <: String */, Fallback /* <: Element */] = Fallback | (/* import warning: importer.ImportType#apply Failed type conversion: std.SVGElementTagNameMap[Tag] */ js.Any)
  
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
