package typings.tapePromise

import typings.node.NodeJS.ReadableStream
import typings.tape.mod.StreamOptions
import typings.tape.mod.TestCase
import typings.tape.mod.TestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  def apply(cb: TestCase): Unit = js.native
  def apply(name: String, cb: TestCase): Unit = js.native
  def apply(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  def apply(opts: TestOptions, cb: TestCase): Unit = js.native
  def createHarness(): js.Any = js.native
  def createStream(): ReadableStream = js.native
  def createStream(opts: StreamOptions): ReadableStream = js.native
  def onFinish(cb: js.Function0[Unit]): Unit = js.native
  def only(cb: TestCase): Unit = js.native
  def only(name: String, cb: TestCase): Unit = js.native
  def only(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  def only(opts: TestOptions, cb: TestCase): Unit = js.native
  def skip(cb: TestCase): Unit = js.native
  def skip(name: String, cb: TestCase): Unit = js.native
  def skip(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  def skip(opts: TestOptions, cb: TestCase): Unit = js.native
}

