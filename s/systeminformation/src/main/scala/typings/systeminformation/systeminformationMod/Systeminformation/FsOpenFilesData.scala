package typings.systeminformation.systeminformationMod.Systeminformation

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
    val __obj = js.Dynamic.literal(allocated = allocated, available = available, max = max)
  
    __obj.asInstanceOf[FsOpenFilesData]
  }
}

