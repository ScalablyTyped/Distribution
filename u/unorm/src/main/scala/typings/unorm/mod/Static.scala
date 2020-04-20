package typings.unorm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  def nfc(str: String): String
  def nfd(str: String): String
  def nfkc(str: String): String
  def nfkd(str: String): String
}

object Static {
  @scala.inline
  def apply(nfc: String => String, nfd: String => String, nfkc: String => String, nfkd: String => String): Static = {
    val __obj = js.Dynamic.literal(nfc = js.Any.fromFunction1(nfc), nfd = js.Any.fromFunction1(nfd), nfkc = js.Any.fromFunction1(nfkc), nfkd = js.Any.fromFunction1(nfkd))
    __obj.asInstanceOf[Static]
  }
}

