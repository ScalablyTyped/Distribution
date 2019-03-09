package typings
package tapeDashAsyncLib.tapeDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tape-async", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(cb: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestCase): scala.Unit = js.native
  def apply(
    name: java.lang.String | tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestOptions,
    cb: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestCase
  ): scala.Unit = js.native
  def apply(
    name: java.lang.String,
    opts: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestOptions,
    cb: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestCase
  ): scala.Unit = js.native
  /**
  	 * Create a new test harness instance, which is a function like test(), but with a new pending stack and test state.
  	 */
  def createHarness(): tapeDashAsyncLib.Anon_Cb = js.native
  /**
  	 * Create a stream of output, bypassing the default output stream that writes messages to console.log().
  	 * By default stream will be a text stream of TAP output, but you can get an object stream instead by setting opts.objectMode to true.
  	 */
  def createStream(): nodeLib.NodeJSNs.ReadableStream = js.native
  def createStream(opts: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.StreamOptions): nodeLib.NodeJSNs.ReadableStream = js.native
  /**
  	 * The onFinish hook will get invoked when ALL tape tests have finished right before tape is about to print the test summary.
  	 */
  def onFinish(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def only(cb: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestCase): scala.Unit = js.native
  /**
  	 * Like test(name?, opts?, cb) except if you use .only this is the only test case that will run for the entire process, all other test cases using tape will be ignored.
  	 */
  def only(name: java.lang.String, cb: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestCase): scala.Unit = js.native
  def only(
    name: java.lang.String,
    opts: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestOptions,
    cb: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestCase
  ): scala.Unit = js.native
  def only(
    name: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestOptions,
    cb: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestCase
  ): scala.Unit = js.native
  def skip(cb: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestCase): scala.Unit = js.native
  /**
  	 * Generate a new test that will be skipped over.
  	 */
  def skip(name: java.lang.String, cb: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestCase): scala.Unit = js.native
  def skip(
    name: java.lang.String,
    opts: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestOptions,
    cb: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestCase
  ): scala.Unit = js.native
  def skip(
    name: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestOptions,
    cb: tapeDashAsyncLib.tapeDashAsyncMod.tapeNs.TestCase
  ): scala.Unit = js.native
}

