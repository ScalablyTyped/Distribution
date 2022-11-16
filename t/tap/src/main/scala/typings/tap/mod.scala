package typings.tap

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Record
import typings.tap.mod.Assertions.Basic
import typings.tap.mod.Assertions.DoesNotThrow
import typings.tap.mod.Assertions.Equal
import typings.tap.mod.Assertions.Match
import typings.tap.mod.Assertions.NotEqual
import typings.tap.mod.Assertions.Throws
import typings.tap.mod.Assertions.Type
import typings.tap.mod.Options.Assert
import typings.tap.mod.Options.Bag
import typings.tap.mod.Options.Pragma
import typings.tap.mod.Options.Spawn
import typings.tap.mod.global.Tap.Fixture.Instance
import typings.tap.mod.global.Tap.Fixture.Spec
import typings.tap.mod.global.Tap.Tap
import typings.tap.tapStrings.dir
import typings.tap.tapStrings.file
import typings.tap.tapStrings.link
import typings.tap.tapStrings.symlink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tap", JSImport.Namespace)
  @js.native
  val ^ : Tap = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tap", "Test")
  @js.native
  open class Test ()
    extends typings.tap.mod.global.Tap.Test {
    def this(options: typings.tap.mod.Options.Test) = this()
  }
  
  object global {
    
    object Tap {
      
      @JSGlobal("Tap.Tap")
      @js.native
      open class Tap ()
        extends typings.tap.mod.global.Tap.Test {
        def this(options: typings.tap.mod.Options.Test) = this()
        
        var Test: TestConstructor = js.native
        
        var mocha: Mocha = js.native
        
        def mochaGlobals(): Unit = js.native
      }
      
      @JSGlobal("Tap.Test")
      @js.native
      open class Test ()
        extends StObject
           with DeprecatedAssertionSynonyms {
        def this(options: typings.tap.mod.Options.Test) = this()
        
        /**
          * This is used for creating assertion methods on the Test class.
          *
          * @param name The name of the assertion method.
          * @param length The amount of arguments the assertion has.
          * @param fn The code to be ran when this assertion is called.
          *
          * @example
          * // Add an assertion that a string is in Title Case
          * // It takes one argument (the string to be tested)
          * t.Test.prototype.addAssert('titleCase', 1, function (str, message, extra) {
          *     message = message || 'should be in Title Case'
          *     // the string in Title Case
          *     const tc = str.toLowerCase().replace(/\b./, match => match.toUpperCase())
          *     // should always return another assert call, or
          *     // this.pass(message) or this.fail(message, extra)
          *     return this.equal(str, tc, message, extra)
          * })
          *
          * t.titleCase('This Passes')
          * t.titleCase('however, tHis tOTaLLy faILS')
          */
        def addAssert(name: String, length: Double, fn: js.Function1[/* repeated */ Any, Boolean]): Boolean = js.native
        
        /**
          * This is called after each child test (or any children of any child tests,
          * on down the tree). Like beforeEach, it's called with the child test
          * object, and can return a Promise to perform asynchronous operations.
          */
        def afterEach(fn: js.Function0[Any]): Unit = js.native
        def afterEach(fn: js.Function1[/* childTest */ Any, Any]): Unit = js.native
        
        /**
          * @deprecated use ok() instead.
          */
        /* CompleteClass */
        override def assert(obj: Any): Boolean = js.native
        /* CompleteClass */
        override def assert(obj: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def assert(obj: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def assert(obj: Any, message: Unit, extra: Assert): Boolean = js.native
        
        /**
          * @deprecated use assertNot() instead.
          */
        /* CompleteClass */
        override def assertNot(obj: Any): Boolean = js.native
        /* CompleteClass */
        override def assertNot(obj: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def assertNot(obj: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def assertNot(obj: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use assertNot() instead.
          */
        /* CompleteClass */
        @JSName("assertNot")
        var assertNot_Original: Basic = js.native
        
        /**
          * @deprecated use ok() instead.
          */
        /* CompleteClass */
        @JSName("assert")
        var assert_Original: Basic = js.native
        
        /**
          * Automatically end() the test on the next turn of the event loop after its internal queue is drained.
          */
        def autoend(value: Boolean): Unit = js.native
        
        /**
          * Use this when things are severely broken, and cannot be reasonably handled. Immediately terminates the entire test run.
          */
        def bailout(): Unit = js.native
        def bailout(reason: String): Unit = js.native
        
        /**
          * Run the provided function once before any tests are ran.
          * If this function returns a promise, it will wait for the promise to
          * resolve, before running any tests.
          */
        def before(fn: js.Function0[Any]): Unit = js.native
        
        /**
          * Before any child test (or any children of any child tests, etc.) the
          * supplied function is called with the test object that it's prefixing.
          *
          * If the function returns a Promise, then that is used as the indication of
          * doneness. Thus, async functions automatically end when all of their
          * awaited Promises are complete.
          */
        def beforeEach(fn: js.Function0[Any]): Unit = js.native
        def beforeEach(fn: js.Function1[/* childTest */ Any, Any]): Unit = js.native
        
        /**
          * Formats a string from a snapshot. This can be used to remove variables
          * and replace them with sentinel values.
          *
          * @see {@link https://node-tap.org/docs/api/snapshot-testing/}
          *
          * @example
          * t.cleanSnapshot = s => {
          *     return s.replace(/ time=[0-9]+$/g, ' time={time}')
          * }
          */
        def cleanSnapshot(s: String): String = js.native
        
        def comment(message: String, args: Any*): Unit = js.native
        
        /**
          * @deprecated use has() instead.
          */
        /* CompleteClass */
        override def contains(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def contains(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def contains(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def contains(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use has() instead.
          */
        /* CompleteClass */
        @JSName("contains")
        var contains_Original: Match = js.native
        
        /**
          * This is an object which is inherited by child tests, and is a handy place to put
          * various contextual information.
          *
          * t.context will only be inherited by child tests if it is an object.
          *
          * This typically will be used with lifecycle events, such as beforeEach or afterEach.
          * @see {@link https://node-tap.org/docs/api/test-lifecycle-events}
          */
        var context: Any = js.native
        
        def current(): typings.tap.mod.global.Tap.Test = js.native
        
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        override def deepEqual(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def deepEqual(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def deepEqual(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def deepEqual(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        @JSName("deepEqual")
        var deepEqual_Original: Equal = js.native
        
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        override def deepEquals(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def deepEquals(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def deepEquals(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def deepEquals(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        @JSName("deepEquals")
        var deepEquals_Original: Equal = js.native
        
        /**
          * @deprecated use notSame() instead.
          */
        /* CompleteClass */
        override def deepInequal(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def deepInequal(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def deepInequal(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def deepInequal(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notSame() instead.
          */
        /* CompleteClass */
        @JSName("deepInequal")
        var deepInequal_Original: NotEqual = js.native
        
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        override def deepIs(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def deepIs(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def deepIs(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def deepIs(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        @JSName("deepIs")
        var deepIs_Original: Equal = js.native
        
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        override def deepNot(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def deepNot(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def deepNot(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def deepNot(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        @JSName("deepNot")
        var deepNot_Original: NotEqual = js.native
        
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        override def dissimilar(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def dissimilar(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def dissimilar(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def dissimilar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        @JSName("dissimilar")
        var dissimilar_Original: Match = js.native
        
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        override def doesNotEqual(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def doesNotEqual(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def doesNotEqual(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def doesNotEqual(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        @JSName("doesNotEqual")
        var doesNotEqual_Original: NotEqual = js.native
        
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        override def doesNotHave(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def doesNotHave(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def doesNotHave(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def doesNotHave(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        @JSName("doesNotHave")
        var doesNotHave_Original: Match = js.native
        
        /**
          * Verify that the provided function does not throw.
          *
          * If the function has a name, and the message is not provided,
          * then the function name will be used as the message.
          *
          * If the function is not provided, then this will be treated as a todo test.
          *
          * Note: If an error is encountered unexpectedly,
          * it's often better to simply throw it. The Test object will handle this as a failure.
          */
        def doesNotThrow(): Boolean = js.native
        def doesNotThrow(fn: js.Function1[/* repeated */ Any, Any]): Boolean = js.native
        def doesNotThrow(fn: js.Function1[/* repeated */ Any, Any], message: String): Boolean = js.native
        def doesNotThrow(fn: js.Function1[/* repeated */ Any, Any], message: String, extra: Assert): Boolean = js.native
        def doesNotThrow(fn: js.Function1[/* repeated */ Any, Any], message: Unit, extra: Assert): Boolean = js.native
        def doesNotThrow(fn: Unit, message: String): Boolean = js.native
        def doesNotThrow(fn: Unit, message: String, extra: Assert): Boolean = js.native
        def doesNotThrow(fn: Unit, message: Unit, extra: Assert): Boolean = js.native
        /**
          * Verify that the provided function does not throw.
          *
          * If the function has a name, and the message is not provided,
          * then the function name will be used as the message.
          *
          * If the function is not provided, then this will be treated as a todo test.
          *
          * Note: If an error is encountered unexpectedly,
          * it's often better to simply throw it. The Test object will handle this as a failure.
          */
        @JSName("doesNotThrow")
        var doesNotThrow_Original: DoesNotThrow = js.native
        
        def done(): Unit = js.native
        
        /**
          * Verify that the event emitter emits the named event before the end of the test.
          */
        def emits(eventEmitter: EventEmitter, event: String): Unit = js.native
        def emits(eventEmitter: EventEmitter, event: String, message: String): Unit = js.native
        def emits(eventEmitter: EventEmitter, event: String, message: String, extra: Assert): Unit = js.native
        def emits(eventEmitter: EventEmitter, event: String, message: Unit, extra: Assert): Unit = js.native
        
        /**
          * Call when tests are done running. This is not necessary if t.plan() was used,
          * or if the test function returns a Promise.
          *
          * If you call t.end() explicitly more than once, an error will be raised.
          */
        def end(): Unit = js.native
        
        /**
          * Call the end() method on all child tests, and then on this one.
          */
        def endAll(): Unit = js.native
        
        /**
          * Verify that the object found is exactly the same (that is, ===)
          * to the object that is wanted.
          */
        def equal(found: Any, wanted: Any): Boolean = js.native
        def equal(found: Any, wanted: Any, message: String): Boolean = js.native
        def equal(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        def equal(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * Verify that the object found is exactly the same (that is, ===)
          * to the object that is wanted.
          */
        @JSName("equal")
        var equal_Original: Equal = js.native
        
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        override def equals(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def equals(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def equals(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def equals(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        @JSName("equals")
        var equals_Original: Equal = js.native
        
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        override def equivalent(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def equivalent(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def equivalent(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def equivalent(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        @JSName("equivalent")
        var equivalent_Original: Equal = js.native
        
        /**
          * If the object is an error, then the assertion fails.
          *
          * Note: if an error is encountered unexpectedly,
          * it's often better to simply throw it. The Test object will handle this as a failure.
          */
        def error(obj: Any): Boolean = js.native
        def error(obj: Any, message: String): Boolean = js.native
        def error(obj: Any, message: String, extra: Assert): Boolean = js.native
        def error(obj: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * If the object is an error, then the assertion fails.
          *
          * Note: if an error is encountered unexpectedly,
          * it's often better to simply throw it. The Test object will handle this as a failure.
          */
        @JSName("error")
        var error_Original: Basic = js.native
        
        /**
          * Expect the function to throw an uncaught exception at some point in the future,
          * before the test ends.
          * If the test ends without having thrown the expected error, then the test fails.
          *
          * If the error is thrown synchronously, or within a promise,
          * then the t.throws() or t.rejects() methods are more appropriate.
          *
          * If called multiple times, then the uncaught exception errors must be emitted in the order called.
          */
        def expectUncaughtException(): Boolean = js.native
        def expectUncaughtException(fn: js.Function1[/* repeated */ Any, Any]): Boolean = js.native
        def expectUncaughtException(fn: js.Function1[/* repeated */ Any, Any], expectedError: js.Error): Boolean = js.native
        def expectUncaughtException(fn: js.Function1[/* repeated */ Any, Any], expectedError: js.Error, message: String): Boolean = js.native
        def expectUncaughtException(fn: js.Function1[/* repeated */ Any, Any], expectedError: js.Error, message: String, extra: Assert): Boolean = js.native
        def expectUncaughtException(fn: js.Function1[/* repeated */ Any, Any], expectedError: js.Error, message: Unit, extra: Assert): Boolean = js.native
        def expectUncaughtException(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: String): Boolean = js.native
        def expectUncaughtException(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: String, extra: Assert): Boolean = js.native
        def expectUncaughtException(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
        def expectUncaughtException(fn: Unit, expectedError: js.Error): Boolean = js.native
        def expectUncaughtException(fn: Unit, expectedError: js.Error, message: String): Boolean = js.native
        def expectUncaughtException(fn: Unit, expectedError: js.Error, message: String, extra: Assert): Boolean = js.native
        def expectUncaughtException(fn: Unit, expectedError: js.Error, message: Unit, extra: Assert): Boolean = js.native
        def expectUncaughtException(fn: Unit, expectedError: Unit, message: String): Boolean = js.native
        def expectUncaughtException(fn: Unit, expectedError: Unit, message: String, extra: Assert): Boolean = js.native
        def expectUncaughtException(fn: Unit, expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
        
        def fail(): Boolean = js.native
        def fail(message: String): Boolean = js.native
        def fail(message: String, extra: Assert): Boolean = js.native
        def fail(message: Unit, extra: Assert): Boolean = js.native
        
        /**
          * @deprecated use notOk() instead.
          */
        /* CompleteClass */
        override def `false`(obj: Any): Boolean = js.native
        /* CompleteClass */
        override def `false`(obj: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def `false`(obj: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def `false`(obj: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notOk() instead.
          */
        /* CompleteClass */
        @JSName("false")
        var false_Original: Basic = js.native
        
        /**
          * Create a fixture object to specify hard links and symbolic links
          * in the fixture definition object passed to t.testdir().
          */
        def fixture(`type`: symlink | link, content: String): Instance = js.native
        @JSName("fixture")
        def fixture_dir(`type`: dir, content: Spec): Instance = js.native
        @JSName("fixture")
        def fixture_file(`type`: file, content: String): Instance = js.native
        @JSName("fixture")
        def fixture_file(`type`: file, content: Buffer): Instance = js.native
        
        /**
          * Formats the data argument of any snapshot into this string.
          *
          * @see {@link https://node-tap.org/docs/api/snapshot-testing/}
          *
          * @example t.formatSnapshot = object => JSON.stringify(object)
          */
        def formatSnapshot(obj: Any): String = js.native
        
        /**
          * Verify that the found object contains all of the provided fields, and that they coerce to the same values, even if the types do not match.
          *
          * This does not do advanced/loose matching based on constructor, regexp patterns, and so on, like t.match() does.
          * You may specify key: undefined in the pattern to ensure that a field is not defined in the found object,
          * but it will not differentiate between a missing property and a property set to undefined.
          */
        def has(found: Any, pattern: Any): Boolean = js.native
        def has(found: Any, pattern: Any, message: String): Boolean = js.native
        def has(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        def has(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        
        /**
          * @deprecated use has() instead.
          */
        /* CompleteClass */
        override def hasFields(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def hasFields(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def hasFields(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def hasFields(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use has() instead.
          */
        /* CompleteClass */
        @JSName("hasFields")
        var hasFields_Original: Match = js.native
        
        /**
          * Verify that the found object contains all of the provided fields,
          * and that they are of the same type and value as the pattern provided.
          *
          * @see has
          */
        def hasStrict(found: Any, pattern: Any): Boolean = js.native
        def hasStrict(found: Any, pattern: Any, message: String): Boolean = js.native
        def hasStrict(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        def hasStrict(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * Verify that the found object contains all of the provided fields,
          * and that they are of the same type and value as the pattern provided.
          *
          * @see has
          */
        @JSName("hasStrict")
        var hasStrict_Original: Match = js.native
        
        /**
          * Verify that the found object contains all of the provided fields, and that they coerce to the same values, even if the types do not match.
          *
          * This does not do advanced/loose matching based on constructor, regexp patterns, and so on, like t.match() does.
          * You may specify key: undefined in the pattern to ensure that a field is not defined in the found object,
          * but it will not differentiate between a missing property and a property set to undefined.
          */
        @JSName("has")
        var has_Original: Match = js.native
        
        /**
          * @deprecated use error() instead.
          */
        /* CompleteClass */
        override def ifErr(obj: Any): Boolean = js.native
        /* CompleteClass */
        override def ifErr(obj: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def ifErr(obj: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def ifErr(obj: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use error() instead.
          */
        /* CompleteClass */
        @JSName("ifErr")
        var ifErr_Original: Basic = js.native
        
        /**
          * @deprecated use error() instead.
          */
        /* CompleteClass */
        override def ifError(obj: Any): Boolean = js.native
        /* CompleteClass */
        override def ifError(obj: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def ifError(obj: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def ifError(obj: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use error() instead.
          */
        /* CompleteClass */
        @JSName("ifError")
        var ifError_Original: Basic = js.native
        
        /**
          * @deprecated use has() instead.
          */
        /* CompleteClass */
        override def include(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def include(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def include(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def include(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use has() instead.
          */
        /* CompleteClass */
        @JSName("include")
        var include_Original: Match = js.native
        
        /**
          * @deprecated use has() instead.
          */
        /* CompleteClass */
        override def includes(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def includes(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def includes(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def includes(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use has() instead.
          */
        /* CompleteClass */
        @JSName("includes")
        var includes_Original: Match = js.native
        
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        override def inequal(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def inequal(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def inequal(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def inequal(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        @JSName("inequal")
        var inequal_Original: NotEqual = js.native
        
        /**
          * @deprecated use notSame() instead.
          */
        /* CompleteClass */
        override def inequivalent(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def inequivalent(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def inequivalent(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def inequivalent(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notSame() instead.
          */
        /* CompleteClass */
        @JSName("inequivalent")
        var inequivalent_Original: NotEqual = js.native
        
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        override def is(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def is(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def is(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def is(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        
        /**
          * @deprecated use type() instead.
          */
        /* CompleteClass */
        override def isA(found: Any, `type`: String): Boolean = js.native
        /* CompleteClass */
        override def isA(found: Any, `type`: String, message: String): Boolean = js.native
        /* CompleteClass */
        override def isA(found: Any, `type`: String, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isA(found: Any, `type`: String, message: Unit, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isA(found: Any, `type`: Instantiable1[/* args (repeated) */ Any, js.Object]): Boolean = js.native
        /* CompleteClass */
        override def isA(found: Any, `type`: Instantiable1[/* args (repeated) */ Any, js.Object], message: String): Boolean = js.native
        /* CompleteClass */
        override def isA(
          found: Any,
          `type`: Instantiable1[/* args (repeated) */ Any, js.Object],
          message: String,
          extra: Assert
        ): Boolean = js.native
        /* CompleteClass */
        override def isA(
          found: Any,
          `type`: Instantiable1[/* args (repeated) */ Any, js.Object],
          message: Unit,
          extra: Assert
        ): Boolean = js.native
        /**
          * @deprecated use type() instead.
          */
        /* CompleteClass */
        @JSName("isA")
        var isA_Original: Type = js.native
        
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        override def isDeep(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def isDeep(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isDeep(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isDeep(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        @JSName("isDeep")
        var isDeep_Original: Equal = js.native
        
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        override def isDeeply(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def isDeeply(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isDeeply(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isDeeply(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        @JSName("isDeeply")
        var isDeeply_Original: Equal = js.native
        
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        override def isDissimilar(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def isDissimilar(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isDissimilar(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isDissimilar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        @JSName("isDissimilar")
        var isDissimilar_Original: Match = js.native
        
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        override def isEqual(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def isEqual(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isEqual(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isEqual(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        @JSName("isEqual")
        var isEqual_Original: Equal = js.native
        
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        override def isInequal(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def isInequal(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isInequal(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isInequal(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        @JSName("isInequal")
        var isInequal_Original: NotEqual = js.native
        
        /**
          * @deprecated use match() instead.
          */
        /* CompleteClass */
        override def isLike(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def isLike(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isLike(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isLike(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use match() instead.
          */
        /* CompleteClass */
        @JSName("isLike")
        var isLike_Original: Match = js.native
        
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        override def isLoose(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def isLoose(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isLoose(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isLoose(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        @JSName("isLoose")
        var isLoose_Original: Equal = js.native
        
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        override def isNot(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def isNot(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isNot(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isNot(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        override def isNotEqual(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def isNotEqual(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isNotEqual(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isNotEqual(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        @JSName("isNotEqual")
        var isNotEqual_Original: NotEqual = js.native
        
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        override def isNotLike(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def isNotLike(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isNotLike(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isNotLike(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        @JSName("isNotLike")
        var isNotLike_Original: Match = js.native
        
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        override def isNotSimilar(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def isNotSimilar(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isNotSimilar(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isNotSimilar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        @JSName("isNotSimilar")
        var isNotSimilar_Original: Match = js.native
        
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        @JSName("isNot")
        var isNot_Original: NotEqual = js.native
        
        /**
          * @deprecated use match() instead.
          */
        /* CompleteClass */
        override def isSimilar(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def isSimilar(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isSimilar(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isSimilar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use match() instead.
          */
        /* CompleteClass */
        @JSName("isSimilar")
        var isSimilar_Original: Match = js.native
        
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        override def isStrict(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def isStrict(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isStrict(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isStrict(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        @JSName("isStrict")
        var isStrict_Original: Equal = js.native
        
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        override def isStrictly(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def isStrictly(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isStrictly(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isStrictly(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        @JSName("isStrictly")
        var isStrictly_Original: Equal = js.native
        
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        override def isUnlike(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def isUnlike(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def isUnlike(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isUnlike(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        @JSName("isUnlike")
        var isUnlike_Original: Match = js.native
        
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        @JSName("is")
        var is_Original: Equal = js.native
        
        /**
          * @deprecated use type() instead.
          */
        /* CompleteClass */
        override def isa(found: Any, `type`: String): Boolean = js.native
        /* CompleteClass */
        override def isa(found: Any, `type`: String, message: String): Boolean = js.native
        /* CompleteClass */
        override def isa(found: Any, `type`: String, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isa(found: Any, `type`: String, message: Unit, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def isa(found: Any, `type`: Instantiable1[/* args (repeated) */ Any, js.Object]): Boolean = js.native
        /* CompleteClass */
        override def isa(found: Any, `type`: Instantiable1[/* args (repeated) */ Any, js.Object], message: String): Boolean = js.native
        /* CompleteClass */
        override def isa(
          found: Any,
          `type`: Instantiable1[/* args (repeated) */ Any, js.Object],
          message: String,
          extra: Assert
        ): Boolean = js.native
        /* CompleteClass */
        override def isa(
          found: Any,
          `type`: Instantiable1[/* args (repeated) */ Any, js.Object],
          message: Unit,
          extra: Assert
        ): Boolean = js.native
        /**
          * @deprecated use type() instead.
          */
        /* CompleteClass */
        @JSName("isa")
        var isa_Original: Type = js.native
        
        /**
          * If you set the t.jobs property to a number greater than 1,
          * then it will enable parallel execution of all of this test's children.
          */
        var jobs: Double = js.native
        
        /**
          * @deprecated use match() instead.
          */
        /* CompleteClass */
        override def like(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def like(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def like(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def like(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use match() instead.
          */
        /* CompleteClass */
        @JSName("like")
        var like_Original: Match = js.native
        
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        override def looseEqual(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def looseEqual(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def looseEqual(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def looseEqual(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        @JSName("looseEqual")
        var looseEqual_Original: Equal = js.native
        
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        override def looseEquals(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def looseEquals(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def looseEquals(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def looseEquals(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        @JSName("looseEquals")
        var looseEquals_Original: Equal = js.native
        
        /**
          * @deprecated use notSame() instead.
          */
        /* CompleteClass */
        override def looseInequal(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def looseInequal(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def looseInequal(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def looseInequal(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notSame() instead.
          */
        /* CompleteClass */
        @JSName("looseInequal")
        var looseInequal_Original: NotEqual = js.native
        
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        override def looseIs(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def looseIs(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def looseIs(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def looseIs(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use same() instead.
          */
        /* CompleteClass */
        @JSName("looseIs")
        var looseIs_Original: Equal = js.native
        
        /**
          * @deprecated use notSame() instead.
          */
        /* CompleteClass */
        override def looseNot(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def looseNot(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def looseNot(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def looseNot(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notSame() instead.
          */
        /* CompleteClass */
        @JSName("looseNot")
        var looseNot_Original: NotEqual = js.native
        
        /**
          * Verify that the found object matches the pattern provided.
          *
          * If pattern is a regular expression, and found is a string, then verify that the string matches the pattern.
          * If the pattern is a string, and found is a string, then verify that the pattern occurs within the string somewhere.
          * If pattern is an object, then verify that all of the (enumerable) fields in the pattern match the corresponding fields in the object using this same algorithm.
          *
          * This is useful when you want to verify that an object has a certain set of required fields, but additional fields are ok.
          *
          * @example {x:/a[sdf]{3}/} would successfully match {x:'asdf',y:'z'}.
          */
        def `match`(found: Any, pattern: Any): Boolean = js.native
        def `match`(found: Any, pattern: Any, message: String): Boolean = js.native
        def `match`(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        def `match`(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        
        // WARN: This is not described in the documentation formally anymore?
        /**
          * Checks if the output in data matches the data with this snapshot name.
          *
          * @see {@link https://node-tap.org/docs/api/snapshot-testing/}
          */
        def matchSnapshot(output: Any): Boolean = js.native
        def matchSnapshot(output: Any, message: String): Boolean = js.native
        def matchSnapshot(output: Any, message: String, extra: Assert): Boolean = js.native
        def matchSnapshot(output: Any, message: Unit, extra: Assert): Boolean = js.native
        
        /**
          * Verify that the found object matches the pattern provided.
          *
          * If pattern is a regular expression, and found is a string, then verify that the string matches the pattern.
          * If the pattern is a string, and found is a string, then verify that the pattern occurs within the string somewhere.
          * If pattern is an object, then verify that all of the (enumerable) fields in the pattern match the corresponding fields in the object using this same algorithm.
          *
          * This is useful when you want to verify that an object has a certain set of required fields, but additional fields are ok.
          *
          * @example {x:/a[sdf]{3}/} would successfully match {x:'asdf',y:'z'}.
          */
        @JSName("match")
        var match_Original: Match = js.native
        
        /**
          * @deprecated use match() instead.
          */
        /* CompleteClass */
        override def matches(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def matches(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def matches(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def matches(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use match() instead.
          */
        /* CompleteClass */
        @JSName("matches")
        var matches_Original: Match = js.native
        
        // TODO: Investigate whether - using generics - this could
        // return the type of module provided unioned with the mocks?
        /**
          * Takes a path to a module and returns the specified module in context of the
          * mocks provided.
          *
          * @see {@link https://node-tap.org/docs/api/mocks/}
          *
          * @param modulePath - The string path to the module that is being required,
          * relative to the current test file.
          * @param mocks - The key/value pairs of paths (relative to the current test)
          * and the value that should be returned when anything in the loaded module requires
          * those modules.
          */
        def mock(modulePath: String, mocks: Record[String, Any]): Any = js.native
        
        /**
          * This is a read-only property set to the string value provided
          * as the name argument to t.test(), or an empty string if no name is provided.
          */
        val name: String = js.native
        
        /**
          * Inverse of t.equal().
          *
          * Verify that the object found is not exactly the same (that is, !==)
          * as the object that is wanted.
          */
        def not(found: Any, notWanted: Any): Boolean = js.native
        def not(found: Any, notWanted: Any, message: String): Boolean = js.native
        def not(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        def not(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        
        /**
          * @deprecated use notSame() instead.
          */
        /* CompleteClass */
        override def notDeep(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def notDeep(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def notDeep(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notDeep(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notSame() instead.
          */
        /* CompleteClass */
        @JSName("notDeep")
        var notDeep_Original: NotEqual = js.native
        
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        override def notDeeply(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def notDeeply(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def notDeeply(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notDeeply(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        @JSName("notDeeply")
        var notDeeply_Original: NotEqual = js.native
        
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        override def notEqual(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def notEqual(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def notEqual(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notEqual(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        @JSName("notEqual")
        var notEqual_Original: NotEqual = js.native
        
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        override def notEquals(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def notEquals(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def notEquals(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notEquals(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        @JSName("notEquals")
        var notEquals_Original: NotEqual = js.native
        
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        override def notLike(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def notLike(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def notLike(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notLike(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        @JSName("notLike")
        var notLike_Original: Match = js.native
        
        /**
          * @deprecated use notSame() instead.
          */
        /* CompleteClass */
        override def notLoose(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def notLoose(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def notLoose(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notLoose(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notSame() instead.
          */
        /* CompleteClass */
        @JSName("notLoose")
        var notLoose_Original: NotEqual = js.native
        
        /**
          * Inverse of match().
          *
          * Verify that the found object does not match the pattern provided.
          */
        def notMatch(found: Any, pattern: Any): Boolean = js.native
        def notMatch(found: Any, pattern: Any, message: String): Boolean = js.native
        def notMatch(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        def notMatch(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * Inverse of match().
          *
          * Verify that the found object does not match the pattern provided.
          */
        @JSName("notMatch")
        var notMatch_Original: Match = js.native
        
        /**
          * Verifies that the object is not truthy.
          */
        def notOk(obj: Any): Boolean = js.native
        def notOk(obj: Any, message: String): Boolean = js.native
        def notOk(obj: Any, message: String, extra: Assert): Boolean = js.native
        def notOk(obj: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * Verifies that the object is not truthy.
          */
        @JSName("notOk")
        var notOk_Original: Basic = js.native
        
        /**
          * Inverse of t.same().
          *
          * Verify that the found object is not deeply equivalent to the unwanted object.
          * Uses non-strict inequality (ie, !=) for scalars.
          */
        def notSame(found: Any, notWanted: Any): Boolean = js.native
        def notSame(found: Any, notWanted: Any, message: String): Boolean = js.native
        def notSame(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        def notSame(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        override def notSameStrict(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def notSameStrict(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def notSameStrict(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notSameStrict(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        @JSName("notSameStrict")
        var notSameStrict_Original: NotEqual = js.native
        
        /**
          * Inverse of t.same().
          *
          * Verify that the found object is not deeply equivalent to the unwanted object.
          * Uses non-strict inequality (ie, !=) for scalars.
          */
        @JSName("notSame")
        var notSame_Original: NotEqual = js.native
        
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        override def notSimilar(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def notSimilar(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def notSimilar(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notSimilar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        @JSName("notSimilar")
        var notSimilar_Original: Match = js.native
        
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        override def notStrictEqual(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def notStrictEqual(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def notStrictEqual(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notStrictEqual(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        @JSName("notStrictEqual")
        var notStrictEqual_Original: NotEqual = js.native
        
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        override def notStrictEquals(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def notStrictEquals(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def notStrictEquals(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notStrictEquals(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use not() instead.
          */
        /* CompleteClass */
        @JSName("notStrictEquals")
        var notStrictEquals_Original: NotEqual = js.native
        
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        override def notStrictSame(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def notStrictSame(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def notStrictSame(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notStrictSame(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        @JSName("notStrictSame")
        var notStrictSame_Original: NotEqual = js.native
        
        /**
          * @deprecated use doesNotThrow() instead.
          */
        /* CompleteClass */
        override def notThrow(): Boolean = js.native
        /* CompleteClass */
        override def notThrow(fn: js.Function1[/* repeated */ Any, Any]): Boolean = js.native
        /* CompleteClass */
        override def notThrow(fn: js.Function1[/* repeated */ Any, Any], message: String): Boolean = js.native
        /* CompleteClass */
        override def notThrow(fn: js.Function1[/* repeated */ Any, Any], message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notThrow(fn: js.Function1[/* repeated */ Any, Any], message: Unit, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notThrow(fn: Unit, message: String): Boolean = js.native
        /* CompleteClass */
        override def notThrow(fn: Unit, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def notThrow(fn: Unit, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use doesNotThrow() instead.
          */
        /* CompleteClass */
        @JSName("notThrow")
        var notThrow_Original: DoesNotThrow = js.native
        
        /**
          * Inverse of t.equal().
          *
          * Verify that the object found is not exactly the same (that is, !==)
          * as the object that is wanted.
          */
        @JSName("not")
        var not_Original: NotEqual = js.native
        
        // ----
        // Assertions below this line!
        // ----
        /**
          * Verifies that the object is truthy.
          */
        def ok(obj: Any): Boolean = js.native
        def ok(obj: Any, message: String): Boolean = js.native
        def ok(obj: Any, message: String, extra: Assert): Boolean = js.native
        def ok(obj: Any, message: Unit, extra: Assert): Boolean = js.native
        // ----
        // Assertions below this line!
        // ----
        /**
          * Verifies that the object is truthy.
          */
        @JSName("ok")
        var ok_Original: Basic = js.native
        
        /**
          * Exactly the same as t.test(), but adds only: true in the options.
          *
          * @see {@link https://node-tap.org/docs/api/only}
          */
        def only(name: String): js.Promise[Unit] = js.native
        def only(name: String, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
        def only(name: String, extra: Unit, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
        def only(name: String, extra: typings.tap.mod.Options.Test): js.Promise[Unit] = js.native
        def only(
          name: String,
          extra: typings.tap.mod.Options.Test,
          cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]
        ): js.Promise[Unit] = js.native
        
        def pass(): Boolean = js.native
        def pass(message: String): Boolean = js.native
        def pass(message: String, extra: Assert): Boolean = js.native
        def pass(message: Unit, extra: Assert): Boolean = js.native
        
        /**
          * Return true if everything so far is ok.
          */
        def passing(): Boolean = js.native
        
        /**
          * Specify that a given number of tests are going to be run.
          *
          * This may only be called before running any asserts or child tests.
          */
        def plan(n: Double): Unit = js.native
        def plan(n: Double, comment: String): Unit = js.native
        
        /**
          * Sets a pragma switch for a set of boolean keys in the argument.
          *
          * The only pragma currently supported by the TAP parser is strict,
          * which tells the parser to treat non-TAP output as a failure.
          */
        def pragma(set: Pragma): Unit = js.native
        
        def rejects(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]]): js.Promise[Unit] = js.native
        def rejects(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]], expectedError: Any): js.Promise[Unit] = js.native
        def rejects(
          promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]],
          expectedError: Any,
          message: String
        ): js.Promise[Unit] = js.native
        def rejects(
          promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]],
          expectedError: Any,
          message: String,
          extra: Assert
        ): js.Promise[Unit] = js.native
        def rejects(
          promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]],
          expectedError: Any,
          message: Unit,
          extra: Assert
        ): js.Promise[Unit] = js.native
        def rejects(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]], message: String): js.Promise[Unit] = js.native
        def rejects(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]], message: String, extra: Assert): js.Promise[Unit] = js.native
        def rejects(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]], message: Unit, extra: Assert): js.Promise[Unit] = js.native
        def rejects(promiseOrFn: js.Promise[Any]): js.Promise[Unit] = js.native
        /**
          * Verifies that the promise (or promise-returning function) rejects.
          *
          * If an expected error is provided,
          * then also verify that the rejection matches the expected error.
          */
        def rejects(promiseOrFn: js.Promise[Any], expectedError: Any): js.Promise[Unit] = js.native
        def rejects(promiseOrFn: js.Promise[Any], expectedError: Any, message: String): js.Promise[Unit] = js.native
        def rejects(promiseOrFn: js.Promise[Any], expectedError: Any, message: String, extra: Assert): js.Promise[Unit] = js.native
        def rejects(promiseOrFn: js.Promise[Any], expectedError: Any, message: Unit, extra: Assert): js.Promise[Unit] = js.native
        def rejects(promiseOrFn: js.Promise[Any], message: String): js.Promise[Unit] = js.native
        def rejects(promiseOrFn: js.Promise[Any], message: String, extra: Assert): js.Promise[Unit] = js.native
        def rejects(promiseOrFn: js.Promise[Any], message: Unit, extra: Assert): js.Promise[Unit] = js.native
        
        def resolveMatch(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]], wanted: Any): js.Promise[Unit] = js.native
        def resolveMatch(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]], wanted: Any, message: String): js.Promise[Unit] = js.native
        def resolveMatch(
          promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]],
          wanted: Any,
          message: String,
          extra: Assert
        ): js.Promise[Unit] = js.native
        def resolveMatch(
          promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]],
          wanted: Any,
          message: Unit,
          extra: Assert
        ): js.Promise[Unit] = js.native
        /**
          * Verifies that the promise (or promise-returning function) resolves
          * and that the value of the promise matches the wanted pattern using t.match.
          *
          * @see match
          */
        def resolveMatch(promiseOrFn: js.Promise[Any], wanted: Any): js.Promise[Unit] = js.native
        def resolveMatch(promiseOrFn: js.Promise[Any], wanted: Any, message: String): js.Promise[Unit] = js.native
        def resolveMatch(promiseOrFn: js.Promise[Any], wanted: Any, message: String, extra: Assert): js.Promise[Unit] = js.native
        def resolveMatch(promiseOrFn: js.Promise[Any], wanted: Any, message: Unit, extra: Assert): js.Promise[Unit] = js.native
        
        def resolveMatchSnapshot(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]]): js.Promise[Unit] = js.native
        def resolveMatchSnapshot(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]], message: String): js.Promise[Unit] = js.native
        def resolveMatchSnapshot(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]], message: String, extra: Assert): js.Promise[Unit] = js.native
        def resolveMatchSnapshot(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]], message: Unit, extra: Assert): js.Promise[Unit] = js.native
        /**
          * Verifies that the promise (or promise-returning function) resolves, and
          * furthermore that the value of the promise matches the snapshot.
          *
          * Note: since promises always reject and resolve asynchronously, this
          * assertion is implemented asynchronously. As such, it does not return a
          * boolean to indicate its passing status. Instead, it returns a Promise
          * that resolves when it is completed.
          */
        def resolveMatchSnapshot(promiseOrFn: js.Promise[Any]): js.Promise[Unit] = js.native
        def resolveMatchSnapshot(promiseOrFn: js.Promise[Any], message: String): js.Promise[Unit] = js.native
        def resolveMatchSnapshot(promiseOrFn: js.Promise[Any], message: String, extra: Assert): js.Promise[Unit] = js.native
        def resolveMatchSnapshot(promiseOrFn: js.Promise[Any], message: Unit, extra: Assert): js.Promise[Unit] = js.native
        
        def resolves(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]]): js.Promise[Unit] = js.native
        def resolves(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]], message: String): js.Promise[Unit] = js.native
        def resolves(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]], message: String, extra: Assert): js.Promise[Unit] = js.native
        def resolves(promiseOrFn: js.Function1[/* repeated */ Any, js.Promise[Any]], message: Unit, extra: Assert): js.Promise[Unit] = js.native
        /**
          * Verifies that the promise (or promise-returning function) resolves,
          * making no expectation about the value that the promise resolves to.
          */
        def resolves(promiseOrFn: js.Promise[Any]): js.Promise[Unit] = js.native
        def resolves(promiseOrFn: js.Promise[Any], message: String): js.Promise[Unit] = js.native
        def resolves(promiseOrFn: js.Promise[Any], message: String, extra: Assert): js.Promise[Unit] = js.native
        def resolves(promiseOrFn: js.Promise[Any], message: Unit, extra: Assert): js.Promise[Unit] = js.native
        
        /**
          * Set to true to only run child tests that have only: true
          * set in their options (or are run with t.only(), which is the same thing).
          */
        var runOnly: Boolean = js.native
        
        /**
          * Verify that the found object is deeply equivalent to the wanted object.
          *
          * Uses non-strict equality for scalars (ie, ==).
          */
        def same(found: Any, wanted: Any): Boolean = js.native
        def same(found: Any, wanted: Any, message: String): Boolean = js.native
        def same(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        def same(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        override def sameStrict(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def sameStrict(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def sameStrict(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def sameStrict(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        @JSName("sameStrict")
        var sameStrict_Original: Equal = js.native
        
        /**
          * Verify that the found object is deeply equivalent to the wanted object.
          *
          * Uses non-strict equality for scalars (ie, ==).
          */
        @JSName("same")
        var same_Original: Equal = js.native
        
        /**
          * Fail the test with a timeout error if it goes longer than the specified number of ms.
          *
          * Call t.setTimeout(0) to remove the timeout setting.
          *
          * When this is called on the top-level tap object, it sets the runners timeout value
          * to the specified value for that test process as well.
          */
        def setTimeout(n: Double): Unit = js.native
        
        /**
          * @deprecated use match() instead.
          */
        /* CompleteClass */
        override def similar(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def similar(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def similar(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def similar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use match() instead.
          */
        /* CompleteClass */
        @JSName("similar")
        var similar_Original: Match = js.native
        
        /**
          * Exactly the same as t.test(), but adds skip: true in the options.
          */
        def skip(name: String): js.Promise[Unit] = js.native
        def skip(name: String, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
        def skip(name: String, extra: Unit, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
        def skip(name: String, extra: typings.tap.mod.Options.Test): js.Promise[Unit] = js.native
        def skip(
          name: String,
          extra: typings.tap.mod.Options.Test,
          cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]
        ): js.Promise[Unit] = js.native
        
        /**
          * Sometimes, instead of running a child test directly inline, you might
          * want to run a TAP producting test as a child process, and treat its
          * standard output as the TAP stream.
          *
          * Returns a Promise which resolves with the parent when the child process
          * is completed.
          *
          * @see {@link https://node-tap.org/docs/api/advanced/#tspawncommand-arguments-options-name}
          */
        def spawn(cmd: String, args: String): js.Promise[Unit] = js.native
        def spawn(cmd: String, args: String, options: Unit, name: String): js.Promise[Unit] = js.native
        def spawn(cmd: String, args: String, options: Unit, name: String, extra: Spawn): js.Promise[Unit] = js.native
        def spawn(cmd: String, args: String, options: Unit, name: Unit, extra: Spawn): js.Promise[Unit] = js.native
        def spawn(cmd: String, args: String, options: Bag): js.Promise[Unit] = js.native
        def spawn(cmd: String, args: String, options: Bag, name: String): js.Promise[Unit] = js.native
        def spawn(cmd: String, args: String, options: Bag, name: String, extra: Spawn): js.Promise[Unit] = js.native
        def spawn(cmd: String, args: String, options: Bag, name: Unit, extra: Spawn): js.Promise[Unit] = js.native
        
        /**
          * Parse standard input as if it was a child test named /dev/stdin.
          *
          * Returns a Promise which resolves with the parent when the input stream is
          * completed.
          */
        def stdin(name: String): js.Promise[Unit] = js.native
        def stdin(name: String, extra: Bag): js.Promise[Unit] = js.native
        
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        override def strictDeepEqual(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def strictDeepEqual(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def strictDeepEqual(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def strictDeepEqual(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        @JSName("strictDeepEqual")
        var strictDeepEqual_Original: Equal = js.native
        
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        override def strictDeepEquals(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def strictDeepEquals(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def strictDeepEquals(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def strictDeepEquals(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        @JSName("strictDeepEquals")
        var strictDeepEquals_Original: Equal = js.native
        
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        override def strictDeepInequal(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def strictDeepInequal(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def strictDeepInequal(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def strictDeepInequal(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        @JSName("strictDeepInequal")
        var strictDeepInequal_Original: NotEqual = js.native
        
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        override def strictDeepInequals(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def strictDeepInequals(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def strictDeepInequals(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def strictDeepInequals(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        @JSName("strictDeepInequals")
        var strictDeepInequals_Original: NotEqual = js.native
        
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        override def strictEqual(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def strictEqual(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def strictEqual(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def strictEqual(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        @JSName("strictEqual")
        var strictEqual_Original: Equal = js.native
        
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        override def strictEquals(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def strictEquals(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def strictEquals(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def strictEquals(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        @JSName("strictEquals")
        var strictEquals_Original: Equal = js.native
        
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        override def strictEquivalent(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def strictEquivalent(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def strictEquivalent(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def strictEquivalent(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictSame() instead.
          */
        /* CompleteClass */
        @JSName("strictEquivalent")
        var strictEquivalent_Original: Equal = js.native
        
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        override def strictInequivalent(found: Any, notWanted: Any): Boolean = js.native
        /* CompleteClass */
        override def strictInequivalent(found: Any, notWanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def strictInequivalent(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def strictInequivalent(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use strictNotSame() instead.
          */
        /* CompleteClass */
        @JSName("strictInequivalent")
        var strictInequivalent_Original: NotEqual = js.native
        
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        override def strictIs(found: Any, wanted: Any): Boolean = js.native
        /* CompleteClass */
        override def strictIs(found: Any, wanted: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def strictIs(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def strictIs(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use equal() instead.
          */
        /* CompleteClass */
        @JSName("strictIs")
        var strictIs_Original: Equal = js.native
        
        /**
          * Inverse of t.strictSame().
          *
          * Verify that the found object is not deeply equivalent to the unwanted object.
          * Uses strict equality for scalars (ie, ===).
          */
        def strictNotSame(found: Any, notWanted: Any): Boolean = js.native
        def strictNotSame(found: Any, notWanted: Any, message: String): Boolean = js.native
        def strictNotSame(found: Any, notWanted: Any, message: String, extra: Assert): Boolean = js.native
        def strictNotSame(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * Inverse of t.strictSame().
          *
          * Verify that the found object is not deeply equivalent to the unwanted object.
          * Uses strict equality for scalars (ie, ===).
          */
        @JSName("strictNotSame")
        var strictNotSame_Original: NotEqual = js.native
        
        /**
          * Strict version of t.same().
          *
          * Verify that the found object is deeply equivalent to the wanted object.
          * Uses strict equality for scalars (ie, ===).
          */
        def strictSame(found: Any, wanted: Any): Boolean = js.native
        def strictSame(found: Any, wanted: Any, message: String): Boolean = js.native
        def strictSame(found: Any, wanted: Any, message: String, extra: Assert): Boolean = js.native
        def strictSame(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * Strict version of t.same().
          *
          * Verify that the found object is deeply equivalent to the wanted object.
          * Uses strict equality for scalars (ie, ===).
          */
        @JSName("strictSame")
        var strictSame_Original: Equal = js.native
        
        /**
          * @deprecated use teardown() instead.
          */
        /* CompleteClass */
        override def tearDown(fn: js.Function0[Unit | js.Promise[Unit]]): Unit = js.native
        
        /**
          * Run the supplied function when t.end() is called, or when t.plan is met.
          *
          * This function can return a promise to support async actions.
          * @see {@link https://node-tap.org/docs/api/test-lifecycle-events}
          * @param fn
          */
        def teardown(fn: js.Function0[Unit | js.Promise[Unit]]): Unit = js.native
        
        /**
          * Create a subtest.
          *
          * Returns a Promise which resolves with the parent when the child test is completed.
          * @param name - The name for this subtest.
          * @param extra - Any options this subtest should adhere to.
          * @param cb - The function containing the sub-tests. If not present, the test
          * will automatically be marked as a todo.
          */
        def test(name: String): js.Promise[Unit] = js.native
        def test(name: String, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
        def test(name: String, extra: Unit, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
        def test(name: String, extra: typings.tap.mod.Options.Test): js.Promise[Unit] = js.native
        def test(
          name: String,
          extra: typings.tap.mod.Options.Test,
          cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]
        ): js.Promise[Unit] = js.native
        
        /**
          * Create a fresh directory with the specified fixtures,
          * which is deleted on test teardown. Returns the directory name.
          *
          * @see {@link https://node-tap.org/docs/api/fixtures/}
          */
        def testdir(): String = js.native
        def testdir(spec: Spec): String = js.native
        
        val testdirName: String = js.native
        
        /**
          * When an uncaught exception is raised in the context of a test,
          * then this method is used to handle the error. It fails the test,
          * and prints out appropriate information about the stack, message, current test,
          * and so on.
          *
          * Generally, you never need to worry about this directly.
          */
        def threw(error: js.Error): Unit = js.native
        def threw(error: js.Error, extra: js.Error): Unit = js.native
        def threw(error: js.Error, extra: js.Error, proxy: typings.tap.mod.global.Tap.Test): Unit = js.native
        def threw(error: js.Error, extra: Unit, proxy: typings.tap.mod.global.Tap.Test): Unit = js.native
        
        /**
          * @deprecated use throws() instead.
          */
        /* CompleteClass */
        override def `throw`(): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: js.Function1[/* repeated */ Any, Any]): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, message: Unit, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: String): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: Unit, expectedError: Any): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: Unit, expectedError: Any, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: Unit, expectedError: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: Unit, expectedError: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: Unit, expectedError: Any, message: Unit, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: Unit, expectedError: Unit, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: Unit, expectedError: Unit, message: String): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: Unit, expectedError: Unit, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def `throw`(fn: Unit, expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use throws() instead.
          */
        /* CompleteClass */
        @JSName("throw")
        var throw_Original: Throws = js.native
        
        /**
          * Expect the function to throw an error.
          * If an expected error is provided, then also verify that the thrown error
          * matches the expected error.
          *
          * If the function has a name, and the message is not provided,
          * then the function name will be used as the message.
          *
          * If the function is not provided, then this will be treated as a todo test.
          */
        def throws(): Boolean = js.native
        def throws(fn: js.Function1[/* repeated */ Any, Any]): Boolean = js.native
        def throws(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any): Boolean = js.native
        def throws(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, extra: Assert): Boolean = js.native
        def throws(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, message: String): Boolean = js.native
        def throws(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, message: String, extra: Assert): Boolean = js.native
        def throws(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, message: Unit, extra: Assert): Boolean = js.native
        def throws(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, extra: Assert): Boolean = js.native
        def throws(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: String): Boolean = js.native
        def throws(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: String, extra: Assert): Boolean = js.native
        def throws(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
        def throws(fn: Unit, expectedError: Any): Boolean = js.native
        def throws(fn: Unit, expectedError: Any, extra: Assert): Boolean = js.native
        def throws(fn: Unit, expectedError: Any, message: String): Boolean = js.native
        def throws(fn: Unit, expectedError: Any, message: String, extra: Assert): Boolean = js.native
        def throws(fn: Unit, expectedError: Any, message: Unit, extra: Assert): Boolean = js.native
        def throws(fn: Unit, expectedError: Unit, extra: Assert): Boolean = js.native
        def throws(fn: Unit, expectedError: Unit, message: String): Boolean = js.native
        def throws(fn: Unit, expectedError: Unit, message: String, extra: Assert): Boolean = js.native
        def throws(fn: Unit, expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
        /**
          * Expect the function to throw an error.
          * If an expected error is provided, then also verify that the thrown error
          * matches the expected error.
          *
          * If the function has a name, and the message is not provided,
          * then the function name will be used as the message.
          *
          * If the function is not provided, then this will be treated as a todo test.
          */
        @JSName("throws")
        var throws_Original: Throws = js.native
        
        /**
          * Exactly the same as t.test(), but adds todo: true in the options.
          */
        def todo(name: String): js.Promise[Unit] = js.native
        def todo(name: String, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
        def todo(name: String, extra: Unit, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
        def todo(name: String, extra: typings.tap.mod.Options.Test): js.Promise[Unit] = js.native
        def todo(
          name: String,
          extra: typings.tap.mod.Options.Test,
          cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]
        ): js.Promise[Unit] = js.native
        
        /**
          * @deprecated use ok() instead.
          */
        /* CompleteClass */
        override def `true`(obj: Any): Boolean = js.native
        /* CompleteClass */
        override def `true`(obj: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def `true`(obj: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def `true`(obj: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use ok() instead.
          */
        /* CompleteClass */
        @JSName("true")
        var true_Original: Basic = js.native
        
        /**
          * Verify that the object is of the type provided.
          *
          * Type can be a string that matches the typeof value of the object,
          * or the string name of any constructor in the object's prototype chain,
          * or a constructor function in the object's prototype chain.
          *
          * @example type(new Date(), "object") - true
          * @example type(new Date(), "Date") - true
          * @example type(new Date(), Date) - true
          */
        def `type`(found: Any, `type`: String): Boolean = js.native
        def `type`(found: Any, `type`: String, message: String): Boolean = js.native
        def `type`(found: Any, `type`: String, message: String, extra: Assert): Boolean = js.native
        def `type`(found: Any, `type`: String, message: Unit, extra: Assert): Boolean = js.native
        def `type`(found: Any, `type`: Instantiable1[/* args (repeated) */ Any, js.Object]): Boolean = js.native
        def `type`(found: Any, `type`: Instantiable1[/* args (repeated) */ Any, js.Object], message: String): Boolean = js.native
        def `type`(
          found: Any,
          `type`: Instantiable1[/* args (repeated) */ Any, js.Object],
          message: String,
          extra: Assert
        ): Boolean = js.native
        def `type`(
          found: Any,
          `type`: Instantiable1[/* args (repeated) */ Any, js.Object],
          message: Unit,
          extra: Assert
        ): Boolean = js.native
        /**
          * Verify that the object is of the type provided.
          *
          * Type can be a string that matches the typeof value of the object,
          * or the string name of any constructor in the object's prototype chain,
          * or a constructor function in the object's prototype chain.
          *
          * @example type(new Date(), "object") - true
          * @example type(new Date(), "Date") - true
          * @example type(new Date(), Date) - true
          */
        @JSName("type")
        var type_Original: Type = js.native
        
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        override def unlike(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def unlike(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def unlike(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def unlike(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        @JSName("unlike")
        var unlike_Original: Match = js.native
        
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        override def unsimilar(found: Any, pattern: Any): Boolean = js.native
        /* CompleteClass */
        override def unsimilar(found: Any, pattern: Any, message: String): Boolean = js.native
        /* CompleteClass */
        override def unsimilar(found: Any, pattern: Any, message: String, extra: Assert): Boolean = js.native
        /* CompleteClass */
        override def unsimilar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean = js.native
        /**
          * @deprecated use notMatch() instead.
          */
        /* CompleteClass */
        @JSName("unsimilar")
        var unsimilar_Original: Match = js.native
      }
      
      object Fixture {
        
        trait Instance extends StObject {
          
          var content: String | Buffer | Spec
          
          var `type`: symlink | link | file | dir
        }
        object Instance {
          
          inline def apply(content: String | Buffer | Spec, `type`: symlink | link | file | dir): Instance = {
            val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
            __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
            __obj.asInstanceOf[Instance]
          }
          
          extension [Self <: Instance](x: Self) {
            
            inline def setContent(value: String | Buffer | Spec): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
            
            inline def setType(value: symlink | link | file | dir): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          }
        }
        
        /** 
        NOTE: Rewritten from type alias:
        {{{
        type Spec = {[pathname: string] : string | node.buffer.<global>.Buffer | tap.tap.<global>.Tap.Fixture.Instance | tap.tap.<global>.Tap.Fixture.Spec}
        }}}
        to avoid circular code involving: 
        - tap.tap.<global>.Tap.Fixture.Spec
        */
        trait Spec
          extends StObject
             with /* pathname */ StringDictionary[String | Buffer | Instance | Spec]
        object Spec {
          
          inline def apply(): Spec = {
            val __obj = js.Dynamic.literal()
            __obj.asInstanceOf[Spec]
          }
        }
      }
      
      @js.native
      trait Mocha extends StObject {
        
        def describe(): Unit = js.native
        def describe(name: String): Unit = js.native
        def describe(name: String, fn: js.Function1[/* a */ Any, Any]): Unit = js.native
        def describe(name: Unit, fn: js.Function1[/* a */ Any, Any]): Unit = js.native
        
        def global(): Unit = js.native
        
        def it(): Unit = js.native
        def it(name: String): Unit = js.native
        def it(name: String, fn: js.Function1[/* a */ Any, Any]): Unit = js.native
        def it(name: Unit, fn: js.Function1[/* a */ Any, Any]): Unit = js.native
        @JSName("it")
        var it_Original: MochaIt = js.native
      }
      
      @js.native
      trait MochaIt extends StObject {
        
        def apply(): Unit = js.native
        def apply(name: String): Unit = js.native
        def apply(name: String, fn: js.Function1[/* a */ Any, Any]): Unit = js.native
        def apply(name: Unit, fn: js.Function1[/* a */ Any, Any]): Unit = js.native
        
        def skip(): Unit = js.native
        def skip(name: String): Unit = js.native
        def skip(name: String, fn: js.Function1[/* a */ Any, Any]): Unit = js.native
        def skip(name: Unit, fn: js.Function1[/* a */ Any, Any]): Unit = js.native
        
        def todo(): Unit = js.native
        def todo(name: String): Unit = js.native
        def todo(name: String, fn: js.Function1[/* a */ Any, Any]): Unit = js.native
        def todo(name: Unit, fn: js.Function1[/* a */ Any, Any]): Unit = js.native
      }
      
      // Little hack to simulate the Test class on the tap export
      @js.native
      trait TestConstructor
        extends StObject
           with Instantiable0[typings.tap.mod.global.Tap.Test]
           with Instantiable1[/* options */ typings.tap.mod.Options.Test, typings.tap.mod.global.Tap.Test]
    }
  }
  
  object Assertions {
    
    type Basic = js.Function3[
        /* obj */ Any, 
        /* message */ js.UndefOr[String], 
        /* extra */ js.UndefOr[Assert], 
        Boolean
      ]
    
    type DoesNotThrow = js.Function3[
        /* fn */ js.UndefOr[js.Function1[/* repeated */ Any, Any]], 
        /* message */ js.UndefOr[String], 
        /* extra */ js.UndefOr[Assert], 
        Boolean
      ]
    
    type Equal = js.Function4[
        /* found */ Any, 
        /* wanted */ Any, 
        /* message */ js.UndefOr[String], 
        /* extra */ js.UndefOr[Assert], 
        Boolean
      ]
    
    type Match = js.Function4[
        /* found */ Any, 
        /* pattern */ Any, 
        /* message */ js.UndefOr[String], 
        /* extra */ js.UndefOr[Assert], 
        Boolean
      ]
    
    type NotEqual = js.Function4[
        /* found */ Any, 
        /* notWanted */ Any, 
        /* message */ js.UndefOr[String], 
        /* extra */ js.UndefOr[Assert], 
        Boolean
      ]
    
    @js.native
    trait Throws extends StObject {
      
      def apply(): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ Any, Any]): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, extra: Assert): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, message: String): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, message: String, extra: Assert): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, message: Unit, extra: Assert): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, extra: Assert): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: String): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: String, extra: Assert): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
      def apply(fn: Unit, expectedError: Any): Boolean = js.native
      def apply(fn: Unit, expectedError: Any, extra: Assert): Boolean = js.native
      def apply(fn: Unit, expectedError: Any, message: String): Boolean = js.native
      def apply(fn: Unit, expectedError: Any, message: String, extra: Assert): Boolean = js.native
      def apply(fn: Unit, expectedError: Any, message: Unit, extra: Assert): Boolean = js.native
      def apply(fn: Unit, expectedError: Unit, extra: Assert): Boolean = js.native
      def apply(fn: Unit, expectedError: Unit, message: String): Boolean = js.native
      def apply(fn: Unit, expectedError: Unit, message: String, extra: Assert): Boolean = js.native
      def apply(fn: Unit, expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
    }
    
    type Type = js.Function4[
        /* found */ Any, 
        /* type */ String | (Instantiable1[/* args (repeated) */ Any, js.Object]), 
        /* message */ js.UndefOr[String], 
        /* extra */ js.UndefOr[Assert], 
        Boolean
      ]
  }
  
  /**
    * Tap v15 deprecates **ALL** synonyms for assertions.
    */
  trait DeprecatedAssertionSynonyms extends StObject {
    
    /**
      * @deprecated use ok() instead.
      */
    def assert(obj: Any): Boolean
    def assert(obj: Any, message: String): Boolean
    def assert(obj: Any, message: String, extra: Assert): Boolean
    def assert(obj: Any, message: Unit, extra: Assert): Boolean
    
    /**
      * @deprecated use assertNot() instead.
      */
    def assertNot(obj: Any): Boolean
    def assertNot(obj: Any, message: String): Boolean
    def assertNot(obj: Any, message: String, extra: Assert): Boolean
    def assertNot(obj: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use assertNot() instead.
      */
    @JSName("assertNot")
    var assertNot_Original: Basic
    
    /**
      * @deprecated use ok() instead.
      */
    @JSName("assert")
    var assert_Original: Basic
    
    /**
      * @deprecated use has() instead.
      */
    def contains(found: Any, pattern: Any): Boolean
    def contains(found: Any, pattern: Any, message: String): Boolean
    def contains(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def contains(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use has() instead.
      */
    @JSName("contains")
    var contains_Original: Match
    
    /**
      * @deprecated use same() instead.
      */
    def deepEqual(found: Any, wanted: Any): Boolean
    def deepEqual(found: Any, wanted: Any, message: String): Boolean
    def deepEqual(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def deepEqual(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use same() instead.
      */
    @JSName("deepEqual")
    var deepEqual_Original: Equal
    
    /**
      * @deprecated use same() instead.
      */
    def deepEquals(found: Any, wanted: Any): Boolean
    def deepEquals(found: Any, wanted: Any, message: String): Boolean
    def deepEquals(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def deepEquals(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use same() instead.
      */
    @JSName("deepEquals")
    var deepEquals_Original: Equal
    
    /**
      * @deprecated use notSame() instead.
      */
    def deepInequal(found: Any, notWanted: Any): Boolean
    def deepInequal(found: Any, notWanted: Any, message: String): Boolean
    def deepInequal(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def deepInequal(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notSame() instead.
      */
    @JSName("deepInequal")
    var deepInequal_Original: NotEqual
    
    /**
      * @deprecated use strictSame() instead.
      */
    def deepIs(found: Any, wanted: Any): Boolean
    def deepIs(found: Any, wanted: Any, message: String): Boolean
    def deepIs(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def deepIs(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictSame() instead.
      */
    @JSName("deepIs")
    var deepIs_Original: Equal
    
    /**
      * @deprecated use strictNotSame() instead.
      */
    def deepNot(found: Any, notWanted: Any): Boolean
    def deepNot(found: Any, notWanted: Any, message: String): Boolean
    def deepNot(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def deepNot(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictNotSame() instead.
      */
    @JSName("deepNot")
    var deepNot_Original: NotEqual
    
    /**
      * @deprecated use notMatch() instead.
      */
    def dissimilar(found: Any, pattern: Any): Boolean
    def dissimilar(found: Any, pattern: Any, message: String): Boolean
    def dissimilar(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def dissimilar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notMatch() instead.
      */
    @JSName("dissimilar")
    var dissimilar_Original: Match
    
    /**
      * @deprecated use not() instead.
      */
    def doesNotEqual(found: Any, notWanted: Any): Boolean
    def doesNotEqual(found: Any, notWanted: Any, message: String): Boolean
    def doesNotEqual(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def doesNotEqual(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use not() instead.
      */
    @JSName("doesNotEqual")
    var doesNotEqual_Original: NotEqual
    
    /**
      * @deprecated use notMatch() instead.
      */
    def doesNotHave(found: Any, pattern: Any): Boolean
    def doesNotHave(found: Any, pattern: Any, message: String): Boolean
    def doesNotHave(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def doesNotHave(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notMatch() instead.
      */
    @JSName("doesNotHave")
    var doesNotHave_Original: Match
    
    /**
      * @deprecated use equal() instead.
      */
    def equals(found: Any, wanted: Any): Boolean
    def equals(found: Any, wanted: Any, message: String): Boolean
    def equals(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def equals(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use equal() instead.
      */
    @JSName("equals")
    var equals_Original: Equal
    
    /**
      * @deprecated use same() instead.
      */
    def equivalent(found: Any, wanted: Any): Boolean
    def equivalent(found: Any, wanted: Any, message: String): Boolean
    def equivalent(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def equivalent(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use same() instead.
      */
    @JSName("equivalent")
    var equivalent_Original: Equal
    
    /**
      * @deprecated use notOk() instead.
      */
    def `false`(obj: Any): Boolean
    def `false`(obj: Any, message: String): Boolean
    def `false`(obj: Any, message: String, extra: Assert): Boolean
    def `false`(obj: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notOk() instead.
      */
    @JSName("false")
    var false_Original: Basic
    
    /**
      * @deprecated use has() instead.
      */
    def hasFields(found: Any, pattern: Any): Boolean
    def hasFields(found: Any, pattern: Any, message: String): Boolean
    def hasFields(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def hasFields(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use has() instead.
      */
    @JSName("hasFields")
    var hasFields_Original: Match
    
    /**
      * @deprecated use error() instead.
      */
    def ifErr(obj: Any): Boolean
    def ifErr(obj: Any, message: String): Boolean
    def ifErr(obj: Any, message: String, extra: Assert): Boolean
    def ifErr(obj: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use error() instead.
      */
    @JSName("ifErr")
    var ifErr_Original: Basic
    
    /**
      * @deprecated use error() instead.
      */
    def ifError(obj: Any): Boolean
    def ifError(obj: Any, message: String): Boolean
    def ifError(obj: Any, message: String, extra: Assert): Boolean
    def ifError(obj: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use error() instead.
      */
    @JSName("ifError")
    var ifError_Original: Basic
    
    /**
      * @deprecated use has() instead.
      */
    def include(found: Any, pattern: Any): Boolean
    def include(found: Any, pattern: Any, message: String): Boolean
    def include(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def include(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use has() instead.
      */
    @JSName("include")
    var include_Original: Match
    
    /**
      * @deprecated use has() instead.
      */
    def includes(found: Any, pattern: Any): Boolean
    def includes(found: Any, pattern: Any, message: String): Boolean
    def includes(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def includes(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use has() instead.
      */
    @JSName("includes")
    var includes_Original: Match
    
    /**
      * @deprecated use not() instead.
      */
    def inequal(found: Any, notWanted: Any): Boolean
    def inequal(found: Any, notWanted: Any, message: String): Boolean
    def inequal(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def inequal(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use not() instead.
      */
    @JSName("inequal")
    var inequal_Original: NotEqual
    
    /**
      * @deprecated use notSame() instead.
      */
    def inequivalent(found: Any, notWanted: Any): Boolean
    def inequivalent(found: Any, notWanted: Any, message: String): Boolean
    def inequivalent(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def inequivalent(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notSame() instead.
      */
    @JSName("inequivalent")
    var inequivalent_Original: NotEqual
    
    /**
      * @deprecated use equal() instead.
      */
    def is(found: Any, wanted: Any): Boolean
    def is(found: Any, wanted: Any, message: String): Boolean
    def is(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def is(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    
    /**
      * @deprecated use type() instead.
      */
    def isA(found: Any, `type`: String): Boolean
    def isA(found: Any, `type`: String, message: String): Boolean
    def isA(found: Any, `type`: String, message: String, extra: Assert): Boolean
    def isA(found: Any, `type`: String, message: Unit, extra: Assert): Boolean
    def isA(found: Any, `type`: Instantiable1[/* args (repeated) */ Any, js.Object]): Boolean
    def isA(found: Any, `type`: Instantiable1[/* args (repeated) */ Any, js.Object], message: String): Boolean
    def isA(
      found: Any,
      `type`: Instantiable1[/* args (repeated) */ Any, js.Object],
      message: String,
      extra: Assert
    ): Boolean
    def isA(
      found: Any,
      `type`: Instantiable1[/* args (repeated) */ Any, js.Object],
      message: Unit,
      extra: Assert
    ): Boolean
    /**
      * @deprecated use type() instead.
      */
    @JSName("isA")
    var isA_Original: Type
    
    /**
      * @deprecated use strictSame() instead.
      */
    def isDeep(found: Any, wanted: Any): Boolean
    def isDeep(found: Any, wanted: Any, message: String): Boolean
    def isDeep(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def isDeep(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictSame() instead.
      */
    @JSName("isDeep")
    var isDeep_Original: Equal
    
    /**
      * @deprecated use strictSame() instead.
      */
    def isDeeply(found: Any, wanted: Any): Boolean
    def isDeeply(found: Any, wanted: Any, message: String): Boolean
    def isDeeply(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def isDeeply(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictSame() instead.
      */
    @JSName("isDeeply")
    var isDeeply_Original: Equal
    
    /**
      * @deprecated use notMatch() instead.
      */
    def isDissimilar(found: Any, pattern: Any): Boolean
    def isDissimilar(found: Any, pattern: Any, message: String): Boolean
    def isDissimilar(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def isDissimilar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notMatch() instead.
      */
    @JSName("isDissimilar")
    var isDissimilar_Original: Match
    
    /**
      * @deprecated use equal() instead.
      */
    def isEqual(found: Any, wanted: Any): Boolean
    def isEqual(found: Any, wanted: Any, message: String): Boolean
    def isEqual(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def isEqual(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use equal() instead.
      */
    @JSName("isEqual")
    var isEqual_Original: Equal
    
    /**
      * @deprecated use not() instead.
      */
    def isInequal(found: Any, notWanted: Any): Boolean
    def isInequal(found: Any, notWanted: Any, message: String): Boolean
    def isInequal(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def isInequal(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use not() instead.
      */
    @JSName("isInequal")
    var isInequal_Original: NotEqual
    
    /**
      * @deprecated use match() instead.
      */
    def isLike(found: Any, pattern: Any): Boolean
    def isLike(found: Any, pattern: Any, message: String): Boolean
    def isLike(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def isLike(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use match() instead.
      */
    @JSName("isLike")
    var isLike_Original: Match
    
    /**
      * @deprecated use same() instead.
      */
    def isLoose(found: Any, wanted: Any): Boolean
    def isLoose(found: Any, wanted: Any, message: String): Boolean
    def isLoose(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def isLoose(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use same() instead.
      */
    @JSName("isLoose")
    var isLoose_Original: Equal
    
    /**
      * @deprecated use not() instead.
      */
    def isNot(found: Any, notWanted: Any): Boolean
    def isNot(found: Any, notWanted: Any, message: String): Boolean
    def isNot(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def isNot(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    
    /**
      * @deprecated use not() instead.
      */
    def isNotEqual(found: Any, notWanted: Any): Boolean
    def isNotEqual(found: Any, notWanted: Any, message: String): Boolean
    def isNotEqual(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def isNotEqual(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use not() instead.
      */
    @JSName("isNotEqual")
    var isNotEqual_Original: NotEqual
    
    /**
      * @deprecated use notMatch() instead.
      */
    def isNotLike(found: Any, pattern: Any): Boolean
    def isNotLike(found: Any, pattern: Any, message: String): Boolean
    def isNotLike(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def isNotLike(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notMatch() instead.
      */
    @JSName("isNotLike")
    var isNotLike_Original: Match
    
    /**
      * @deprecated use notMatch() instead.
      */
    def isNotSimilar(found: Any, pattern: Any): Boolean
    def isNotSimilar(found: Any, pattern: Any, message: String): Boolean
    def isNotSimilar(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def isNotSimilar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notMatch() instead.
      */
    @JSName("isNotSimilar")
    var isNotSimilar_Original: Match
    
    /**
      * @deprecated use not() instead.
      */
    @JSName("isNot")
    var isNot_Original: NotEqual
    
    /**
      * @deprecated use match() instead.
      */
    def isSimilar(found: Any, pattern: Any): Boolean
    def isSimilar(found: Any, pattern: Any, message: String): Boolean
    def isSimilar(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def isSimilar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use match() instead.
      */
    @JSName("isSimilar")
    var isSimilar_Original: Match
    
    /**
      * @deprecated use equal() instead.
      */
    def isStrict(found: Any, wanted: Any): Boolean
    def isStrict(found: Any, wanted: Any, message: String): Boolean
    def isStrict(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def isStrict(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use equal() instead.
      */
    @JSName("isStrict")
    var isStrict_Original: Equal
    
    /**
      * @deprecated use equal() instead.
      */
    def isStrictly(found: Any, wanted: Any): Boolean
    def isStrictly(found: Any, wanted: Any, message: String): Boolean
    def isStrictly(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def isStrictly(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use equal() instead.
      */
    @JSName("isStrictly")
    var isStrictly_Original: Equal
    
    /**
      * @deprecated use notMatch() instead.
      */
    def isUnlike(found: Any, pattern: Any): Boolean
    def isUnlike(found: Any, pattern: Any, message: String): Boolean
    def isUnlike(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def isUnlike(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notMatch() instead.
      */
    @JSName("isUnlike")
    var isUnlike_Original: Match
    
    /**
      * @deprecated use equal() instead.
      */
    @JSName("is")
    var is_Original: Equal
    
    /**
      * @deprecated use type() instead.
      */
    def isa(found: Any, `type`: String): Boolean
    def isa(found: Any, `type`: String, message: String): Boolean
    def isa(found: Any, `type`: String, message: String, extra: Assert): Boolean
    def isa(found: Any, `type`: String, message: Unit, extra: Assert): Boolean
    def isa(found: Any, `type`: Instantiable1[/* args (repeated) */ Any, js.Object]): Boolean
    def isa(found: Any, `type`: Instantiable1[/* args (repeated) */ Any, js.Object], message: String): Boolean
    def isa(
      found: Any,
      `type`: Instantiable1[/* args (repeated) */ Any, js.Object],
      message: String,
      extra: Assert
    ): Boolean
    def isa(
      found: Any,
      `type`: Instantiable1[/* args (repeated) */ Any, js.Object],
      message: Unit,
      extra: Assert
    ): Boolean
    /**
      * @deprecated use type() instead.
      */
    @JSName("isa")
    var isa_Original: Type
    
    /**
      * @deprecated use match() instead.
      */
    def like(found: Any, pattern: Any): Boolean
    def like(found: Any, pattern: Any, message: String): Boolean
    def like(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def like(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use match() instead.
      */
    @JSName("like")
    var like_Original: Match
    
    /**
      * @deprecated use same() instead.
      */
    def looseEqual(found: Any, wanted: Any): Boolean
    def looseEqual(found: Any, wanted: Any, message: String): Boolean
    def looseEqual(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def looseEqual(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use same() instead.
      */
    @JSName("looseEqual")
    var looseEqual_Original: Equal
    
    /**
      * @deprecated use same() instead.
      */
    def looseEquals(found: Any, wanted: Any): Boolean
    def looseEquals(found: Any, wanted: Any, message: String): Boolean
    def looseEquals(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def looseEquals(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use same() instead.
      */
    @JSName("looseEquals")
    var looseEquals_Original: Equal
    
    /**
      * @deprecated use notSame() instead.
      */
    def looseInequal(found: Any, notWanted: Any): Boolean
    def looseInequal(found: Any, notWanted: Any, message: String): Boolean
    def looseInequal(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def looseInequal(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notSame() instead.
      */
    @JSName("looseInequal")
    var looseInequal_Original: NotEqual
    
    /**
      * @deprecated use same() instead.
      */
    def looseIs(found: Any, wanted: Any): Boolean
    def looseIs(found: Any, wanted: Any, message: String): Boolean
    def looseIs(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def looseIs(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use same() instead.
      */
    @JSName("looseIs")
    var looseIs_Original: Equal
    
    /**
      * @deprecated use notSame() instead.
      */
    def looseNot(found: Any, notWanted: Any): Boolean
    def looseNot(found: Any, notWanted: Any, message: String): Boolean
    def looseNot(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def looseNot(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notSame() instead.
      */
    @JSName("looseNot")
    var looseNot_Original: NotEqual
    
    /**
      * @deprecated use match() instead.
      */
    def matches(found: Any, pattern: Any): Boolean
    def matches(found: Any, pattern: Any, message: String): Boolean
    def matches(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def matches(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use match() instead.
      */
    @JSName("matches")
    var matches_Original: Match
    
    /**
      * @deprecated use notSame() instead.
      */
    def notDeep(found: Any, notWanted: Any): Boolean
    def notDeep(found: Any, notWanted: Any, message: String): Boolean
    def notDeep(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def notDeep(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notSame() instead.
      */
    @JSName("notDeep")
    var notDeep_Original: NotEqual
    
    /**
      * @deprecated use strictNotSame() instead.
      */
    def notDeeply(found: Any, notWanted: Any): Boolean
    def notDeeply(found: Any, notWanted: Any, message: String): Boolean
    def notDeeply(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def notDeeply(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictNotSame() instead.
      */
    @JSName("notDeeply")
    var notDeeply_Original: NotEqual
    
    /**
      * @deprecated use not() instead.
      */
    def notEqual(found: Any, notWanted: Any): Boolean
    def notEqual(found: Any, notWanted: Any, message: String): Boolean
    def notEqual(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def notEqual(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use not() instead.
      */
    @JSName("notEqual")
    var notEqual_Original: NotEqual
    
    /**
      * @deprecated use not() instead.
      */
    def notEquals(found: Any, notWanted: Any): Boolean
    def notEquals(found: Any, notWanted: Any, message: String): Boolean
    def notEquals(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def notEquals(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use not() instead.
      */
    @JSName("notEquals")
    var notEquals_Original: NotEqual
    
    /**
      * @deprecated use notMatch() instead.
      */
    def notLike(found: Any, pattern: Any): Boolean
    def notLike(found: Any, pattern: Any, message: String): Boolean
    def notLike(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def notLike(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notMatch() instead.
      */
    @JSName("notLike")
    var notLike_Original: Match
    
    /**
      * @deprecated use notSame() instead.
      */
    def notLoose(found: Any, notWanted: Any): Boolean
    def notLoose(found: Any, notWanted: Any, message: String): Boolean
    def notLoose(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def notLoose(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notSame() instead.
      */
    @JSName("notLoose")
    var notLoose_Original: NotEqual
    
    /**
      * @deprecated use strictNotSame() instead.
      */
    def notSameStrict(found: Any, notWanted: Any): Boolean
    def notSameStrict(found: Any, notWanted: Any, message: String): Boolean
    def notSameStrict(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def notSameStrict(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictNotSame() instead.
      */
    @JSName("notSameStrict")
    var notSameStrict_Original: NotEqual
    
    /**
      * @deprecated use notMatch() instead.
      */
    def notSimilar(found: Any, pattern: Any): Boolean
    def notSimilar(found: Any, pattern: Any, message: String): Boolean
    def notSimilar(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def notSimilar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notMatch() instead.
      */
    @JSName("notSimilar")
    var notSimilar_Original: Match
    
    /**
      * @deprecated use not() instead.
      */
    def notStrictEqual(found: Any, notWanted: Any): Boolean
    def notStrictEqual(found: Any, notWanted: Any, message: String): Boolean
    def notStrictEqual(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def notStrictEqual(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use not() instead.
      */
    @JSName("notStrictEqual")
    var notStrictEqual_Original: NotEqual
    
    /**
      * @deprecated use not() instead.
      */
    def notStrictEquals(found: Any, notWanted: Any): Boolean
    def notStrictEquals(found: Any, notWanted: Any, message: String): Boolean
    def notStrictEquals(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def notStrictEquals(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use not() instead.
      */
    @JSName("notStrictEquals")
    var notStrictEquals_Original: NotEqual
    
    /**
      * @deprecated use strictNotSame() instead.
      */
    def notStrictSame(found: Any, notWanted: Any): Boolean
    def notStrictSame(found: Any, notWanted: Any, message: String): Boolean
    def notStrictSame(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def notStrictSame(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictNotSame() instead.
      */
    @JSName("notStrictSame")
    var notStrictSame_Original: NotEqual
    
    /**
      * @deprecated use doesNotThrow() instead.
      */
    def notThrow(): Boolean
    def notThrow(fn: js.Function1[/* repeated */ Any, Any]): Boolean
    def notThrow(fn: js.Function1[/* repeated */ Any, Any], message: String): Boolean
    def notThrow(fn: js.Function1[/* repeated */ Any, Any], message: String, extra: Assert): Boolean
    def notThrow(fn: js.Function1[/* repeated */ Any, Any], message: Unit, extra: Assert): Boolean
    def notThrow(fn: Unit, message: String): Boolean
    def notThrow(fn: Unit, message: String, extra: Assert): Boolean
    def notThrow(fn: Unit, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use doesNotThrow() instead.
      */
    @JSName("notThrow")
    var notThrow_Original: DoesNotThrow
    
    /**
      * @deprecated use strictSame() instead.
      */
    def sameStrict(found: Any, wanted: Any): Boolean
    def sameStrict(found: Any, wanted: Any, message: String): Boolean
    def sameStrict(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def sameStrict(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictSame() instead.
      */
    @JSName("sameStrict")
    var sameStrict_Original: Equal
    
    /**
      * @deprecated use match() instead.
      */
    def similar(found: Any, pattern: Any): Boolean
    def similar(found: Any, pattern: Any, message: String): Boolean
    def similar(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def similar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use match() instead.
      */
    @JSName("similar")
    var similar_Original: Match
    
    /**
      * @deprecated use strictSame() instead.
      */
    def strictDeepEqual(found: Any, wanted: Any): Boolean
    def strictDeepEqual(found: Any, wanted: Any, message: String): Boolean
    def strictDeepEqual(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def strictDeepEqual(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictSame() instead.
      */
    @JSName("strictDeepEqual")
    var strictDeepEqual_Original: Equal
    
    /**
      * @deprecated use strictSame() instead.
      */
    def strictDeepEquals(found: Any, wanted: Any): Boolean
    def strictDeepEquals(found: Any, wanted: Any, message: String): Boolean
    def strictDeepEquals(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def strictDeepEquals(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictSame() instead.
      */
    @JSName("strictDeepEquals")
    var strictDeepEquals_Original: Equal
    
    /**
      * @deprecated use strictNotSame() instead.
      */
    def strictDeepInequal(found: Any, notWanted: Any): Boolean
    def strictDeepInequal(found: Any, notWanted: Any, message: String): Boolean
    def strictDeepInequal(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def strictDeepInequal(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictNotSame() instead.
      */
    @JSName("strictDeepInequal")
    var strictDeepInequal_Original: NotEqual
    
    /**
      * @deprecated use strictNotSame() instead.
      */
    def strictDeepInequals(found: Any, notWanted: Any): Boolean
    def strictDeepInequals(found: Any, notWanted: Any, message: String): Boolean
    def strictDeepInequals(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def strictDeepInequals(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictNotSame() instead.
      */
    @JSName("strictDeepInequals")
    var strictDeepInequals_Original: NotEqual
    
    /**
      * @deprecated use equal() instead.
      */
    def strictEqual(found: Any, wanted: Any): Boolean
    def strictEqual(found: Any, wanted: Any, message: String): Boolean
    def strictEqual(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def strictEqual(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use equal() instead.
      */
    @JSName("strictEqual")
    var strictEqual_Original: Equal
    
    /**
      * @deprecated use equal() instead.
      */
    def strictEquals(found: Any, wanted: Any): Boolean
    def strictEquals(found: Any, wanted: Any, message: String): Boolean
    def strictEquals(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def strictEquals(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use equal() instead.
      */
    @JSName("strictEquals")
    var strictEquals_Original: Equal
    
    /**
      * @deprecated use strictSame() instead.
      */
    def strictEquivalent(found: Any, wanted: Any): Boolean
    def strictEquivalent(found: Any, wanted: Any, message: String): Boolean
    def strictEquivalent(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def strictEquivalent(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictSame() instead.
      */
    @JSName("strictEquivalent")
    var strictEquivalent_Original: Equal
    
    /**
      * @deprecated use strictNotSame() instead.
      */
    def strictInequivalent(found: Any, notWanted: Any): Boolean
    def strictInequivalent(found: Any, notWanted: Any, message: String): Boolean
    def strictInequivalent(found: Any, notWanted: Any, message: String, extra: Assert): Boolean
    def strictInequivalent(found: Any, notWanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use strictNotSame() instead.
      */
    @JSName("strictInequivalent")
    var strictInequivalent_Original: NotEqual
    
    /**
      * @deprecated use equal() instead.
      */
    def strictIs(found: Any, wanted: Any): Boolean
    def strictIs(found: Any, wanted: Any, message: String): Boolean
    def strictIs(found: Any, wanted: Any, message: String, extra: Assert): Boolean
    def strictIs(found: Any, wanted: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use equal() instead.
      */
    @JSName("strictIs")
    var strictIs_Original: Equal
    
    /**
      * @deprecated use teardown() instead.
      */
    def tearDown(fn: js.Function0[Unit | js.Promise[Unit]]): Unit
    
    /**
      * @deprecated use throws() instead.
      */
    def `throw`(): Boolean
    def `throw`(fn: js.Function1[/* repeated */ Any, Any]): Boolean
    def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any): Boolean
    def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, extra: Assert): Boolean
    def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, message: String): Boolean
    def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, message: String, extra: Assert): Boolean
    def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Any, message: Unit, extra: Assert): Boolean
    def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, extra: Assert): Boolean
    def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: String): Boolean
    def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: String, extra: Assert): Boolean
    def `throw`(fn: js.Function1[/* repeated */ Any, Any], expectedError: Unit, message: Unit, extra: Assert): Boolean
    def `throw`(fn: Unit, expectedError: Any): Boolean
    def `throw`(fn: Unit, expectedError: Any, extra: Assert): Boolean
    def `throw`(fn: Unit, expectedError: Any, message: String): Boolean
    def `throw`(fn: Unit, expectedError: Any, message: String, extra: Assert): Boolean
    def `throw`(fn: Unit, expectedError: Any, message: Unit, extra: Assert): Boolean
    def `throw`(fn: Unit, expectedError: Unit, extra: Assert): Boolean
    def `throw`(fn: Unit, expectedError: Unit, message: String): Boolean
    def `throw`(fn: Unit, expectedError: Unit, message: String, extra: Assert): Boolean
    def `throw`(fn: Unit, expectedError: Unit, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use throws() instead.
      */
    @JSName("throw")
    var throw_Original: Throws
    
    /**
      * @deprecated use ok() instead.
      */
    def `true`(obj: Any): Boolean
    def `true`(obj: Any, message: String): Boolean
    def `true`(obj: Any, message: String, extra: Assert): Boolean
    def `true`(obj: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use ok() instead.
      */
    @JSName("true")
    var true_Original: Basic
    
    /**
      * @deprecated use notMatch() instead.
      */
    def unlike(found: Any, pattern: Any): Boolean
    def unlike(found: Any, pattern: Any, message: String): Boolean
    def unlike(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def unlike(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notMatch() instead.
      */
    @JSName("unlike")
    var unlike_Original: Match
    
    /**
      * @deprecated use notMatch() instead.
      */
    def unsimilar(found: Any, pattern: Any): Boolean
    def unsimilar(found: Any, pattern: Any, message: String): Boolean
    def unsimilar(found: Any, pattern: Any, message: String, extra: Assert): Boolean
    def unsimilar(found: Any, pattern: Any, message: Unit, extra: Assert): Boolean
    /**
      * @deprecated use notMatch() instead.
      */
    @JSName("unsimilar")
    var unsimilar_Original: Match
  }
  object DeprecatedAssertionSynonyms {
    
    inline def apply(
      assert: (/* obj */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      assertNot: (/* obj */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      contains: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      deepEqual: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      deepEquals: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      deepInequal: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      deepIs: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      deepNot: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      dissimilar: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      doesNotEqual: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      doesNotHave: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      equals_ : (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      equivalent: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      `false`: (/* obj */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      hasFields: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      ifErr: (/* obj */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      ifError: (/* obj */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      include: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      includes: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      inequal: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      inequivalent: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      is: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isA: (/* found */ Any, /* type */ String | (Instantiable1[/* args (repeated) */ Any, js.Object]), /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isDeep: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isDeeply: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isDissimilar: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isEqual: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isInequal: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isLike: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isLoose: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isNot: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isNotEqual: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isNotLike: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isNotSimilar: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isSimilar: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isStrict: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isStrictly: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isUnlike: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      isa: (/* found */ Any, /* type */ String | (Instantiable1[/* args (repeated) */ Any, js.Object]), /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      like: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      looseEqual: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      looseEquals: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      looseInequal: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      looseIs: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      looseNot: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      matches: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      notDeep: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      notDeeply: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      notEqual: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      notEquals: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      notLike: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      notLoose: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      notSameStrict: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      notSimilar: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      notStrictEqual: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      notStrictEquals: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      notStrictSame: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      notThrow: (/* fn */ js.UndefOr[js.Function1[/* repeated */ Any, Any]], /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      sameStrict: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      similar: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      strictDeepEqual: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      strictDeepEquals: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      strictDeepInequal: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      strictDeepInequals: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      strictEqual: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      strictEquals: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      strictEquivalent: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      strictInequivalent: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      strictIs: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      tearDown: js.Function0[Unit | js.Promise[Unit]] => Unit,
      `throw`: Throws,
      `true`: (/* obj */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      unlike: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean,
      unsimilar: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
    ): DeprecatedAssertionSynonyms = {
      val __obj = js.Dynamic.literal(assert = js.Any.fromFunction3(assert), assertNot = js.Any.fromFunction3(assertNot), contains = js.Any.fromFunction4(contains), deepEqual = js.Any.fromFunction4(deepEqual), deepEquals = js.Any.fromFunction4(deepEquals), deepInequal = js.Any.fromFunction4(deepInequal), deepIs = js.Any.fromFunction4(deepIs), deepNot = js.Any.fromFunction4(deepNot), dissimilar = js.Any.fromFunction4(dissimilar), doesNotEqual = js.Any.fromFunction4(doesNotEqual), doesNotHave = js.Any.fromFunction4(doesNotHave), equivalent = js.Any.fromFunction4(equivalent), hasFields = js.Any.fromFunction4(hasFields), ifErr = js.Any.fromFunction3(ifErr), ifError = js.Any.fromFunction3(ifError), include = js.Any.fromFunction4(include), includes = js.Any.fromFunction4(includes), inequal = js.Any.fromFunction4(inequal), inequivalent = js.Any.fromFunction4(inequivalent), is = js.Any.fromFunction4(is), isA = js.Any.fromFunction4(isA), isDeep = js.Any.fromFunction4(isDeep), isDeeply = js.Any.fromFunction4(isDeeply), isDissimilar = js.Any.fromFunction4(isDissimilar), isEqual = js.Any.fromFunction4(isEqual), isInequal = js.Any.fromFunction4(isInequal), isLike = js.Any.fromFunction4(isLike), isLoose = js.Any.fromFunction4(isLoose), isNot = js.Any.fromFunction4(isNot), isNotEqual = js.Any.fromFunction4(isNotEqual), isNotLike = js.Any.fromFunction4(isNotLike), isNotSimilar = js.Any.fromFunction4(isNotSimilar), isSimilar = js.Any.fromFunction4(isSimilar), isStrict = js.Any.fromFunction4(isStrict), isStrictly = js.Any.fromFunction4(isStrictly), isUnlike = js.Any.fromFunction4(isUnlike), isa = js.Any.fromFunction4(isa), like = js.Any.fromFunction4(like), looseEqual = js.Any.fromFunction4(looseEqual), looseEquals = js.Any.fromFunction4(looseEquals), looseInequal = js.Any.fromFunction4(looseInequal), looseIs = js.Any.fromFunction4(looseIs), looseNot = js.Any.fromFunction4(looseNot), matches = js.Any.fromFunction4(matches), notDeep = js.Any.fromFunction4(notDeep), notDeeply = js.Any.fromFunction4(notDeeply), notEqual = js.Any.fromFunction4(notEqual), notEquals = js.Any.fromFunction4(notEquals), notLike = js.Any.fromFunction4(notLike), notLoose = js.Any.fromFunction4(notLoose), notSameStrict = js.Any.fromFunction4(notSameStrict), notSimilar = js.Any.fromFunction4(notSimilar), notStrictEqual = js.Any.fromFunction4(notStrictEqual), notStrictEquals = js.Any.fromFunction4(notStrictEquals), notStrictSame = js.Any.fromFunction4(notStrictSame), notThrow = js.Any.fromFunction3(notThrow), sameStrict = js.Any.fromFunction4(sameStrict), similar = js.Any.fromFunction4(similar), strictDeepEqual = js.Any.fromFunction4(strictDeepEqual), strictDeepEquals = js.Any.fromFunction4(strictDeepEquals), strictDeepInequal = js.Any.fromFunction4(strictDeepInequal), strictDeepInequals = js.Any.fromFunction4(strictDeepInequals), strictEqual = js.Any.fromFunction4(strictEqual), strictEquals = js.Any.fromFunction4(strictEquals), strictEquivalent = js.Any.fromFunction4(strictEquivalent), strictInequivalent = js.Any.fromFunction4(strictInequivalent), strictIs = js.Any.fromFunction4(strictIs), tearDown = js.Any.fromFunction1(tearDown), unlike = js.Any.fromFunction4(unlike), unsimilar = js.Any.fromFunction4(unsimilar))
      __obj.updateDynamic("equals")(js.Any.fromFunction4(equals_))
      __obj.updateDynamic("false")(js.Any.fromFunction3(`false`))
      __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
      __obj.updateDynamic("true")(js.Any.fromFunction3(`true`))
      __obj.asInstanceOf[DeprecatedAssertionSynonyms]
    }
    
    extension [Self <: DeprecatedAssertionSynonyms](x: Self) {
      
      inline def setAssert(
        value: (/* obj */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "assert", js.Any.fromFunction3(value))
      
      inline def setAssertNot(
        value: (/* obj */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "assertNot", js.Any.fromFunction3(value))
      
      inline def setContains(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "contains", js.Any.fromFunction4(value))
      
      inline def setDeepEqual(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "deepEqual", js.Any.fromFunction4(value))
      
      inline def setDeepEquals(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "deepEquals", js.Any.fromFunction4(value))
      
      inline def setDeepInequal(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "deepInequal", js.Any.fromFunction4(value))
      
      inline def setDeepIs(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "deepIs", js.Any.fromFunction4(value))
      
      inline def setDeepNot(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "deepNot", js.Any.fromFunction4(value))
      
      inline def setDissimilar(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "dissimilar", js.Any.fromFunction4(value))
      
      inline def setDoesNotEqual(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "doesNotEqual", js.Any.fromFunction4(value))
      
      inline def setDoesNotHave(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "doesNotHave", js.Any.fromFunction4(value))
      
      inline def setEquals_(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "equals", js.Any.fromFunction4(value))
      
      inline def setEquivalent(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "equivalent", js.Any.fromFunction4(value))
      
      inline def setFalse(
        value: (/* obj */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "false", js.Any.fromFunction3(value))
      
      inline def setHasFields(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "hasFields", js.Any.fromFunction4(value))
      
      inline def setIfErr(
        value: (/* obj */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "ifErr", js.Any.fromFunction3(value))
      
      inline def setIfError(
        value: (/* obj */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "ifError", js.Any.fromFunction3(value))
      
      inline def setInclude(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "include", js.Any.fromFunction4(value))
      
      inline def setIncludes(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "includes", js.Any.fromFunction4(value))
      
      inline def setInequal(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "inequal", js.Any.fromFunction4(value))
      
      inline def setInequivalent(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "inequivalent", js.Any.fromFunction4(value))
      
      inline def setIs(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "is", js.Any.fromFunction4(value))
      
      inline def setIsA(
        value: (/* found */ Any, /* type */ String | (Instantiable1[/* args (repeated) */ Any, js.Object]), /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isA", js.Any.fromFunction4(value))
      
      inline def setIsDeep(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isDeep", js.Any.fromFunction4(value))
      
      inline def setIsDeeply(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isDeeply", js.Any.fromFunction4(value))
      
      inline def setIsDissimilar(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isDissimilar", js.Any.fromFunction4(value))
      
      inline def setIsEqual(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isEqual", js.Any.fromFunction4(value))
      
      inline def setIsInequal(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isInequal", js.Any.fromFunction4(value))
      
      inline def setIsLike(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isLike", js.Any.fromFunction4(value))
      
      inline def setIsLoose(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isLoose", js.Any.fromFunction4(value))
      
      inline def setIsNot(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isNot", js.Any.fromFunction4(value))
      
      inline def setIsNotEqual(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isNotEqual", js.Any.fromFunction4(value))
      
      inline def setIsNotLike(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isNotLike", js.Any.fromFunction4(value))
      
      inline def setIsNotSimilar(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isNotSimilar", js.Any.fromFunction4(value))
      
      inline def setIsSimilar(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isSimilar", js.Any.fromFunction4(value))
      
      inline def setIsStrict(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isStrict", js.Any.fromFunction4(value))
      
      inline def setIsStrictly(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isStrictly", js.Any.fromFunction4(value))
      
      inline def setIsUnlike(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "isUnlike", js.Any.fromFunction4(value))
      
      inline def setLike(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "like", js.Any.fromFunction4(value))
      
      inline def setLooseEqual(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "looseEqual", js.Any.fromFunction4(value))
      
      inline def setLooseEquals(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "looseEquals", js.Any.fromFunction4(value))
      
      inline def setLooseInequal(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "looseInequal", js.Any.fromFunction4(value))
      
      inline def setLooseIs(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "looseIs", js.Any.fromFunction4(value))
      
      inline def setLooseNot(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "looseNot", js.Any.fromFunction4(value))
      
      inline def setMatches(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "matches", js.Any.fromFunction4(value))
      
      inline def setNotDeep(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "notDeep", js.Any.fromFunction4(value))
      
      inline def setNotDeeply(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "notDeeply", js.Any.fromFunction4(value))
      
      inline def setNotEqual(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "notEqual", js.Any.fromFunction4(value))
      
      inline def setNotEquals(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "notEquals", js.Any.fromFunction4(value))
      
      inline def setNotLike(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "notLike", js.Any.fromFunction4(value))
      
      inline def setNotLoose(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "notLoose", js.Any.fromFunction4(value))
      
      inline def setNotSameStrict(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "notSameStrict", js.Any.fromFunction4(value))
      
      inline def setNotSimilar(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "notSimilar", js.Any.fromFunction4(value))
      
      inline def setNotStrictEqual(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "notStrictEqual", js.Any.fromFunction4(value))
      
      inline def setNotStrictEquals(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "notStrictEquals", js.Any.fromFunction4(value))
      
      inline def setNotStrictSame(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "notStrictSame", js.Any.fromFunction4(value))
      
      inline def setNotThrow(
        value: (/* fn */ js.UndefOr[js.Function1[/* repeated */ Any, Any]], /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "notThrow", js.Any.fromFunction3(value))
      
      inline def setSameStrict(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "sameStrict", js.Any.fromFunction4(value))
      
      inline def setSimilar(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "similar", js.Any.fromFunction4(value))
      
      inline def setStrictDeepEqual(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "strictDeepEqual", js.Any.fromFunction4(value))
      
      inline def setStrictDeepEquals(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "strictDeepEquals", js.Any.fromFunction4(value))
      
      inline def setStrictDeepInequal(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "strictDeepInequal", js.Any.fromFunction4(value))
      
      inline def setStrictDeepInequals(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "strictDeepInequals", js.Any.fromFunction4(value))
      
      inline def setStrictEqual(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "strictEqual", js.Any.fromFunction4(value))
      
      inline def setStrictEquals(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "strictEquals", js.Any.fromFunction4(value))
      
      inline def setStrictEquivalent(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "strictEquivalent", js.Any.fromFunction4(value))
      
      inline def setStrictInequivalent(
        value: (/* found */ Any, /* notWanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "strictInequivalent", js.Any.fromFunction4(value))
      
      inline def setStrictIs(
        value: (/* found */ Any, /* wanted */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "strictIs", js.Any.fromFunction4(value))
      
      inline def setTearDown(value: js.Function0[Unit | js.Promise[Unit]] => Unit): Self = StObject.set(x, "tearDown", js.Any.fromFunction1(value))
      
      inline def setThrow(value: Throws): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      inline def setTrue(
        value: (/* obj */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "true", js.Any.fromFunction3(value))
      
      inline def setUnlike(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "unlike", js.Any.fromFunction4(value))
      
      inline def setUnsimilar(
        value: (/* found */ Any, /* pattern */ Any, /* message */ js.UndefOr[String], /* extra */ js.UndefOr[Assert]) => Boolean
      ): Self = StObject.set(x, "unsimilar", js.Any.fromFunction4(value))
    }
  }
  
  object Options {
    
    trait Assert
      extends StObject
         with Bag {
      
      var diagnostic: js.UndefOr[Boolean] = js.undefined
      
      var skip: js.UndefOr[Boolean | String] = js.undefined
      
      var todo: js.UndefOr[Boolean | String] = js.undefined
    }
    object Assert {
      
      inline def apply(): Assert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Assert]
      }
      
      extension [Self <: Assert](x: Self) {
        
        inline def setDiagnostic(value: Boolean): Self = StObject.set(x, "diagnostic", value.asInstanceOf[js.Any])
        
        inline def setDiagnosticUndefined: Self = StObject.set(x, "diagnostic", js.undefined)
        
        inline def setSkip(value: Boolean | String): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
        
        inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
        
        inline def setTodo(value: Boolean | String): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
        
        inline def setTodoUndefined: Self = StObject.set(x, "todo", js.undefined)
      }
    }
    
    type Bag = StringDictionary[Any]
    
    type Pragma = StringDictionary[Boolean]
    
    trait Spawn
      extends StObject
         with Assert {
      
      var bail: js.UndefOr[Boolean] = js.undefined
      
      var timeout: js.UndefOr[Double] = js.undefined
    }
    object Spawn {
      
      inline def apply(): Spawn = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Spawn]
      }
      
      extension [Self <: Spawn](x: Self) {
        
        inline def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
        
        inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    trait Test
      extends StObject
         with Assert {
      
      var autoend: js.UndefOr[Boolean] = js.undefined
      
      var bail: js.UndefOr[Boolean] = js.undefined
      
      var buffered: js.UndefOr[Boolean] = js.undefined
      
      var grep: js.UndefOr[js.Array[js.RegExp]] = js.undefined
      
      var jobs: js.UndefOr[Double] = js.undefined
      
      var only: js.UndefOr[Boolean] = js.undefined
      
      var runOnly: js.UndefOr[Boolean] = js.undefined
      
      var timeout: js.UndefOr[Double] = js.undefined
    }
    object Test {
      
      inline def apply(): typings.tap.mod.Options.Test = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.tap.mod.Options.Test]
      }
      
      extension [Self <: typings.tap.mod.Options.Test](x: Self) {
        
        inline def setAutoend(value: Boolean): Self = StObject.set(x, "autoend", value.asInstanceOf[js.Any])
        
        inline def setAutoendUndefined: Self = StObject.set(x, "autoend", js.undefined)
        
        inline def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
        
        inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
        
        inline def setBuffered(value: Boolean): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
        
        inline def setBufferedUndefined: Self = StObject.set(x, "buffered", js.undefined)
        
        inline def setGrep(value: js.Array[js.RegExp]): Self = StObject.set(x, "grep", value.asInstanceOf[js.Any])
        
        inline def setGrepUndefined: Self = StObject.set(x, "grep", js.undefined)
        
        inline def setGrepVarargs(value: js.RegExp*): Self = StObject.set(x, "grep", js.Array(value*))
        
        inline def setJobs(value: Double): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
        
        inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
        
        inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
        
        inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
        
        inline def setRunOnly(value: Boolean): Self = StObject.set(x, "runOnly", value.asInstanceOf[js.Any])
        
        inline def setRunOnlyUndefined: Self = StObject.set(x, "runOnly", js.undefined)
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
  }
  
  type _To = Tap
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Tap = ^
}
