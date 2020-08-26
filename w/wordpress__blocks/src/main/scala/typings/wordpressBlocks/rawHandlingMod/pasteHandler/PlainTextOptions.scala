package typings.wordpressBlocks.rawHandlingMod.pasteHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlainTextOptions
  extends BaseOptions
     with Options {
  /**
    * Plain text version.
    */
  var plainText: String = js.native
}

object PlainTextOptions {
  @scala.inline
  def apply(plainText: String): PlainTextOptions = {
    val __obj = js.Dynamic.literal(plainText = plainText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlainTextOptions]
  }
  @scala.inline
  implicit class PlainTextOptionsOps[Self <: PlainTextOptions] (val x: Self) extends AnyVal {
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
    def setPlainText(value: String): Self = this.set("plainText", value.asInstanceOf[js.Any])
  }
  
}

