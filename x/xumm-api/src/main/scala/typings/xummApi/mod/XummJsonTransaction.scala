package typings.xummApi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummJsonTransaction
  extends /* key */ StringDictionary[js.Any] {
  var TransactionType: XummTransactionType | XrplTransactionType = js.native
}

object XummJsonTransaction {
  @scala.inline
  def apply(TransactionType: XummTransactionType | XrplTransactionType): XummJsonTransaction = {
    val __obj = js.Dynamic.literal(TransactionType = TransactionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummJsonTransaction]
  }
  @scala.inline
  implicit class XummJsonTransactionOps[Self <: XummJsonTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTransactionType(value: XummTransactionType | XrplTransactionType): Self = this.set("TransactionType", value.asInstanceOf[js.Any])
  }
  
}

