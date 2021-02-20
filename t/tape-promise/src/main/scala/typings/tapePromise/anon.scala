package typings.tapePromise

import typings.tape.mod.TestCase
import typings.tape.mod.TestOptions
import typings.tapePromise.mod.AsyncTapeFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined tape-promise.tape-promise.AsyncTapeFunction & {None (opts : tape.tape.TestOptions, cb : tape.tape.TestCase): void, None (cb : tape.tape.TestCase): void, None (name : string, opts : tape.tape.TestOptions, cb : tape.tape.TestCase): void, None (name : string, cb : tape.tape.TestCase): void} */
  @js.native
  trait AsyncTapeFunctionNoneopts extends StObject {
    
    def apply(cb: TestCase | typings.tapePromise.mod.TestCase): Unit = js.native
    /**
      * Create a new test with an optional name string and optional opts object.
      * cb(t) fires with the new test object t once all preceding tests have finished.
      * Tests execute serially.
      */
    def apply(name: String, cb: TestCase | typings.tapePromise.mod.TestCase): Unit = js.native
    def apply(name: String, opts: TestOptions, cb: TestCase | typings.tapePromise.mod.TestCase): Unit = js.native
    def apply(opts: TestOptions, cb: TestCase | typings.tapePromise.mod.TestCase): Unit = js.native
    
    /**
      * Create a new test harness instance, which is a function like test(),
      * but with a new pending stack and test state.
      */
    def createHarness(): AsyncTapeFunction with FnCall = js.native
    
    def only(cb: typings.tapePromise.mod.TestCase): Unit = js.native
    /**
      * Like test(name?, opts?, cb) except if you use .only this
      * is the only test case that will run for the entire process,
      * all other test cases using tape will be ignored.
      */
    def only(name: String, cb: typings.tapePromise.mod.TestCase): Unit = js.native
    def only(name: String, opts: TestOptions, cb: typings.tapePromise.mod.TestCase): Unit = js.native
    def only(opts: TestOptions, cb: typings.tapePromise.mod.TestCase): Unit = js.native
    
    def skip(cb: typings.tapePromise.mod.TestCase): Unit = js.native
    /**
      * Generate a new test that will be skipped over.
      */
    def skip(name: String, cb: typings.tapePromise.mod.TestCase): Unit = js.native
    def skip(name: String, opts: TestOptions, cb: typings.tapePromise.mod.TestCase): Unit = js.native
    def skip(opts: TestOptions, cb: typings.tapePromise.mod.TestCase): Unit = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(cb: TestCase): Unit = js.native
    def apply(name: String, cb: TestCase): Unit = js.native
    def apply(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
    def apply(opts: TestOptions, cb: TestCase): Unit = js.native
  }
}
