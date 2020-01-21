package typings.vsoNodeApi.serializationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContractEnumMetadata extends js.Object {
  var enumValues: js.UndefOr[StringDictionary[Double]] = js.undefined
}

object ContractEnumMetadata {
  @scala.inline
  def apply(enumValues: StringDictionary[Double] = null): ContractEnumMetadata = {
    val __obj = js.Dynamic.literal()
    if (enumValues != null) __obj.updateDynamic("enumValues")(enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractEnumMetadata]
  }
}

