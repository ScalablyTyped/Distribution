package typings.summernote.mod.global.Summernote

import typings.jquery.JQuery.Node
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HintOptions extends js.Object {
  var content: js.UndefOr[js.Function1[/* item */ String, htmlElement | Node]] = js.native
  var `match`: RegExp = js.native
  var mentions: js.UndefOr[js.Array[String]] = js.native
  var template: js.UndefOr[js.Function1[/* item */ String, htmlElement]] = js.native
  var words: js.UndefOr[js.Array[String]] = js.native
  def search(keyword: String, callback: js.Function1[/* plausibleItems */ js.Array[String], Unit]): Unit = js.native
}

object HintOptions {
  @scala.inline
  def apply(
    `match`: RegExp,
    search: (String, js.Function1[/* plausibleItems */ js.Array[String], Unit]) => Unit
  ): HintOptions = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction2(search))
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HintOptions]
  }
  @scala.inline
  implicit class HintOptionsOps[Self <: HintOptions] (val x: Self) extends AnyVal {
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
    def setMatch(value: RegExp): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: (String, js.Function1[/* plausibleItems */ js.Array[String], Unit]) => Unit): Self = this.set("search", js.Any.fromFunction2(value))
    @scala.inline
    def setContent(value: /* item */ String => htmlElement | Node): Self = this.set("content", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setMentionsVarargs(value: String*): Self = this.set("mentions", js.Array(value :_*))
    @scala.inline
    def setMentions(value: js.Array[String]): Self = this.set("mentions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMentions: Self = this.set("mentions", js.undefined)
    @scala.inline
    def setTemplate(value: /* item */ String => htmlElement): Self = this.set("template", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setWordsVarargs(value: String*): Self = this.set("words", js.Array(value :_*))
    @scala.inline
    def setWords(value: js.Array[String]): Self = this.set("words", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
  
}

