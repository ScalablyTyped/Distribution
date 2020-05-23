package typings.wordpressBlockEditor.anon

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends js.Object {
  var align: String
  var icon: Icon | Element
  var title: String
}

object Align {
  @scala.inline
  def apply(align: String, icon: Icon | Element, title: String): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
}

