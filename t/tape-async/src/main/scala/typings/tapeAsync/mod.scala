package typings.tapeAsync

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cb: TestCase): Unit = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(name: String, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(name: String, opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(name: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("tape-async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new test harness instance, which is a function like test(), but with a new pending stack and test state.
    */
  inline def createHarness(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createHarness")().asInstanceOf[Any]
  
  /**
    * Create a stream of output, bypassing the default output stream that writes messages to console.log().
    * By default stream will be a text stream of TAP output, but you can get an object stream instead by setting opts.objectMode to true.
    */
  inline def createStream(): ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")().asInstanceOf[ReadableStream[Any]]
  inline def createStream(opts: StreamOptions): ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(opts.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[Any]]
  
  /**
    * The onFinish hook will get invoked when ALL tape tests have finished right before tape is about to print the test summary.
    */
  inline def onFinish(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFinish")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def only(cb: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Like test(name?, opts?, cb) except if you use .only this is the only test case that will run for the entire process, all other test cases using tape will be ignored.
    */
  inline def only(name: String, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("only")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def only(name: String, opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("only")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def only(name: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("only")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def skip(cb: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Generate a new test that will be skipped over.
    */
  inline def skip(name: String, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def skip(name: String, opts: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def skip(name: TestOptions, cb: TestCase): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Options for the createStream function.
    */
  type StreamOptions = typings.tape.mod.StreamOptions
  
  @js.native
  trait Test
    extends StObject
       with typings.tape.mod.Test
  
  type TestCase = js.Function1[/* test */ Test, Unit | js.Iterator[Any] | js.Thenable[Unit]]
  
  /**
    * Available opts options for the tape function.
    */
  type TestOptions = typings.tape.mod.TestOptions
}
