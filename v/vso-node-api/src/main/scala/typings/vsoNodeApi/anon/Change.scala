package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  var change: scala.Double
  var changeset: scala.Double
  var date: scala.Double
  var latest: scala.Double
  var mergeSource: scala.Double
  var none: scala.Double
  var shelveset: scala.Double
  var tip: scala.Double
}

object Change {
  @scala.inline
  def apply(
    change: scala.Double,
    changeset: scala.Double,
    date: scala.Double,
    latest: scala.Double,
    mergeSource: scala.Double,
    none: scala.Double,
    shelveset: scala.Double,
    tip: scala.Double
  ): Change = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], changeset = changeset.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], mergeSource = mergeSource.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], shelveset = shelveset.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
}

