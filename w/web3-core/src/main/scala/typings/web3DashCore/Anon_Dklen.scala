package typings.web3DashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dklen extends js.Object {
  var dklen: Double
  var n: Double
  var p: Double
  var r: Double
  var salt: String
}

object Anon_Dklen {
  @scala.inline
  def apply(dklen: Double, n: Double, p: Double, r: Double, salt: String): Anon_Dklen = {
    val __obj = js.Dynamic.literal(dklen = dklen, n = n, p = p, r = r, salt = salt)
  
    __obj.asInstanceOf[Anon_Dklen]
  }
}

