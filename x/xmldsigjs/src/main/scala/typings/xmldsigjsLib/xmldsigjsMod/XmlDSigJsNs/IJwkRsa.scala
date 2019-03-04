package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJwkRsa extends js.Object {
  var alg: java.lang.String
  var e: java.lang.String
  var ext: scala.Boolean
  var kty: java.lang.String
  var n: java.lang.String
}

object IJwkRsa {
  @scala.inline
  def apply(
    alg: java.lang.String,
    e: java.lang.String,
    ext: scala.Boolean,
    kty: java.lang.String,
    n: java.lang.String
  ): IJwkRsa = {
    val __obj = js.Dynamic.literal(alg = alg, e = e, ext = ext, kty = kty, n = n)
  
    __obj.asInstanceOf[IJwkRsa]
  }
}

