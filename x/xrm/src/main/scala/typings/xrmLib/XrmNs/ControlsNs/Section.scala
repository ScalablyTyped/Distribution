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

