package typings
package triplesecLib.triplesecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("triplesec", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decrypt(
    arg: Arguments,
    cb: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* buff */ nodeLib.Buffer | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def encrypt(
    arg: Arguments,
    cb: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* buff */ nodeLib.Buffer | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

