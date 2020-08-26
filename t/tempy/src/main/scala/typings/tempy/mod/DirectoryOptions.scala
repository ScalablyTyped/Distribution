package typings.tempy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryOptions extends js.Object {
  /**
  		_You usually won't need this option. Specify it only when actually needed._
  		Directory prefix.
  		Useful for testing by making it easier to identify cache directories that are created.
  		*/
  val prefix: js.UndefOr[String] = js.native
}

object DirectoryOptions {
  @scala.inline
  def apply(): DirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryOptions]
  }
  @scala.inline
  implicit class DirectoryOptionsOps[Self <: DirectoryOptions] (val x: Self) extends AnyVal {
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
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

