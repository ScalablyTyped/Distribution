package typings.triplesec.triplesecMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("triplesec", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(arg: Arguments, cb: js.Function2[/* err */ Error | Null, /* buff */ Buffer | Null, Unit]): Unit = js.native
}

