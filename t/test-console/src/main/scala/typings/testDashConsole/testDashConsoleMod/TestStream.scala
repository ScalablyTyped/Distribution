package typings.testDashConsole.testDashConsoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestStream extends js.Object {
  def ignore(): Restore = js.native
  def ignore(options: Options): Restore = js.native
  def ignoreSync(fn: NoOutputCallback): Unit = js.native
  def ignoreSync(options: Options, fn: NoOutputCallback): Unit = js.native
  def inspect(): Inspector = js.native
  def inspect(options: Options): Inspector = js.native
  def inspectSync(fn: OutputCallback): Output = js.native
  def inspectSync(options: Options, fn: OutputCallback): Output = js.native
}

