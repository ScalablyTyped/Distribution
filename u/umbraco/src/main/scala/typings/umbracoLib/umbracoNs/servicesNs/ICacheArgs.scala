package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cache args
  */
trait ICacheArgs extends js.Object {
  var cacheKey: java.lang.String
  var childrenOf: js.UndefOr[scala.Double] = js.undefined
  var section: js.UndefOr[java.lang.String] = js.undefined
}

object ICacheArgs {
  @scala.inline
  def apply(
    cacheKey: java.lang.String,
    childrenOf: scala.Int | scala.Double = null,
    section: java.lang.String = null
  ): ICacheArgs = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey)
    if (childrenOf != null) __obj.updateDynamic("childrenOf")(childrenOf.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section)
    __obj.asInstanceOf[ICacheArgs]
  }
}

