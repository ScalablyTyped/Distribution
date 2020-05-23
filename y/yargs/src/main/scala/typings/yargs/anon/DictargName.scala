package typings.yargs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictargName
  extends /** All remaining options */
/* argName */ StringDictionary[js.Any] {
  /** The script name or node command */
  @JSName("$0")
  var $0: java.lang.String
  /** Non-option arguments */
  @JSName("_")
  var _underscore: js.Array[java.lang.String]
}

object DictargName {
  @scala.inline
  def apply(
    $0: java.lang.String,
    _underscore: js.Array[java.lang.String],
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): DictargName = {
    val __obj = js.Dynamic.literal($0 = $0.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictargName]
  }
}

