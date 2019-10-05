package typings.xadesjs.xadesjsMod

import typings.xadesjs.xadesjsMod.xml.IdentifierQualifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsPolicyIdentifier extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var qualifier: IdentifierQualifier
  var references: js.UndefOr[js.Array[String]] = js.undefined
  var value: String
}

object OptionsPolicyIdentifier {
  @scala.inline
  def apply(
    qualifier: IdentifierQualifier,
    value: String,
    description: String = null,
    references: js.Array[String] = null
  ): OptionsPolicyIdentifier = {
    val __obj = js.Dynamic.literal(qualifier = qualifier, value = value)
    if (description != null) __obj.updateDynamic("description")(description)
    if (references != null) __obj.updateDynamic("references")(references)
    __obj.asInstanceOf[OptionsPolicyIdentifier]
  }
}

