package typings.typeDashFest

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Browser
  extends /* moduleName */ StringDictionary[js.UndefOr[String]] {
  var browser: js.UndefOr[String] = js.undefined
  var main: js.UndefOr[String] = js.undefined
}

object Anon_Browser {
  @scala.inline
  def apply(
    StringDictionary: /* moduleName */ StringDictionary[js.UndefOr[String]] = null,
    browser: String = null,
    main: String = null
  ): Anon_Browser = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (main != null) __obj.updateDynamic("main")(main)
    __obj.asInstanceOf[Anon_Browser]
  }
}

