package typings.swcCore.typesMod

import org.scalablytyped.runtime.TopLevel
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
type ToSnakeCase[T /* <: String */] = T | (/* template literal string: ${AextendsLowercase<A>?A:_${Lowercase<A>}}${ToSnakeCase<B>} */ String)

/**
  * @example ToSnakeCaseProperties<{indentLevel: 3}> == {indent_level: 3}
  */
type ToSnakeCaseProperties[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T as K extends string? @swc/core.@swc/core/types.ToSnakeCase<K> : K ]: T[K]}
  */ typings.swcCore.swcCoreStrings.ToSnakeCaseProperties & TopLevel[T]
