package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Change extends js.Object {
  var change: Double
  var changeset: Double
  var date: Double
  var latest: Double
  var mergeSource: Double
  var none: Double
  var shelveset: Double
  var tip: Double
}

object Anon_Change {
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
  ): Anon_Change = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], changeset = changeset.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], mergeSource = mergeSource.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], shelveset = shelveset.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Change]
  }
}

