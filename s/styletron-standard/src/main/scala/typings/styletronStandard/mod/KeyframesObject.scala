package typings.styletronStandard.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined styletron-standard.styletron-standard.KeyframesPercentageObject & {  from ? :styletron-standard.styletron-standard.Properties,   to ? :styletron-standard.styletron-standard.Properties} */
trait KeyframesObject extends /* key */ StringDictionary[Properties] {
  var from: js.UndefOr[Properties] = js.undefined
  var to: js.UndefOr[Properties] = js.undefined
}

object KeyframesObject {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[Properties] = null,
    from: Properties = null,
    to: Properties = null
  ): KeyframesObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesObject]
  }
}

