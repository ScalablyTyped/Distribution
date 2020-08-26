package typings.xmlFormatter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatOptions extends js.Object {
  var collapseContent: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[js.Function1[/* node */ js.Any, Boolean]] = js.native
  var indentation: js.UndefOr[String] = js.native
  var lineSeparator: js.UndefOr[String] = js.native
  var stripComments: js.UndefOr[Boolean] = js.native
  var whiteSpaceAtEndOfSelfclosingTag: js.UndefOr[Boolean] = js.native
}

object FormatOptions {
  @scala.inline
  def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  @scala.inline
  implicit class FormatOptionsOps[Self <: FormatOptions] (val x: Self) extends AnyVal {
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
    def setCollapseContent(value: Boolean): Self = this.set("collapseContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseContent: Self = this.set("collapseContent", js.undefined)
    @scala.inline
    def setFilter(value: /* node */ js.Any => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setIndentation(value: String): Self = this.set("indentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentation: Self = this.set("indentation", js.undefined)
    @scala.inline
    def setLineSeparator(value: String): Self = this.set("lineSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineSeparator: Self = this.set("lineSeparator", js.undefined)
    @scala.inline
    def setStripComments(value: Boolean): Self = this.set("stripComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripComments: Self = this.set("stripComments", js.undefined)
    @scala.inline
    def setWhiteSpaceAtEndOfSelfclosingTag(value: Boolean): Self = this.set("whiteSpaceAtEndOfSelfclosingTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhiteSpaceAtEndOfSelfclosingTag: Self = this.set("whiteSpaceAtEndOfSelfclosingTag", js.undefined)
  }
  
}

