package typings.triplesec.triplesecMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("triplesec", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decrypt(arg: Arguments, cb: js.Function2[/* err */ Error | Null, /* buff */ Buffer | Null, Unit]): Unit = js.native
  def encrypt(arg: Arguments, cb: js.Function2[/* err */ Error | Null, /* buff */ Buffer | Null, Unit]): Unit = js.native
}

