package typings
package superstructLib.superstructMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var types: js.UndefOr[org.scalablytyped.runtime.StringDictionary[CustomType]] = js.undefined
}

object Config {
  @scala.inline
  def apply(types: org.scalablytyped.runtime.StringDictionary[CustomType] = null): Config = {
    val __obj = js.Dynamic.literal()
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[Config]
  }
}

