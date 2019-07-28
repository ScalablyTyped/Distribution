package typings.wikidataDashSdk.wikidataDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplifyOption extends js.Object {
  // sitelinks
  var addUrl: js.UndefOr[Boolean] = js.undefined
  // claims
  var entityPrefix: js.UndefOr[String] = js.undefined
  var keepHashes: js.UndefOr[Boolean] = js.undefined
  var keepIds: js.UndefOr[Boolean] = js.undefined
  var keepNonTruthy: js.UndefOr[Boolean] = js.undefined
  var keepQualifiers: js.UndefOr[Boolean] = js.undefined
  var keepReferences: js.UndefOr[Boolean] = js.undefined
  var keepRichValues: js.UndefOr[Boolean] = js.undefined
  var propertyPrefix: js.UndefOr[String] = js.undefined
}

object SimplifyOption {
  @scala.inline
  def apply(
    addUrl: js.UndefOr[Boolean] = js.undefined,
    entityPrefix: String = null,
    keepHashes: js.UndefOr[Boolean] = js.undefined,
    keepIds: js.UndefOr[Boolean] = js.undefined,
    keepNonTruthy: js.UndefOr[Boolean] = js.undefined,
    keepQualifiers: js.UndefOr[Boolean] = js.undefined,
    keepReferences: js.UndefOr[Boolean] = js.undefined,
    keepRichValues: js.UndefOr[Boolean] = js.undefined,
    propertyPrefix: String = null
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

