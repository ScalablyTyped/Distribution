package typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod

import typings.atTensorflowTfjsDashLayers.distLogsMod.Logs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomCallbackArgs extends js.Object {
  var onBatchBegin: js.UndefOr[
    js.Function2[/* batch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.undefined
  var onBatchEnd: js.UndefOr[
    js.Function2[/* batch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.undefined
  var onEpochBegin: js.UndefOr[
    js.Function2[/* epoch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.undefined
  var onEpochEnd: js.UndefOr[
    js.Function2[/* epoch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.undefined
  var onTrainBegin: js.UndefOr[js.Function1[/* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]] = js.undefined
  var onTrainEnd: js.UndefOr[js.Function1[/* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]] = js.undefined
  var onYield: js.UndefOr[
    js.Function3[/* epoch */ Double, /* batch */ Double, /* logs */ Logs, Unit | js.Promise[Unit]]
  ] = js.undefined
}

object CustomCallbackArgs {
  @scala.inline
  def apply(
    onBatchBegin: (/* batch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit] = null,
    onBatchEnd: (/* batch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit] = null,
    onEpochBegin: (/* epoch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit] = null,
    onEpochEnd: (/* epoch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit] = null,
    onTrainBegin: /* logs */ js.UndefOr[Logs] => Unit | js.Promise[Unit] = null,
    onTrainEnd: /* logs */ js.UndefOr[Logs] => Unit | js.Promise[Unit] = null,
    onYield: (/* epoch */ Double, /* batch */ Double, /* logs */ Logs) => Unit | js.Promise[Unit] = null
  ): CustomCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (onBatchBegin != null) __obj.updateDynamic("onBatchBegin")(js.Any.fromFunction2(onBatchBegin))
    if (onBatchEnd != null) __obj.updateDynamic("onBatchEnd")(js.Any.fromFunction2(onBatchEnd))
    if (onEpochBegin != null) __obj.updateDynamic("onEpochBegin")(js.Any.fromFunction2(onEpochBegin))
    if (onEpochEnd != null) __obj.updateDynamic("onEpochEnd")(js.Any.fromFunction2(onEpochEnd))
    if (onTrainBegin != null) __obj.updateDynamic("onTrainBegin")(js.Any.fromFunction1(onTrainBegin))
    if (onTrainEnd != null) __obj.updateDynamic("onTrainEnd")(js.Any.fromFunction1(onTrainEnd))
    if (onYield != null) __obj.updateDynamic("onYield")(js.Any.fromFunction3(onYield))
    __obj.asInstanceOf[CustomCallbackArgs]
  }
}

