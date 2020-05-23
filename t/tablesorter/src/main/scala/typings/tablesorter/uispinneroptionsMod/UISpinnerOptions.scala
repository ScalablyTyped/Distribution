package typings.tablesorter.uispinneroptionsMod

import typings.jquery.JQueryEventObject
import typings.jqueryui.JQueryUI.SpinnerEvent
import typings.jqueryui.JQueryUI.SpinnerUIParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SpinnerOptions> */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/IntervalOptions.IntervalOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ControlOptions.ControlOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DefaultValueOptions.DefaultValueOptions<number> */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ToggleableOptions.ToggleableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ComparableOptions.ComparableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DelayableOptions.DelayableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/StrictOptions.StrictOptions */
trait UISpinnerOptions extends js.Object {
  /**
    * A value indicating whether to add a box for enabling/disabling the control.
    */
  var addToggle: js.UndefOr[Boolean] = js.undefined
  /**
    * The label of the control.
    */
  var cellText: js.UndefOr[String] = js.undefined
  var change: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
  /**
    * The compare-operators supported by the control.
    */
  var compare: js.UndefOr[String | js.Array[String]] = js.undefined
  var create: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  /**
    * A value indicating whether the value of the filter should be set delayed.
    */
  var delayed: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether the control is initially disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicatin whether only exact matching values should be included.
    */
  var exactMatch: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var incremental: js.UndefOr[js.Any] = js.undefined
  /**
    * The maximum value of the control.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The minimum value of the control.
    */
  var min: js.UndefOr[Double] = js.undefined
  var numberFormat: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var spin: js.UndefOr[SpinnerEvent[SpinnerUIParam]] = js.undefined
  var start: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
  /**
    * The interval of the control.
    */
  var step: js.UndefOr[Double] = js.undefined
  var stop: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
  /**
    * The default value of the control.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object UISpinnerOptions {
  @scala.inline
  def apply(
    addToggle: js.UndefOr[Boolean] = js.undefined,
    cellText: String = null,
    change: (/* event */ JQueryEventObject, js.Object) => Unit = null,
    compare: String | js.Array[String] = null,
    create: (/* event */ JQueryEventObject, js.Object) => Unit = null,
    culture: String = null,
    delayed: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    icons: js.Any = null,
    incremental: js.Any = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    numberFormat: String = null,
    page: js.UndefOr[Double] = js.undefined,
    spin: (/* event */ JQueryEventObject, SpinnerUIParam) => Unit = null,
    start: (/* event */ JQueryEventObject, js.Object) => Unit = null,
    step: js.UndefOr[Double] = js.undefined,
    stop: (/* event */ JQueryEventObject, js.Object) => Unit = null,
    value: js.UndefOr[Double] = js.undefined
  ): UISpinnerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addToggle)) __obj.updateDynamic("addToggle")(addToggle.get.asInstanceOf[js.Any])
    if (cellText != null) __obj.updateDynamic("cellText")(cellText.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (compare != null) __obj.updateDynamic("compare")(compare.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (!js.isUndefined(delayed)) __obj.updateDynamic("delayed")(delayed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.get.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (incremental != null) __obj.updateDynamic("incremental")(incremental.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (spin != null) __obj.updateDynamic("spin")(js.Any.fromFunction2(spin))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UISpinnerOptions]
  }
}

