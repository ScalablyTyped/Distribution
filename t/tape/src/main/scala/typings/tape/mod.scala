package typings.tape

import typings.node.NodeJS.ReadableStream
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cb: TestCase): Unit = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Create a new test with an optional name string and optional opts object.
    * cb(t) fires with the new test object t once all preceeding tests have finished.
    * Tests execute serially.
    */
  inline def apply(name: String, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(name: String, opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("tape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHarness(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createHarness")().asInstanceOf[js.Any]
  
  inline def createStream(): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")().asInstanceOf[ReadableStream]
  inline def createStream(opts: StreamOptions): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(opts.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  inline def onFailure(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFailure")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onFinish(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFinish")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def only(cb: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def only(name: String, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("only")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def only(name: String, opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("only")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def only(opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("only")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def skip(cb: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def skip(name: String, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def skip(name: String, opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def skip(opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Available options for tape assertions.
    */
  trait AssertOptions extends StObject {
    
    // Allows the assertion to fail.
    var message: js.UndefOr[String] = js.undefined
    
    var skip: js.UndefOr[Boolean | String] = js.undefined
    
    // Skip the assertion. Can also be a message explaining why the test is skipped.
    var todo: js.UndefOr[Boolean | String] = js.undefined
  }
  object AssertOptions {
    
    inline def apply(): AssertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssertOptions]
    }
    
    extension [Self <: AssertOptions](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setSkip(value: Boolean | String): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTodo(value: Boolean | String): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
      
      inline def setTodoUndefined: Self = StObject.set(x, "todo", js.undefined)
    }
  }
  
  /**
    * Options for the createStream function.
    */
  trait StreamOptions extends StObject {
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
  }
  object StreamOptions {
    
    inline def apply(): StreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamOptions]
    }
    
    extension [Self <: StreamOptions](x: Self) {
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
  
  @js.native
  trait Test extends StObject {
    
    def assert(value: js.Any): Unit = js.native
    def assert(value: js.Any, msg: String): Unit = js.native
    def assert(value: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def assert(value: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Print a message without breaking the tap output.
      * (Useful when using e.g. tap-colorize where output is buffered & console.log will print in incorrect order vis-a-vis tap output.)
      */
    def comment(msg: String): Unit = js.native
    
    /**
      * Assert that a and b have the same structure and nested values using node's deepEqual() algorithm with strict comparisons (===) on leaf nodes and an optional description msg.
      */
    def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def deepEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def deepEqual(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def deepEqual(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def deepEquals(actual: js.Any, expected: js.Any): Unit = js.native
    def deepEquals(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def deepEquals(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def deepEquals(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Assert that a and b have the same structure and nested values using node's deepEqual() algorithm with loose comparisons (==) on leaf nodes and an optional description msg.
      */
    def deepLooseEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def deepLooseEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def deepLooseEqual(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def deepLooseEqual(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def doesNotEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def doesNotEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def doesNotEqual(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def doesNotEqual(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Assert that string does not match the RegExp regexp. Will throw (not just fail) when the first two arguments are the wrong type.
      */
    def doesNotMatch(actual: String, expected: RegExp): Unit = js.native
    def doesNotMatch(actual: String, expected: RegExp, msg: String): Unit = js.native
    def doesNotMatch(actual: String, expected: RegExp, msg: String, extra: AssertOptions): Unit = js.native
    def doesNotMatch(actual: String, expected: RegExp, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Assert that the function call fn() does not throw an exception.
      */
    def doesNotThrow(fn: js.Function0[Unit]): Unit = js.native
    def doesNotThrow(fn: js.Function0[Unit], exceptionExpected: js.Function): Unit = js.native
    def doesNotThrow(fn: js.Function0[Unit], exceptionExpected: js.Function, msg: String): Unit = js.native
    def doesNotThrow(fn: js.Function0[Unit], exceptionExpected: RegExp): Unit = js.native
    def doesNotThrow(fn: js.Function0[Unit], exceptionExpected: RegExp, msg: String): Unit = js.native
    def doesNotThrow(fn: js.Function0[Unit], msg: String): Unit = js.native
    
    /**
      * Declare the end of a test explicitly.
      * If err is passed in t.end will assert that it is falsey.
      */
    def end(): Unit = js.native
    def end(err: js.Any): Unit = js.native
    
    /**
      * Assert that a === b with an optional description msg.
      */
    def equal(actual: js.Any, expected: js.Any): Unit = js.native
    def equal(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def equal(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def equal(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def equals(actual: js.Any, expected: js.Any): Unit = js.native
    def equals(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def equals(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def equals(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Assert that err is falsy.
      * If err is non-falsy, use its err.message as the description message.
      */
    def error(err: js.Any): Unit = js.native
    def error(err: js.Any, msg: String): Unit = js.native
    def error(err: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def error(err: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Generate a failing assertion with a message msg.
      */
    def fail(): Unit = js.native
    def fail(msg: String): Unit = js.native
    def fail(msg: String, extra: AssertOptions): Unit = js.native
    def fail(msg: Unit, extra: AssertOptions): Unit = js.native
    
    def `false`(value: js.Any): Unit = js.native
    def `false`(value: js.Any, msg: String): Unit = js.native
    def `false`(value: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def `false`(value: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def ifErr(err: js.Any): Unit = js.native
    def ifErr(err: js.Any, msg: String): Unit = js.native
    def ifErr(err: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def ifErr(err: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def ifError(err: js.Any): Unit = js.native
    def ifError(err: js.Any, msg: String): Unit = js.native
    def ifError(err: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def ifError(err: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def iferror(err: js.Any): Unit = js.native
    def iferror(err: js.Any, msg: String): Unit = js.native
    def iferror(err: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def iferror(err: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def is(actual: js.Any, expected: js.Any): Unit = js.native
    def is(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def is(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def is(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def isEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def isEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def isEqual(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def isEqual(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def isEquivalent(actual: js.Any, expected: js.Any): Unit = js.native
    def isEquivalent(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def isEquivalent(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def isEquivalent(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def isInequal(actual: js.Any, expected: js.Any): Unit = js.native
    def isInequal(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def isInequal(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def isInequal(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def isInequivalent(actual: js.Any, expected: js.Any): Unit = js.native
    def isInequivalent(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def isInequivalent(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def isInequivalent(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def isNot(actual: js.Any, expected: js.Any): Unit = js.native
    def isNot(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def isNot(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def isNot(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def isNotDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def isNotDeepEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def isNotDeepEqual(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def isNotDeepEqual(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def isNotDeeply(actual: js.Any, expected: js.Any): Unit = js.native
    def isNotDeeply(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def isNotDeeply(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def isNotDeeply(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def isNotEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def isNotEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def isNotEqual(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def isNotEqual(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def isNotEquivalent(actual: js.Any, expected: js.Any): Unit = js.native
    def isNotEquivalent(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def isNotEquivalent(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def isNotEquivalent(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def looseEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def looseEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def looseEqual(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def looseEqual(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def looseEquals(actual: js.Any, expected: js.Any): Unit = js.native
    def looseEquals(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def looseEquals(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def looseEquals(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Assert that string matches the RegExp regexp. Will throw (not just fail) when the first two arguments are the wrong type.
      */
    def `match`(actual: String, expected: RegExp): Unit = js.native
    def `match`(actual: String, expected: RegExp, msg: String): Unit = js.native
    def `match`(actual: String, expected: RegExp, msg: String, extra: AssertOptions): Unit = js.native
    def `match`(actual: String, expected: RegExp, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def not(actual: js.Any, expected: js.Any): Unit = js.native
    def not(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def not(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def not(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Assert that a and b do not have the same structure and nested values using node's deepEqual() algorithm with strict comparisons (===) on leaf nodes and an optional description msg.
      */
    def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def notDeepEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def notDeepEqual(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def notDeepEqual(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Assert that a and b do not have the same structure and nested values using node's deepEqual() algorithm with loose comparisons (==) on leaf nodes and an optional description msg.
      */
    def notDeepLooseEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def notDeepLooseEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def notDeepLooseEqual(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def notDeepLooseEqual(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def notDeeply(actual: js.Any, expected: js.Any): Unit = js.native
    def notDeeply(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def notDeeply(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def notDeeply(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Assert that a !== b with an optional description msg.
      */
    def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def notEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def notEqual(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def notEqual(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def notEquals(actual: js.Any, expected: js.Any): Unit = js.native
    def notEquals(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def notEquals(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def notEquals(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def notEquivalent(actual: js.Any, expected: js.Any): Unit = js.native
    def notEquivalent(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def notEquivalent(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def notEquivalent(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def notLooseEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def notLooseEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def notLooseEqual(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def notLooseEqual(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def notLooseEquals(actual: js.Any, expected: js.Any): Unit = js.native
    def notLooseEquals(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def notLooseEquals(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def notLooseEquals(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Assert that value is falsy with an optional description message msg.
      */
    def notOk(value: js.Any): Unit = js.native
    def notOk(value: js.Any, msg: String): Unit = js.native
    def notOk(value: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def notOk(value: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def notSame(actual: js.Any, expected: js.Any): Unit = js.native
    def notSame(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def notSame(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def notSame(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def notStrictEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def notStrictEqual(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def notStrictEqual(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def notStrictEquals(actual: js.Any, expected: js.Any): Unit = js.native
    def notStrictEquals(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def notStrictEquals(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def notStrictEquals(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def notok(value: js.Any): Unit = js.native
    def notok(value: js.Any, msg: String): Unit = js.native
    def notok(value: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def notok(value: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Assert that value is truthy with an optional description message msg.
      */
    def ok(value: js.Any): Unit = js.native
    def ok(value: js.Any, msg: String): Unit = js.native
    def ok(value: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def ok(value: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Generate a passing assertion with a message msg.
      */
    def pass(): Unit = js.native
    def pass(msg: String): Unit = js.native
    def pass(msg: String, extra: AssertOptions): Unit = js.native
    def pass(msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Declare that n assertions should be run. end() will be called automatically after the nth assertion.
      * If there are any more assertions after the nth, or after end() is called, they will generate errors.
      */
    def plan(n: Double): Unit = js.native
    
    def same(actual: js.Any, expected: js.Any): Unit = js.native
    def same(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def same(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def same(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Generate an assertion that will be skipped over.
      */
    def skip(): Unit = js.native
    def skip(msg: String): Unit = js.native
    def skip(msg: String, extra: AssertOptions): Unit = js.native
    def skip(msg: Unit, extra: AssertOptions): Unit = js.native
    
    def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def strictEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def strictEqual(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def strictEqual(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    def strictEquals(actual: js.Any, expected: js.Any): Unit = js.native
    def strictEquals(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def strictEquals(actual: js.Any, expected: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def strictEquals(actual: js.Any, expected: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
    
    /**
      * Create a subtest with a new test handle st from cb(st) inside the current test.
      * cb(st) will only fire when t finishes.
      * Additional tests queued up after t will not be run until all subtests finish.
      */
    def test(name: String, cb: TestCase): Unit = js.native
    def test(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
    
    /**
      * Assert that the function call fn() throws an exception.
      * expected, if present, must be a RegExp or Function, which is used to test the exception object.
      */
    def throws(fn: js.Function0[Unit]): Unit = js.native
    def throws(fn: js.Function0[Unit], exceptionExpected: js.Function): Unit = js.native
    def throws(fn: js.Function0[Unit], exceptionExpected: js.Function, msg: String): Unit = js.native
    def throws(fn: js.Function0[Unit], exceptionExpected: RegExp): Unit = js.native
    def throws(fn: js.Function0[Unit], exceptionExpected: RegExp, msg: String): Unit = js.native
    def throws(fn: js.Function0[Unit], msg: String): Unit = js.native
    
    /**
      * Automatically timeout the test after X ms.
      */
    def timeoutAfter(ms: Double): Unit = js.native
    
    def `true`(value: js.Any): Unit = js.native
    def `true`(value: js.Any, msg: String): Unit = js.native
    def `true`(value: js.Any, msg: String, extra: AssertOptions): Unit = js.native
    def `true`(value: js.Any, msg: Unit, extra: AssertOptions): Unit = js.native
  }
  
  type TestCase = js.Function1[/* test */ Test, Unit]
  
  /**
    * Available opts options for the tape function.
    */
  trait TestOptions extends StObject {
    
    var skip: js.UndefOr[Boolean] = js.undefined
    
    // true/false. Test will be allowed to fail.
    var timeout: js.UndefOr[Double] = js.undefined
    
    // true/false. See test.skip.
    var todo: js.UndefOr[Boolean] = js.undefined
  }
  object TestOptions {
    
    inline def apply(): TestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestOptions]
    }
    
    extension [Self <: TestOptions](x: Self) {
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTodo(value: Boolean): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
      
      inline def setTodoUndefined: Self = StObject.set(x, "todo", js.undefined)
    }
  }
}
