package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.CoreWindow")
@js.native
class CoreWindow () extends ICoreWindow {
  /* CompleteClass */
  override var automationHostProvider: js.Any = js.native
  /* CompleteClass */
  override var bounds: winrtLib.WindowsNs.FoundationNs.Rect = js.native
  /* CompleteClass */
  override var customProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  /* CompleteClass */
  override var dispatcher: CoreDispatcher = js.native
  /* CompleteClass */
  override var flowDirection: CoreWindowFlowDirection = js.native
  /* CompleteClass */
  override var isInputEnabled: scala.Boolean = js.native
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
  override var pointerCursor: CoreCursor = js.native
  /* CompleteClass */
  override var pointerPosition: winrtLib.WindowsNs.FoundationNs.Point = js.native
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  /* CompleteClass */
  override def activate(): scala.Unit = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /* CompleteClass */
  override def getAsyncKeyState(virtualKey: winrtLib.WindowsNs.SystemNs.VirtualKey): CoreVirtualKeyStates = js.native
  /* CompleteClass */
  override def getKeyState(virtualKey: winrtLib.WindowsNs.SystemNs.VirtualKey): CoreVirtualKeyStates = js.native
  /* CompleteClass */
  override def releasePointerCapture(): scala.Unit = js.native
  /* CompleteClass */
  override def setPointerCapture(): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.UI.Core.CoreWindow")
@js.native
object CoreWindow extends js.Object {
  def getForCurrentThread(): winrtLib.WindowsNs.UINs.CoreNs.CoreWindow = js.native
}

