package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionEnumValue extends js.Object {
  var deprecationReason: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var isDeprecated: Boolean
  var name: String
}

object IntrospectionEnumValue {
  @scala.inline
  def apply(isDeprecated: Boolean, name: String, deprecationReason: String = null, description: String = null): IntrospectionEnumValue = {
    val __obj = js.Dynamic.literal(isDeprecated = isDeprecated, name = name)
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionEnumValue]
  }
}

