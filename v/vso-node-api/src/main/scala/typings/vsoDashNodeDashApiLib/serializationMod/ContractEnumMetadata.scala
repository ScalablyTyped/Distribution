package typings
package vsoDashNodeDashApiLib.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContractEnumMetadata extends js.Object {
  var enumValues: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
}

object ContractEnumMetadata {
  @scala.inline
  def apply(enumValues: org.scalablytyped.runtime.StringDictionary[scala.Double] = null): ContractEnumMetadata = {
    val __obj = js.Dynamic.literal()
    if (enumValues != null) __obj.updateDynamic("enumValues")(enumValues)
    __obj.asInstanceOf[ContractEnumMetadata]
  }
}

