package typings
package yogDashBigpipeLib.yogDashBigpipeMod.yogBigpipeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageletData extends js.Object {
  var container: java.lang.String
  var css: js.Array[java.lang.String]
  var html: java.lang.String
  var id: java.lang.String
  @JSName("js")
  var js_ : js.Array[java.lang.String]
  var reqID: java.lang.String
  var scripts: js.Array[java.lang.String]
  var styles: js.Array[java.lang.String]
}

object PageletData {
  @scala.inline
  def apply(
    container: java.lang.String,
    css: js.Array[java.lang.String],
    html: java.lang.String,
    id: java.lang.String,
    js_ : js.Array[java.lang.String],
    reqID: java.lang.String,
    scripts: js.Array[java.lang.String],
    styles: js.Array[java.lang.String]
  ): PageletData = {
    val __obj = js.Dynamic.literal(container = container, css = css, html = html, id = id, reqID = reqID, scripts = scripts, styles = styles)
    __obj.updateDynamic("js")(js_)
    __obj.asInstanceOf[PageletData]
  }
}

