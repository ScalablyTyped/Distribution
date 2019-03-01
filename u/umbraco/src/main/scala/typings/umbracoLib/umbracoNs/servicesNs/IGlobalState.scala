package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global State
  */
trait IGlobalState extends js.Object {
  var isReady: scala.Boolean
  var navMode: js.Any
  var showNavigation: scala.Boolean
  var showTray: scala.Boolean
  var stickyNavigation: js.Any
  var touchDevice: scala.Boolean
}

object IGlobalState {
  @scala.inline
  def apply(
    isReady: scala.Boolean,
    navMode: js.Any,
    showNavigation: scala.Boolean,
    showTray: scala.Boolean,
    stickyNavigation: js.Any,
    touchDevice: scala.Boolean
  ): IGlobalState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isReady")(isReady)
    __obj.updateDynamic("navMode")(navMode)
    __obj.updateDynamic("showNavigation")(showNavigation)
    __obj.updateDynamic("showTray")(showTray)
    __obj.updateDynamic("stickyNavigation")(stickyNavigation)
    __obj.updateDynamic("touchDevice")(touchDevice)
    __obj.asInstanceOf[IGlobalState]
  }
}

