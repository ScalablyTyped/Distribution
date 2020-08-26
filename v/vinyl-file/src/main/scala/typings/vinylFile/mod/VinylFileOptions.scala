package typings.vinylFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VinylFileOptions extends js.Object {
  /** Specifies the folder relative to the cwd */
  var base: js.UndefOr[String] = js.native
  /** Setting this to false will retuurn file.contents as a stream */
  var buffer: js.UndefOr[Boolean] = js.native
  /** Specifies the working directory the folder is relative to */
  var cwd: js.UndefOr[String] = js.native
  /** Setting this to false will return file.contents as null and not read the file at all */
  var read: js.UndefOr[Boolean] = js.native
}

object VinylFileOptions {
  @scala.inline
  def apply(): VinylFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VinylFileOptions]
  }
  @scala.inline
  implicit class VinylFileOptionsOps[Self <: VinylFileOptions] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
  }
  
}

