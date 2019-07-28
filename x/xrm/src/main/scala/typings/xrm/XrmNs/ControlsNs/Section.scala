package typings.xrm.XrmNs.ControlsNs

import typings.xrm.XrmNs.CollectionNs.ItemCollection
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
  var controls: ItemCollection[Control]
  /**
    * Gets the name of the section.
    * @returns The name.
    */
  def getName(): String
  /**
    * Gets a reference to the parent {@link Tab}.
    * @returns The parent.
    */
  def getParent(): Tab
}

object Section {
  @scala.inline
  def apply(
    controls: ItemCollection[Control],
    getLabel: () => String,
    getName: () => String,
    getParent: () => Tab,
    getVisible: () => Boolean,
    setLabel: String => Unit,
    setVisible: Boolean => Unit
  ): Section = {
    val __obj = js.Dynamic.literal(controls = controls, getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[Section]
  }
}

