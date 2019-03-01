package typings
package tapeLib.tapeMod.tapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the createStream function.
  */
trait StreamOptions extends js.Object {
  var objectMode: js.UndefOr[scala.Boolean] = js.undefined
}

object StreamOptions {
  @scala.inline
  def apply(objectMode: js.UndefOr[scala.Boolean] = js.undefined): StreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    __obj.asInstanceOf[StreamOptions]
  }
}

