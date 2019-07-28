package typings.yogDashBigpipe.yogDashBigpipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageletData extends js.Object {
  var container: String
  var css: js.Array[String]
  var html: String
  var id: String
  @JSName("js")
  var js_ : js.Array[String]
  var reqID: String
  var scripts: js.Array[String]
  var styles: js.Array[String]
}

object PageletData {
  @scala.inline
  def apply(
    container: String,
    css: js.Array[String],
    html: String,
    id: String,
    js_ : js.Array[String],
    reqID: String,
    scripts: js.Array[String],
    styles: js.Array[String]
  ): PageletData = {
    val __obj = js.Dynamic.literal(container = container, css = css, html = html, id = id, reqID = reqID, scripts = scripts, styles = styles)
    __obj.updateDynamic("js")(js_)
    __obj.asInstanceOf[PageletData]
  }
}

