package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a form section.
  * @see {@link UiElement}
  */
trait Section extends UiStandardElement {
  /**
    * A reference to the collection of controls within this tab.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var controls: xrmLib.XrmNs.CollectionNs.ItemCollection[Control]
  /**
    * Gets the name of the section.
    * @returns The name.
    */
  def getName(): java.lang.String
  /**
    * Gets a reference to the parent {@link Tab}.
    * @returns The parent.
    */
  def getParent(): Tab
}

object Section {
  @scala.inline
  def apply(
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[Control],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[Tab],
    getVisible: js.Function0[scala.Boolean],
    setLabel: js.Function1[java.lang.String, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit]
  ): Section = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("controls")(controls)
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getVisible")(getVisible)
    __obj.updateDynamic("setLabel")(setLabel)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.asInstanceOf[Section]
  }
}

