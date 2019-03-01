package typings
package w2uiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def w2form(options: js.Object): w2uiLib.W2UINs.W2Form
  def w2grid(options: js.Object): w2uiLib.W2UINs.W2Grid
  def w2layout(options: js.Object): w2uiLib.W2UINs.W2Layout
  def w2popup(options: js.Object): w2uiLib.W2UINs.W2Popup
  def w2sidebar(options: js.Object): w2uiLib.W2UINs.W2Sidebar
  def w2tabs(options: js.Object): w2uiLib.W2UINs.W2Tabs
  def w2toolbar(options: js.Object): w2uiLib.W2UINs.W2Toolbar
}

object JQuery {
  @scala.inline
  def apply(
    w2form: js.Function1[js.Object, w2uiLib.W2UINs.W2Form],
    w2grid: js.Function1[js.Object, w2uiLib.W2UINs.W2Grid],
    w2layout: js.Function1[js.Object, w2uiLib.W2UINs.W2Layout],
    w2popup: js.Function1[js.Object, w2uiLib.W2UINs.W2Popup],
    w2sidebar: js.Function1[js.Object, w2uiLib.W2UINs.W2Sidebar],
    w2tabs: js.Function1[js.Object, w2uiLib.W2UINs.W2Tabs],
    w2toolbar: js.Function1[js.Object, w2uiLib.W2UINs.W2Toolbar]
  ): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("w2form")(w2form)
    __obj.updateDynamic("w2grid")(w2grid)
    __obj.updateDynamic("w2layout")(w2layout)
    __obj.updateDynamic("w2popup")(w2popup)
    __obj.updateDynamic("w2sidebar")(w2sidebar)
    __obj.updateDynamic("w2tabs")(w2tabs)
    __obj.updateDynamic("w2toolbar")(w2toolbar)
    __obj.asInstanceOf[JQuery]
  }
}

