package typings.tensorflowTfjsLayers.baseCallbacksMod

import typings.tensorflowTfjsLayers.logsMod.Logs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomCallbackArgs extends js.Object {
  
  var onBatchBegin: js.UndefOr[
    js.Function2[/* batch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.native
  
  var onBatchEnd: js.UndefOr[
    js.Function2[/* batch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.native
  
  var onEpochBegin: js.UndefOr[
    js.Function2[/* epoch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.native
  
  var onEpochEnd: js.UndefOr[
    js.Function2[/* epoch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
  ] = js.native
  
  var onTrainBegin: js.UndefOr[js.Function1[/* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]] = js.native
  
  var onTrainEnd: js.UndefOr[js.Function1[/* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]] = js.native
  
  var onYield: js.UndefOr[
    js.Function3[/* epoch */ Double, /* batch */ Double, /* logs */ Logs, Unit | js.Promise[Unit]]
  ] = js.native
}
object CustomCallbackArgs {
  
  @scala.inline
  def apply(): CustomCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomCallbackArgs]
  }
  
  @scala.inline
  implicit class CustomCallbackArgsOps[Self <: CustomCallbackArgs] (val x: Self) extends AnyVal {
    
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
    def setOnBatchBegin(value: (/* batch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = this.set("onBatchBegin", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBatchBegin: Self = this.set("onBatchBegin", js.undefined)
    
    @scala.inline
    def setOnBatchEnd(value: (/* batch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = this.set("onBatchEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBatchEnd: Self = this.set("onBatchEnd", js.undefined)
    
    @scala.inline
    def setOnEpochBegin(value: (/* epoch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = this.set("onEpochBegin", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEpochBegin: Self = this.set("onEpochBegin", js.undefined)
    
    @scala.inline
    def setOnEpochEnd(value: (/* epoch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = this.set("onEpochEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEpochEnd: Self = this.set("onEpochEnd", js.undefined)
    
    @scala.inline
    def setOnTrainBegin(value: /* logs */ js.UndefOr[Logs] => Unit | js.Promise[Unit]): Self = this.set("onTrainBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTrainBegin: Self = this.set("onTrainBegin", js.undefined)
    
    @scala.inline
    def setOnTrainEnd(value: /* logs */ js.UndefOr[Logs] => Unit | js.Promise[Unit]): Self = this.set("onTrainEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTrainEnd: Self = this.set("onTrainEnd", js.undefined)
    
    @scala.inline
    def setOnYield(value: (/* epoch */ Double, /* batch */ Double, /* logs */ Logs) => Unit | js.Promise[Unit]): Self = this.set("onYield", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnYield: Self = this.set("onYield", js.undefined)
  }
}
