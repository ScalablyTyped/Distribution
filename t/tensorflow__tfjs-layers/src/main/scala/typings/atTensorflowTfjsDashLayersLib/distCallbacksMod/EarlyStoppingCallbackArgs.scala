package typings
package atTensorflowTfjsDashLayersLib.distCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EarlyStoppingCallbackArgs extends js.Object {
  /**
    * Baseline value of the monitored quantity.
    *
    * If specified, training will be stopped if the model doesn't show
    * improvement over the baseline.
    */
  var baseline: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum change in the monitored quantity to qualify as improvement,
    * i.e., an absolute change of less than `minDelta` will count as no
    * improvement.
    *
    * Defaults to 0.
    */
  var minDelta: js.UndefOr[scala.Double] = js.undefined
  /**
    * Mode: one of 'min', 'max', and 'auto'.
    * - In 'min' mode, training will be stopped when the quantity monitored has
    *   stopped decreasing.
    * - In 'max' mode, training will be stopped when the quantity monitored has
    *   stopped increasing.
    * - In 'auto' mode, the direction is inferred automatically from the name of
    *   the monitored quantity.
    *
    * Defaults to 'auto'.
    */
  var mode: js.UndefOr[
    atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.auto | atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.min | atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.max
  ] = js.undefined
  /**
    * Quantity to be monitored.
    *
    * Defaults to 'val_loss'.
    */
  var monitor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of epochs with no improvement after which training will be stopped.
    *
    * Defaults to 0.
    */
  var patience: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to restore model weights from the epoch with the best value
    * of the monitored quantity. If `False`, the model weights obtained at the
    * at the last step of training are used.
    *
    * **`True` is not supported yet.**
    */
  var restoreBestWeights: js.UndefOr[scala.Boolean] = js.undefined
  /** Verbosity mode. */
  var verbose: js.UndefOr[scala.Double] = js.undefined
}

object EarlyStoppingCallbackArgs {
  @scala.inline
  def apply(
    baseline: scala.Int | scala.Double = null,
    minDelta: scala.Int | scala.Double = null,
    mode: atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.auto | atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.min | atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.max = null,
    monitor: java.lang.String = null,
    patience: scala.Int | scala.Double = null,
    restoreBestWeights: js.UndefOr[scala.Boolean] = js.undefined,
    verbose: scala.Int | scala.Double = null
  ): EarlyStoppingCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (minDelta != null) __obj.updateDynamic("minDelta")(minDelta.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monitor != null) __obj.updateDynamic("monitor")(monitor)
    if (patience != null) __obj.updateDynamic("patience")(patience.asInstanceOf[js.Any])
    if (!js.isUndefined(restoreBestWeights)) __obj.updateDynamic("restoreBestWeights")(restoreBestWeights)
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarlyStoppingCallbackArgs]
  }
}

