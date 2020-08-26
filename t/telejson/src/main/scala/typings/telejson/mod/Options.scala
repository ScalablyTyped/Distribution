package typings.telejson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowClass: Boolean = js.native
  var allowDate: Boolean = js.native
  var allowFunction: Boolean = js.native
  var allowRegExp: Boolean = js.native
  var allowSymbol: Boolean = js.native
  var allowUndefined: Boolean = js.native
  var lazyEval: Boolean = js.native
  var maxDepth: Double = js.native
  var space: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(
    allowClass: Boolean,
    allowDate: Boolean,
    allowFunction: Boolean,
    allowRegExp: Boolean,
    allowSymbol: Boolean,
    allowUndefined: Boolean,
    lazyEval: Boolean,
    maxDepth: Double
  ): Options = {
    val __obj = js.Dynamic.literal(allowClass = allowClass.asInstanceOf[js.Any], allowDate = allowDate.asInstanceOf[js.Any], allowFunction = allowFunction.asInstanceOf[js.Any], allowRegExp = allowRegExp.asInstanceOf[js.Any], allowSymbol = allowSymbol.asInstanceOf[js.Any], allowUndefined = allowUndefined.asInstanceOf[js.Any], lazyEval = lazyEval.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any])
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
    def setAllowClass(value: Boolean): Self = this.set("allowClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowDate(value: Boolean): Self = this.set("allowDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowFunction(value: Boolean): Self = this.set("allowFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowRegExp(value: Boolean): Self = this.set("allowRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowSymbol(value: Boolean): Self = this.set("allowSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowUndefined(value: Boolean): Self = this.set("allowUndefined", value.asInstanceOf[js.Any])
    @scala.inline
    def setLazyEval(value: Boolean): Self = this.set("lazyEval", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpace(value: Double): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
  }
  
}

