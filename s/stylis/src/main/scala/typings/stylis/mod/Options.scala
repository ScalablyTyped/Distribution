package typings.stylis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cascade: js.UndefOr[Boolean] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var global: js.UndefOr[Boolean] = js.native
  var keyframe: js.UndefOr[Boolean] = js.native
  var prefix: js.UndefOr[
    Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ Double, Boolean])
  ] = js.native
  var preserve: js.UndefOr[Boolean] = js.native
  var semicolon: js.UndefOr[Boolean] = js.native
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
    def setCascade(value: Boolean): Self = this.set("cascade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setKeyframe(value: Boolean): Self = this.set("keyframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyframe: Self = this.set("keyframe", js.undefined)
    @scala.inline
    def setPrefixFunction3(value: (/* key */ String, /* value */ String, /* context */ Double) => Boolean): Self = this.set("prefix", js.Any.fromFunction3(value))
    @scala.inline
    def setPrefix(
      value: Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ Double, Boolean])
    ): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPreserve(value: Boolean): Self = this.set("preserve", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserve: Self = this.set("preserve", js.undefined)
    @scala.inline
    def setSemicolon(value: Boolean): Self = this.set("semicolon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemicolon: Self = this.set("semicolon", js.undefined)
  }
  
}

