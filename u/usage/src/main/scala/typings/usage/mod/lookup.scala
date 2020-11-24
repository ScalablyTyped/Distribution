package typings.usage.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("usage", "lookup")
@js.native
object lookup extends js.Object {
  
  def apply(pid: Double, callback: js.Function2[/* err */ Error, /* result */ ResultObject, Unit]): Unit = js.native
  def apply(
    pid: Double,
    options: Options,
    callback: js.Function2[/* err */ Error, /* result */ ResultObject, Unit]
  ): Unit = js.native
}
