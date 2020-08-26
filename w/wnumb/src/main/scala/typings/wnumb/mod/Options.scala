package typings.wnumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** The number of decimals to include in the result. Limited to 7. */
  var decimals: js.UndefOr[Double] = js.native
  /**
    * Reverse the operations set in encoder.
    * Use this option to undo modifications made while encoding the value.
    * function( value ){
    *   return value / 1.32;
    * }
    */
  var decoder: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
  /**
    * Similar to encoder, but applied after all other formatting options are applied.
    */
  var edit: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
  /**
    * This is a powerful option to manually modify the slider output.
    * For example, to show a number in another currency:
    * function( value ){
    *  return value * 1.32;
    * }
    */
  var encoder: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
  /**
    * The decimal separator.
    * Defaults to '.' if thousand isn't already set to '.'.
    */
  var mark: js.UndefOr[String] = js.native
  /**
    * The prefix for negative values. Defaults to '-' if negativeBefore isn't set.
    */
  var negative: js.UndefOr[String] = js.native
  /**
    * The prefix for a negative number. Inserted before prefix.
    */
  var negativeBefore: js.UndefOr[String] = js.native
  /**
    * A string to prepend to the number. Use cases include prefixing with money symbols such as '$' or '€'.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * A number to append to a number. For example: ',-'.
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * Separator for large numbers. For example: ' ' would result in a formatted number of 1 000 000.
    */
  var thousand: js.UndefOr[String] = js.native
  /**
    * Similar to decoder and the reverse for edit.
    * Applied before all other formatting options are applied.
    */
  var undo: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimals: Self = this.set("decimals", js.undefined)
    @scala.inline
    def setDecoder(value: /* value */ Double => Double): Self = this.set("decoder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDecoder: Self = this.set("decoder", js.undefined)
    @scala.inline
    def setEdit(value: /* value */ Double => Double): Self = this.set("edit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    @scala.inline
    def setEncoder(value: /* value */ Double => Double): Self = this.set("encoder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEncoder: Self = this.set("encoder", js.undefined)
    @scala.inline
    def setMark(value: String): Self = this.set("mark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    @scala.inline
    def setNegative(value: String): Self = this.set("negative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    @scala.inline
    def setNegativeBefore(value: String): Self = this.set("negativeBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeBefore: Self = this.set("negativeBefore", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setThousand(value: String): Self = this.set("thousand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousand: Self = this.set("thousand", js.undefined)
    @scala.inline
    def setUndo(value: /* value */ Double => Double): Self = this.set("undo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUndo: Self = this.set("undo", js.undefined)
  }
  
}

