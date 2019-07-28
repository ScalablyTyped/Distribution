package typings.tapeDashAsync.tapeDashAsyncMod

import typings.node.NodeJSNs.ReadableStream
import typings.tapeDashAsync.Fn_Cb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tape-async", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(cb: TestCase): Unit = js.native
  def apply(name: String | TestOptions, cb: TestCase): Unit = js.native
  def apply(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  /**
  	 * Create a new test harness instance, which is a function like test(), but with a new pending stack and test state.
  	 */
  def createHarness(): Fn_Cb = js.native
  /**
  	 * Create a stream of output, bypassing the default output stream that writes messages to console.log().
  	 * By default stream will be a text stream of TAP output, but you can get an object stream instead by setting opts.objectMode to true.
  	 */
  def createStream(): ReadableStream = js.native
  def createStream(opts: StreamOptions): ReadableStream = js.native
  /**
  	 * The onFinish hook will get invoked when ALL tape tests have finished right before tape is about to print the test summary.
  	 */
  def onFinish(cb: js.Function0[Unit]): Unit = js.native
  def only(cb: TestCase): Unit = js.native
  /**
  	 * Like test(name?, opts?, cb) except if you use .only this is the only test case that will run for the entire process, all other test cases using tape will be ignored.
  	 */
  def only(name: String, cb: TestCase): Unit = js.native
  def only(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  def only(name: TestOptions, cb: TestCase): Unit = js.native
  def skip(cb: TestCase): Unit = js.native
  /**
  	 * Generate a new test that will be skipped over.
  	 */
  def skip(name: String, cb: TestCase): Unit = js.native
  def skip(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  def skip(name: TestOptions, cb: TestCase): Unit = js.native
}

