package typings.xummApi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummJsonTransaction
  extends /* key */ StringDictionary[js.Any] {
  var TransactionType: XummTransactionType | XrplTransactionType
}

object XummJsonTransaction {
  @scala.inline
  def apply(
    TransactionType: XummTransactionType | XrplTransactionType,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): XummJsonTransaction = {
    val __obj = js.Dynamic.literal(TransactionType = TransactionType.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[XummJsonTransaction]
  }
}

