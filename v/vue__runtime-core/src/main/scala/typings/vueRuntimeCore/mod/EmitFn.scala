package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Options extends std.Array<infer V> ? (event : V, args : ...any): void : {} extends Options ? (event : string, args : ...any): void : @vue/shared.@vue/shared.UnionToIntersection<{[ key in Event ]: Options[key] extends (args : infer Args): any? (event : key, args : Args): void : (event : key, args : ...any): void}[Event]>
  }}}
  */
@js.native
trait EmitFn[Options, Event /* <: /* keyof Options */ String */] extends StObject
