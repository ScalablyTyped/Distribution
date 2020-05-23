package typings.terminalKit.screenBufferMod

import typings.terminalKit.terminalKitStrings.down
import typings.terminalKit.terminalKitStrings.left
import typings.terminalKit.terminalKitStrings.right
import typings.terminalKit.terminalKitStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutOptions extends js.Object {
  var attr: Attributes | Double
  var direction: js.UndefOr[right | left | up | down | Null] = js.undefined
  var dx: Double
  var dy: Double
  var wrap: Boolean
  var x: Double
  var y: Double
}

object PutOptions {
  @scala.inline
  def apply(
    attr: Attributes | Double,
    dx: Double,
    dy: Double,
    wrap: Boolean,
    x: Double,
    y: Double,
    direction: js.UndefOr[Null | right | left | up | down] = js.undefined
  ): PutOptions = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOptions]
  }
}

