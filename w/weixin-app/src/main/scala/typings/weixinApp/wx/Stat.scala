package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stat extends js.Object {
  var lastAccessedTime: Double = js.native
  var lastModifiedTime: Double = js.native
  var mode: String = js.native
  var size: Double = js.native
  def isDirectory(): Boolean = js.native
  def isFile(): Boolean = js.native
}

object Stat {
  @scala.inline
  def apply(
    isDirectory: () => Boolean,
    isFile: () => Boolean,
    lastAccessedTime: Double,
    lastModifiedTime: Double,
    mode: String,
    size: Double
  ): Stat = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), lastAccessedTime = lastAccessedTime.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
  @scala.inline
  implicit class StatOps[Self <: Stat] (val x: Self) extends AnyVal {
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
    def setIsDirectory(value: () => Boolean): Self = this.set("isDirectory", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFile(value: () => Boolean): Self = this.set("isFile", js.Any.fromFunction0(value))
    @scala.inline
    def setLastAccessedTime(value: Double): Self = this.set("lastAccessedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedTime(value: Double): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

