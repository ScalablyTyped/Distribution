package typings.usage.usageMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearHistory(): Unit = js.native
  def clearHistory(pid: Double): Unit = js.native
  def lookup(pid: Double, callback: js.Function2[/* err */ Error, /* result */ ResultObject, Unit]): Unit = js.native
  def lookup(
    pid: Double,
    options: Options,
    callback: js.Function2[/* err */ Error, /* result */ ResultObject, Unit]
  ): Unit = js.native
}

