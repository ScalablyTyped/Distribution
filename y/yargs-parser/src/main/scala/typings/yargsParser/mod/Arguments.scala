package typings.yargsParser.mod

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
  @JSName("_")
  var _underscore: js.Array[String]
}

object Arguments {
  @scala.inline
  def apply(
    $0: String,
    _underscore: js.Array[String],
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Arguments = {
    val __obj = js.Dynamic.literal($0 = $0.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Arguments]
  }
}

