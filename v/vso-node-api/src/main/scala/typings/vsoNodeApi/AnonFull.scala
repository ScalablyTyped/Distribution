package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFull extends js.Object {
  var full: Double
  var none: Double
  var oneLevel: Double
  var oneLevelPlusNestedEmptyFolders: Double
}

object AnonFull {
  @scala.inline
  def apply(full: Double, none: Double, oneLevel: Double, oneLevelPlusNestedEmptyFolders: Double): AnonFull = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], oneLevel = oneLevel.asInstanceOf[js.Any], oneLevelPlusNestedEmptyFolders = oneLevelPlusNestedEmptyFolders.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFull]
  }
}

