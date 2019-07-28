package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionDirective extends js.Object {
  var args: js.Array[IntrospectionInputValue]
  var description: js.UndefOr[String] = js.undefined
  var locations: js.Array[DirectiveLocationEnum]
  var name: String
}

object IntrospectionDirective {
  @scala.inline
  def apply(
    args: js.Array[IntrospectionInputValue],
    locations: js.Array[DirectiveLocationEnum],
    name: String,
    description: String = null
  ): IntrospectionDirective = {
    val __obj = js.Dynamic.literal(args = args, locations = locations, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionDirective]
  }
}

