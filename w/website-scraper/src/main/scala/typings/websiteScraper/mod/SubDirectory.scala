package typings.websiteScraper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubDirectory extends js.Object {
  var directory: String = js.native
  var extensions: js.Array[String] = js.native
}

object SubDirectory {
  @scala.inline
  def apply(directory: String, extensions: js.Array[String]): SubDirectory = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubDirectory]
  }
  @scala.inline
  implicit class SubDirectoryOps[Self <: SubDirectory] (val x: Self) extends AnyVal {
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
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
  }
  
}

