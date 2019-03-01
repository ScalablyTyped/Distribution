package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Full extends js.Object {
  var full: scala.Double
  var none: scala.Double
  var oneLevel: scala.Double
  var oneLevelPlusNestedEmptyFolders: scala.Double
}

object Anon_Full {
  @scala.inline
  def apply(
    full: scala.Double,
    none: scala.Double,
    oneLevel: scala.Double,
    oneLevelPlusNestedEmptyFolders: scala.Double
  ): Anon_Full = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("full")(full)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("oneLevel")(oneLevel)
    __obj.updateDynamic("oneLevelPlusNestedEmptyFolders")(oneLevelPlusNestedEmptyFolders)
    __obj.asInstanceOf[Anon_Full]
  }
}

