package typings
package atWordpressDependencyDashExtractionDashWebpackDashPluginLib.atWordpressDependencyDashExtractionDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var injectPolyfill: js.UndefOr[scala.Boolean] = js.undefined
  var requestToExternal: js.UndefOr[
    js.Function1[
      /* request */ java.lang.String, 
      java.lang.String | js.Array[java.lang.String] | scala.Unit
    ]
  ] = js.undefined
  var requestToHandle: js.UndefOr[js.Function1[/* request */ java.lang.String, java.lang.String | scala.Unit]] = js.undefined
  var useDefaults: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    injectPolyfill: js.UndefOr[scala.Boolean] = js.undefined,
    requestToExternal: /* request */ java.lang.String => java.lang.String | js.Array[java.lang.String] | scala.Unit = null,
    requestToHandle: /* request */ java.lang.String => java.lang.String | scala.Unit = null,
    useDefaults: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(injectPolyfill)) __obj.updateDynamic("injectPolyfill")(injectPolyfill)
    if (requestToExternal != null) __obj.updateDynamic("requestToExternal")(js.Any.fromFunction1(requestToExternal))
    if (requestToHandle != null) __obj.updateDynamic("requestToHandle")(js.Any.fromFunction1(requestToHandle))
    if (!js.isUndefined(useDefaults)) __obj.updateDynamic("useDefaults")(useDefaults)
    __obj.asInstanceOf[Options]
  }
}

