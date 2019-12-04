package typings.tablesorter.filteringFormatterOptionsUISliderOptionsMod

import typings.tablesorter.filteringFormatterOptionsComparableOptionsMod.ComparableOptions
import typings.tablesorter.filteringFormatterOptionsControlOptionsMod.ControlOptions
import typings.tablesorter.filteringFormatterOptionsDefaultValueOptionsMod.DefaultValueOptions
import typings.tablesorter.filteringFormatterOptionsDelayableOptionsMod.DelayableOptions
import typings.tablesorter.filteringFormatterOptionsPreviewableOptionsMod.PreviewableOptions
import typings.tablesorter.filteringFormatterOptionsRangeOptionsMod.RangeOptions
import typings.tablesorter.filteringFormatterOptionsStrictOptionsMod.StrictOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SliderOptions>, 'values'> ]: tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SliderOptions>[P]} */ trait UISliderOptions
  extends RangeOptions
     with ControlOptions
     with DefaultValueOptions[Double]
     with ComparableOptions
     with PreviewableOptions
     with DelayableOptions
     with StrictOptions

object UISliderOptions {
  @scala.inline
  def apply(
    allText: String = null,
    cellText: String = null,
    compare: String | js.Array[String] = null,
    delayed: js.UndefOr[Boolean] = js.undefined,
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    step: Int | Double = null,
    value: Int | Double = null,
    valueToHeader: js.UndefOr[Boolean] = js.undefined
  ): UISliderOptions = {
    val __obj = js.Dynamic.literal()
    if (allText != null) __obj.updateDynamic("allText")(allText.asInstanceOf[js.Any])
    if (cellText != null) __obj.updateDynamic("cellText")(cellText.asInstanceOf[js.Any])
    if (compare != null) __obj.updateDynamic("compare")(compare.asInstanceOf[js.Any])
    if (!js.isUndefined(delayed)) __obj.updateDynamic("delayed")(delayed.asInstanceOf[js.Any])
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(valueToHeader)) __obj.updateDynamic("valueToHeader")(valueToHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[UISliderOptions]
  }
}

