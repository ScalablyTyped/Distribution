package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  T extends std.Array<string> ? {[ K in string ]:? (args : ...any): any} : T extends @vue/runtime-core.@vue/runtime-core.ObjectEmitsOptions ? {[ K in string ]:? K extends / * template literal string: on${inferC} * / string? T[std.Uncapitalize</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify C * / any>] extends null? (args : ...any): any : (args : T[std.Uncapitalize</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify C * / any>] extends (args : infer P): any? P : never): any : never} : {}
  }}}
  */
@js.native
trait EmitsToProps[T /* <: EmitsOptions */] extends StObject
