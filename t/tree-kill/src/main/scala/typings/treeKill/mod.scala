package typings.treeKill

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tree-kill", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(pid: Double): Unit = js.native
  def apply(pid: Double, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(
    pid: Double,
    signal: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def apply(pid: Double, signal: String): Unit = js.native
  def apply(pid: Double, signal: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(pid: Double, signal: Double): Unit = js.native
  def apply(pid: Double, signal: Double, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
}

