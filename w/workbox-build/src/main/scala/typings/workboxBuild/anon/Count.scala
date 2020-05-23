package typings.workboxBuild.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: Double
  var filePaths: js.Array[String]
  var size: Double
  var warnings: js.Array[String]
}

object Count {
  @scala.inline
  def apply(count: Double, filePaths: js.Array[String], size: Double, warnings: js.Array[String]): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], filePaths = filePaths.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

