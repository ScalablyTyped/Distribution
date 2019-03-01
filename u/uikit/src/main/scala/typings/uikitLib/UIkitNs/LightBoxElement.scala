package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightBoxElement extends js.Object {
  /**
    * Open the lightbox
    */
  def show(): scala.Unit
}

object LightBoxElement {
  @scala.inline
  def apply(show: js.Function0[scala.Unit]): LightBoxElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[LightBoxElement]
  }
}

