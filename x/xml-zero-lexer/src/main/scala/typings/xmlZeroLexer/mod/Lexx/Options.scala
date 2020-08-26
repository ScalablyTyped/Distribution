package typings.xmlZeroLexer.mod.Lexx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * @default ["script", "style"]
    */
  var blackholes: js.UndefOr[js.Array[String]] = js.native
  /**
    * @default false
    */
  var html: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var jsx: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBlackholesVarargs(value: String*): Self = this.set("blackholes", js.Array(value :_*))
    @scala.inline
    def setBlackholes(value: js.Array[String]): Self = this.set("blackholes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlackholes: Self = this.set("blackholes", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setJsx(value: Boolean): Self = this.set("jsx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsx: Self = this.set("jsx", js.undefined)
  }
  
}

