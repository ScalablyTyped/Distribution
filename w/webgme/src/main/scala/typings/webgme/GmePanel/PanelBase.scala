package typings.webgme.GmePanel

import typings.webgme.Global_.GmeLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelBase extends js.Object {
  
  var OPTIONS: Options = js.native
  
  def afterAppend(): Unit = js.native
  
  def clear(): Unit = js.native
  
  var control: js.Any = js.native
  
  def destroy(): Unit = js.native
  
  def isReadOnly(): Boolean = js.native
  
  var logger: GmeLogger = js.native
  
  def onReadOnlyChanged(isReadOnly: Boolean): Unit = js.native
  
  def onResize(width: Double, height: Double): Unit = js.native
  
  def setContainerUpdateFn(currentLayout: Layout, sizeUpdateFn: js.Function1[/* layout */ Layout, Double]): Unit = js.native
  
  def setReadOnly(isReadOnly: Boolean): Unit = js.native
  
  def setSize(width: Double, height: Double): Unit = js.native
}
object PanelBase {
  
  @scala.inline
  def apply(
    OPTIONS: Options,
    afterAppend: () => Unit,
    clear: () => Unit,
    control: js.Any,
    destroy: () => Unit,
    isReadOnly: () => Boolean,
    logger: GmeLogger,
    onReadOnlyChanged: Boolean => Unit,
    onResize: (Double, Double) => Unit,
    setContainerUpdateFn: (Layout, js.Function1[/* layout */ Layout, Double]) => Unit,
    setReadOnly: Boolean => Unit,
    setSize: (Double, Double) => Unit
  ): PanelBase = {
    val __obj = js.Dynamic.literal(OPTIONS = OPTIONS.asInstanceOf[js.Any], afterAppend = js.Any.fromFunction0(afterAppend), clear = js.Any.fromFunction0(clear), control = control.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), isReadOnly = js.Any.fromFunction0(isReadOnly), logger = logger.asInstanceOf[js.Any], onReadOnlyChanged = js.Any.fromFunction1(onReadOnlyChanged), onResize = js.Any.fromFunction2(onResize), setContainerUpdateFn = js.Any.fromFunction2(setContainerUpdateFn), setReadOnly = js.Any.fromFunction1(setReadOnly), setSize = js.Any.fromFunction2(setSize))
    __obj.asInstanceOf[PanelBase]
  }
  
  @scala.inline
  implicit class PanelBaseOps[Self <: PanelBase] (val x: Self) extends AnyVal {
    
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
    def setOPTIONS(value: Options): Self = this.set("OPTIONS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterAppend(value: () => Unit): Self = this.set("afterAppend", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setControl(value: js.Any): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReadOnly(value: () => Boolean): Self = this.set("isReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogger(value: GmeLogger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReadOnlyChanged(value: Boolean => Unit): Self = this.set("onReadOnlyChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResize(value: (Double, Double) => Unit): Self = this.set("onResize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetContainerUpdateFn(value: (Layout, js.Function1[/* layout */ Layout, Double]) => Unit): Self = this.set("setContainerUpdateFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetReadOnly(value: Boolean => Unit): Self = this.set("setReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSize(value: (Double, Double) => Unit): Self = this.set("setSize", js.Any.fromFunction2(value))
  }
}
