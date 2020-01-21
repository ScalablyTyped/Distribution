package typings.temp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var dirs: Double
  var files: Double
}

object Stats {
  @scala.inline
  def apply(dirs: Double, files: Double): Stats = {
    val __obj = js.Dynamic.literal(dirs = dirs.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Stats]
  }
}

