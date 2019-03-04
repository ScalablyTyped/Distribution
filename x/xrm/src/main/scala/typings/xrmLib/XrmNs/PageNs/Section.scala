package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a form section.
  * @see {@link UiElement}
  * @deprecated Use {@link Xrm.Controls.Section} instead.
  */
trait Section
  extends xrmLib.XrmNs.ControlsNs.Section

object Section {
  @scala.inline
  def apply(
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.Control],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[xrmLib.XrmNs.ControlsNs.Tab],
    getVisible: js.Function0[scala.Boolean],
    setLabel: js.Function1[java.lang.String, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit]
  ): Section = {
    val __obj = js.Dynamic.literal(controls = controls, getLabel = getLabel, getName = getName, getParent = getParent, getVisible = getVisible, setLabel = setLabel, setVisible = setVisible)
  
    __obj.asInstanceOf[Section]
  }
}

