package typings.winrt.global.Windows.UI.Core

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.System.VirtualKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.CoreWindow")
@js.native
class CoreWindow ()
  extends typings.winrt.Windows.UI.Core.CoreWindow {
  /* CompleteClass */
  override var automationHostProvider: js.Any = js.native
  /* CompleteClass */
  override var bounds: Rect = js.native
  /* CompleteClass */
  override var customProperties: IPropertySet = js.native
  /* CompleteClass */
  override var dispatcher: typings.winrt.Windows.UI.Core.CoreDispatcher = js.native
  /* CompleteClass */
  override var flowDirection: typings.winrt.Windows.UI.Core.CoreWindowFlowDirection = js.native
  /* CompleteClass */
  override var isInputEnabled: Boolean = js.native
  /* CompleteClass */
  override var onactivated: js.Any = js.native
  /* CompleteClass */
  override var onautomationproviderrequested: js.Any = js.native
  /* CompleteClass */
  override var oncharacterreceived: js.Any = js.native
  /* CompleteClass */
  override var onclosed: js.Any = js.native
  /* CompleteClass */
  override var oninputenabled: js.Any = js.native
  /* CompleteClass */
  override var onkeydown: js.Any = js.native
  /* CompleteClass */
  override var onkeyup: js.Any = js.native
  /* CompleteClass */
  override var onpointercapturelost: js.Any = js.native
  /* CompleteClass */
  override var onpointerentered: js.Any = js.native
  /* CompleteClass */
  override var onpointerexited: js.Any = js.native
  /* CompleteClass */
  override var onpointermoved: js.Any = js.native
  /* CompleteClass */
  override var onpointerpressed: js.Any = js.native
  /* CompleteClass */
  override var onpointerreleased: js.Any = js.native
  /* CompleteClass */
  override var onpointerwheelchanged: js.Any = js.native
  /* CompleteClass */
  override var onsizechanged: js.Any = js.native
  /* CompleteClass */
  override var ontouchhittesting: js.Any = js.native
  /* CompleteClass */
  override var onvisibilitychanged: js.Any = js.native
  /* CompleteClass */
  override var pointerCursor: typings.winrt.Windows.UI.Core.CoreCursor = js.native
  /* CompleteClass */
  override var pointerPosition: Point = js.native
  /* CompleteClass */
  override var visible: Boolean = js.native
  /* CompleteClass */
  override def activate(): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def getAsyncKeyState(virtualKey: VirtualKey): typings.winrt.Windows.UI.Core.CoreVirtualKeyStates = js.native
  /* CompleteClass */
  override def getKeyState(virtualKey: VirtualKey): typings.winrt.Windows.UI.Core.CoreVirtualKeyStates = js.native
  /* CompleteClass */
  override def releasePointerCapture(): Unit = js.native
  /* CompleteClass */
  override def setPointerCapture(): Unit = js.native
}

/* static members */
@JSGlobal("Windows.UI.Core.CoreWindow")
@js.native
object CoreWindow extends js.Object {
  def getForCurrentThread(): typings.winrt.Windows.UI.Core.CoreWindow = js.native
}

