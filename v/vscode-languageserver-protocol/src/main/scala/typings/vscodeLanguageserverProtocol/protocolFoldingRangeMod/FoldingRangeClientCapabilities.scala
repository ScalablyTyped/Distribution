package typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeClientCapabilities extends js.Object {
  /**
    * Whether implementation supports dynamic registration for folding range providers. If this is set to `true`
    * the client supports the new `FoldingRangeRegistrationOptions` return value for the corresponding server
    * capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, the client signals that it only supports folding complete lines. If set, client will
    * ignore specified `startCharacter` and `endCharacter` properties in a FoldingRange.
    */
  var lineFoldingOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of folding ranges that the client prefers to receive per document. The value serves as a
    * hint, servers are free to follow the limit.
    */
  var rangeLimit: js.UndefOr[Double] = js.undefined
}

object FoldingRangeClientCapabilities {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    lineFoldingOnly: js.UndefOr[Boolean] = js.undefined,
    rangeLimit: js.UndefOr[Double] = js.undefined
  ): FoldingRangeClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineFoldingOnly)) __obj.updateDynamic("lineFoldingOnly")(lineFoldingOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeLimit)) __obj.updateDynamic("rangeLimit")(rangeLimit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRangeClientCapabilities]
  }
}

