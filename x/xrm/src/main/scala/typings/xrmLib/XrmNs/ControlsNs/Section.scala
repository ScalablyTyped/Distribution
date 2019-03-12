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
    getLabel: () => java.lang.String,
    getName: () => java.lang.String,
    getParent: () => Tab,
    getVisible: () => scala.Boolean,
    setLabel: java.lang.String => scala.Unit,
    setVisible: scala.Boolean => scala.Unit
  ): Section = {
    val __obj = js.Dynamic.literal(controls = controls, getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[Section]
  }
}

