package typings
package xadesjsLib.xadesjsMod.XAdESNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsPolicyIdentifier extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var qualifier: xadesjsLib.xadesjsMod.XAdESNs.xmlNs.IdentifierQualifier
  var references: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var value: java.lang.String
}

object OptionsPolicyIdentifier {
  @scala.inline
  def apply(
    qualifier: xadesjsLib.xadesjsMod.XAdESNs.xmlNs.IdentifierQualifier,
    value: java.lang.String,
    description: java.lang.String = null,
    references: js.Array[java.lang.String] = null
  ): OptionsPolicyIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qualifier")(qualifier)
    __obj.updateDynamic("value")(value)
    if (description != null) __obj.updateDynamic("description")(description)
    if (references != null) __obj.updateDynamic("references")(references)
    __obj.asInstanceOf[OptionsPolicyIdentifier]
  }
}

