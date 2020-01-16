package typings.w3cDashXmlserializer.w3cDashXmlserializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		 * Whether the serialization algorithm will throw an `Error`
  		 * when the `Node` can't be serialized to well-formed XML.
  		 *
  		 * @default false
  		 */
  var requireWellFormed: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(requireWellFormed: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requireWellFormed)) __obj.updateDynamic("requireWellFormed")(requireWellFormed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

