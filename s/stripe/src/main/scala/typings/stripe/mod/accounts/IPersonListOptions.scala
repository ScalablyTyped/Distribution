package typings.stripe.mod.accounts

import typings.stripe.AnonExecutive
import typings.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonListOptions extends IListOptions {
  var relationship: AnonExecutive
}

object IPersonListOptions {
  @scala.inline
  def apply(
    relationship: AnonExecutive,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    starting_after: String = null
  ): IPersonListOptions = {
    val __obj = js.Dynamic.literal(relationship = relationship.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonListOptions]
  }
}

