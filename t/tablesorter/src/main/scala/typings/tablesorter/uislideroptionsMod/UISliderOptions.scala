package typings.tablesorter.uislideroptionsMod

import typings.jquery.JQueryEventObject
import typings.jqueryui.JQueryUI.SliderClasses
import typings.jqueryui.JQueryUI.SliderEvent
import typings.jqueryui.JQueryUI.SliderUIParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent tablesorter.tablesorter/Omit.Omit<tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SliderOptions>, 'values'> */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/RangeOptions.RangeOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ControlOptions.ControlOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DefaultValueOptions.DefaultValueOptions<number> */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ComparableOptions.ComparableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/PreviewableOptions.PreviewableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DelayableOptions.DelayableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/StrictOptions.StrictOptions */
trait UISliderOptions extends js.Object {
  /**
    * The text indicating the whole range.
    */
  var allText: js.UndefOr[String] = js.undefined
  var animate: js.UndefOr[js.Any] = js.undefined
  /**
    * The label of the control.
    */
  var cellText: js.UndefOr[String] = js.undefined
  var change: js.UndefOr[SliderEvent] = js.undefined
  var classes: js.UndefOr[SliderClasses] = js.undefined
  /**
    * The compare-operators supported by the control.
    */
  var compare: js.UndefOr[String | js.Array[String]] = js.undefined
  var create: js.UndefOr[SliderEvent] = js.undefined
  /**
    * A value indicating whether the value of the filter should be set delayed.
    */
  var delayed: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicatin whether only exact matching values should be included.
    */
  var exactMatch: js.UndefOr[Boolean] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum value of the control.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The minimum value of the control.
    */
  var min: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[js.Any] = js.undefined
  var slide: js.UndefOr[SliderEvent] = js.undefined
  var start: js.UndefOr[SliderEvent] = js.undefined
  /**
    * The interval of the control.
    */
  var step: js.UndefOr[Double] = js.undefined
  var stop: js.UndefOr[SliderEvent] = js.undefined
  /**
    * The default value of the control.
    */
  var value: js.UndefOr[Double] = js.undefined
  /**
    * A value indicating whether the value should be visible in the table header.
    */
  var valueToHeader: js.UndefOr[Boolean] = js.undefined
}

object UISliderOptions {
  @scala.inline
  def apply(
    allText: String = null,
    animate: js.Any = null,
    cellText: String = null,
    change: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    classes: SliderClasses = null,
    compare: String | js.Array[String] = null,
    create: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    delayed: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    orientation: String = null,
    range: js.Any = null,
    slide: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    start: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    step: js.UndefOr[Double] = js.undefined,
    stop: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    value: js.UndefOr[Double] = js.undefined,
    valueToHeader: js.UndefOr[Boolean] = js.undefined
  ): UISliderOptions = {
    val __obj = js.Dynamic.literal()
    if (allText != null) __obj.updateDynamic("allText")(allText.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (cellText != null) __obj.updateDynamic("cellText")(cellText.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (compare != null) __obj.updateDynamic("compare")(compare.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (!js.isUndefined(delayed)) __obj.updateDynamic("delayed")(delayed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction2(slide))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueToHeader)) __obj.updateDynamic("valueToHeader")(valueToHeader.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UISliderOptions]
  }
}

