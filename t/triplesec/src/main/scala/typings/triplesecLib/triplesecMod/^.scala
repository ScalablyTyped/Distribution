package typings
package triplesecLib.triplesecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("triplesec", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decrypt(
    arg: triplesecLib.triplesecMod.Arguments,
    cb: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* buff */ nodeLib.Buffer | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def encrypt(
    arg: triplesecLib.triplesecMod.Arguments,
    cb: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* buff */ nodeLib.Buffer | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

