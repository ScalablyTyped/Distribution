package typings.symbolTree.symbolTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorOptions extends js.Object {
  /**
    * Whether to iterate in reverse tree order.
    *
    * @default false
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
}

object IteratorOptions {
  @scala.inline
  def apply(reverse: js.UndefOr[Boolean] = js.undefined): IteratorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorOptions]
  }
}

