package typings.xadesjs.signedXmlMod

import typings.std.AlgorithmIdentifier
import typings.xmldsigjs.signedXmlMod.OptionsSignTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsPolicyId extends js.Object {
  var hash: AlgorithmIdentifier
  var identifier: OptionsPolicyIdentifier
  var qualifiers: js.UndefOr[js.Array[OptionsPolicyUserNotice | String]] = js.undefined
  var transforms: js.UndefOr[js.Array[OptionsSignTransform]] = js.undefined
}

object OptionsPolicyId {
  @scala.inline
  def apply(
    hash: AlgorithmIdentifier,
    identifier: OptionsPolicyIdentifier,
    qualifiers: js.Array[OptionsPolicyUserNotice | String] = null,
    transforms: js.Array[OptionsSignTransform] = null
  ): OptionsPolicyId = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    if (qualifiers != null) __obj.updateDynamic("qualifiers")(qualifiers.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPolicyId]
  }
}

