package typings.webgme.GmePanel

import typings.webgme.Global_.GmeLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBase extends js.Object {
  var OPTIONS: Options
  var control: js.Any
  var logger: GmeLogger
  def afterAppend(): Unit
  def clear(): Unit
  def destroy(): Unit
  def isReadOnly(): Boolean
  def onReadOnlyChanged(isReadOnly: Boolean): Unit
  def onResize(width: Double, height: Double): Unit
  def setContainerUpdateFn(currentLayout: Layout, sizeUpdateFn: js.Function1[/* layout */ Layout, Double]): Unit
  def setReadOnly(isReadOnly: Boolean): Unit
  def setSize(width: Double, height: Double): Unit
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
}

