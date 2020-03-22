package typings.typeFest

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictmoduleName
  extends /* moduleName */ StringDictionary[js.UndefOr[String]] {
  var browser: js.UndefOr[String] = js.undefined
  var main: js.UndefOr[String] = js.undefined
}

object AnonDictmoduleName {
  @scala.inline
  def apply(
    StringDictionary: /* moduleName */ StringDictionary[js.UndefOr[String]] = null,
    browser: String = null,
    main: String = null
  ): AnonDictmoduleName = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictmoduleName]
  }
}

