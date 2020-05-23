package typings.webgme.GmePanel

import typings.webgme.Global_.GmeLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBaseWithHeader extends PanelBase {
  @JSName("OPTIONS")
  var OPTIONS_PanelBaseWithHeader: OptionsWithHeader
  def getNodeID(): String
  def initUI(options: OptionsWithHeader): Unit
  def setActive(isActive: Boolean): Unit
  def setTitle(text: String): Unit
}

object PanelBaseWithHeader {
  @scala.inline
  def apply(
    OPTIONS: OptionsWithHeader,
    afterAppend: () => Unit,
    clear: () => Unit,
    control: js.Any,
    destroy: () => Unit,
    getNodeID: () => String,
    initUI: OptionsWithHeader => Unit,
    isReadOnly: () => Boolean,
    logger: GmeLogger,
    onReadOnlyChanged: Boolean => Unit,
    onResize: (Double, Double) => Unit,
    setActive: Boolean => Unit,
    setContainerUpdateFn: (Layout, js.Function1[/* layout */ Layout, Double]) => Unit,
    setReadOnly: Boolean => Unit,
    setSize: (Double, Double) => Unit,
    setTitle: String => Unit
  ): PanelBaseWithHeader = {
    val __obj = js.Dynamic.literal(OPTIONS = OPTIONS.asInstanceOf[js.Any], afterAppend = js.Any.fromFunction0(afterAppend), clear = js.Any.fromFunction0(clear), control = control.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getNodeID = js.Any.fromFunction0(getNodeID), initUI = js.Any.fromFunction1(initUI), isReadOnly = js.Any.fromFunction0(isReadOnly), logger = logger.asInstanceOf[js.Any], onReadOnlyChanged = js.Any.fromFunction1(onReadOnlyChanged), onResize = js.Any.fromFunction2(onResize), setActive = js.Any.fromFunction1(setActive), setContainerUpdateFn = js.Any.fromFunction2(setContainerUpdateFn), setReadOnly = js.Any.fromFunction1(setReadOnly), setSize = js.Any.fromFunction2(setSize), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[PanelBaseWithHeader]
  }
}

