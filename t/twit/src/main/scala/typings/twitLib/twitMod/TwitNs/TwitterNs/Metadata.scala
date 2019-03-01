package typings
package twitLib.twitMod.TwitNs.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var completed_in: js.UndefOr[scala.Double] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var max_id: js.UndefOr[scala.Double] = js.undefined
  var max_id_str: js.UndefOr[java.lang.String] = js.undefined
  var next_results: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var refresh_url: js.UndefOr[java.lang.String] = js.undefined
  var since_id: js.UndefOr[scala.Double] = js.undefined
  var since_id_str: js.UndefOr[java.lang.String] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    completed_in: scala.Int | scala.Double = null,
    count: scala.Int | scala.Double = null,
    max_id: scala.Int | scala.Double = null,
    max_id_str: java.lang.String = null,
    next_results: java.lang.String = null,
    query: java.lang.String = null,
    refresh_url: java.lang.String = null,
    since_id: scala.Int | scala.Double = null,
    since_id_str: java.lang.String = null
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    if (completed_in != null) __obj.updateDynamic("completed_in")(completed_in.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (max_id != null) __obj.updateDynamic("max_id")(max_id.asInstanceOf[js.Any])
    if (max_id_str != null) __obj.updateDynamic("max_id_str")(max_id_str)
    if (next_results != null) __obj.updateDynamic("next_results")(next_results)
    if (query != null) __obj.updateDynamic("query")(query)
    if (refresh_url != null) __obj.updateDynamic("refresh_url")(refresh_url)
    if (since_id != null) __obj.updateDynamic("since_id")(since_id.asInstanceOf[js.Any])
    if (since_id_str != null) __obj.updateDynamic("since_id_str")(since_id_str)
    __obj.asInstanceOf[Metadata]
  }
}

