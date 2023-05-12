package typings.typeFest

import typings.typeFest.typeFestStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceJoinMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Items extends [] ? '' : Items extends [type-fest.type-fest/source/join.JoinableItem | undefined] ? / * template literal string: ${NullishCoalesce<Items[0],>} * / string : Items extends [infer First, ...infer Tail] ? / * template literal string: ${NullishCoalesce<First,>}${Delimiter}${Join<Tail,Delimiter>} * / string : Items extends [...infer Head, infer Last] ? / * template literal string: ${Join<Head,Delimiter>}${Delimiter}${NullishCoalesce<Last,>} * / string : string
    }}}
    */
  type Join[Items /* <: js.Array[JoinableItem] */, Delimiter /* <: String */] = _empty
  
  type JoinableItem = js.UndefOr[String | Double | js.BigInt | Boolean | Null]
  
  // `null` and `undefined` are treated uniquely in the built-in join method, in a way that differs from the default `toString` that would result in the type `${undefined}`. That's why we need to handle it specifically with this helper.
  // @see https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/join#description
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Value extends undefined | null ? std.NonNullable<Value> | Fallback : Value
    }}}
    */
  type NullishCoalesce[Value /* <: JoinableItem */, Fallback /* <: String */] = Value
}
