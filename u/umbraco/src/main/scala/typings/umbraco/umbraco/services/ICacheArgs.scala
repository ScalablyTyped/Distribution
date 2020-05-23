package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cache args
  */
trait ICacheArgs extends js.Object {
  var cacheKey: String
  var childrenOf: js.UndefOr[Double] = js.undefined
  var section: js.UndefOr[String] = js.undefined
}

object ICacheArgs {
  @scala.inline
  def apply(cacheKey: String, childrenOf: js.UndefOr[Double] = js.undefined, section: String = null): ICacheArgs = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any])
    if (!js.isUndefined(childrenOf)) __obj.updateDynamic("childrenOf")(childrenOf.get.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICacheArgs]
  }
}

