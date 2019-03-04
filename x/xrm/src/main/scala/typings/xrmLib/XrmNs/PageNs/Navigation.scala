package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Xrm.Page.ui.navigation.
  * @deprecated Use {@link Xrm.Controls.Navigation} instead.
  */
trait Navigation
  extends xrmLib.XrmNs.ControlsNs.Navigation

object Navigation {
  @scala.inline
  def apply(items: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.NavigationItem]): Navigation = {
    val __obj = js.Dynamic.literal(items = items)
  
    __obj.asInstanceOf[Navigation]
  }
}

