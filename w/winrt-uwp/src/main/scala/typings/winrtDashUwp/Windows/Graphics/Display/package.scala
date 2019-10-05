package typings.winrtDashUwp.Windows.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Display {
  import typings.winrtDashUwp.Windows.WinRTEvent

  /** Represents a method that handles display property events. */
  type DisplayPropertiesEventHandler = js.Function1[/* ev */ WinRTEvent[js.Any], Unit]
}
