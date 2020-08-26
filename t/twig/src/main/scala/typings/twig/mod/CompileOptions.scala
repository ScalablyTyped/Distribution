package typings.twig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileOptions extends js.Object {
  var filename: String = js.native
  var settings: js.Any = js.native
}

object CompileOptions {
  @scala.inline
  def apply(filename: String, settings: js.Any): CompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileOptions]
  }
  @scala.inline
  implicit class CompileOptionsOps[Self <: CompileOptions] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: js.Any): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

