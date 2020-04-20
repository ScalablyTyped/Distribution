package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global State
  */
trait IGlobalState extends js.Object {
  var isReady: Boolean
  var navMode: js.Any
  var showNavigation: Boolean
  var showTray: Boolean
  var stickyNavigation: js.Any
  var touchDevice: Boolean
}

object IGlobalState {
  @scala.inline
  def apply(
    isReady: Boolean,
    navMode: js.Any,
    showNavigation: Boolean,
    showTray: Boolean,
    stickyNavigation: js.Any,
    touchDevice: Boolean
  ): IGlobalState = {
    val __obj = js.Dynamic.literal(isReady = isReady.asInstanceOf[js.Any], navMode = navMode.asInstanceOf[js.Any], showNavigation = showNavigation.asInstanceOf[js.Any], showTray = showTray.asInstanceOf[js.Any], stickyNavigation = stickyNavigation.asInstanceOf[js.Any], touchDevice = touchDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlobalState]
  }
}

