package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChange extends js.Object {
  var change: Double
  var changeset: Double
  var date: Double
  var latest: Double
  var mergeSource: Double
  var none: Double
  var shelveset: Double
  var tip: Double
}

object AnonChange {
  @scala.inline
  def apply(
    change: Double,
    changeset: Double,
    date: Double,
    latest: Double,
    mergeSource: Double,
    none: Double,
    shelveset: Double,
    tip: Double
  ): AnonChange = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], changeset = changeset.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], mergeSource = mergeSource.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], shelveset = shelveset.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChange]
  }
}

