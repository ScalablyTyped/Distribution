package typings.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends typedoc.typedoc/dist/lib/utils/options/declaration.MapDeclarationOption<infer U> ? U : T extends typedoc.typedoc/dist/lib/utils/options/declaration.FlagsDeclarationOption<infer U> ? U : typedoc.typedoc/dist/lib/utils/options/declaration.ParameterTypeToOptionTypeMap[std.Exclude<T['type'], undefined>]
  }}}
  */
@js.native
trait DeclarationOptionToOptionType[T /* <: DeclarationOption */] extends StObject
