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

