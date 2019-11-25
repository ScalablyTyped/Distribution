package typings.stripe.stripeMod.fileLinks

import typings.stripe.stripeMod.IDateFilter
import typings.stripe.stripeMod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileLinksListOptions extends IListOptionsCreated {
  /**
    * Filter links by their expiration status. By default, all links are returned.
    */
  var expired: js.UndefOr[Boolean] = js.undefined
  /**
    * Only return links for the given file.
    */
  var file: js.UndefOr[String] = js.undefined
}

object IFileLinksListOptions {
  @scala.inline
  def apply(
    created: String | IDateFilter = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    expired: js.UndefOr[Boolean] = js.undefined,
    file: String = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    starting_after: String = null
  ): IFileLinksListOptions = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (!js.isUndefined(expired)) __obj.updateDynamic("expired")(expired.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileLinksListOptions]
  }
}

