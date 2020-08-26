package typings.testingLibraryDom.matchesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherOptions extends js.Object {
  /** Use normalizer with getDefaultNormalizer instead */
  var collapseWhitespace: js.UndefOr[Boolean] = js.native
  var exact: js.UndefOr[Boolean] = js.native
  var normalizer: js.UndefOr[NormalizerFn] = js.native
  /** suppress suggestions for a specific query */
  var suggest: js.UndefOr[Boolean] = js.native
  /** Use normalizer with getDefaultNormalizer instead */
  var trim: js.UndefOr[Boolean] = js.native
}

object MatcherOptions {
  @scala.inline
  def apply(): MatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherOptions]
  }
  @scala.inline
  implicit class MatcherOptionsOps[Self <: MatcherOptions] (val x: Self) extends AnyVal {
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
    def setCollapseWhitespace(value: Boolean): Self = this.set("collapseWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseWhitespace: Self = this.set("collapseWhitespace", js.undefined)
    @scala.inline
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    @scala.inline
    def setNormalizer(value: /* text */ String => String): Self = this.set("normalizer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNormalizer: Self = this.set("normalizer", js.undefined)
    @scala.inline
    def setSuggest(value: Boolean): Self = this.set("suggest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggest: Self = this.set("suggest", js.undefined)
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
  
}

