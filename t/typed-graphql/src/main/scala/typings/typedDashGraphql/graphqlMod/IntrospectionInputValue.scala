package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionInputValue extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var `type`: IntrospectionTypeRef
}

object IntrospectionInputValue {
  @scala.inline
  def apply(
    name: String,
    `type`: IntrospectionTypeRef,
    defaultValue: String = null,
    description: String = null
  ): IntrospectionInputValue = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionInputValue]
  }
}

