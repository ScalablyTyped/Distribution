package typings.vsoDashNodeDashApi.serializationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContractMetadata extends js.Object {
  var fields: js.UndefOr[StringDictionary[ContractFieldMetadata]] = js.undefined
}

object ContractMetadata {
  @scala.inline
  def apply(fields: StringDictionary[ContractFieldMetadata] = null): ContractMetadata = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractMetadata]
  }
}

