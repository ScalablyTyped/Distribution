package typings
package xadesjsLib.xadesjsMod.XAdESNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsPolicyId extends js.Object {
  var hash: stdLib.AlgorithmIdentifier
  var identifier: OptionsPolicyIdentifier
  var qualifiers: js.UndefOr[js.Array[OptionsPolicyUserNotice | java.lang.String]] = js.undefined
  var transforms: js.UndefOr[js.Array[xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.OptionsSignTransform]] = js.undefined
}

object OptionsPolicyId {
  @scala.inline
  def apply(
    hash: stdLib.AlgorithmIdentifier,
    identifier: OptionsPolicyIdentifier,
    qualifiers: js.Array[OptionsPolicyUserNotice | java.lang.String] = null,
    transforms: js.Array[xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.OptionsSignTransform] = null
  ): OptionsPolicyId = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], identifier = identifier)
    if (qualifiers != null) __obj.updateDynamic("qualifiers")(qualifiers)
    if (transforms != null) __obj.updateDynamic("transforms")(transforms)
    __obj.asInstanceOf[OptionsPolicyId]
  }
}

