package typings
package styletronDashEngineDashAtomicLib.styletronDashEngineDashAtomicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var container: js.UndefOr[stdLib.Element] = js.undefined
  var hydrate: js.UndefOr[hydrateType] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(container: stdLib.Element = null, hydrate: hydrateType = null, prefix: java.lang.String = null): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (hydrate != null) __obj.updateDynamic("hydrate")(hydrate.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[ClientOptions]
  }
}

