package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsOpenFilesData extends js.Object {
  var allocated: Double
  var available: Double
  var max: Double
}

object FsOpenFilesData {
  @scala.inline
  def apply(allocated: Double, available: Double, max: Double): FsOpenFilesData = {
    val __obj = js.Dynamic.literal(allocated = allocated.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FsOpenFilesData]
  }
}

