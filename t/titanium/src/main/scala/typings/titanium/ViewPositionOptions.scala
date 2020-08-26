package typings.titanium

import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pass an object with the following key-value pairs:
  *   * `view` (Titanium.UI.View): View to insert
  *   * `position` (Number): Position in the [children](Titanium.UI.View.children) array of
  *     the view elment to replace.
  */
@js.native
trait ViewPositionOptions extends js.Object {
  /**
    * Position in the [children](Titanium.UI.View.children) array of the view element to replace.
    */
  var position: js.UndefOr[Double] = js.native
  /**
    * View to insert. Required.
    */
  var view: View = js.native
}

object ViewPositionOptions {
  @scala.inline
  def apply(view: View): ViewPositionOptions = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPositionOptions]
  }
  @scala.inline
  implicit class ViewPositionOptionsOps[Self <: ViewPositionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

