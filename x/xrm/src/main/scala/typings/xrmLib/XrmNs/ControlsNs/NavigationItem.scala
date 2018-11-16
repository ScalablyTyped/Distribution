package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Interface for a navigation item.
         * @see {@link UiElement}
         * @see {@link UiFocusable}
         * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui-navigation External Link: formContext.ui.navigation item (Client API reference)}
         */

trait NavigationItem
  extends UiStandardElement
     with UiFocusable {
  /**
               * Gets the name of the item.
               * @returns The identifier.
               */
  def getId(): java.lang.String
}

