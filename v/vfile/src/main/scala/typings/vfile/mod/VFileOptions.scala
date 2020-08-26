package typings.vfile.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VFileOptions
  extends /* key */ StringDictionary[js.Any]
     with _VFileCompatible {
  var basename: js.UndefOr[String] = js.native
  var contents: js.UndefOr[VFileContents] = js.native
  var cwd: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dirname: js.UndefOr[String] = js.native
  var extname: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var stem: js.UndefOr[String] = js.native
}

object VFileOptions {
  @scala.inline
  def apply(): VFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VFileOptions]
  }
  @scala.inline
  implicit class VFileOptionsOps[Self <: VFileOptions] (val x: Self) extends AnyVal {
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
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasename: Self = this.set("basename", js.undefined)
    @scala.inline
    def setContents(value: VFileContents): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirname: Self = this.set("dirname", js.undefined)
    @scala.inline
    def setExtname(value: String): Self = this.set("extname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtname: Self = this.set("extname", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setStem(value: String): Self = this.set("stem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStem: Self = this.set("stem", js.undefined)
  }
  
}

