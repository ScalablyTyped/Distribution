package typings.webidl2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /** Boolean indicating whether the result should include EOF node or not. */
  var concrete: js.UndefOr[Boolean] = js.undefined
  /** The source name, typically a filename. Errors and validation objects can indicate their origin if you pass a value. */
  var sourceName: js.UndefOr[String] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(concrete: js.UndefOr[Boolean] = js.undefined, sourceName: String = null): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concrete)) __obj.updateDynamic("concrete")(concrete.get.asInstanceOf[js.Any])
    if (sourceName != null) __obj.updateDynamic("sourceName")(sourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

