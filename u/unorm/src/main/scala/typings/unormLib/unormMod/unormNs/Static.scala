package typings
package unormLib.unormMod.unormNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  def nfc(str: java.lang.String): java.lang.String
  def nfd(str: java.lang.String): java.lang.String
  def nfkc(str: java.lang.String): java.lang.String
  def nfkd(str: java.lang.String): java.lang.String
}

object Static {
  @scala.inline
  def apply(
    nfc: java.lang.String => java.lang.String,
    nfd: java.lang.String => java.lang.String,
    nfkc: java.lang.String => java.lang.String,
    nfkd: java.lang.String => java.lang.String
  ): Static = {
    val __obj = js.Dynamic.literal(nfc = js.Any.fromFunction1(nfc), nfd = js.Any.fromFunction1(nfd), nfkc = js.Any.fromFunction1(nfkc), nfkd = js.Any.fromFunction1(nfkd))
  
    __obj.asInstanceOf[Static]
  }
}

