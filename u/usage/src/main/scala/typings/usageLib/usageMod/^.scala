package typings
package usageLib.usageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearHistory(): scala.Unit = js.native
  def clearHistory(pid: scala.Double): scala.Unit = js.native
  def lookup(
    pid: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* result */ usageLib.usageMod.ResultObject, scala.Unit]
  ): scala.Unit = js.native
  def lookup(
    pid: scala.Double,
    options: usageLib.usageMod.Options,
    callback: js.Function2[/* err */ stdLib.Error, /* result */ usageLib.usageMod.ResultObject, scala.Unit]
  ): scala.Unit = js.native
}

