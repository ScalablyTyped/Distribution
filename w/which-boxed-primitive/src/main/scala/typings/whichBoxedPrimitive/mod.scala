package typings.whichBoxedPrimitive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Which kind of boxed JS primitive is this? This function works cross-realm/iframe,
    * does not depend on `instanceof` or mutable properties, and works despite ES6 `Symbol.toStringTag`.
    *
    * @example
    * import assert = require('node:assert');
    * import whichBoxedPrimitive = require('which-boxed-primitive');
    *
    * // unboxed primitives return `null`
    * // boxed primitives return the builtin constructor name
    *
    * assert.equal(whichBoxedPrimitive(undefined), null);
    * assert.equal(whichBoxedPrimitive(null), null);
    *
    * assert.equal(whichBoxedPrimitive(false), null);
    * assert.equal(whichBoxedPrimitive(true), null);
    * assert.equal(whichBoxedPrimitive(new Boolean(false)), 'Boolean');
    * assert.equal(whichBoxedPrimitive(new Boolean(true)), 'Boolean');
    *
    * assert.equal(whichBoxedPrimitive(42), null);
    * assert.equal(whichBoxedPrimitive(NaN), null);
    * assert.equal(whichBoxedPrimitive(Infinity), null);
    * assert.equal(whichBoxedPrimitive(new Number(42)), 'Number');
    * assert.equal(whichBoxedPrimitive(new Number(NaN)), 'Number');
    * assert.equal(whichBoxedPrimitive(new Number(Infinity)), 'Number');
    *
    * assert.equal(whichBoxedPrimitive(''), null);
    * assert.equal(whichBoxedPrimitive('foo'), null);
    * assert.equal(whichBoxedPrimitive(new String('')), 'String');
    * assert.equal(whichBoxedPrimitive(new String('foo')), 'String');
    *
    * assert.equal(whichBoxedPrimitive(Symbol()), null);
    * assert.equal(whichBoxedPrimitive(Object(Symbol())), 'Symbol');
    *
    * assert.equal(whichBoxedPrimitive(BigInt(42)), null);
    * assert.equal(whichBoxedPrimitive(Object(BigInt(42))), 'BigInt');
    *
    * // non-boxed-primitive objects return `undefined`
    * assert.equal(whichBoxedPrimitive([]), undefined);
    * assert.equal(whichBoxedPrimitive({}), undefined);
    * assert.equal(whichBoxedPrimitive(/a/g), undefined);
    * assert.equal(whichBoxedPrimitive(new RegExp('a', 'g')), undefined);
    * assert.equal(whichBoxedPrimitive(new Date()), undefined);
    * assert.equal(whichBoxedPrimitive(() => {}), undefined);
    * assert.equal(whichBoxedPrimitive(function* () {}), undefined);
    * assert.equal(whichBoxedPrimitive((x: number) => x * x), undefined);
    * assert.equal(whichBoxedPrimitive([]), undefined);
    */
  inline def apply[T](value: T): WhichBoxed[T] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[WhichBoxed[T]]
  
  @JSImport("which-boxed-primitive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends string | number | boolean | symbol | bigint | null | undefined ? null : T extends std.String ? 'String' : T extends std.Number ? 'Number' : T extends std.Boolean ? 'Boolean' : T extends std.Symbol ? 'Symbol' : T extends std.BigInt ? 'BigInt' : undefined
    }}}
    */
  type WhichBoxed[T] = Null
}
