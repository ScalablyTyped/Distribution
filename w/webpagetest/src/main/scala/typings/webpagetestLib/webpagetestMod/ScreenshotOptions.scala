package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScreenshotOptions extends js.Object {
  /** returns the page screenshot at the Document Complete point (i.e.: when window.onload was fired) */
  var documentComplete: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the full resolution screenshot in PNG format if available */
  var fullResolution: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the page screenshot at the Start Render point (i.e.: when something was first displayed on screen) */
  var startRender: js.UndefOr[scala.Boolean] = js.undefined
}

