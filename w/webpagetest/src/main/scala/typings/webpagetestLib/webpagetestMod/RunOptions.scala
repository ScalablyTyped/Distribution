package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOptions extends js.Object {
  /** if true returns the repeat view (cached) data */
  var repeatView: js.UndefOr[scala.Boolean] = js.undefined
  /** the test run number for multiple runs tests (default: 1, first test) */
  var run: js.UndefOr[scala.Double] = js.undefined
}

