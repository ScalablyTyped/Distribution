package typings.typeFest

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSetReturnTypeMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    // Just using `Parameters<Fn>` isn't ideal because it doesn't handle the `this` fake parameter.
  Fn extends (this : infer ThisArg, arguments_ : infer Arguments): any ? // If a function did not specify the `this` fake parameter, it will be inferred to `unknown`.
  // We want to detect this situation just to display a friendlier type upon hovering on an IntelliSense-powered IDE.
  type-fest.type-fest/source/is-unknown.IsUnknown<ThisArg> extends true ? (arguments_ : Arguments): TypeToReturn : (this : ThisArg, arguments_ : Arguments): TypeToReturn : (arguments_ : std.Parameters<Fn>): TypeToReturn
    }}}
    */
  type SetReturnType[Fn /* <: js.Function1[/* repeated */ Any, Any] */, TypeToReturn] = // This part should be unreachable, but we make it meaningful just in case…
  js.Function1[/* arguments_ */ Parameters[Fn], TypeToReturn]
}
