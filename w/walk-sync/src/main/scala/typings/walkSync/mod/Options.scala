package typings.walkSync.mod

import typings.minimatch.mod.IMinimatch
import typings.minimatch.mod.IOptions
import typings.walkSync.anon.TypeoffsNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var directories: js.UndefOr[Boolean] = js.native
  var fs: TypeoffsNode = js.native
  var globOptions: js.UndefOr[IOptions] = js.native
  var globs: js.UndefOr[js.Array[String | IMinimatch]] = js.native
  var ignore: js.UndefOr[js.Array[String | IMinimatch]] = js.native
  var includeBasePath: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(fs: TypeoffsNode): Options = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFs(value: TypeoffsNode): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectories(value: Boolean): Self = this.set("directories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    @scala.inline
    def setGlobOptions(value: IOptions): Self = this.set("globOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobOptions: Self = this.set("globOptions", js.undefined)
    @scala.inline
    def setGlobsVarargs(value: (String | IMinimatch)*): Self = this.set("globs", js.Array(value :_*))
    @scala.inline
    def setGlobs(value: js.Array[String | IMinimatch]): Self = this.set("globs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobs: Self = this.set("globs", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: (String | IMinimatch)*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[String | IMinimatch]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setIncludeBasePath(value: Boolean): Self = this.set("includeBasePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeBasePath: Self = this.set("includeBasePath", js.undefined)
  }
  
}

