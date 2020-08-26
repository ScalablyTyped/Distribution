package typings.swigEmailTemplates.mod

import typings.jquery.JQueryStatic
import typings.swig.mod.SwigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwigEmailTemplatesOptions extends SwigOptions {
  var juice: js.UndefOr[js.Any] = js.native
  var rewrite: js.UndefOr[js.Function1[/* $ */ JQueryStatic, Unit]] = js.native
  var rewriteUrl: js.UndefOr[js.Function1[/* href */ String, String]] = js.native
  var root: js.UndefOr[String] = js.native
}

object SwigEmailTemplatesOptions {
  @scala.inline
  def apply(): SwigEmailTemplatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwigEmailTemplatesOptions]
  }
  @scala.inline
  implicit class SwigEmailTemplatesOptionsOps[Self <: SwigEmailTemplatesOptions] (val x: Self) extends AnyVal {
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
    def setJuice(value: js.Any): Self = this.set("juice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJuice: Self = this.set("juice", js.undefined)
    @scala.inline
    def setRewrite(value: /* $ */ JQueryStatic => Unit): Self = this.set("rewrite", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRewrite: Self = this.set("rewrite", js.undefined)
    @scala.inline
    def setRewriteUrl(value: /* href */ String => String): Self = this.set("rewriteUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRewriteUrl: Self = this.set("rewriteUrl", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

