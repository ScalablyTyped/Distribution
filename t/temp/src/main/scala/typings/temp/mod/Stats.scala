package typings.temp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var dirs: Double = js.native
  var files: Double = js.native
}

object Stats {
  @scala.inline
  def apply(dirs: Double, files: Double): Stats = {
    val __obj = js.Dynamic.literal(dirs = dirs.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirs(value: Double): Self = this.set("dirs", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiles(value: Double): Self = this.set("files", value.asInstanceOf[js.Any])
  }
  
}

