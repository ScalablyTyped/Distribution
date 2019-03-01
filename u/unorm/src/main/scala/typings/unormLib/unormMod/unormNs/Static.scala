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
    nfc: js.Function1[java.lang.String, java.lang.String],
    nfd: js.Function1[java.lang.String, java.lang.String],
    nfkc: js.Function1[java.lang.String, java.lang.String],
    nfkd: js.Function1[java.lang.String, java.lang.String]
  ): Static = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nfc")(nfc)
    __obj.updateDynamic("nfd")(nfd)
    __obj.updateDynamic("nfkc")(nfkc)
    __obj.updateDynamic("nfkd")(nfkd)
    __obj.asInstanceOf[Static]
  }
}

