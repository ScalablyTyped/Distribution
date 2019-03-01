package typings
package vsoDashNodeDashApiLib.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContractMetadata extends js.Object {
  var fields: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ContractFieldMetadata]] = js.undefined
}

object ContractMetadata {
  @scala.inline
  def apply(fields: org.scalablytyped.runtime.StringDictionary[ContractFieldMetadata] = null): ContractMetadata = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[ContractMetadata]
  }
}

