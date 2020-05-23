package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Full extends js.Object {
  var full: scala.Double
  var none: scala.Double
  var oneLevel: scala.Double
  var oneLevelPlusNestedEmptyFolders: scala.Double
}

object Full {
  @scala.inline
  def apply(
    full: scala.Double,
    none: scala.Double,
    oneLevel: scala.Double,
    oneLevelPlusNestedEmptyFolders: scala.Double
  ): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], oneLevel = oneLevel.asInstanceOf[js.Any], oneLevelPlusNestedEmptyFolders = oneLevelPlusNestedEmptyFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
}

