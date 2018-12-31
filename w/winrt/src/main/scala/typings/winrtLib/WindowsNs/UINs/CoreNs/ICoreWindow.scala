package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindow extends js.Object {
  var automationHostProvider: js.Any
  var bounds: winrtLib.WindowsNs.FoundationNs.Rect
  var customProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  var dispatcher: CoreDispatcher
  var flowDirection: CoreWindowFlowDirection
  var isInputEnabled: scala.Boolean
  var onactivated: js.Any
  var onautomationproviderrequested: js.Any
  var oncharacterreceived: js.Any
  var onclosed: js.Any
  var oninputenabled: js.Any
  var onkeydown: js.Any
  var onkeyup: js.Any
  var onpointercapturelost: js.Any
  var onpointerentered: js.Any
  var onpointerexited: js.Any
  var onpointermoved: js.Any
  var onpointerpressed: js.Any
  var onpointerreleased: js.Any
  var onpointerwheelchanged: js.Any
  var onsizechanged: js.Any
  var ontouchhittesting: js.Any
  var onvisibilitychanged: js.Any
  var pointerCursor: CoreCursor
  var pointerPosition: winrtLib.WindowsNs.FoundationNs.Point
  var visible: scala.Boolean
  def activate(): scala.Unit
  def close(): scala.Unit
  def getAsyncKeyState(virtualKey: winrtLib.WindowsNs.SystemNs.VirtualKey): CoreVirtualKeyStates
  def getKeyState(virtualKey: winrtLib.WindowsNs.SystemNs.VirtualKey): CoreVirtualKeyStates
  def releasePointerCapture(): scala.Unit
  def setPointerCapture(): scala.Unit
}

