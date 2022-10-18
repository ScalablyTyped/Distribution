package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceIncludesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Value extends [Value[0], ...infer rest] ? type-fest.type-fest/source/internal.IsEqual<Value[0], Item> extends true ? true : type-fest.type-fest/source/includes.Includes<rest, Item> : false
    }}}
    */
  @js.native
  trait Includes[Value /* <: js.Array[Any] */, Item] extends StObject
}
