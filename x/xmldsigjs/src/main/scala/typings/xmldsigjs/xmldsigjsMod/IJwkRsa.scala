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
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IJwkRsa]
  }
}

