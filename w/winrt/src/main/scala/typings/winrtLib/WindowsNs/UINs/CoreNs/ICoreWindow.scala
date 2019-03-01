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

object ICoreWindow {
  @scala.inline
  def apply(
    activate: js.Function0[scala.Unit],
    automationHostProvider: js.Any,
    bounds: winrtLib.WindowsNs.FoundationNs.Rect,
    close: js.Function0[scala.Unit],
    customProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet,
    dispatcher: CoreDispatcher,
    flowDirection: CoreWindowFlowDirection,
    getAsyncKeyState: js.Function1[winrtLib.WindowsNs.SystemNs.VirtualKey, CoreVirtualKeyStates],
    getKeyState: js.Function1[winrtLib.WindowsNs.SystemNs.VirtualKey, CoreVirtualKeyStates],
    isInputEnabled: scala.Boolean,
    onactivated: js.Any,
    onautomationproviderrequested: js.Any,
    oncharacterreceived: js.Any,
    onclosed: js.Any,
    oninputenabled: js.Any,
    onkeydown: js.Any,
    onkeyup: js.Any,
    onpointercapturelost: js.Any,
    onpointerentered: js.Any,
    onpointerexited: js.Any,
    onpointermoved: js.Any,
    onpointerpressed: js.Any,
    onpointerreleased: js.Any,
    onpointerwheelchanged: js.Any,
    onsizechanged: js.Any,
    ontouchhittesting: js.Any,
    onvisibilitychanged: js.Any,
    pointerCursor: CoreCursor,
    pointerPosition: winrtLib.WindowsNs.FoundationNs.Point,
    releasePointerCapture: js.Function0[scala.Unit],
    setPointerCapture: js.Function0[scala.Unit],
    visible: scala.Boolean
  ): ICoreWindow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activate")(activate)
    __obj.updateDynamic("automationHostProvider")(automationHostProvider)
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("customProperties")(customProperties)
    __obj.updateDynamic("dispatcher")(dispatcher)
    __obj.updateDynamic("flowDirection")(flowDirection)
    __obj.updateDynamic("getAsyncKeyState")(getAsyncKeyState)
    __obj.updateDynamic("getKeyState")(getKeyState)
    __obj.updateDynamic("isInputEnabled")(isInputEnabled)
    __obj.updateDynamic("onactivated")(onactivated)
    __obj.updateDynamic("onautomationproviderrequested")(onautomationproviderrequested)
    __obj.updateDynamic("oncharacterreceived")(oncharacterreceived)
    __obj.updateDynamic("onclosed")(onclosed)
    __obj.updateDynamic("oninputenabled")(oninputenabled)
    __obj.updateDynamic("onkeydown")(onkeydown)
    __obj.updateDynamic("onkeyup")(onkeyup)
    __obj.updateDynamic("onpointercapturelost")(onpointercapturelost)
    __obj.updateDynamic("onpointerentered")(onpointerentered)
    __obj.updateDynamic("onpointerexited")(onpointerexited)
    __obj.updateDynamic("onpointermoved")(onpointermoved)
    __obj.updateDynamic("onpointerpressed")(onpointerpressed)
    __obj.updateDynamic("onpointerreleased")(onpointerreleased)
    __obj.updateDynamic("onpointerwheelchanged")(onpointerwheelchanged)
    __obj.updateDynamic("onsizechanged")(onsizechanged)
    __obj.updateDynamic("ontouchhittesting")(ontouchhittesting)
    __obj.updateDynamic("onvisibilitychanged")(onvisibilitychanged)
    __obj.updateDynamic("pointerCursor")(pointerCursor)
    __obj.updateDynamic("pointerPosition")(pointerPosition)
    __obj.updateDynamic("releasePointerCapture")(releasePointerCapture)
    __obj.updateDynamic("setPointerCapture")(setPointerCapture)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ICoreWindow]
  }
}

