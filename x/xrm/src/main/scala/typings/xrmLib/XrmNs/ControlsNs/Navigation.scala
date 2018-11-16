package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Interface for {@link Ui.navigation formContext.ui.navigation}.
         */

trait Navigation extends js.Object {
  /**
               * A reference to the collection of available navigation items.
               * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
               */
  var items: xrmLib.XrmNs.CollectionNs.ItemCollection[NavigationItem]
}

