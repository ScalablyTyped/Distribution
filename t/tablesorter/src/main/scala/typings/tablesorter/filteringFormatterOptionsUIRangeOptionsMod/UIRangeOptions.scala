package typings.tablesorter.filteringFormatterOptionsUIRangeOptionsMod

import typings.tablesorter.filteringFormatterOptionsDelayableOptionsMod.DelayableOptions
import typings.tablesorter.filteringFormatterOptionsNumericOptionsMod.NumericOptions
import typings.tablesorter.filteringFormatterOptionsPreviewableOptionsMod.PreviewableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SliderOptions>, 'value'> ]: tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SliderOptions>[P]} */ trait UIRangeOptions
  extends NumericOptions
     with DelayableOptions
     with PreviewableOptions

object UIRangeOptions {
  @scala.inline
  def apply(
    delayed: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    valueToHeader: js.UndefOr[Boolean] = js.undefined
  ): UIRangeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delayed)) __obj.updateDynamic("delayed")(delayed.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(valueToHeader)) __obj.updateDynamic("valueToHeader")(valueToHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIRangeOptions]
  }
}

