package typings.stubby.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StubbyWithPfxOptions
  extends StubbyCommonOptions
     with StubbyOptions {
  /** pfx file contents (mutually exclusive with key/cert options) */
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | js.Object])] = js.native
}

object StubbyWithPfxOptions {
  @scala.inline
  def apply(): StubbyWithPfxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StubbyWithPfxOptions]
  }
  @scala.inline
  implicit class StubbyWithPfxOptionsOps[Self <: StubbyWithPfxOptions] (val x: Self) extends AnyVal {
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
    def setPfxVarargs(value: (String | Buffer | js.Object)*): Self = this.set("pfx", js.Array(value :_*))
    @scala.inline
    def setPfx(value: String | Buffer | (js.Array[String | Buffer | js.Object])): Self = this.set("pfx", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
  }
  
}

