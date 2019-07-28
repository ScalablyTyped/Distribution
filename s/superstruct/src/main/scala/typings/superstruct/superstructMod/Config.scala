package typings.superstruct.superstructMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var types: js.UndefOr[StringDictionary[CustomType]] = js.undefined
}

object Config {
  @scala.inline
  def apply(types: StringDictionary[CustomType] = null): Config = {
    val __obj = js.Dynamic.literal()
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[Config]
  }
}

