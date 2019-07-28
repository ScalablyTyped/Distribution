package typings.xmldsigjs.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJwkRsa extends js.Object {
  var alg: String
  var e: String
  var ext: Boolean
  var kty: String
  var n: String
}

object IJwkRsa {
  @scala.inline
  def apply(alg: String, e: String, ext: Boolean, kty: String, n: String): IJwkRsa = {
    val __obj = js.Dynamic.literal(alg = alg, e = e, ext = ext, kty = kty, n = n)
  
    __obj.asInstanceOf[IJwkRsa]
  }
}

