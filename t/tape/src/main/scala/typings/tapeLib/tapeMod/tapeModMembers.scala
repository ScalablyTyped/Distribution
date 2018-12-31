package typings
package tapeLib.tapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tape", JSImport.Namespace)
@js.native
object tapeModMembers extends js.Object {
  def apply(cb: tapeLib.tapeMod.tapeNs.TestCase): scala.Unit = js.native
  /**
    * Create a new test with an optional name string and optional opts object.
    * cb(t) fires with the new test object t once all preceeding tests have finished.
    * Tests execute serially.
    */
  def apply(name: java.lang.String, cb: tapeLib.tapeMod.tapeNs.TestCase): scala.Unit = js.native
  def apply(
    name: java.lang.String,
    opts: tapeLib.tapeMod.tapeNs.TestOptions,
    cb: tapeLib.tapeMod.tapeNs.TestCase
  ): scala.Unit = js.native
  def apply(opts: tapeLib.tapeMod.tapeNs.TestOptions, cb: tapeLib.tapeMod.tapeNs.TestCase): scala.Unit = js.native
  def createHarness(): tapeLib.Anon_Opts = js.native
  def createStream(): nodeLib.NodeJSNs.ReadableStream = js.native
  def createStream(opts: tapeLib.tapeMod.tapeNs.StreamOptions): nodeLib.NodeJSNs.ReadableStream = js.native
  def onFinish(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def only(cb: tapeLib.tapeMod.tapeNs.TestCase): scala.Unit = js.native
  def only(name: java.lang.String, cb: tapeLib.tapeMod.tapeNs.TestCase): scala.Unit = js.native
  def only(
    name: java.lang.String,
    opts: tapeLib.tapeMod.tapeNs.TestOptions,
    cb: tapeLib.tapeMod.tapeNs.TestCase
  ): scala.Unit = js.native
  def only(opts: tapeLib.tapeMod.tapeNs.TestOptions, cb: tapeLib.tapeMod.tapeNs.TestCase): scala.Unit = js.native
  def skip(cb: tapeLib.tapeMod.tapeNs.TestCase): scala.Unit = js.native
  def skip(name: java.lang.String, cb: tapeLib.tapeMod.tapeNs.TestCase): scala.Unit = js.native
  def skip(
    name: java.lang.String,
    opts: tapeLib.tapeMod.tapeNs.TestOptions,
    cb: tapeLib.tapeMod.tapeNs.TestCase
  ): scala.Unit = js.native
  def skip(opts: tapeLib.tapeMod.tapeNs.TestOptions, cb: tapeLib.tapeMod.tapeNs.TestCase): scala.Unit = js.native
}

