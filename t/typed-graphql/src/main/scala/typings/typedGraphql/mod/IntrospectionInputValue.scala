package typings.typedGraphql.mod

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputValue]
  }
}

