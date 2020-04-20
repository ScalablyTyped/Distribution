package typings.titanium.Titanium.App

import typings.titanium.LaunchOptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a new URL is handled by the application.
		 */
trait iOSHandleurlEvent extends iOSBaseEvent {
  /**
  			 * The launch options that are related to opening the URL.
  			 */
  var launchOptions: LaunchOptionsType
}

object iOSHandleurlEvent {
  @scala.inline
  def apply(launchOptions: LaunchOptionsType, source: iOS): iOSHandleurlEvent = {
    val __obj = js.Dynamic.literal(launchOptions = launchOptions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSHandleurlEvent]
  }
}

