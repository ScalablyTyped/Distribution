package typings.tablesorter.uirangeoptionsMod

import typings.jquery.JQueryEventObject
import typings.jqueryui.JQueryUI.SliderClasses
import typings.jqueryui.JQueryUI.SliderEvent
import typings.jqueryui.JQueryUI.SliderUIParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent tablesorter.tablesorter/Omit.Omit<tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SliderOptions>, 'value'> */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/NumericOptions.NumericOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DelayableOptions.DelayableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/PreviewableOptions.PreviewableOptions */
trait UIRangeOptions extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var change: js.UndefOr[SliderEvent] = js.undefined
  var classes: js.UndefOr[SliderClasses] = js.undefined
  var create: js.UndefOr[SliderEvent] = js.undefined
  /**
    * A value indicating whether the value of the filter should be set delayed.
    */
  var delayed: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
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
  var stop: js.UndefOr[SliderEvent] = js.undefined
  /**
    * A value indicating whether the value should be visible in the table header.
    */
  var valueToHeader: js.UndefOr[Boolean] = js.undefined
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object UIRangeOptions {
  @scala.inline
  def apply(
    animate: js.Any = null,
    change: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    classes: SliderClasses = null,
    create: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    delayed: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    orientation: String = null,
    range: js.Any = null,
    slide: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    start: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    stop: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit = null,
    valueToHeader: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[Double] = null
  ): UIRangeOptions = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (!js.isUndefined(delayed)) __obj.updateDynamic("delayed")(delayed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction2(slide))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    if (!js.isUndefined(valueToHeader)) __obj.updateDynamic("valueToHeader")(valueToHeader.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIRangeOptions]
  }
}

