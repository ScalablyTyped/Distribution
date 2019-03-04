package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionEnumValue extends js.Object {
  var deprecationReason: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var isDeprecated: scala.Boolean
  var name: java.lang.String
}

object IntrospectionEnumValue {
  @scala.inline
  def apply(
    isDeprecated: scala.Boolean,
    name: java.lang.String,
    deprecationReason: java.lang.String = null,
    description: java.lang.String = null
  ): IntrospectionEnumValue = {
    val __obj = js.Dynamic.literal(isDeprecated = isDeprecated, name = name)
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionEnumValue]
  }
}

