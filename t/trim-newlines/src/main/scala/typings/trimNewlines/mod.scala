package typings.trimNewlines

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("trim-newlines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def trimNewlines[S /* <: String */](string: S): Trim[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("trimNewlines")(string.asInstanceOf[js.Any]).asInstanceOf[Trim[S]]
  
  inline def trimNewlinesEnd[S /* <: String */](string: S): TrimEnd[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("trimNewlinesEnd")(string.asInstanceOf[js.Any]).asInstanceOf[TrimEnd[S]]
  
  inline def trimNewlinesStart[S /* <: String */](string: S): TrimStart[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("trimNewlinesStart")(string.asInstanceOf[js.Any]).asInstanceOf[TrimStart[S]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.trimNewlines.trimNewlinesStrings.uLeftcurlybracketARightcurlybracket
    - typings.trimNewlines.trimNewlinesStrings.uLeftcurlybracketDRightcurlybracket
  */
  trait Newline extends StObject
  object Newline {
    
    inline def uLeftcurlybracketARightcurlybracket: typings.trimNewlines.trimNewlinesStrings.uLeftcurlybracketARightcurlybracket = "u{A}".asInstanceOf[typings.trimNewlines.trimNewlinesStrings.uLeftcurlybracketARightcurlybracket]
    
    inline def uLeftcurlybracketDRightcurlybracket: typings.trimNewlines.trimNewlinesStrings.uLeftcurlybracketDRightcurlybracket = "u{D}".asInstanceOf[typings.trimNewlines.trimNewlinesStrings.uLeftcurlybracketDRightcurlybracket]
  }
  
  type Trim[S /* <: String */] = TrimStart[TrimEnd[S]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferR}${Newline} * / string ? trim-newlines.trim-newlines.TrimEnd</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : S
    }}}
    */
  type TrimEnd[S /* <: String */] = S
  
  // Source: https://github.com/sindresorhus/type-fest/blob/main/source/trim.d.ts
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${Newline}${inferR} * / string ? trim-newlines.trim-newlines.TrimStart</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : S
    }}}
    */
  type TrimStart[S /* <: String */] = S
}
