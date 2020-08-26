package typings.tensorflowTfjsLayers.callbacksMod

import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.auto
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.max
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EarlyStoppingCallbackArgs extends js.Object {
  /**
    * Baseline value of the monitored quantity.
    *
    * If specified, training will be stopped if the model doesn't show
    * improvement over the baseline.
    */
  var baseline: js.UndefOr[Double] = js.native
  /**
    * Minimum change in the monitored quantity to qualify as improvement,
    * i.e., an absolute change of less than `minDelta` will count as no
    * improvement.
    *
    * Defaults to 0.
    */
  var minDelta: js.UndefOr[Double] = js.native
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
  var mode: js.UndefOr[auto | min | max] = js.native
  /**
    * Quantity to be monitored.
    *
    * Defaults to 'val_loss'.
    */
  var monitor: js.UndefOr[String] = js.native
  /**
    * Number of epochs with no improvement after which training will be stopped.
    *
    * Defaults to 0.
    */
  var patience: js.UndefOr[Double] = js.native
  /**
    * Whether to restore model weights from the epoch with the best value
    * of the monitored quantity. If `False`, the model weights obtained at the
    * at the last step of training are used.
    *
    * **`True` is not supported yet.**
    */
  var restoreBestWeights: js.UndefOr[Boolean] = js.native
  /** Verbosity mode. */
  var verbose: js.UndefOr[Double] = js.native
}

object EarlyStoppingCallbackArgs {
  @scala.inline
  def apply(): EarlyStoppingCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EarlyStoppingCallbackArgs]
  }
  @scala.inline
  implicit class EarlyStoppingCallbackArgsOps[Self <: EarlyStoppingCallbackArgs] (val x: Self) extends AnyVal {
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
    def setBaseline(value: Double): Self = this.set("baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseline: Self = this.set("baseline", js.undefined)
    @scala.inline
    def setMinDelta(value: Double): Self = this.set("minDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDelta: Self = this.set("minDelta", js.undefined)
    @scala.inline
    def setMode(value: auto | min | max): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMonitor(value: String): Self = this.set("monitor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitor: Self = this.set("monitor", js.undefined)
    @scala.inline
    def setPatience(value: Double): Self = this.set("patience", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatience: Self = this.set("patience", js.undefined)
    @scala.inline
    def setRestoreBestWeights(value: Boolean): Self = this.set("restoreBestWeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreBestWeights: Self = this.set("restoreBestWeights", js.undefined)
    @scala.inline
    def setVerbose(value: Double): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

