package typings
package wepyLib.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppConfig extends js.Object {
  var appEvents: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var noPromiseAPI: js.UndefOr[
    js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  ] = js.undefined
  var pageEvents: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AppConfig {
  @scala.inline
  def apply(
    appEvents: js.Array[java.lang.String] = null,
    noPromiseAPI: js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    pageEvents: js.Array[java.lang.String] = null
  ): AppConfig = {
    val __obj = js.Dynamic.literal()
    if (appEvents != null) __obj.updateDynamic("appEvents")(appEvents)
    if (noPromiseAPI != null) __obj.updateDynamic("noPromiseAPI")(noPromiseAPI.asInstanceOf[js.Any])
    if (pageEvents != null) __obj.updateDynamic("pageEvents")(pageEvents)
    __obj.asInstanceOf[AppConfig]
  }
}

