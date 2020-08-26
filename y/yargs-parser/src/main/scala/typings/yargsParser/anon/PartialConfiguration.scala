package typings.yargsParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yargs-parser.yargs-parser.Configuration> */
@js.native
trait PartialConfiguration extends js.Object {
  var `boolean-negation`: js.UndefOr[scala.Boolean] = js.native
  var `camel-case-expansion`: js.UndefOr[scala.Boolean] = js.native
  var `combine-arrays`: js.UndefOr[scala.Boolean] = js.native
  var `dot-notation`: js.UndefOr[scala.Boolean] = js.native
  var `duplicate-arguments-array`: js.UndefOr[scala.Boolean] = js.native
  var `flatten-duplicate-arrays`: js.UndefOr[scala.Boolean] = js.native
  var `halt-at-non-option`: js.UndefOr[scala.Boolean] = js.native
  var `negation-prefix`: js.UndefOr[String] = js.native
  var `parse-numbers`: js.UndefOr[scala.Boolean] = js.native
  var `populate--`: js.UndefOr[scala.Boolean] = js.native
  var `set-placeholder-key`: js.UndefOr[scala.Boolean] = js.native
  var `short-option-groups`: js.UndefOr[scala.Boolean] = js.native
  var `strip-aliased`: js.UndefOr[scala.Boolean] = js.native
  var `strip-dashed`: js.UndefOr[scala.Boolean] = js.native
  var `unknown-options-as-args`: js.UndefOr[scala.Boolean] = js.native
}

object PartialConfiguration {
  @scala.inline
  def apply(): PartialConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfiguration]
  }
  @scala.inline
  implicit class PartialConfigurationOps[Self <: PartialConfiguration] (val x: Self) extends AnyVal {
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
    def `setBoolean-negation`(value: scala.Boolean): Self = this.set("boolean-negation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBoolean-negation`: Self = this.set("boolean-negation", js.undefined)
    @scala.inline
    def `setCamel-case-expansion`(value: scala.Boolean): Self = this.set("camel-case-expansion", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCamel-case-expansion`: Self = this.set("camel-case-expansion", js.undefined)
    @scala.inline
    def `setCombine-arrays`(value: scala.Boolean): Self = this.set("combine-arrays", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCombine-arrays`: Self = this.set("combine-arrays", js.undefined)
    @scala.inline
    def `setDot-notation`(value: scala.Boolean): Self = this.set("dot-notation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDot-notation`: Self = this.set("dot-notation", js.undefined)
    @scala.inline
    def `setDuplicate-arguments-array`(value: scala.Boolean): Self = this.set("duplicate-arguments-array", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDuplicate-arguments-array`: Self = this.set("duplicate-arguments-array", js.undefined)
    @scala.inline
    def `setFlatten-duplicate-arrays`(value: scala.Boolean): Self = this.set("flatten-duplicate-arrays", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlatten-duplicate-arrays`: Self = this.set("flatten-duplicate-arrays", js.undefined)
    @scala.inline
    def `setHalt-at-non-option`(value: scala.Boolean): Self = this.set("halt-at-non-option", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHalt-at-non-option`: Self = this.set("halt-at-non-option", js.undefined)
    @scala.inline
    def `setNegation-prefix`(value: String): Self = this.set("negation-prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNegation-prefix`: Self = this.set("negation-prefix", js.undefined)
    @scala.inline
    def `setParse-numbers`(value: scala.Boolean): Self = this.set("parse-numbers", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteParse-numbers`: Self = this.set("parse-numbers", js.undefined)
    @scala.inline
    def `setPopulate--`(value: scala.Boolean): Self = this.set("populate--", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePopulate--`: Self = this.set("populate--", js.undefined)
    @scala.inline
    def `setSet-placeholder-key`(value: scala.Boolean): Self = this.set("set-placeholder-key", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSet-placeholder-key`: Self = this.set("set-placeholder-key", js.undefined)
    @scala.inline
    def `setShort-option-groups`(value: scala.Boolean): Self = this.set("short-option-groups", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShort-option-groups`: Self = this.set("short-option-groups", js.undefined)
    @scala.inline
    def `setStrip-aliased`(value: scala.Boolean): Self = this.set("strip-aliased", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStrip-aliased`: Self = this.set("strip-aliased", js.undefined)
    @scala.inline
    def `setStrip-dashed`(value: scala.Boolean): Self = this.set("strip-dashed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStrip-dashed`: Self = this.set("strip-dashed", js.undefined)
    @scala.inline
    def `setUnknown-options-as-args`(value: scala.Boolean): Self = this.set("unknown-options-as-args", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnknown-options-as-args`: Self = this.set("unknown-options-as-args", js.undefined)
  }
  
}

