package typings
package vsoDashNodeDashApiLib.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializationData extends js.Object {
  var requestTypeMetadata: js.UndefOr[ContractMetadata] = js.undefined
  var responseIsCollection: scala.Boolean
  var responseTypeMetadata: js.UndefOr[ContractMetadata] = js.undefined
}

object SerializationData {
  @scala.inline
  def apply(
    responseIsCollection: scala.Boolean,
    requestTypeMetadata: ContractMetadata = null,
    responseTypeMetadata: ContractMetadata = null
  ): SerializationData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("responseIsCollection")(responseIsCollection)
    if (requestTypeMetadata != null) __obj.updateDynamic("requestTypeMetadata")(requestTypeMetadata)
    if (responseTypeMetadata != null) __obj.updateDynamic("responseTypeMetadata")(responseTypeMetadata)
    __obj.asInstanceOf[SerializationData]
  }
}

