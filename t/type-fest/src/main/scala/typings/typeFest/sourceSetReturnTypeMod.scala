package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSetReturnTypeMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    0 extends 1 & T ? true : false
    }}}
    */
  @js.native
  trait IsAny[T] extends StObject
  
  // https://stackoverflow.com/a/49928360/3406963
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T] extends [never] ? true : false
    }}}
    */
  @js.native
  trait IsNever[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    type-fest.type-fest/source/set-return-type.IsNever<T> extends false ? T extends unknown ? unknown extends T ? type-fest.type-fest/source/set-return-type.IsAny<T> extends false ? true : false : false : false : false
    }}}
    */
  @js.native
  trait IsUnknown[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    // Just using `Parameters<Fn>` isn't ideal because it doesn't handle the `this` fake parameter.
  Fn extends (this : infer ThisArg, args : infer Arguments): any ? // If a function did not specify the `this` fake parameter, it will be inferred to `unknown`.
  // We want to detect this situation just to display a friendlier type upon hovering on an IntelliSense-powered IDE.
  type-fest.type-fest/source/set-return-type.IsUnknown<ThisArg> extends true ? (args : Arguments): TypeToReturn : (this : ThisArg, args : Arguments): TypeToReturn : (args : std.Parameters<Fn>): TypeToReturn
    }}}
    */
  @js.native
  trait SetReturnType[Fn /* <: js.Function1[/* repeated */ Any, Any] */, TypeToReturn] extends StObject
}
