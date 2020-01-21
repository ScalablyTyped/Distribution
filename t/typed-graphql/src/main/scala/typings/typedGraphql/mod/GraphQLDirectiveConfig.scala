package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLDirectiveConfig extends js.Object {
  var args: js.UndefOr[js.Array[GraphQLArgument]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var onField: js.UndefOr[Boolean] = js.undefined
  var onFragment: js.UndefOr[Boolean] = js.undefined
  var onOperation: js.UndefOr[Boolean] = js.undefined
}

object GraphQLDirectiveConfig {
  @scala.inline
  def apply(
    name: String,
    args: js.Array[GraphQLArgument] = null,
    description: String = null,
    onField: js.UndefOr[Boolean] = js.undefined,
    onFragment: js.UndefOr[Boolean] = js.undefined,
    onOperation: js.UndefOr[Boolean] = js.undefined
  ): GraphQLDirectiveConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(onField)) __obj.updateDynamic("onField")(onField.asInstanceOf[js.Any])
    if (!js.isUndefined(onFragment)) __obj.updateDynamic("onFragment")(onFragment.asInstanceOf[js.Any])
    if (!js.isUndefined(onOperation)) __obj.updateDynamic("onOperation")(onOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLDirectiveConfig]
  }
}

