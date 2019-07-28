package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumValueConfig extends js.Object {
  var deprecationReason: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object GraphQLEnumValueConfig {
  @scala.inline
  def apply(deprecationReason: String = null, description: String = null, value: js.Any = null): GraphQLEnumValueConfig = {
    val __obj = js.Dynamic.literal()
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason)
    if (description != null) __obj.updateDynamic("description")(description)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GraphQLEnumValueConfig]
  }
}

