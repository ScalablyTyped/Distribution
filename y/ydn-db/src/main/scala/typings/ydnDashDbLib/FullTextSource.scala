package typings
package ydnDashDbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullTextSource extends js.Object {
  var keyPath: java.lang.String
  var storeName: java.lang.String
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object FullTextSource {
  @scala.inline
  def apply(keyPath: java.lang.String, storeName: java.lang.String, weight: scala.Int | scala.Double = null): FullTextSource = {
    val __obj = js.Dynamic.literal(keyPath = keyPath, storeName = storeName)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTextSource]
  }
}

