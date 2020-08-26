package typings.tannin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TanninOptions extends js.Object {
  /**
    * Joiner in string lookup with context.
    */
  var contextDelimiter: js.UndefOr[String] = js.native
  /**
    * Callback to invoke when key missing.
    */
  var onMissingKey: js.UndefOr[js.Function] = js.native
}

object TanninOptions {
  @scala.inline
  def apply(): TanninOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TanninOptions]
  }
  @scala.inline
  implicit class TanninOptionsOps[Self <: TanninOptions] (val x: Self) extends AnyVal {
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
    def setContextDelimiter(value: String): Self = this.set("contextDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextDelimiter: Self = this.set("contextDelimiter", js.undefined)
    @scala.inline
    def setOnMissingKey(value: js.Function): Self = this.set("onMissingKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMissingKey: Self = this.set("onMissingKey", js.undefined)
  }
  
}

