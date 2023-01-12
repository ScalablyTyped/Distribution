package typings.typedQuerySelector

import typings.std.Uppercase
import typings.typedQuerySelector.typedQuerySelectorBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictMod {
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedQuerySelector.strictMod.IdentifierFirstChar
    - typings.typedQuerySelector.strictMod.Digit
  */
  type IdentifierChar = _IdentifierChar | Uppercase[LowerCaseLetter]
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedQuerySelector.strictMod.LowerCaseLetter
    - typings.std.Uppercase[typings.typedQuerySelector.strictMod.LowerCaseLetter]
    - typings.typedQuerySelector.typedQuerySelectorStrings.`-_`
    - typings.typedQuerySelector.typedQuerySelectorStrings._underscore
  */
  type IdentifierFirstChar = _IdentifierFirstChar | Uppercase[LowerCaseLetter]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferH}${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H * / any extends typed-query-selector.typed-query-selector/strict.IdentifierChar ? typed-query-selector.typed-query-selector/strict.IsValidRestChars</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : false : true
    }}}
    */
  type IsValidRestChars[S /* <: String */] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferH}${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H * / any extends typed-query-selector.typed-query-selector/strict.IdentifierFirstChar ? typed-query-selector.typed-query-selector/strict.IsValidRestChars</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : false : false
    }}}
    */
  type IsValidTagName[S] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends [infer H, ...infer Rest] ? H extends '' | '*' ? typed-query-selector.typed-query-selector/strict.IsValidTags<Rest> : typed-query-selector.typed-query-selector/strict.IsValidTagName<H> extends true ? typed-query-selector.typed-query-selector/strict.IsValidTags<Rest> : false : true
    }}}
    */
  type IsValidTags[S] = `true`
  
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
  
  // no characters left, so it's OK
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    typed-query-selector.typed-query-selector/parser.ParseSelectorToTagNames<S> extends infer Tags ? Tags extends [] ? typed-query-selector.typed-query-selector/parser.TagNameToElement<'', typed-query-selector.typed-query-selector/strict.<global>.Element> : Tags extends std.Array<string> ? typed-query-selector.typed-query-selector/strict.IsValidTags<Tags> extends true ? typed-query-selector.typed-query-selector/parser.TagNameToElement<Tags[number], typed-query-selector.typed-query-selector/strict.<global>.Element> : never : never : never
    }}}
    */
  @js.native
  trait Parse[S /* <: String */] extends StObject
  
  trait _IdentifierChar extends StObject
  
  trait _IdentifierFirstChar
    extends StObject
       with _IdentifierChar
  
  object global {
    
    trait Element extends StObject {
      
      def closest[S /* <: String */, E /* <: Parse[S] */](selector: S): /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
    }
    object Element {
      
      inline def apply(
        closest: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
      ): Element = {
        val __obj = js.Dynamic.literal(closest = js.Any.fromFunction1(closest))
        __obj.asInstanceOf[Element]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
        
        inline def setClosest(
          value: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
        ): Self = StObject.set(x, "closest", js.Any.fromFunction1(value))
      }
    }
    
    trait ParentNode extends StObject {
      
      def querySelector[S /* <: String */, E /* <: Parse[S] */](selector: S): /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
      
      def querySelectorAll[S /* <: String */, E /* <: Parse[S] */](selector: S): /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : std.NodeListOf<E> */ js.Any
    }
    object ParentNode {
      
      inline def apply(
        querySelector: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any,
        querySelectorAll: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : std.NodeListOf<E> */ js.Any
      ): ParentNode = {
        val __obj = js.Dynamic.literal(querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll))
        __obj.asInstanceOf[ParentNode]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ParentNode] (val x: Self) extends AnyVal {
        
        inline def setQuerySelector(
          value: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
        ): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
        
        inline def setQuerySelectorAll(
          value: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : std.NodeListOf<E> */ js.Any
        ): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction1(value))
      }
    }
  }
}
