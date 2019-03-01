package typings
package wikidataDashSdkLib.wikidataDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplifyOption extends js.Object {
  // sitelinks
  var addUrl: js.UndefOr[scala.Boolean] = js.undefined
  // claims
  var entityPrefix: js.UndefOr[java.lang.String] = js.undefined
  var keepHashes: js.UndefOr[scala.Boolean] = js.undefined
  var keepIds: js.UndefOr[scala.Boolean] = js.undefined
  var keepNonTruthy: js.UndefOr[scala.Boolean] = js.undefined
  var keepQualifiers: js.UndefOr[scala.Boolean] = js.undefined
  var keepReferences: js.UndefOr[scala.Boolean] = js.undefined
  var keepRichValues: js.UndefOr[scala.Boolean] = js.undefined
  var propertyPrefix: js.UndefOr[java.lang.String] = js.undefined
}

object SimplifyOption {
  @scala.inline
  def apply(
    addUrl: js.UndefOr[scala.Boolean] = js.undefined,
    entityPrefix: java.lang.String = null,
    keepHashes: js.UndefOr[scala.Boolean] = js.undefined,
    keepIds: js.UndefOr[scala.Boolean] = js.undefined,
    keepNonTruthy: js.UndefOr[scala.Boolean] = js.undefined,
    keepQualifiers: js.UndefOr[scala.Boolean] = js.undefined,
    keepReferences: js.UndefOr[scala.Boolean] = js.undefined,
    keepRichValues: js.UndefOr[scala.Boolean] = js.undefined,
    propertyPrefix: java.lang.String = null
  ): SimplifyOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addUrl)) __obj.updateDynamic("addUrl")(addUrl)
    if (entityPrefix != null) __obj.updateDynamic("entityPrefix")(entityPrefix)
    if (!js.isUndefined(keepHashes)) __obj.updateDynamic("keepHashes")(keepHashes)
    if (!js.isUndefined(keepIds)) __obj.updateDynamic("keepIds")(keepIds)
    if (!js.isUndefined(keepNonTruthy)) __obj.updateDynamic("keepNonTruthy")(keepNonTruthy)
    if (!js.isUndefined(keepQualifiers)) __obj.updateDynamic("keepQualifiers")(keepQualifiers)
    if (!js.isUndefined(keepReferences)) __obj.updateDynamic("keepReferences")(keepReferences)
    if (!js.isUndefined(keepRichValues)) __obj.updateDynamic("keepRichValues")(keepRichValues)
    if (propertyPrefix != null) __obj.updateDynamic("propertyPrefix")(propertyPrefix)
    __obj.asInstanceOf[SimplifyOption]
  }
}

