package typings.summernote.summernoteMod._Global_.Summernote

import typings.jquery.JQuery.Node
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HintOptions extends js.Object {
  var content: js.UndefOr[js.Function1[/* item */ String, htmlElement | Node]] = js.undefined
  var `match`: RegExp
  var mentions: js.UndefOr[js.Array[String]] = js.undefined
  var template: js.UndefOr[js.Function1[/* item */ String, htmlElement]] = js.undefined
  var words: js.UndefOr[js.Array[String]] = js.undefined
  def search(keyword: String, callback: js.Function1[/* plausibleItems */ js.Array[String], Unit]): Unit
}

object HintOptions {
  @scala.inline
  def apply(
    `match`: RegExp,
    search: (String, js.Function1[/* plausibleItems */ js.Array[String], Unit]) => Unit,
    content: /* item */ String => htmlElement | Node = null,
    mentions: js.Array[String] = null,
    template: /* item */ String => htmlElement = null,
    words: js.Array[String] = null
  ): HintOptions = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction2(search))
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(js.Any.fromFunction1(content))
    if (mentions != null) __obj.updateDynamic("mentions")(mentions.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1(template))
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[HintOptions]
  }
}

