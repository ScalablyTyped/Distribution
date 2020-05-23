package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  var delete: scala.Double
  var edit: scala.Double
  var none: scala.Double
  var view: scala.Double
}

object View {
  @scala.inline
  def apply(delete: scala.Double, edit: scala.Double, none: scala.Double, view: scala.Double): View = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
}

