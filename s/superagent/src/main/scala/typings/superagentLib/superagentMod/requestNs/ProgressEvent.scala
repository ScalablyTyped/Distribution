package typings
package superagentLib.superagentMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProgressEvent extends js.Object {
  var direction: superagentLib.superagentLibStrings.download | superagentLib.superagentLibStrings.upload
  var loaded: scala.Double
  var percent: js.UndefOr[scala.Double] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
}

