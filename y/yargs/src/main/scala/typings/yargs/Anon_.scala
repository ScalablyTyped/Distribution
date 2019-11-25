package typings.yargs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_
  extends /** All remaining options */
/* argName */ StringDictionary[js.Any] {
  /** The script name or node command */
  @JSName("$0")
  var $0: String
  /** Non-option arguments */
  var `_`: js.Array[String]
}

object Anon_ {
  @scala.inline
  def apply(
    $0: String,
    `_`: js.Array[String],
    StringDictionary: /** All remaining options */
  /* argName */ StringDictionary[js.Any] = null
  ): Anon_ = {
    val __obj = js.Dynamic.literal($0 = $0.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(`_`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_]
  }
}

