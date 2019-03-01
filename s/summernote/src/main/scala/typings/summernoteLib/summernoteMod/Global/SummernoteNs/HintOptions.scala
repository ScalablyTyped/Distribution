package typings
package summernoteLib.summernoteMod.Global.SummernoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HintOptions extends js.Object {
  var content: js.UndefOr[js.Function1[/* item */ java.lang.String, htmlElement | jqueryLib.JQueryNs.Node]] = js.undefined
  var `match`: stdLib.RegExp
  var mentions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var template: js.UndefOr[js.Function1[/* item */ java.lang.String, htmlElement]] = js.undefined
  var words: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  def search(
    keyword: java.lang.String,
    callback: js.Function1[/* plausibleItems */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit
}

object HintOptions {
  @scala.inline
  def apply(
    `match`: stdLib.RegExp,
    search: js.Function2[
      java.lang.String, 
      js.Function1[/* plausibleItems */ js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ],
    content: js.Function1[/* item */ java.lang.String, htmlElement | jqueryLib.JQueryNs.Node] = null,
    mentions: js.Array[java.lang.String] = null,
    template: js.Function1[/* item */ java.lang.String, htmlElement] = null,
    words: js.Array[java.lang.String] = null
  ): HintOptions = {
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("search")(search)
    if (content != null) __obj.updateDynamic("content")(content)
    if (mentions != null) __obj.updateDynamic("mentions")(mentions)
    if (template != null) __obj.updateDynamic("template")(template)
    if (words != null) __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[HintOptions]
  }
}

