package typings.systemjs.System

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module
  extends /* exportName */ StringDictionary[js.Any] {
  var default: js.UndefOr[js.Any] = js.undefined
}

object Module {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, default: js.Any = null): Module = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

