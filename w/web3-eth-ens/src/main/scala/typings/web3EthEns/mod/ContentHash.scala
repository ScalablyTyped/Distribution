package typings.web3EthEns.mod

import typings.std.Error
import typings.web3EthEns.web3EthEnsStrings.bzz
import typings.web3EthEns.web3EthEnsStrings.ipfs
import typings.web3EthEns.web3EthEnsStrings.onion
import typings.web3EthEns.web3EthEnsStrings.onion3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentHash extends js.Object {
  var decoded: String | Null = js.native
  var error: js.UndefOr[Error | Null] = js.native
  var protocolType: ipfs | bzz | onion | onion3 | Null = js.native
}

object ContentHash {
  @scala.inline
  def apply(): ContentHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentHash]
  }
  @scala.inline
  implicit class ContentHashOps[Self <: ContentHash] (val x: Self) extends AnyVal {
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
    def setDecoded(value: String): Self = this.set("decoded", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecodedNull: Self = this.set("decoded", null)
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    @scala.inline
    def setProtocolType(value: ipfs | bzz | onion | onion3): Self = this.set("protocolType", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocolTypeNull: Self = this.set("protocolType", null)
  }
  
}

