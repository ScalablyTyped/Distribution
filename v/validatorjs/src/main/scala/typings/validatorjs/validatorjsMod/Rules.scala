package typings.validatorjs.validatorjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rules
  extends /* attribute */ StringDictionary[String | (js.Array[String | TypeCheckingRule]) | Rules]

object Rules {
  @scala.inline
  def apply(
    StringDictionary: /* attribute */ StringDictionary[String | (js.Array[String | TypeCheckingRule]) | Rules] = null
  ): Rules = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Rules]
  }
}

