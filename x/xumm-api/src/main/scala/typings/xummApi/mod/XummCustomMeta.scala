package typings.xummApi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummCustomMeta extends js.Object {
  var blob: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  var identifier: js.UndefOr[String | Null] = js.undefined
  var instruction: js.UndefOr[String | Null] = js.undefined
}

object XummCustomMeta {
  @scala.inline
  def apply(
    blob: js.UndefOr[Null | StringDictionary[js.Any]] = js.undefined,
    identifier: js.UndefOr[Null | String] = js.undefined,
    instruction: js.UndefOr[Null | String] = js.undefined
  ): XummCustomMeta = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blob)) __obj.updateDynamic("blob")(blob.asInstanceOf[js.Any])
    if (!js.isUndefined(identifier)) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (!js.isUndefined(instruction)) __obj.updateDynamic("instruction")(instruction.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummCustomMeta]
  }
}

