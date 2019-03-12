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
    w2form: js.Object => w2uiLib.W2UINs.W2Form,
    w2grid: js.Object => w2uiLib.W2UINs.W2Grid,
    w2layout: js.Object => w2uiLib.W2UINs.W2Layout,
    w2popup: js.Object => w2uiLib.W2UINs.W2Popup,
    w2sidebar: js.Object => w2uiLib.W2UINs.W2Sidebar,
    w2tabs: js.Object => w2uiLib.W2UINs.W2Tabs,
    w2toolbar: js.Object => w2uiLib.W2UINs.W2Toolbar
  ): JQuery = {
    val __obj = js.Dynamic.literal(w2form = js.Any.fromFunction1(w2form), w2grid = js.Any.fromFunction1(w2grid), w2layout = js.Any.fromFunction1(w2layout), w2popup = js.Any.fromFunction1(w2popup), w2sidebar = js.Any.fromFunction1(w2sidebar), w2tabs = js.Any.fromFunction1(w2tabs), w2toolbar = js.Any.fromFunction1(w2toolbar))
  
    __obj.asInstanceOf[JQuery]
  }
}

