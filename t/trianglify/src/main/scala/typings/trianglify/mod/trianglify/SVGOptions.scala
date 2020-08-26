package typings.trianglify.mod.trianglify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGOptions extends js.Object {
  var includeNamespace: Boolean = js.native
}

object SVGOptions {
  @scala.inline
  def apply(includeNamespace: Boolean): SVGOptions = {
    val __obj = js.Dynamic.literal(includeNamespace = includeNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGOptions]
  }
  @scala.inline
  implicit class SVGOptionsOps[Self <: SVGOptions] (val x: Self) extends AnyVal {
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
    def setIncludeNamespace(value: Boolean): Self = this.set("includeNamespace", value.asInstanceOf[js.Any])
  }
  
}

