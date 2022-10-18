package typings.testcafe.mod.global

import typings.testcafe.testcafeStrings.`null`
import typings.testcafe.testcafeStrings.`object`
import typings.testcafe.testcafeStrings.boolean
import typings.testcafe.testcafeStrings.function
import typings.testcafe.testcafeStrings.number
import typings.testcafe.testcafeStrings.regexp
import typings.testcafe.testcafeStrings.string
import typings.testcafe.testcafeStrings.undefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assertion[E] extends StObject {
  
  def contains[R](expected: ElementOf[E]): TestControllerPromise[Any] = js.native
  def contains[R](expected: ElementOf[E], message: String): TestControllerPromise[Any] = js.native
  def contains[R](expected: ElementOf[E], message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def contains[R](expected: ElementOf[E], message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def contains[R](expected: ElementOf[E], options: AssertionOptions): TestControllerPromise[Any] = js.native
  /**
    * Asserts that `actual` contains `expected`.
    *
    * @param expected - An expected value.
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def contains[R](expected: EnsureString[E]): TestControllerPromise[Any] = js.native
  def contains[R](expected: EnsureString[E], message: String): TestControllerPromise[Any] = js.native
  def contains[R](expected: EnsureString[E], message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def contains[R](expected: EnsureString[E], message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def contains[R](expected: EnsureString[E], options: AssertionOptions): TestControllerPromise[Any] = js.native
  def contains[R](expected: Extend[E, R]): TestControllerPromise[Any] = js.native
  def contains[R](expected: Extend[E, R], message: String): TestControllerPromise[Any] = js.native
  def contains[R](expected: Extend[E, R], message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def contains[R](expected: Extend[E, R], message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def contains[R](expected: Extend[E, R], options: AssertionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Asserts that `actual` is deeply equal to `expected`.
    *
    * @param expected - An expected value.
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def eql(expected: E): TestControllerPromise[Any] = js.native
  def eql(expected: E, message: String): TestControllerPromise[Any] = js.native
  def eql(expected: E, message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def eql(expected: E, message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def eql(expected: E, options: AssertionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Asserts that `actual` is strictly greater than `expected`.
    *
    * @param expected - A value that should be less than or equal to `actual`.
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def gt(expected: Double): TestControllerPromise[Any] = js.native
  def gt(expected: Double, message: String): TestControllerPromise[Any] = js.native
  def gt(expected: Double, message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def gt(expected: Double, message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def gt(expected: Double, options: AssertionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Asserts that `actual` is greater than or equal to `expected`.
    *
    * @param expected - A value that should be less than `actual`.
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def gte(expected: Double): TestControllerPromise[Any] = js.native
  def gte(expected: Double, message: String): TestControllerPromise[Any] = js.native
  def gte(expected: Double, message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def gte(expected: Double, message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def gte(expected: Double, options: AssertionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Asserts that `actual` is less than `expected`.
    *
    * @param expected - A value that should be greater than or equal to `actual`.
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def lt(expected: Double): TestControllerPromise[Any] = js.native
  def lt(expected: Double, message: String): TestControllerPromise[Any] = js.native
  def lt(expected: Double, message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def lt(expected: Double, message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def lt(expected: Double, options: AssertionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Asserts that `actual` is less than or equal to `expected`.
    *
    * @param expected - A value that should be greater than `actual`.
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def lte(expected: Double): TestControllerPromise[Any] = js.native
  def lte(expected: Double, message: String): TestControllerPromise[Any] = js.native
  def lte(expected: Double, message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def lte(expected: Double, message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def lte(expected: Double, options: AssertionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Asserts that `actual` matches the regular expression.
    *
    * @param re - A regular expression that is expected to be matched.
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def `match`(re: js.RegExp): TestControllerPromise[Any] = js.native
  def `match`(re: js.RegExp, message: String): TestControllerPromise[Any] = js.native
  def `match`(re: js.RegExp, message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def `match`(re: js.RegExp, message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def `match`(re: js.RegExp, options: AssertionOptions): TestControllerPromise[Any] = js.native
  
  def notContains[R](unexpected: ElementOf[E]): TestControllerPromise[Any] = js.native
  def notContains[R](unexpected: ElementOf[E], message: String): TestControllerPromise[Any] = js.native
  def notContains[R](unexpected: ElementOf[E], message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notContains[R](unexpected: ElementOf[E], message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notContains[R](unexpected: ElementOf[E], options: AssertionOptions): TestControllerPromise[Any] = js.native
  /**
    * Asserts that `actual` not contains `unexpected`.
    *
    * @param unexpected - An unexpected value.
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def notContains[R](unexpected: EnsureString[E]): TestControllerPromise[Any] = js.native
  def notContains[R](unexpected: EnsureString[E], message: String): TestControllerPromise[Any] = js.native
  def notContains[R](unexpected: EnsureString[E], message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notContains[R](unexpected: EnsureString[E], message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notContains[R](unexpected: EnsureString[E], options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notContains[R](unexpected: Extend[E, R]): TestControllerPromise[Any] = js.native
  def notContains[R](unexpected: Extend[E, R], message: String): TestControllerPromise[Any] = js.native
  def notContains[R](unexpected: Extend[E, R], message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notContains[R](unexpected: Extend[E, R], message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notContains[R](unexpected: Extend[E, R], options: AssertionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Assert that `actual` is not deeply equal to `unexpected`.
    *
    * @param unexpected - An unexpected value.
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def notEql(unexpected: E): TestControllerPromise[Any] = js.native
  def notEql(unexpected: E, message: String): TestControllerPromise[Any] = js.native
  def notEql(unexpected: E, message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notEql(unexpected: E, message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notEql(unexpected: E, options: AssertionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Asserts that `actual` does not match the regular expression.
    *
    * @param re - A regular expression that is expected to be matched.
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def notMatch(re: js.RegExp): TestControllerPromise[Any] = js.native
  def notMatch(re: js.RegExp, message: String): TestControllerPromise[Any] = js.native
  def notMatch(re: js.RegExp, message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notMatch(re: js.RegExp, message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notMatch(re: js.RegExp, options: AssertionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Asserts that `actual` is falsy.
    *
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def notOk(): TestControllerPromise[Any] = js.native
  def notOk(message: String): TestControllerPromise[Any] = js.native
  def notOk(message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notOk(message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notOk(options: AssertionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Asserts that type of `actual` is not `typeName`.
    *
    * @param typeName - An unexpected type of an `actual` value.
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def notTypeOf(typeName: function | `object` | number | string | boolean | undefined | `null` | regexp): TestControllerPromise[Any] = js.native
  def notTypeOf(
    typeName: function | `object` | number | string | boolean | undefined | `null` | regexp,
    message: String
  ): TestControllerPromise[Any] = js.native
  def notTypeOf(
    typeName: function | `object` | number | string | boolean | undefined | `null` | regexp,
    message: String,
    options: AssertionOptions
  ): TestControllerPromise[Any] = js.native
  def notTypeOf(
    typeName: function | `object` | number | string | boolean | undefined | `null` | regexp,
    message: Unit,
    options: AssertionOptions
  ): TestControllerPromise[Any] = js.native
  def notTypeOf(
    typeName: function | `object` | number | string | boolean | undefined | `null` | regexp,
    options: AssertionOptions
  ): TestControllerPromise[Any] = js.native
  
  /**
    * Asserts that `actual` is not within a range from `start` to `finish`. Bounds are inclusive.
    *
    * @param start - A lower bound of range (included).
    * @param finish - An upper bound of range (included).
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def notWithin(start: Double, finish: Double): TestControllerPromise[Any] = js.native
  def notWithin(start: Double, finish: Double, message: String): TestControllerPromise[Any] = js.native
  def notWithin(start: Double, finish: Double, message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notWithin(start: Double, finish: Double, message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def notWithin(start: Double, finish: Double, options: AssertionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Asserts that `actual` is truthy.
    *
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def ok(): TestControllerPromise[Any] = js.native
  def ok(message: String): TestControllerPromise[Any] = js.native
  def ok(message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def ok(message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def ok(options: AssertionOptions): TestControllerPromise[Any] = js.native
  
  /**
    * Asserts that type of `actual` is `typeName`.
    *
    * @param typeName - The expected type of an `actual` value.
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def typeOf(typeName: function | `object` | number | string | boolean | undefined | `null` | regexp): TestControllerPromise[Any] = js.native
  def typeOf(
    typeName: function | `object` | number | string | boolean | undefined | `null` | regexp,
    message: String
  ): TestControllerPromise[Any] = js.native
  def typeOf(
    typeName: function | `object` | number | string | boolean | undefined | `null` | regexp,
    message: String,
    options: AssertionOptions
  ): TestControllerPromise[Any] = js.native
  def typeOf(
    typeName: function | `object` | number | string | boolean | undefined | `null` | regexp,
    message: Unit,
    options: AssertionOptions
  ): TestControllerPromise[Any] = js.native
  def typeOf(
    typeName: function | `object` | number | string | boolean | undefined | `null` | regexp,
    options: AssertionOptions
  ): TestControllerPromise[Any] = js.native
  
  /**
    * Asserts that `actual` is within a range from `start` to `finish`. Bounds are inclusive.
    *
    * @param start - A lower bound of range (included).
    * @param finish - An upper bound of range (included).
    * @param message - An assertion message that will be displayed in the report if the test fails.
    * @param options - Assertion options.
    */
  def within(start: Double, finish: Double): TestControllerPromise[Any] = js.native
  def within(start: Double, finish: Double, message: String): TestControllerPromise[Any] = js.native
  def within(start: Double, finish: Double, message: String, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def within(start: Double, finish: Double, message: Unit, options: AssertionOptions): TestControllerPromise[Any] = js.native
  def within(start: Double, finish: Double, options: AssertionOptions): TestControllerPromise[Any] = js.native
}
