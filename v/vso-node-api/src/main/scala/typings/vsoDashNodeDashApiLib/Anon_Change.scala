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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("changeset")(changeset)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("latest")(latest)
    __obj.updateDynamic("mergeSource")(mergeSource)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("shelveset")(shelveset)
    __obj.updateDynamic("tip")(tip)
    __obj.asInstanceOf[Anon_Change]
  }
}

