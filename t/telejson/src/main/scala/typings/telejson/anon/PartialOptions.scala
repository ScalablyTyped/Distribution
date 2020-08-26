package typings.telejson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<telejson.telejson.Options> */
@js.native
trait PartialOptions extends js.Object {
  var allowClass: js.UndefOr[Boolean] = js.native
  var allowDate: js.UndefOr[Boolean] = js.native
  var allowFunction: js.UndefOr[Boolean] = js.native
  var allowRegExp: js.UndefOr[Boolean] = js.native
  var allowSymbol: js.UndefOr[Boolean] = js.native
  var allowUndefined: js.UndefOr[Boolean] = js.native
  var lazyEval: js.UndefOr[Boolean] = js.native
  var maxDepth: js.UndefOr[Double] = js.native
  var space: js.UndefOr[Double] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def setAllowClass(value: Boolean): Self = this.set("allowClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClass: Self = this.set("allowClass", js.undefined)
    @scala.inline
    def setAllowDate(value: Boolean): Self = this.set("allowDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDate: Self = this.set("allowDate", js.undefined)
    @scala.inline
    def setAllowFunction(value: Boolean): Self = this.set("allowFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFunction: Self = this.set("allowFunction", js.undefined)
    @scala.inline
    def setAllowRegExp(value: Boolean): Self = this.set("allowRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRegExp: Self = this.set("allowRegExp", js.undefined)
    @scala.inline
    def setAllowSymbol(value: Boolean): Self = this.set("allowSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSymbol: Self = this.set("allowSymbol", js.undefined)
    @scala.inline
    def setAllowUndefined(value: Boolean): Self = this.set("allowUndefined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUndefined: Self = this.set("allowUndefined", js.undefined)
    @scala.inline
    def setLazyEval(value: Boolean): Self = this.set("lazyEval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyEval: Self = this.set("lazyEval", js.undefined)
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    @scala.inline
    def setSpace(value: Double): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
  }
  
}

