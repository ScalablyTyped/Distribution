package typings.tap

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.RegExp
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tap", JSImport.Namespace)
  @js.native
  val ^ : Tap = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tap", "Test")
  @js.native
  class TestCls ()
    extends StObject
       with Test {
    def this(options: typings.tap.mod.Options.Test) = this()
  }
  
  object Assertions {
    
    type Basic = js.Function3[
        /* obj */ js.Any, 
        /* message */ js.UndefOr[String], 
        /* extra */ js.UndefOr[Assert], 
        Boolean
      ]
    
    type DoesNotThrow = js.Function3[
        /* fn */ js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]], 
        /* message */ js.UndefOr[String], 
        /* extra */ js.UndefOr[Assert], 
        Boolean
      ]
    
    type Equal = js.Function4[
        /* found */ js.Any, 
        /* wanted */ js.Any, 
        /* message */ js.UndefOr[String], 
        /* extra */ js.UndefOr[Assert], 
        Boolean
      ]
    
    type Match = js.Function4[
        /* found */ js.Any, 
        /* pattern */ String | RegExp | StringDictionary[RegExp], 
        /* message */ js.UndefOr[String], 
        /* extra */ js.UndefOr[Assert], 
        Boolean
      ]
    
    type NotEqual = js.Function4[
        /* found */ js.Any, 
        /* notWanted */ js.Any, 
        /* message */ js.UndefOr[String], 
        /* extra */ js.UndefOr[Assert], 
        Boolean
      ]
    
    @js.native
    trait Throws extends StObject {
      
      def apply(): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ js.Any, js.Any]): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Unit, message: String): Boolean = js.native
      def apply(
        fn: js.Function1[/* repeated */ js.Any, js.Any],
        expectedError: Unit,
        message: String,
        extra: Assert
      ): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Error): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Error, message: String): Boolean = js.native
      def apply(
        fn: js.Function1[/* repeated */ js.Any, js.Any],
        expectedError: Error,
        message: String,
        extra: Assert
      ): Boolean = js.native
      def apply(
        fn: js.Function1[/* repeated */ js.Any, js.Any],
        expectedError: Error,
        message: Unit,
        extra: Assert
      ): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ js.Any, js.Any], messageOrExpectedError: String): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ js.Any, js.Any], messageOrExpectedError: String, extra: Assert): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ js.Any, js.Any], messageOrExpectedError: Unit, extra: Assert): Boolean = js.native
      def apply(fn: js.Function1[/* repeated */ js.Any, js.Any], messageOrExpectedError: Error, extra: Assert): Boolean = js.native
      def apply(fn: Unit, expectedError: Unit, message: String): Boolean = js.native
      def apply(fn: Unit, expectedError: Unit, message: String, extra: Assert): Boolean = js.native
      def apply(fn: Unit, expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
      def apply(fn: Unit, expectedError: Error): Boolean = js.native
      def apply(fn: Unit, expectedError: Error, message: String): Boolean = js.native
      def apply(fn: Unit, expectedError: Error, message: String, extra: Assert): Boolean = js.native
      def apply(fn: Unit, expectedError: Error, message: Unit, extra: Assert): Boolean = js.native
      def apply(fn: Unit, messageOrExpectedError: String): Boolean = js.native
      def apply(fn: Unit, messageOrExpectedError: String, extra: Assert): Boolean = js.native
      def apply(fn: Unit, messageOrExpectedError: Unit, extra: Assert): Boolean = js.native
      def apply(fn: Unit, messageOrExpectedError: Error, extra: Assert): Boolean = js.native
    }
    
    type Type = js.Function4[
        /* found */ js.Any, 
        /* type */ String | (Instantiable1[/* args (repeated) */ js.Any, js.Object]), 
        /* message */ js.UndefOr[String], 
        /* extra */ js.UndefOr[Assert], 
        Boolean
      ]
  }
  
  @js.native
  trait Mocha extends StObject {
    
    def describe(): Unit = js.native
    def describe(name: String): Unit = js.native
    def describe(name: String, fn: js.Function1[/* a */ js.Any, js.Any]): Unit = js.native
    def describe(name: Unit, fn: js.Function1[/* a */ js.Any, js.Any]): Unit = js.native
    
    def global(): Unit = js.native
    
    def it(): Unit = js.native
    def it(name: String): Unit = js.native
    def it(name: String, fn: js.Function1[/* a */ js.Any, js.Any]): Unit = js.native
    def it(name: Unit, fn: js.Function1[/* a */ js.Any, js.Any]): Unit = js.native
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
      
      @scala.inline
      def apply(): Assert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Assert]
      }
      
      @scala.inline
      implicit class AssertMutableBuilder[Self <: Assert] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDiagnostic(value: Boolean): Self = StObject.set(x, "diagnostic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDiagnosticUndefined: Self = StObject.set(x, "diagnostic", js.undefined)
        
        @scala.inline
        def setSkip(value: Boolean | String): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
        
        @scala.inline
        def setTodo(value: Boolean | String): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTodoUndefined: Self = StObject.set(x, "todo", js.undefined)
      }
    }
    
    type Bag = StringDictionary[js.Any]
    
    type Pragma = StringDictionary[Boolean]
    
    trait Spawn
      extends StObject
         with Assert {
      
      var bail: js.UndefOr[Boolean] = js.undefined
      
      var timeout: js.UndefOr[Double] = js.undefined
    }
    object Spawn {
      
      @scala.inline
      def apply(): Spawn = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Spawn]
      }
      
      @scala.inline
      implicit class SpawnMutableBuilder[Self <: Spawn] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    trait Test
      extends StObject
         with Assert {
      
      var autoend: js.UndefOr[Boolean] = js.undefined
      
      var bail: js.UndefOr[Boolean] = js.undefined
      
      var buffered: js.UndefOr[Boolean] = js.undefined
      
      var grep: js.UndefOr[js.Array[RegExp]] = js.undefined
      
      var jobs: js.UndefOr[Double] = js.undefined
      
      var only: js.UndefOr[Boolean] = js.undefined
      
      var runOnly: js.UndefOr[Boolean] = js.undefined
      
      var timeout: js.UndefOr[Double] = js.undefined
    }
    object Test {
      
      @scala.inline
      def apply(): typings.tap.mod.Options.Test = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.tap.mod.Options.Test]
      }
      
      @scala.inline
      implicit class TestMutableBuilder[Self <: typings.tap.mod.Options.Test] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoend(value: Boolean): Self = StObject.set(x, "autoend", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoendUndefined: Self = StObject.set(x, "autoend", js.undefined)
        
        @scala.inline
        def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
        
        @scala.inline
        def setBuffered(value: Boolean): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBufferedUndefined: Self = StObject.set(x, "buffered", js.undefined)
        
        @scala.inline
        def setGrep(value: js.Array[RegExp]): Self = StObject.set(x, "grep", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGrepUndefined: Self = StObject.set(x, "grep", js.undefined)
        
        @scala.inline
        def setGrepVarargs(value: RegExp*): Self = StObject.set(x, "grep", js.Array(value :_*))
        
        @scala.inline
        def setJobs(value: Double): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
        
        @scala.inline
        def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
        
        @scala.inline
        def setRunOnly(value: Boolean): Self = StObject.set(x, "runOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRunOnlyUndefined: Self = StObject.set(x, "runOnly", js.undefined)
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
  }
  
  @js.native
  trait Tap
    extends StObject
       with Test {
    
    var Test: TestConstructor = js.native
    
    var mocha: Mocha = js.native
    
    def mochaGlobals(): Unit = js.native
  }
  
  @js.native
  trait Test extends StObject {
    
    def addAssert(name: String, length: Double, fn: js.Function1[/* repeated */ js.Any, Boolean]): Boolean = js.native
    
    def afterEach(
      fn: js.Function2[/* done */ js.Function0[Unit], /* childTest */ this.type, Unit | js.Promise[Unit]]
    ): Unit = js.native
    
    def assert(obj: js.Any): Boolean = js.native
    def assert(obj: js.Any, message: String): Boolean = js.native
    def assert(obj: js.Any, message: String, extra: Assert): Boolean = js.native
    def assert(obj: js.Any, message: Unit, extra: Assert): Boolean = js.native
    
    def assertNot(obj: js.Any): Boolean = js.native
    def assertNot(obj: js.Any, message: String): Boolean = js.native
    def assertNot(obj: js.Any, message: String, extra: Assert): Boolean = js.native
    def assertNot(obj: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("assertNot")
    var assertNot_Original: Basic = js.native
    
    @JSName("assert")
    var assert_Original: Basic = js.native
    
    def bailout(): Unit = js.native
    def bailout(message: String): Unit = js.native
    
    def beforeEach(
      fn: js.Function2[/* done */ js.Function0[Unit], /* childTest */ this.type, Unit | js.Promise[Unit]]
    ): Unit = js.native
    
    def cleanSnapshot(s: String): String = js.native
    
    def comment(message: String, args: js.Any*): Unit = js.native
    
    def contains(found: js.Any, pattern: String): Boolean = js.native
    def contains(found: js.Any, pattern: String, message: String): Boolean = js.native
    def contains(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def contains(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def contains(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def contains(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def contains(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def contains(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def contains(found: js.Any, pattern: RegExp): Boolean = js.native
    def contains(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def contains(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def contains(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("contains")
    var contains_Original: Match = js.native
    
    var context: js.Any = js.native
    
    def current(): Test = js.native
    
    def deepEqual(found: js.Any, wanted: js.Any): Boolean = js.native
    def deepEqual(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def deepEqual(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def deepEqual(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("deepEqual")
    var deepEqual_Original: Equal = js.native
    
    def deepEquals(found: js.Any, wanted: js.Any): Boolean = js.native
    def deepEquals(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def deepEquals(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def deepEquals(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("deepEquals")
    var deepEquals_Original: Equal = js.native
    
    def deepInequal(found: js.Any, notWanted: js.Any): Boolean = js.native
    def deepInequal(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def deepInequal(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def deepInequal(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("deepInequal")
    var deepInequal_Original: NotEqual = js.native
    
    def deepIs(found: js.Any, wanted: js.Any): Boolean = js.native
    def deepIs(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def deepIs(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def deepIs(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("deepIs")
    var deepIs_Original: Equal = js.native
    
    def deepNot(found: js.Any, notWanted: js.Any): Boolean = js.native
    def deepNot(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def deepNot(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def deepNot(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("deepNot")
    var deepNot_Original: NotEqual = js.native
    
    def dissimilar(found: js.Any, pattern: String): Boolean = js.native
    def dissimilar(found: js.Any, pattern: String, message: String): Boolean = js.native
    def dissimilar(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def dissimilar(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def dissimilar(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def dissimilar(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def dissimilar(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def dissimilar(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def dissimilar(found: js.Any, pattern: RegExp): Boolean = js.native
    def dissimilar(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def dissimilar(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def dissimilar(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("dissimilar")
    var dissimilar_Original: Match = js.native
    
    def doesNotEqual(found: js.Any, notWanted: js.Any): Boolean = js.native
    def doesNotEqual(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def doesNotEqual(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def doesNotEqual(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("doesNotEqual")
    var doesNotEqual_Original: NotEqual = js.native
    
    def doesNotHave(found: js.Any, pattern: String): Boolean = js.native
    def doesNotHave(found: js.Any, pattern: String, message: String): Boolean = js.native
    def doesNotHave(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def doesNotHave(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def doesNotHave(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def doesNotHave(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def doesNotHave(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def doesNotHave(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def doesNotHave(found: js.Any, pattern: RegExp): Boolean = js.native
    def doesNotHave(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def doesNotHave(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def doesNotHave(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("doesNotHave")
    var doesNotHave_Original: Match = js.native
    
    // Verify that the provided function does not throw.
    // If the function has a name, and the message is not provided, then the function name will be used as the message.
    // If the function is not provided, then this will be treated as a todo test.
    // Note: if an error is encountered unexpectedly, it's often better to simply throw it. The Test object will handle this as a failure.
    def doesNotThrow(): Boolean = js.native
    def doesNotThrow(fn: js.Function1[/* repeated */ js.Any, js.Any]): Boolean = js.native
    def doesNotThrow(fn: js.Function1[/* repeated */ js.Any, js.Any], message: String): Boolean = js.native
    def doesNotThrow(fn: js.Function1[/* repeated */ js.Any, js.Any], message: String, extra: Assert): Boolean = js.native
    def doesNotThrow(fn: js.Function1[/* repeated */ js.Any, js.Any], message: Unit, extra: Assert): Boolean = js.native
    def doesNotThrow(fn: Unit, message: String): Boolean = js.native
    def doesNotThrow(fn: Unit, message: String, extra: Assert): Boolean = js.native
    def doesNotThrow(fn: Unit, message: Unit, extra: Assert): Boolean = js.native
    // Verify that the provided function does not throw.
    // If the function has a name, and the message is not provided, then the function name will be used as the message.
    // If the function is not provided, then this will be treated as a todo test.
    // Note: if an error is encountered unexpectedly, it's often better to simply throw it. The Test object will handle this as a failure.
    @JSName("doesNotThrow")
    var doesNotThrow_Original: DoesNotThrow = js.native
    
    def done(): Unit = js.native
    
    // Verify that the event emitter emits the named event before the end of the test.
    def emits(eventEmitter: EventEmitter, event: String): Unit = js.native
    def emits(eventEmitter: EventEmitter, event: String, message: String): Unit = js.native
    def emits(eventEmitter: EventEmitter, event: String, message: String, extra: Assert): Unit = js.native
    def emits(eventEmitter: EventEmitter, event: String, message: Unit, extra: Assert): Unit = js.native
    
    def end(): Unit = js.native
    
    def endAll(): Unit = js.native
    
    // Verify that the object found is exactly the same (that is, ===) to the object that is wanted.
    def equal(found: js.Any, wanted: js.Any): Boolean = js.native
    def equal(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def equal(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def equal(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    // Verify that the object found is exactly the same (that is, ===) to the object that is wanted.
    @JSName("equal")
    var equal_Original: Equal = js.native
    
    def equals(found: js.Any, wanted: js.Any): Boolean = js.native
    def equals(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def equals(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def equals(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("equals")
    var equals_Original: Equal = js.native
    
    def equivalent(found: js.Any, wanted: js.Any): Boolean = js.native
    def equivalent(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def equivalent(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def equivalent(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("equivalent")
    var equivalent_Original: Equal = js.native
    
    // If the object is an error, then the assertion fails.
    // Note: if an error is encountered unexpectedly, it's often better to simply throw it. The Test object will handle this as a failure.
    def error(obj: js.Any): Boolean = js.native
    def error(obj: js.Any, message: String): Boolean = js.native
    def error(obj: js.Any, message: String, extra: Assert): Boolean = js.native
    def error(obj: js.Any, message: Unit, extra: Assert): Boolean = js.native
    // If the object is an error, then the assertion fails.
    // Note: if an error is encountered unexpectedly, it's often better to simply throw it. The Test object will handle this as a failure.
    @JSName("error")
    var error_Original: Basic = js.native
    
    // Expect the function to throw an uncaught exception at some point in the future, before the test ends. If the test ends without having thrown the expected error, then the test fails.
    // This is useful for verifying that an error thrown in some part of your code will not be handled, which would normally result in a program crash, and verify behavior in those scenarios.
    // If the error is thrown synchronously, or within a promise, then the t.throws() or t.rejects() methods are more appropriate.
    // If called multiple times, then the uncaught exception errors must be emitted in the order called.
    // Note: This method will not properly link a thrown error to the correct test object in some cases involving native modules on Node version 8, because the async_hooks module does not track
    // the execution context ID across native boundaries.
    def expectUncaughtException(): Boolean = js.native
    def expectUncaughtException(fn: js.Function1[/* repeated */ js.Any, js.Any]): Boolean = js.native
    def expectUncaughtException(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Unit, message: String): Boolean = js.native
    def expectUncaughtException(
      fn: js.Function1[/* repeated */ js.Any, js.Any],
      expectedError: Unit,
      message: String,
      extra: Assert
    ): Boolean = js.native
    def expectUncaughtException(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
    def expectUncaughtException(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Error): Boolean = js.native
    def expectUncaughtException(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Error, message: String): Boolean = js.native
    def expectUncaughtException(
      fn: js.Function1[/* repeated */ js.Any, js.Any],
      expectedError: Error,
      message: String,
      extra: Assert
    ): Boolean = js.native
    def expectUncaughtException(
      fn: js.Function1[/* repeated */ js.Any, js.Any],
      expectedError: Error,
      message: Unit,
      extra: Assert
    ): Boolean = js.native
    def expectUncaughtException(fn: Unit, expectedError: Unit, message: String): Boolean = js.native
    def expectUncaughtException(fn: Unit, expectedError: Unit, message: String, extra: Assert): Boolean = js.native
    def expectUncaughtException(fn: Unit, expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
    def expectUncaughtException(fn: Unit, expectedError: Error): Boolean = js.native
    def expectUncaughtException(fn: Unit, expectedError: Error, message: String): Boolean = js.native
    def expectUncaughtException(fn: Unit, expectedError: Error, message: String, extra: Assert): Boolean = js.native
    def expectUncaughtException(fn: Unit, expectedError: Error, message: Unit, extra: Assert): Boolean = js.native
    
    def fail(): Boolean = js.native
    def fail(message: String): Boolean = js.native
    def fail(message: String, extra: Assert): Boolean = js.native
    def fail(message: Unit, extra: Assert): Boolean = js.native
    
    def `false`(obj: js.Any): Boolean = js.native
    def `false`(obj: js.Any, message: String): Boolean = js.native
    def `false`(obj: js.Any, message: String, extra: Assert): Boolean = js.native
    def `false`(obj: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("false")
    var false_Original: Basic = js.native
    
    def formatSnapshot(obj: js.Any): String = js.native
    
    def has(found: js.Any, pattern: String): Boolean = js.native
    def has(found: js.Any, pattern: String, message: String): Boolean = js.native
    def has(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def has(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def has(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def has(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def has(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def has(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def has(found: js.Any, pattern: RegExp): Boolean = js.native
    def has(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def has(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def has(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    
    def hasFields(found: js.Any, pattern: String): Boolean = js.native
    def hasFields(found: js.Any, pattern: String, message: String): Boolean = js.native
    def hasFields(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def hasFields(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def hasFields(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def hasFields(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def hasFields(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def hasFields(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def hasFields(found: js.Any, pattern: RegExp): Boolean = js.native
    def hasFields(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def hasFields(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def hasFields(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("hasFields")
    var hasFields_Original: Match = js.native
    
    // Verify that the found object contains all of the provided fields, and that they are of the same type and value as the pattern provided.
    // This does not do advanced/loose matching based on constructor, regexp patterns, and so on, like t.match() does. You may specify key: undefined in the pattern to ensure that a field is not
    // defined in the found object, but it will not differentiate between a missing property and a property set to undefined.
    // Note that t.has(), the un-strict version of this function, is an alias for t.match().
    def hasStrict(found: js.Any, pattern: String): Boolean = js.native
    def hasStrict(found: js.Any, pattern: String, message: String): Boolean = js.native
    def hasStrict(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def hasStrict(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def hasStrict(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def hasStrict(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def hasStrict(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def hasStrict(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def hasStrict(found: js.Any, pattern: RegExp): Boolean = js.native
    def hasStrict(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def hasStrict(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def hasStrict(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    // Verify that the found object contains all of the provided fields, and that they are of the same type and value as the pattern provided.
    // This does not do advanced/loose matching based on constructor, regexp patterns, and so on, like t.match() does. You may specify key: undefined in the pattern to ensure that a field is not
    // defined in the found object, but it will not differentiate between a missing property and a property set to undefined.
    // Note that t.has(), the un-strict version of this function, is an alias for t.match().
    @JSName("hasStrict")
    var hasStrict_Original: Match = js.native
    
    @JSName("has")
    var has_Original: Match = js.native
    
    def ifErr(obj: js.Any): Boolean = js.native
    def ifErr(obj: js.Any, message: String): Boolean = js.native
    def ifErr(obj: js.Any, message: String, extra: Assert): Boolean = js.native
    def ifErr(obj: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("ifErr")
    var ifErr_Original: Basic = js.native
    
    def ifError(obj: js.Any): Boolean = js.native
    def ifError(obj: js.Any, message: String): Boolean = js.native
    def ifError(obj: js.Any, message: String, extra: Assert): Boolean = js.native
    def ifError(obj: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("ifError")
    var ifError_Original: Basic = js.native
    
    def include(found: js.Any, pattern: String): Boolean = js.native
    def include(found: js.Any, pattern: String, message: String): Boolean = js.native
    def include(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def include(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def include(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def include(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def include(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def include(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def include(found: js.Any, pattern: RegExp): Boolean = js.native
    def include(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def include(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def include(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("include")
    var include_Original: Match = js.native
    
    def includes(found: js.Any, pattern: String): Boolean = js.native
    def includes(found: js.Any, pattern: String, message: String): Boolean = js.native
    def includes(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def includes(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def includes(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def includes(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def includes(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def includes(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def includes(found: js.Any, pattern: RegExp): Boolean = js.native
    def includes(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def includes(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def includes(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("includes")
    var includes_Original: Match = js.native
    
    def inequal(found: js.Any, notWanted: js.Any): Boolean = js.native
    def inequal(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def inequal(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def inequal(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("inequal")
    var inequal_Original: NotEqual = js.native
    
    def inequivalent(found: js.Any, notWanted: js.Any): Boolean = js.native
    def inequivalent(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def inequivalent(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def inequivalent(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("inequivalent")
    var inequivalent_Original: NotEqual = js.native
    
    def is(found: js.Any, wanted: js.Any): Boolean = js.native
    def is(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def is(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def is(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    
    def isA(found: js.Any, `type`: String): Boolean = js.native
    def isA(found: js.Any, `type`: String, message: String): Boolean = js.native
    def isA(found: js.Any, `type`: String, message: String, extra: Assert): Boolean = js.native
    def isA(found: js.Any, `type`: String, message: Unit, extra: Assert): Boolean = js.native
    def isA(found: js.Any, `type`: Instantiable1[/* args (repeated) */ js.Any, js.Object]): Boolean = js.native
    def isA(found: js.Any, `type`: Instantiable1[/* args (repeated) */ js.Any, js.Object], message: String): Boolean = js.native
    def isA(
      found: js.Any,
      `type`: Instantiable1[/* args (repeated) */ js.Any, js.Object],
      message: String,
      extra: Assert
    ): Boolean = js.native
    def isA(
      found: js.Any,
      `type`: Instantiable1[/* args (repeated) */ js.Any, js.Object],
      message: Unit,
      extra: Assert
    ): Boolean = js.native
    @JSName("isA")
    var isA_Original: Type = js.native
    
    def isDeep(found: js.Any, wanted: js.Any): Boolean = js.native
    def isDeep(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def isDeep(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def isDeep(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("isDeep")
    var isDeep_Original: Equal = js.native
    
    def isDeeply(found: js.Any, wanted: js.Any): Boolean = js.native
    def isDeeply(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def isDeeply(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def isDeeply(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("isDeeply")
    var isDeeply_Original: Equal = js.native
    
    def isDissimilar(found: js.Any, pattern: String): Boolean = js.native
    def isDissimilar(found: js.Any, pattern: String, message: String): Boolean = js.native
    def isDissimilar(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def isDissimilar(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def isDissimilar(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def isDissimilar(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def isDissimilar(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def isDissimilar(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def isDissimilar(found: js.Any, pattern: RegExp): Boolean = js.native
    def isDissimilar(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def isDissimilar(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def isDissimilar(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("isDissimilar")
    var isDissimilar_Original: Match = js.native
    
    def isEqual(found: js.Any, wanted: js.Any): Boolean = js.native
    def isEqual(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def isEqual(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def isEqual(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("isEqual")
    var isEqual_Original: Equal = js.native
    
    def isInequal(found: js.Any, notWanted: js.Any): Boolean = js.native
    def isInequal(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def isInequal(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def isInequal(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("isInequal")
    var isInequal_Original: NotEqual = js.native
    
    def isLike(found: js.Any, pattern: String): Boolean = js.native
    def isLike(found: js.Any, pattern: String, message: String): Boolean = js.native
    def isLike(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def isLike(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def isLike(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def isLike(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def isLike(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def isLike(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def isLike(found: js.Any, pattern: RegExp): Boolean = js.native
    def isLike(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def isLike(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def isLike(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("isLike")
    var isLike_Original: Match = js.native
    
    def isLoose(found: js.Any, wanted: js.Any): Boolean = js.native
    def isLoose(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def isLoose(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def isLoose(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("isLoose")
    var isLoose_Original: Equal = js.native
    
    def isNot(found: js.Any, notWanted: js.Any): Boolean = js.native
    def isNot(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def isNot(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def isNot(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    
    def isNotEqual(found: js.Any, notWanted: js.Any): Boolean = js.native
    def isNotEqual(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def isNotEqual(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def isNotEqual(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("isNotEqual")
    var isNotEqual_Original: NotEqual = js.native
    
    def isNotLike(found: js.Any, pattern: String): Boolean = js.native
    def isNotLike(found: js.Any, pattern: String, message: String): Boolean = js.native
    def isNotLike(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def isNotLike(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def isNotLike(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def isNotLike(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def isNotLike(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def isNotLike(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def isNotLike(found: js.Any, pattern: RegExp): Boolean = js.native
    def isNotLike(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def isNotLike(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def isNotLike(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("isNotLike")
    var isNotLike_Original: Match = js.native
    
    def isNotSimilar(found: js.Any, pattern: String): Boolean = js.native
    def isNotSimilar(found: js.Any, pattern: String, message: String): Boolean = js.native
    def isNotSimilar(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def isNotSimilar(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def isNotSimilar(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def isNotSimilar(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def isNotSimilar(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def isNotSimilar(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def isNotSimilar(found: js.Any, pattern: RegExp): Boolean = js.native
    def isNotSimilar(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def isNotSimilar(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def isNotSimilar(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("isNotSimilar")
    var isNotSimilar_Original: Match = js.native
    
    @JSName("isNot")
    var isNot_Original: NotEqual = js.native
    
    def isStrict(found: js.Any, wanted: js.Any): Boolean = js.native
    def isStrict(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def isStrict(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def isStrict(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("isStrict")
    var isStrict_Original: Equal = js.native
    
    def isStrictly(found: js.Any, wanted: js.Any): Boolean = js.native
    def isStrictly(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def isStrictly(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def isStrictly(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("isStrictly")
    var isStrictly_Original: Equal = js.native
    
    def isUnlike(found: js.Any, pattern: String): Boolean = js.native
    def isUnlike(found: js.Any, pattern: String, message: String): Boolean = js.native
    def isUnlike(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def isUnlike(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def isUnlike(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def isUnlike(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def isUnlike(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def isUnlike(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def isUnlike(found: js.Any, pattern: RegExp): Boolean = js.native
    def isUnlike(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def isUnlike(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def isUnlike(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("isUnlike")
    var isUnlike_Original: Match = js.native
    
    @JSName("is")
    var is_Original: Equal = js.native
    
    def isa(found: js.Any, `type`: String): Boolean = js.native
    def isa(found: js.Any, `type`: String, message: String): Boolean = js.native
    def isa(found: js.Any, `type`: String, message: String, extra: Assert): Boolean = js.native
    def isa(found: js.Any, `type`: String, message: Unit, extra: Assert): Boolean = js.native
    def isa(found: js.Any, `type`: Instantiable1[/* args (repeated) */ js.Any, js.Object]): Boolean = js.native
    def isa(found: js.Any, `type`: Instantiable1[/* args (repeated) */ js.Any, js.Object], message: String): Boolean = js.native
    def isa(
      found: js.Any,
      `type`: Instantiable1[/* args (repeated) */ js.Any, js.Object],
      message: String,
      extra: Assert
    ): Boolean = js.native
    def isa(
      found: js.Any,
      `type`: Instantiable1[/* args (repeated) */ js.Any, js.Object],
      message: Unit,
      extra: Assert
    ): Boolean = js.native
    @JSName("isa")
    var isa_Original: Type = js.native
    
    var jobs: Double = js.native
    
    def like(found: js.Any, pattern: String): Boolean = js.native
    def like(found: js.Any, pattern: String, message: String): Boolean = js.native
    def like(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def like(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def like(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def like(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def like(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def like(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def like(found: js.Any, pattern: RegExp): Boolean = js.native
    def like(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def like(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def like(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("like")
    var like_Original: Match = js.native
    
    def looseEqual(found: js.Any, wanted: js.Any): Boolean = js.native
    def looseEqual(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def looseEqual(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def looseEqual(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("looseEqual")
    var looseEqual_Original: Equal = js.native
    
    def looseEquals(found: js.Any, wanted: js.Any): Boolean = js.native
    def looseEquals(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def looseEquals(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def looseEquals(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("looseEquals")
    var looseEquals_Original: Equal = js.native
    
    def looseInequal(found: js.Any, notWanted: js.Any): Boolean = js.native
    def looseInequal(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def looseInequal(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def looseInequal(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("looseInequal")
    var looseInequal_Original: NotEqual = js.native
    
    def looseIs(found: js.Any, wanted: js.Any): Boolean = js.native
    def looseIs(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def looseIs(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def looseIs(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("looseIs")
    var looseIs_Original: Equal = js.native
    
    def looseNot(found: js.Any, notWanted: js.Any): Boolean = js.native
    def looseNot(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def looseNot(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def looseNot(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("looseNot")
    var looseNot_Original: NotEqual = js.native
    
    // Verify that the found object matches the pattern provided.
    // If pattern is a regular expression, and found is a string, then verify that the string matches the pattern.
    // If the pattern is a string, and found is a string, then verify that the pattern occurs within the string somewhere.
    // If pattern is an object, then verify that all of the (enumerable) fields in the pattern match the corresponding fields in the object using this same algorithm. For example, the pattern
    // // {x:/a[sdf]{3}/} would successfully match {x:'asdf',y:'z'}.
    // This is useful when you want to verify that an object has a certain set of required fields, but additional fields are ok.
    // See tcompare for the full details on how this works.
    def `match`(found: js.Any, pattern: String): Boolean = js.native
    def `match`(found: js.Any, pattern: String, message: String): Boolean = js.native
    def `match`(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def `match`(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def `match`(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def `match`(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def `match`(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def `match`(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def `match`(found: js.Any, pattern: RegExp): Boolean = js.native
    def `match`(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def `match`(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def `match`(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    
    // As of version 11, tap supports saving and then comparing against "snapshot" strings. This is a powerful technique for testing programs that generate output, but it comes with some caveats.
    def matchSnapshot(output: js.Any): Boolean = js.native
    def matchSnapshot(output: js.Any, message: String): Boolean = js.native
    def matchSnapshot(output: js.Any, message: String, extra: Assert): Boolean = js.native
    def matchSnapshot(output: js.Any, message: Unit, extra: Assert): Boolean = js.native
    
    // Verify that the found object matches the pattern provided.
    // If pattern is a regular expression, and found is a string, then verify that the string matches the pattern.
    // If the pattern is a string, and found is a string, then verify that the pattern occurs within the string somewhere.
    // If pattern is an object, then verify that all of the (enumerable) fields in the pattern match the corresponding fields in the object using this same algorithm. For example, the pattern
    // // {x:/a[sdf]{3}/} would successfully match {x:'asdf',y:'z'}.
    // This is useful when you want to verify that an object has a certain set of required fields, but additional fields are ok.
    // See tcompare for the full details on how this works.
    @JSName("match")
    var match_Original: Match = js.native
    
    def matches(found: js.Any, pattern: String): Boolean = js.native
    def matches(found: js.Any, pattern: String, message: String): Boolean = js.native
    def matches(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def matches(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def matches(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def matches(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def matches(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def matches(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def matches(found: js.Any, pattern: RegExp): Boolean = js.native
    def matches(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def matches(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def matches(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("matches")
    var matches_Original: Match = js.native
    
    var name: String = js.native
    
    def notDeep(found: js.Any, notWanted: js.Any): Boolean = js.native
    def notDeep(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def notDeep(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def notDeep(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("notDeep")
    var notDeep_Original: NotEqual = js.native
    
    def notDeeply(found: js.Any, notWanted: js.Any): Boolean = js.native
    def notDeeply(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def notDeeply(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def notDeeply(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("notDeeply")
    var notDeeply_Original: NotEqual = js.native
    
    // Inverse of t.equal().
    // Verify that the object found is not exactly the same (that is, !==) as the object that is wanted.
    def notEqual(found: js.Any, notWanted: js.Any): Boolean = js.native
    def notEqual(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def notEqual(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def notEqual(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    // Inverse of t.equal().
    // Verify that the object found is not exactly the same (that is, !==) as the object that is wanted.
    @JSName("notEqual")
    var notEqual_Original: NotEqual = js.native
    
    def notEquals(found: js.Any, notWanted: js.Any): Boolean = js.native
    def notEquals(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def notEquals(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def notEquals(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("notEquals")
    var notEquals_Original: NotEqual = js.native
    
    def notLike(found: js.Any, pattern: String): Boolean = js.native
    def notLike(found: js.Any, pattern: String, message: String): Boolean = js.native
    def notLike(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def notLike(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def notLike(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def notLike(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def notLike(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def notLike(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def notLike(found: js.Any, pattern: RegExp): Boolean = js.native
    def notLike(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def notLike(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def notLike(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("notLike")
    var notLike_Original: Match = js.native
    
    def notLoose(found: js.Any, notWanted: js.Any): Boolean = js.native
    def notLoose(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def notLoose(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def notLoose(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("notLoose")
    var notLoose_Original: NotEqual = js.native
    
    // Inverse of match()
    // Verify that the found object does not match the pattern provided.
    def notMatch(found: js.Any, pattern: String): Boolean = js.native
    def notMatch(found: js.Any, pattern: String, message: String): Boolean = js.native
    def notMatch(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def notMatch(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def notMatch(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def notMatch(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def notMatch(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def notMatch(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def notMatch(found: js.Any, pattern: RegExp): Boolean = js.native
    def notMatch(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def notMatch(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def notMatch(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    // Inverse of match()
    // Verify that the found object does not match the pattern provided.
    @JSName("notMatch")
    var notMatch_Original: Match = js.native
    
    // Verifies that the object is not truthy.
    def notOk(obj: js.Any): Boolean = js.native
    def notOk(obj: js.Any, message: String): Boolean = js.native
    def notOk(obj: js.Any, message: String, extra: Assert): Boolean = js.native
    def notOk(obj: js.Any, message: Unit, extra: Assert): Boolean = js.native
    // Verifies that the object is not truthy.
    @JSName("notOk")
    var notOk_Original: Basic = js.native
    
    // Inverse of t.same().
    // Verify that the found object is not deeply equivalent to the unwanted object. Uses non-strict inequality (ie, !=) for scalars.
    def notSame(found: js.Any, notWanted: js.Any): Boolean = js.native
    def notSame(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def notSame(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def notSame(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    
    def notSameStrict(found: js.Any, notWanted: js.Any): Boolean = js.native
    def notSameStrict(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def notSameStrict(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def notSameStrict(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("notSameStrict")
    var notSameStrict_Original: NotEqual = js.native
    
    // Inverse of t.same().
    // Verify that the found object is not deeply equivalent to the unwanted object. Uses non-strict inequality (ie, !=) for scalars.
    @JSName("notSame")
    var notSame_Original: NotEqual = js.native
    
    def notSimilar(found: js.Any, pattern: String): Boolean = js.native
    def notSimilar(found: js.Any, pattern: String, message: String): Boolean = js.native
    def notSimilar(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def notSimilar(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def notSimilar(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def notSimilar(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def notSimilar(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def notSimilar(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def notSimilar(found: js.Any, pattern: RegExp): Boolean = js.native
    def notSimilar(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def notSimilar(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def notSimilar(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("notSimilar")
    var notSimilar_Original: Match = js.native
    
    def notStrictEqual(found: js.Any, notWanted: js.Any): Boolean = js.native
    def notStrictEqual(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def notStrictEqual(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def notStrictEqual(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("notStrictEqual")
    var notStrictEqual_Original: NotEqual = js.native
    
    def notStrictEquals(found: js.Any, notWanted: js.Any): Boolean = js.native
    def notStrictEquals(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def notStrictEquals(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def notStrictEquals(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("notStrictEquals")
    var notStrictEquals_Original: NotEqual = js.native
    
    def notStrictSame(found: js.Any, notWanted: js.Any): Boolean = js.native
    def notStrictSame(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def notStrictSame(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def notStrictSame(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("notStrictSame")
    var notStrictSame_Original: NotEqual = js.native
    
    def notThrow(): Boolean = js.native
    def notThrow(fn: js.Function1[/* repeated */ js.Any, js.Any]): Boolean = js.native
    def notThrow(fn: js.Function1[/* repeated */ js.Any, js.Any], message: String): Boolean = js.native
    def notThrow(fn: js.Function1[/* repeated */ js.Any, js.Any], message: String, extra: Assert): Boolean = js.native
    def notThrow(fn: js.Function1[/* repeated */ js.Any, js.Any], message: Unit, extra: Assert): Boolean = js.native
    def notThrow(fn: Unit, message: String): Boolean = js.native
    def notThrow(fn: Unit, message: String, extra: Assert): Boolean = js.native
    def notThrow(fn: Unit, message: Unit, extra: Assert): Boolean = js.native
    @JSName("notThrow")
    var notThrow_Original: DoesNotThrow = js.native
    
    // Assertions
    // Verifies that the object is truthy.
    def ok(obj: js.Any): Boolean = js.native
    def ok(obj: js.Any, message: String): Boolean = js.native
    def ok(obj: js.Any, message: String, extra: Assert): Boolean = js.native
    def ok(obj: js.Any, message: Unit, extra: Assert): Boolean = js.native
    // Assertions
    // Verifies that the object is truthy.
    @JSName("ok")
    var ok_Original: Basic = js.native
    
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
    
    def passing(): Boolean = js.native
    
    def plan(n: Double): Unit = js.native
    def plan(n: Double, comment: String): Unit = js.native
    
    def pragma(set: Pragma): Unit = js.native
    
    def rejects(promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]): Unit = js.native
    def rejects(promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]], expectedError: Error): Unit = js.native
    def rejects(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      expectedError: Error,
      message: String
    ): Unit = js.native
    def rejects(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      expectedError: Error,
      message: String,
      extra: Assert
    ): Unit = js.native
    def rejects(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      expectedError: Error,
      message: Unit,
      extra: Assert
    ): Unit = js.native
    def rejects(promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]], message: String): Unit = js.native
    def rejects(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      message: String,
      extra: Assert
    ): Unit = js.native
    def rejects(promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]], message: Unit, extra: Assert): Unit = js.native
    def rejects(promiseOrFn: js.Promise[js.Any]): Unit = js.native
    // Verifies that the promise (or promise-returning function) rejects. If an expected error is provided, then also verify that the rejection matches the expected error.
    // Note: since promises always reject and resolve asynchronously, this assertion is implemented asynchronously. As such, it does not return a boolean to indicate its passing status.
    // Instead, it returns a Promise that resolves when it is completed.
    def rejects(promiseOrFn: js.Promise[js.Any], expectedError: Error): Unit = js.native
    def rejects(promiseOrFn: js.Promise[js.Any], expectedError: Error, message: String): Unit = js.native
    def rejects(promiseOrFn: js.Promise[js.Any], expectedError: Error, message: String, extra: Assert): Unit = js.native
    def rejects(promiseOrFn: js.Promise[js.Any], expectedError: Error, message: Unit, extra: Assert): Unit = js.native
    def rejects(promiseOrFn: js.Promise[js.Any], message: String): Unit = js.native
    def rejects(promiseOrFn: js.Promise[js.Any], message: String, extra: Assert): Unit = js.native
    def rejects(promiseOrFn: js.Promise[js.Any], message: Unit, extra: Assert): Unit = js.native
    
    def resolveMatch(promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]], wanted: String): Unit = js.native
    def resolveMatch(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      wanted: String,
      message: String
    ): Unit = js.native
    def resolveMatch(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      wanted: String,
      message: String,
      extra: Assert
    ): Unit = js.native
    def resolveMatch(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      wanted: String,
      message: Unit,
      extra: Assert
    ): Unit = js.native
    def resolveMatch(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      wanted: StringDictionary[RegExp]
    ): Unit = js.native
    def resolveMatch(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      wanted: StringDictionary[RegExp],
      message: String
    ): Unit = js.native
    def resolveMatch(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      wanted: StringDictionary[RegExp],
      message: String,
      extra: Assert
    ): Unit = js.native
    def resolveMatch(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      wanted: StringDictionary[RegExp],
      message: Unit,
      extra: Assert
    ): Unit = js.native
    def resolveMatch(promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]], wanted: RegExp): Unit = js.native
    def resolveMatch(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      wanted: RegExp,
      message: String
    ): Unit = js.native
    def resolveMatch(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      wanted: RegExp,
      message: String,
      extra: Assert
    ): Unit = js.native
    def resolveMatch(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      wanted: RegExp,
      message: Unit,
      extra: Assert
    ): Unit = js.native
    // Verifies that the promise (or promise-returning function) resolves, and furthermore that the value of the promise matches the wanted pattern using match.
    // Note: since promises always reject and resolve asynchronously, this assertion is implemented asynchronously. As such, it does not return a boolean to indicate its passing status.
    // Instead, it returns a Promise that resolves when it is completed.
    def resolveMatch(promiseOrFn: js.Promise[js.Any], wanted: String): Unit = js.native
    def resolveMatch(promiseOrFn: js.Promise[js.Any], wanted: String, message: String): Unit = js.native
    def resolveMatch(promiseOrFn: js.Promise[js.Any], wanted: String, message: String, extra: Assert): Unit = js.native
    def resolveMatch(promiseOrFn: js.Promise[js.Any], wanted: String, message: Unit, extra: Assert): Unit = js.native
    def resolveMatch(promiseOrFn: js.Promise[js.Any], wanted: StringDictionary[RegExp]): Unit = js.native
    def resolveMatch(promiseOrFn: js.Promise[js.Any], wanted: StringDictionary[RegExp], message: String): Unit = js.native
    def resolveMatch(promiseOrFn: js.Promise[js.Any], wanted: StringDictionary[RegExp], message: String, extra: Assert): Unit = js.native
    def resolveMatch(promiseOrFn: js.Promise[js.Any], wanted: StringDictionary[RegExp], message: Unit, extra: Assert): Unit = js.native
    def resolveMatch(promiseOrFn: js.Promise[js.Any], wanted: RegExp): Unit = js.native
    def resolveMatch(promiseOrFn: js.Promise[js.Any], wanted: RegExp, message: String): Unit = js.native
    def resolveMatch(promiseOrFn: js.Promise[js.Any], wanted: RegExp, message: String, extra: Assert): Unit = js.native
    def resolveMatch(promiseOrFn: js.Promise[js.Any], wanted: RegExp, message: Unit, extra: Assert): Unit = js.native
    
    def resolveMatchSnapshot(promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]): Unit = js.native
    def resolveMatchSnapshot(promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]], message: String): Unit = js.native
    def resolveMatchSnapshot(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      message: String,
      extra: Assert
    ): Unit = js.native
    def resolveMatchSnapshot(promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]], message: Unit, extra: Assert): Unit = js.native
    // Verifies that the promise (or promise-returning function) resolves, and furthermore that the value of the promise matches the snapshot.
    // Note: since promises always reject and resolve asynchronously, this assertion is implemented asynchronously. As such, it does not return a boolean to indicate its passing status.
    // Instead, it returns a Promise that resolves when it is completed.
    def resolveMatchSnapshot(promiseOrFn: js.Promise[js.Any]): Unit = js.native
    def resolveMatchSnapshot(promiseOrFn: js.Promise[js.Any], message: String): Unit = js.native
    def resolveMatchSnapshot(promiseOrFn: js.Promise[js.Any], message: String, extra: Assert): Unit = js.native
    def resolveMatchSnapshot(promiseOrFn: js.Promise[js.Any], message: Unit, extra: Assert): Unit = js.native
    
    def resolves(promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]): Unit = js.native
    def resolves(promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]], message: String): Unit = js.native
    def resolves(
      promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]],
      message: String,
      extra: Assert
    ): Unit = js.native
    def resolves(promiseOrFn: js.Function1[/* repeated */ js.Any, js.Promise[js.Any]], message: Unit, extra: Assert): Unit = js.native
    // Verifies that the promise (or promise-returning function) resolves, making no expectation about the value that the promise resolves to.
    // Note: since promises always reject and resolve asynchronously, this assertion is implemented asynchronously. As such, it does not return a boolean to indicate its passing status.
    // Instead, it returns a Promise that resolves when it is completed.
    def resolves(promiseOrFn: js.Promise[js.Any]): Unit = js.native
    def resolves(promiseOrFn: js.Promise[js.Any], message: String): Unit = js.native
    def resolves(promiseOrFn: js.Promise[js.Any], message: String, extra: Assert): Unit = js.native
    def resolves(promiseOrFn: js.Promise[js.Any], message: Unit, extra: Assert): Unit = js.native
    
    var runOnly: Boolean = js.native
    
    // Verify that the found object is deeply equivalent to the wanted object. Use non-strict equality for scalars (ie, ==). See: tcompare
    def same(found: js.Any, wanted: js.Any): Boolean = js.native
    def same(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def same(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def same(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    
    def sameStrict(found: js.Any, wanted: js.Any): Boolean = js.native
    def sameStrict(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def sameStrict(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def sameStrict(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("sameStrict")
    var sameStrict_Original: Equal = js.native
    
    // Verify that the found object is deeply equivalent to the wanted object. Use non-strict equality for scalars (ie, ==). See: tcompare
    @JSName("same")
    var same_Original: Equal = js.native
    
    def setTimeout(n: Double): Unit = js.native
    
    def similar(found: js.Any, pattern: String): Boolean = js.native
    def similar(found: js.Any, pattern: String, message: String): Boolean = js.native
    def similar(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def similar(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def similar(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def similar(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def similar(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def similar(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def similar(found: js.Any, pattern: RegExp): Boolean = js.native
    def similar(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def similar(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def similar(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("similar")
    var similar_Original: Match = js.native
    
    def skip(name: String): js.Promise[Unit] = js.native
    def skip(name: String, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
    def skip(name: String, extra: Unit, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
    def skip(name: String, extra: typings.tap.mod.Options.Test): js.Promise[Unit] = js.native
    def skip(
      name: String,
      extra: typings.tap.mod.Options.Test,
      cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]
    ): js.Promise[Unit] = js.native
    
    def spawn(cmd: String, args: String): js.Promise[Unit] = js.native
    def spawn(cmd: String, args: String, options: Unit, name: String): js.Promise[Unit] = js.native
    def spawn(cmd: String, args: String, options: Unit, name: String, extra: Spawn): js.Promise[Unit] = js.native
    def spawn(cmd: String, args: String, options: Unit, name: Unit, extra: Spawn): js.Promise[Unit] = js.native
    def spawn(cmd: String, args: String, options: Bag): js.Promise[Unit] = js.native
    def spawn(cmd: String, args: String, options: Bag, name: String): js.Promise[Unit] = js.native
    def spawn(cmd: String, args: String, options: Bag, name: String, extra: Spawn): js.Promise[Unit] = js.native
    def spawn(cmd: String, args: String, options: Bag, name: Unit, extra: Spawn): js.Promise[Unit] = js.native
    
    def stdin(name: String): js.Promise[Unit] = js.native
    def stdin(name: String, extra: Bag): js.Promise[Unit] = js.native
    
    def strictDeepEqual(found: js.Any, wanted: js.Any): Boolean = js.native
    def strictDeepEqual(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def strictDeepEqual(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def strictDeepEqual(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("strictDeepEqual")
    var strictDeepEqual_Original: Equal = js.native
    
    def strictDeepEquals(found: js.Any, wanted: js.Any): Boolean = js.native
    def strictDeepEquals(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def strictDeepEquals(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def strictDeepEquals(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("strictDeepEquals")
    var strictDeepEquals_Original: Equal = js.native
    
    def strictDeepInequal(found: js.Any, notWanted: js.Any): Boolean = js.native
    def strictDeepInequal(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def strictDeepInequal(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def strictDeepInequal(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("strictDeepInequal")
    var strictDeepInequal_Original: NotEqual = js.native
    
    def strictDeepInequals(found: js.Any, notWanted: js.Any): Boolean = js.native
    def strictDeepInequals(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def strictDeepInequals(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def strictDeepInequals(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("strictDeepInequals")
    var strictDeepInequals_Original: NotEqual = js.native
    
    def strictEqual(found: js.Any, wanted: js.Any): Boolean = js.native
    def strictEqual(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def strictEqual(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def strictEqual(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("strictEqual")
    var strictEqual_Original: Equal = js.native
    
    def strictEquals(found: js.Any, wanted: js.Any): Boolean = js.native
    def strictEquals(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def strictEquals(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def strictEquals(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("strictEquals")
    var strictEquals_Original: Equal = js.native
    
    def strictEquivalent(found: js.Any, wanted: js.Any): Boolean = js.native
    def strictEquivalent(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def strictEquivalent(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def strictEquivalent(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("strictEquivalent")
    var strictEquivalent_Original: Equal = js.native
    
    def strictInequivalent(found: js.Any, notWanted: js.Any): Boolean = js.native
    def strictInequivalent(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def strictInequivalent(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def strictInequivalent(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("strictInequivalent")
    var strictInequivalent_Original: NotEqual = js.native
    
    def strictIs(found: js.Any, wanted: js.Any): Boolean = js.native
    def strictIs(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def strictIs(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def strictIs(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("strictIs")
    var strictIs_Original: Equal = js.native
    
    // Inverse of t.strictSame().
    // Verify that the found object is not deeply equivalent to the unwanted object. Use strict equality for scalars (ie, ===).
    def strictNotSame(found: js.Any, notWanted: js.Any): Boolean = js.native
    def strictNotSame(found: js.Any, notWanted: js.Any, message: String): Boolean = js.native
    def strictNotSame(found: js.Any, notWanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def strictNotSame(found: js.Any, notWanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    // Inverse of t.strictSame().
    // Verify that the found object is not deeply equivalent to the unwanted object. Use strict equality for scalars (ie, ===).
    @JSName("strictNotSame")
    var strictNotSame_Original: NotEqual = js.native
    
    // Strict version of t.same().
    // Verify that the found object is deeply equivalent to the wanted object. Use strict equality for scalars (ie, ===).
    def strictSame(found: js.Any, wanted: js.Any): Boolean = js.native
    def strictSame(found: js.Any, wanted: js.Any, message: String): Boolean = js.native
    def strictSame(found: js.Any, wanted: js.Any, message: String, extra: Assert): Boolean = js.native
    def strictSame(found: js.Any, wanted: js.Any, message: Unit, extra: Assert): Boolean = js.native
    // Strict version of t.same().
    // Verify that the found object is deeply equivalent to the wanted object. Use strict equality for scalars (ie, ===).
    @JSName("strictSame")
    var strictSame_Original: Equal = js.native
    
    def tearDown(fn: js.Function0[Unit | js.Promise[Unit]]): Unit = js.native
    
    def teardown(fn: js.Function0[Unit | js.Promise[Unit]]): Unit = js.native
    
    def test(name: String): js.Promise[Unit] = js.native
    def test(name: String, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
    def test(name: String, extra: Unit, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
    def test(name: String, extra: typings.tap.mod.Options.Test): js.Promise[Unit] = js.native
    def test(
      name: String,
      extra: typings.tap.mod.Options.Test,
      cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]
    ): js.Promise[Unit] = js.native
    
    def threw(error: Error): Unit = js.native
    def threw(error: Error, extra: Unit, proxy: Test): Unit = js.native
    def threw(error: Error, extra: Error): Unit = js.native
    def threw(error: Error, extra: Error, proxy: Test): Unit = js.native
    
    def `throw`(): Boolean = js.native
    def `throw`(fn: js.Function1[/* repeated */ js.Any, js.Any]): Boolean = js.native
    def `throw`(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Unit, message: String): Boolean = js.native
    def `throw`(
      fn: js.Function1[/* repeated */ js.Any, js.Any],
      expectedError: Unit,
      message: String,
      extra: Assert
    ): Boolean = js.native
    def `throw`(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
    def `throw`(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Error): Boolean = js.native
    def `throw`(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Error, message: String): Boolean = js.native
    def `throw`(
      fn: js.Function1[/* repeated */ js.Any, js.Any],
      expectedError: Error,
      message: String,
      extra: Assert
    ): Boolean = js.native
    def `throw`(
      fn: js.Function1[/* repeated */ js.Any, js.Any],
      expectedError: Error,
      message: Unit,
      extra: Assert
    ): Boolean = js.native
    def `throw`(fn: js.Function1[/* repeated */ js.Any, js.Any], messageOrExpectedError: String): Boolean = js.native
    def `throw`(fn: js.Function1[/* repeated */ js.Any, js.Any], messageOrExpectedError: String, extra: Assert): Boolean = js.native
    def `throw`(fn: js.Function1[/* repeated */ js.Any, js.Any], messageOrExpectedError: Unit, extra: Assert): Boolean = js.native
    def `throw`(fn: js.Function1[/* repeated */ js.Any, js.Any], messageOrExpectedError: Error, extra: Assert): Boolean = js.native
    def `throw`(fn: Unit, expectedError: Unit, message: String): Boolean = js.native
    def `throw`(fn: Unit, expectedError: Unit, message: String, extra: Assert): Boolean = js.native
    def `throw`(fn: Unit, expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
    def `throw`(fn: Unit, expectedError: Error): Boolean = js.native
    def `throw`(fn: Unit, expectedError: Error, message: String): Boolean = js.native
    def `throw`(fn: Unit, expectedError: Error, message: String, extra: Assert): Boolean = js.native
    def `throw`(fn: Unit, expectedError: Error, message: Unit, extra: Assert): Boolean = js.native
    def `throw`(fn: Unit, messageOrExpectedError: String): Boolean = js.native
    def `throw`(fn: Unit, messageOrExpectedError: String, extra: Assert): Boolean = js.native
    def `throw`(fn: Unit, messageOrExpectedError: Unit, extra: Assert): Boolean = js.native
    def `throw`(fn: Unit, messageOrExpectedError: Error, extra: Assert): Boolean = js.native
    @JSName("throw")
    var throw_Original: Throws = js.native
    
    // Expect the function to throw an error. If an expected error is provided, then also verify that the thrown error matches the expected error.
    // If the expected error is an object, then it's matched against the thrown error using t.match(er, expectedError). If it's a function, then the error is asserted to be a member of that class.
    // If the function has a name, and the message is not provided, then the function name will be used as the message.
    // If the function is not provided, then this will be treated as a todo test.
    // Caveat: if you pass a extra object to t.throws, then you MUST also pass in an expected error, or else it will read the diag object as the expected error, and get upset when your thrown error
    // doesn't match {skip:true} or whatever.
    // For example, this will not work as expected:
    // // anti-example, do not use!
    // t.throws(function() {throw new Error('x')}, { skip: true })
    // But this is fine:
    // // this example is ok to use.
    // // note the empty 'expected error' object.
    // // since it has no fields, it'll only verify that the thrown thing is
    // // an object, not the value of any properties
    // t.throws(function() {throw new Error('x')}, {}, { skip: true })
    // The expected error is tested against the throw error using t.match, so regular expressions and the like are fine. If the expected error is an Error object, then the stack field is ignored,
    // since that will generally never match.
    def throws(): Boolean = js.native
    def throws(fn: js.Function1[/* repeated */ js.Any, js.Any]): Boolean = js.native
    def throws(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Unit, message: String): Boolean = js.native
    def throws(
      fn: js.Function1[/* repeated */ js.Any, js.Any],
      expectedError: Unit,
      message: String,
      extra: Assert
    ): Boolean = js.native
    def throws(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
    def throws(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Error): Boolean = js.native
    def throws(fn: js.Function1[/* repeated */ js.Any, js.Any], expectedError: Error, message: String): Boolean = js.native
    def throws(
      fn: js.Function1[/* repeated */ js.Any, js.Any],
      expectedError: Error,
      message: String,
      extra: Assert
    ): Boolean = js.native
    def throws(
      fn: js.Function1[/* repeated */ js.Any, js.Any],
      expectedError: Error,
      message: Unit,
      extra: Assert
    ): Boolean = js.native
    def throws(fn: js.Function1[/* repeated */ js.Any, js.Any], messageOrExpectedError: String): Boolean = js.native
    def throws(fn: js.Function1[/* repeated */ js.Any, js.Any], messageOrExpectedError: String, extra: Assert): Boolean = js.native
    def throws(fn: js.Function1[/* repeated */ js.Any, js.Any], messageOrExpectedError: Unit, extra: Assert): Boolean = js.native
    def throws(fn: js.Function1[/* repeated */ js.Any, js.Any], messageOrExpectedError: Error, extra: Assert): Boolean = js.native
    def throws(fn: Unit, expectedError: Unit, message: String): Boolean = js.native
    def throws(fn: Unit, expectedError: Unit, message: String, extra: Assert): Boolean = js.native
    def throws(fn: Unit, expectedError: Unit, message: Unit, extra: Assert): Boolean = js.native
    def throws(fn: Unit, expectedError: Error): Boolean = js.native
    def throws(fn: Unit, expectedError: Error, message: String): Boolean = js.native
    def throws(fn: Unit, expectedError: Error, message: String, extra: Assert): Boolean = js.native
    def throws(fn: Unit, expectedError: Error, message: Unit, extra: Assert): Boolean = js.native
    def throws(fn: Unit, messageOrExpectedError: String): Boolean = js.native
    def throws(fn: Unit, messageOrExpectedError: String, extra: Assert): Boolean = js.native
    def throws(fn: Unit, messageOrExpectedError: Unit, extra: Assert): Boolean = js.native
    def throws(fn: Unit, messageOrExpectedError: Error, extra: Assert): Boolean = js.native
    // Expect the function to throw an error. If an expected error is provided, then also verify that the thrown error matches the expected error.
    // If the expected error is an object, then it's matched against the thrown error using t.match(er, expectedError). If it's a function, then the error is asserted to be a member of that class.
    // If the function has a name, and the message is not provided, then the function name will be used as the message.
    // If the function is not provided, then this will be treated as a todo test.
    // Caveat: if you pass a extra object to t.throws, then you MUST also pass in an expected error, or else it will read the diag object as the expected error, and get upset when your thrown error
    // doesn't match {skip:true} or whatever.
    // For example, this will not work as expected:
    // // anti-example, do not use!
    // t.throws(function() {throw new Error('x')}, { skip: true })
    // But this is fine:
    // // this example is ok to use.
    // // note the empty 'expected error' object.
    // // since it has no fields, it'll only verify that the thrown thing is
    // // an object, not the value of any properties
    // t.throws(function() {throw new Error('x')}, {}, { skip: true })
    // The expected error is tested against the throw error using t.match, so regular expressions and the like are fine. If the expected error is an Error object, then the stack field is ignored,
    // since that will generally never match.
    @JSName("throws")
    var throws_Original: Throws = js.native
    
    def todo(name: String): js.Promise[Unit] = js.native
    def todo(name: String, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
    def todo(name: String, extra: Unit, cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
    def todo(name: String, extra: typings.tap.mod.Options.Test): js.Promise[Unit] = js.native
    def todo(
      name: String,
      extra: typings.tap.mod.Options.Test,
      cb: js.Function1[/* t */ this.type, js.Promise[Unit] | Unit]
    ): js.Promise[Unit] = js.native
    
    def `true`(obj: js.Any): Boolean = js.native
    def `true`(obj: js.Any, message: String): Boolean = js.native
    def `true`(obj: js.Any, message: String, extra: Assert): Boolean = js.native
    def `true`(obj: js.Any, message: Unit, extra: Assert): Boolean = js.native
    @JSName("true")
    var true_Original: Basic = js.native
    
    // Verify that the object is of the type provided.
    // Type can be a string that matches the typeof value of the object, or the string name of any constructor in the object's prototype chain, or a constructor function in the
    // object's prototype chain. For example, all the following will pass:
    // t.type(new Date(), 'object');
    // t.type(new Date(), 'Date');
    // t.type(new Date(), Date);
    def `type`(found: js.Any, `type`: String): Boolean = js.native
    def `type`(found: js.Any, `type`: String, message: String): Boolean = js.native
    def `type`(found: js.Any, `type`: String, message: String, extra: Assert): Boolean = js.native
    def `type`(found: js.Any, `type`: String, message: Unit, extra: Assert): Boolean = js.native
    def `type`(found: js.Any, `type`: Instantiable1[/* args (repeated) */ js.Any, js.Object]): Boolean = js.native
    def `type`(found: js.Any, `type`: Instantiable1[/* args (repeated) */ js.Any, js.Object], message: String): Boolean = js.native
    def `type`(
      found: js.Any,
      `type`: Instantiable1[/* args (repeated) */ js.Any, js.Object],
      message: String,
      extra: Assert
    ): Boolean = js.native
    def `type`(
      found: js.Any,
      `type`: Instantiable1[/* args (repeated) */ js.Any, js.Object],
      message: Unit,
      extra: Assert
    ): Boolean = js.native
    // Verify that the object is of the type provided.
    // Type can be a string that matches the typeof value of the object, or the string name of any constructor in the object's prototype chain, or a constructor function in the
    // object's prototype chain. For example, all the following will pass:
    // t.type(new Date(), 'object');
    // t.type(new Date(), 'Date');
    // t.type(new Date(), Date);
    @JSName("type")
    var type_Original: Type = js.native
    
    def unlike(found: js.Any, pattern: String): Boolean = js.native
    def unlike(found: js.Any, pattern: String, message: String): Boolean = js.native
    def unlike(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def unlike(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def unlike(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def unlike(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def unlike(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def unlike(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def unlike(found: js.Any, pattern: RegExp): Boolean = js.native
    def unlike(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def unlike(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def unlike(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("unlike")
    var unlike_Original: Match = js.native
    
    def unsimilar(found: js.Any, pattern: String): Boolean = js.native
    def unsimilar(found: js.Any, pattern: String, message: String): Boolean = js.native
    def unsimilar(found: js.Any, pattern: String, message: String, extra: Assert): Boolean = js.native
    def unsimilar(found: js.Any, pattern: String, message: Unit, extra: Assert): Boolean = js.native
    def unsimilar(found: js.Any, pattern: StringDictionary[RegExp]): Boolean = js.native
    def unsimilar(found: js.Any, pattern: StringDictionary[RegExp], message: String): Boolean = js.native
    def unsimilar(found: js.Any, pattern: StringDictionary[RegExp], message: String, extra: Assert): Boolean = js.native
    def unsimilar(found: js.Any, pattern: StringDictionary[RegExp], message: Unit, extra: Assert): Boolean = js.native
    def unsimilar(found: js.Any, pattern: RegExp): Boolean = js.native
    def unsimilar(found: js.Any, pattern: RegExp, message: String): Boolean = js.native
    def unsimilar(found: js.Any, pattern: RegExp, message: String, extra: Assert): Boolean = js.native
    def unsimilar(found: js.Any, pattern: RegExp, message: Unit, extra: Assert): Boolean = js.native
    @JSName("unsimilar")
    var unsimilar_Original: Match = js.native
  }
  
  // Little hack to simulate the Test class on the tap export
  @js.native
  trait TestConstructor
    extends StObject
       with Instantiable0[Test]
       with Instantiable1[/* options */ typings.tap.mod.Options.Test, Test]
  
  type _To = Tap
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Tap = ^
}
