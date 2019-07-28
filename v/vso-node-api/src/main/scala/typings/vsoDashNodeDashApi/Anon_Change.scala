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
    val __obj = js.Dynamic.literal(change = change, changeset = changeset, date = date, latest = latest, mergeSource = mergeSource, none = none, shelveset = shelveset, tip = tip)
  
    __obj.asInstanceOf[Anon_Change]
  }
}

