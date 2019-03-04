package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionField extends js.Object {
  var args: js.Array[IntrospectionInputValue]
  var deprecationReason: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var isDeprecated: scala.Boolean
  var name: java.lang.String
  var `type`: IntrospectionTypeRef
}

object IntrospectionField {
  @scala.inline
  def apply(
    args: js.Array[IntrospectionInputValue],
    isDeprecated: scala.Boolean,
    name: java.lang.String,
    `type`: IntrospectionTypeRef,
    deprecationReason: java.lang.String = null,
    description: java.lang.String = null
  ): IntrospectionField = {
    val __obj = js.Dynamic.literal(args = args, isDeprecated = isDeprecated, name = name)
    __obj.updateDynamic("type")(`type`)
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionField]
  }
}

