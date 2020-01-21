package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WordStyle. */
trait WordStyle extends js.Object {
  /** HTML head level that content matching this style is tagged with. */
  var level: js.UndefOr[Double] = js.undefined
  /** Array of word style names to convert. */
  var names: js.UndefOr[js.Array[String]] = js.undefined
}

object WordStyle {
  @scala.inline
  def apply(level: Int | Double = null, names: js.Array[String] = null): WordStyle = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordStyle]
  }
}

