package typings.stripe.stripeMod.accounts

import typings.stripe.Anon_DirectorExecutive
import typings.stripe.stripeMod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonListOptions extends IListOptions {
  var relationship: Anon_DirectorExecutive
}

object IPersonListOptions {
  @scala.inline
  def apply(
    relationship: Anon_DirectorExecutive,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    starting_after: String = null
  ): IPersonListOptions = {
    val __obj = js.Dynamic.literal(relationship = relationship)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[IPersonListOptions]
  }
}

