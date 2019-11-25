package typings.yargsDashParser.yargsDashParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arguments
  extends /** All remaining options */
/* argName */ StringDictionary[js.Any] {
  /** The script name or node command */
  @JSName("$0")
  var $0: String
  /** Non-option arguments */
  var `_`: js.Array[String]
}

object Arguments {
  @scala.inline
  def apply(
    $0: String,
    `_`: js.Array[String],
    StringDictionary: /** All remaining options */
  /* argName */ StringDictionary[js.Any] = null
  ): Arguments = {
    val __obj = js.Dynamic.literal($0 = $0.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(`_`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Arguments]
  }
}

