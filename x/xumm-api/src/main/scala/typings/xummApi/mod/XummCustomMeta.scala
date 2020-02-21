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
  def apply(blob: StringDictionary[js.Any] = null, identifier: String = null, instruction: String = null): XummCustomMeta = {
    val __obj = js.Dynamic.literal()
    if (blob != null) __obj.updateDynamic("blob")(blob.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (instruction != null) __obj.updateDynamic("instruction")(instruction.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummCustomMeta]
  }
}

