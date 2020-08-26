package typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldingRangeClientCapabilities extends js.Object {
  /**
    * Whether implementation supports dynamic registration for folding range providers. If this is set to `true`
    * the client supports the new `FoldingRangeRegistrationOptions` return value for the corresponding server
    * capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  /**
    * If set, the client signals that it only supports folding complete lines. If set, client will
    * ignore specified `startCharacter` and `endCharacter` properties in a FoldingRange.
    */
  var lineFoldingOnly: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of folding ranges that the client prefers to receive per document. The value serves as a
    * hint, servers are free to follow the limit.
    */
  var rangeLimit: js.UndefOr[Double] = js.native
}

object FoldingRangeClientCapabilities {
  @scala.inline
  def apply(): FoldingRangeClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldingRangeClientCapabilities]
  }
  @scala.inline
  implicit class FoldingRangeClientCapabilitiesOps[Self <: FoldingRangeClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = this.set("dynamicRegistration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicRegistration: Self = this.set("dynamicRegistration", js.undefined)
    @scala.inline
    def setLineFoldingOnly(value: Boolean): Self = this.set("lineFoldingOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineFoldingOnly: Self = this.set("lineFoldingOnly", js.undefined)
    @scala.inline
    def setRangeLimit(value: Double): Self = this.set("rangeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeLimit: Self = this.set("rangeLimit", js.undefined)
  }
  
}

