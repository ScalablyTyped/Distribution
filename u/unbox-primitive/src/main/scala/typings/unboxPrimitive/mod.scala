package typings.unboxPrimitive

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Unbox a boxed JS primitive value. This function works cross-realm/iframe,
    * does not depend on `instanceof` or mutable properties, and works despite ES6 `Symbol.toStringTag`.
    *
    * @example
    * import unboxPrimitive = require('unbox-primitive');
    * import * as assert from 'node:assert';
    *
    * assert.equal(unboxPrimitive(new Boolean(false)), false);
    * assert.equal(unboxPrimitive(new String('f')), 'f');
    * assert.equal(unboxPrimitive(new Number(42)), 42);
    * const s = Symbol();
    * assert.equal(unboxPrimitive(Object(s)), s);
    * assert.equal(unboxPrimitive(Object(BigInt(42))), BigInt(42));
    */
  inline def apply(value: String): Unbox[String] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Unbox[String]]
  inline def apply(value: js.BigInt): Unbox[js.BigInt] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Unbox[js.BigInt]]
  inline def apply(value: js.Symbol): Unbox[js.Symbol] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Unbox[js.Symbol]]
  inline def apply(value: Boolean): Unbox[Boolean] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Unbox[Boolean]]
  inline def apply(value: Number): Unbox[Number] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Unbox[Number]]
  
  @JSImport("unbox-primitive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Boxed = String | Number | Boolean | js.Symbol | js.BigInt
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.String ? string : T extends std.Number ? number : T extends std.Boolean ? boolean : T extends std.Symbol ? symbol : T extends std.BigInt ? bigint : never
    }}}
    */
  @js.native
  trait Unbox[T /* <: Boxed */] extends StObject
}
