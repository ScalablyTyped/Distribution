package typings.vinylFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cwd extends js.Object {
  /**
    * Specify the working directory the folder is relative to
    * Default is process.cwd()
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Specify the mode the directory should be created with
    * Default is the process mode
    */
  var dirMode: js.UndefOr[Double] = js.native
  /** Specify the mode the directory should be created with. Default is the process mode */
  var mode: js.UndefOr[Double | String] = js.native
}

object Cwd {
  @scala.inline
  def apply(): Cwd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cwd]
  }
  @scala.inline
  implicit class CwdOps[Self <: Cwd] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setDirMode(value: Double): Self = this.set("dirMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirMode: Self = this.set("dirMode", js.undefined)
    @scala.inline
    def setMode(value: Double | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

