package typings.webgme.Gme

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  var branches: StringDictionary[String] = js.native
  var delete: Boolean = js.native
  var name: String = js.native
  /** should always be true */
  var read: Boolean = js.native
  var write: Boolean = js.native
}

object Project {
  @scala.inline
  def apply(branches: StringDictionary[String], delete: Boolean, name: String, read: Boolean, write: Boolean): Project = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
  @scala.inline
  implicit class ProjectOps[Self <: Project] (val x: Self) extends AnyVal {
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
    def setBranches(value: StringDictionary[String]): Self = this.set("branches", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: Boolean): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrite(value: Boolean): Self = this.set("write", value.asInstanceOf[js.Any])
  }
  
}

