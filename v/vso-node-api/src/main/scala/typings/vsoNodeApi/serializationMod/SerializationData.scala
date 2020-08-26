package typings.vsoNodeApi.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializationData extends js.Object {
  var requestTypeMetadata: js.UndefOr[ContractMetadata] = js.native
  var responseIsCollection: Boolean = js.native
  var responseTypeMetadata: js.UndefOr[ContractMetadata] = js.native
}

object SerializationData {
  @scala.inline
  def apply(responseIsCollection: Boolean): SerializationData = {
    val __obj = js.Dynamic.literal(responseIsCollection = responseIsCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationData]
  }
  @scala.inline
  implicit class SerializationDataOps[Self <: SerializationData] (val x: Self) extends AnyVal {
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
    def setResponseIsCollection(value: Boolean): Self = this.set("responseIsCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestTypeMetadata(value: ContractMetadata): Self = this.set("requestTypeMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestTypeMetadata: Self = this.set("requestTypeMetadata", js.undefined)
    @scala.inline
    def setResponseTypeMetadata(value: ContractMetadata): Self = this.set("responseTypeMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseTypeMetadata: Self = this.set("responseTypeMetadata", js.undefined)
  }
  
}

