package typings
package typeDashFestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Browser
  extends /* moduleName */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] {
  var browser: js.UndefOr[java.lang.String] = js.undefined
  var main: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Browser {
  @scala.inline
  def apply(
    StringDictionary: /* moduleName */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    browser: java.lang.String = null,
    main: java.lang.String = null
  ): Anon_Browser = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (main != null) __obj.updateDynamic("main")(main)
    __obj.asInstanceOf[Anon_Browser]
  }
}

