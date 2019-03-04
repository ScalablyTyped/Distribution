package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Change extends js.Object {
  var change: scala.Double
  var changeset: scala.Double
  var date: scala.Double
  var latest: scala.Double
  var mergeSource: scala.Double
  var none: scala.Double
  var shelveset: scala.Double
  var tip: scala.Double
}

object Anon_Change {
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
  ): Anon_Change = {
    val __obj = js.Dynamic.literal(change = change, changeset = changeset, date = date, latest = latest, mergeSource = mergeSource, none = none, shelveset = shelveset, tip = tip)
  
    __obj.asInstanceOf[Anon_Change]
  }
}

