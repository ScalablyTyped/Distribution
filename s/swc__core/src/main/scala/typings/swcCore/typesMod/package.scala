package typings.swcCore.typesMod

import typings.swcCore.anon.Comments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ParseOptions = ParserConfig & Comments

type Plugin = js.Function1[/* module */ Program, Program]

type Swcrc = Config | js.Array[Config]

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.swcCoreInts.`5`
  - typings.swcCore.swcCoreInts.`2015`
  - typings.swcCore.swcCoreInts.`2016`
  - java.lang.String
  - scala.Double
*/
type TerserEcmaVersion = _TerserEcmaVersion | String | Double

/**
  * @example ToSnakeCase<'indentLevel'> == 'indent_level'
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends / * template literal string: ${inferA}${inferB} * / string ? / * template literal string: ${AextendsLowercase<A>?A:_${Lowercase<A>}}${ToSnakeCase<B>} * / string : T
  }}}
  */
type ToSnakeCase[T /* <: String */] = T
