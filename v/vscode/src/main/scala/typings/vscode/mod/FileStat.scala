package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileStat extends js.Object {
  /**
    * The creation timestamp in milliseconds elapsed since January 1, 1970 00:00:00 UTC.
    */
  var ctime: Double = js.native
  /**
    * The modification timestamp in milliseconds elapsed since January 1, 1970 00:00:00 UTC.
    *
    * *Note:* If the file changed, it is important to provide an updated `mtime` that advanced
    * from the previous value. Otherwise there may be optimizations in place that will not show
    * the updated file contents in an editor for example.
    */
  var mtime: Double = js.native
  /**
    * The size in bytes.
    *
    * *Note:* If the file changed, it is important to provide an updated `size`. Otherwise there
    * may be optimizations in place that will not show the updated file contents in an editor for
    * example.
    */
  var size: Double = js.native
  /**
    * The type of the file, e.g. is a regular file, a directory, or symbolic link
    * to a file.
    *
    * *Note:* This value might be a bitmask, e.g. `FileType.File | FileType.SymbolicLink`.
    */
  var `type`: FileType = js.native
}

object FileStat {
  @scala.inline
  def apply(ctime: Double, mtime: Double, size: Double, `type`: FileType): FileStat = {
    val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStat]
  }
  @scala.inline
  implicit class FileStatOps[Self <: FileStat] (val x: Self) extends AnyVal {
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
    def setCtime(value: Double): Self = this.set("ctime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtime(value: Double): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: FileType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

