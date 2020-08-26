package typings.wordpressBlocks.rawHandlingMod.pasteHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLOptions
  extends BaseOptions
     with Options {
  /**
    * The HTML to convert.
    */
  var HTML: String = js.native
}

object HTMLOptions {
  @scala.inline
  def apply(HTML: String): HTMLOptions = {
    val __obj = js.Dynamic.literal(HTML = HTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLOptions]
  }
  @scala.inline
  implicit class HTMLOptionsOps[Self <: HTMLOptions] (val x: Self) extends AnyVal {
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
    def setHTML(value: String): Self = this.set("HTML", value.asInstanceOf[js.Any])
  }
  
}

