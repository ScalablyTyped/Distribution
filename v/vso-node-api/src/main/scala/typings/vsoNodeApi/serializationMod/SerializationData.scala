package typings.vsoNodeApi.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializationData extends js.Object {
  var requestTypeMetadata: js.UndefOr[ContractMetadata] = js.undefined
  var responseIsCollection: Boolean
  var responseTypeMetadata: js.UndefOr[ContractMetadata] = js.undefined
}

object SerializationData {
  @scala.inline
  def apply(
    responseIsCollection: Boolean,
    requestTypeMetadata: ContractMetadata = null,
    responseTypeMetadata: ContractMetadata = null
  ): SerializationData = {
    val __obj = js.Dynamic.literal(responseIsCollection = responseIsCollection.asInstanceOf[js.Any])
    if (requestTypeMetadata != null) __obj.updateDynamic("requestTypeMetadata")(requestTypeMetadata.asInstanceOf[js.Any])
    if (responseTypeMetadata != null) __obj.updateDynamic("responseTypeMetadata")(responseTypeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationData]
  }
}

