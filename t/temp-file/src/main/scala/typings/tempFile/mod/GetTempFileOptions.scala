package typings.tempFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTempFileOptions extends js.Object {
  var disposer: js.UndefOr[(js.Function1[/* file */ String, js.Promise[Unit]]) | Null] = js.native
  var prefix: js.UndefOr[String | Null] = js.native
  var suffix: js.UndefOr[String | Null] = js.native
}

object GetTempFileOptions {
  @scala.inline
  def apply(): GetTempFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTempFileOptions]
  }
  @scala.inline
  implicit class GetTempFileOptionsOps[Self <: GetTempFileOptions] (val x: Self) extends AnyVal {
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
    def setDisposer(value: /* file */ String => js.Promise[Unit]): Self = this.set("disposer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisposer: Self = this.set("disposer", js.undefined)
    @scala.inline
    def setDisposerNull: Self = this.set("disposer", null)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPrefixNull: Self = this.set("prefix", null)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setSuffixNull: Self = this.set("suffix", null)
  }
  
}

