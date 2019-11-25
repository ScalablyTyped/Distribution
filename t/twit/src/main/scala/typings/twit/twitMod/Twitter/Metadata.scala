package typings.twit.twitMod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var completed_in: js.UndefOr[Double] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var max_id: js.UndefOr[Double] = js.undefined
  var max_id_str: js.UndefOr[String] = js.undefined
  var next_results: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var refresh_url: js.UndefOr[String] = js.undefined
  var since_id: js.UndefOr[Double] = js.undefined
  var since_id_str: js.UndefOr[String] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    completed_in: Int | Double = null,
    count: Int | Double = null,
    max_id: Int | Double = null,
    max_id_str: String = null,
    next_results: String = null,
    query: String = null,
    refresh_url: String = null,
    since_id: Int | Double = null,
    since_id_str: String = null
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    if (completed_in != null) __obj.updateDynamic("completed_in")(completed_in.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (max_id != null) __obj.updateDynamic("max_id")(max_id.asInstanceOf[js.Any])
    if (max_id_str != null) __obj.updateDynamic("max_id_str")(max_id_str.asInstanceOf[js.Any])
    if (next_results != null) __obj.updateDynamic("next_results")(next_results.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (refresh_url != null) __obj.updateDynamic("refresh_url")(refresh_url.asInstanceOf[js.Any])
    if (since_id != null) __obj.updateDynamic("since_id")(since_id.asInstanceOf[js.Any])
    if (since_id_str != null) __obj.updateDynamic("since_id_str")(since_id_str.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

