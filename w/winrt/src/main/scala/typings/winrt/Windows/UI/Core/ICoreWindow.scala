package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.System.VirtualKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreWindow extends StObject {
  
  def activate(): Unit
  
  var automationHostProvider: Any
  
  var bounds: Rect
  
  def close(): Unit
  
  var customProperties: IPropertySet
  
  var dispatcher: CoreDispatcher
  
  var flowDirection: CoreWindowFlowDirection
  
  def getAsyncKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates
  
  def getKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates
  
  var isInputEnabled: Boolean
  
  var onactivated: Any
  
  var onautomationproviderrequested: Any
  
  var oncharacterreceived: Any
  
  var onclosed: Any
  
  var oninputenabled: Any
  
  var onkeydown: Any
  
  var onkeyup: Any
  
  var onpointercapturelost: Any
  
  var onpointerentered: Any
  
  var onpointerexited: Any
  
  var onpointermoved: Any
  
  var onpointerpressed: Any
  
  var onpointerreleased: Any
  
  var onpointerwheelchanged: Any
  
  var onsizechanged: Any
  
  var ontouchhittesting: Any
  
  var onvisibilitychanged: Any
  
  var pointerCursor: CoreCursor
  
  var pointerPosition: Point
  
  def releasePointerCapture(): Unit
  
  def setPointerCapture(): Unit
  
  var visible: Boolean
}
object ICoreWindow {
  
  inline def apply(
    activate: () => Unit,
    automationHostProvider: Any,
    bounds: Rect,
    close: () => Unit,
    customProperties: IPropertySet,
    dispatcher: CoreDispatcher,
    flowDirection: CoreWindowFlowDirection,
    getAsyncKeyState: VirtualKey => CoreVirtualKeyStates,
    getKeyState: VirtualKey => CoreVirtualKeyStates,
    isInputEnabled: Boolean,
    onactivated: Any,
    onautomationproviderrequested: Any,
    oncharacterreceived: Any,
    onclosed: Any,
    oninputenabled: Any,
    onkeydown: Any,
    onkeyup: Any,
    onpointercapturelost: Any,
    onpointerentered: Any,
    onpointerexited: Any,
    onpointermoved: Any,
    onpointerpressed: Any,
    onpointerreleased: Any,
    onpointerwheelchanged: Any,
    onsizechanged: Any,
    ontouchhittesting: Any,
    onvisibilitychanged: Any,
    pointerCursor: CoreCursor,
    pointerPosition: Point,
    releasePointerCapture: () => Unit,
    setPointerCapture: () => Unit,
    visible: Boolean
  ): ICoreWindow = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), automationHostProvider = automationHostProvider.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), customProperties = customProperties.asInstanceOf[js.Any], dispatcher = dispatcher.asInstanceOf[js.Any], flowDirection = flowDirection.asInstanceOf[js.Any], getAsyncKeyState = js.Any.fromFunction1(getAsyncKeyState), getKeyState = js.Any.fromFunction1(getKeyState), isInputEnabled = isInputEnabled.asInstanceOf[js.Any], onactivated = onactivated.asInstanceOf[js.Any], onautomationproviderrequested = onautomationproviderrequested.asInstanceOf[js.Any], oncharacterreceived = oncharacterreceived.asInstanceOf[js.Any], onclosed = onclosed.asInstanceOf[js.Any], oninputenabled = oninputenabled.asInstanceOf[js.Any], onkeydown = onkeydown.asInstanceOf[js.Any], onkeyup = onkeyup.asInstanceOf[js.Any], onpointercapturelost = onpointercapturelost.asInstanceOf[js.Any], onpointerentered = onpointerentered.asInstanceOf[js.Any], onpointerexited = onpointerexited.asInstanceOf[js.Any], onpointermoved = onpointermoved.asInstanceOf[js.Any], onpointerpressed = onpointerpressed.asInstanceOf[js.Any], onpointerreleased = onpointerreleased.asInstanceOf[js.Any], onpointerwheelchanged = onpointerwheelchanged.asInstanceOf[js.Any], onsizechanged = onsizechanged.asInstanceOf[js.Any], ontouchhittesting = ontouchhittesting.asInstanceOf[js.Any], onvisibilitychanged = onvisibilitychanged.asInstanceOf[js.Any], pointerCursor = pointerCursor.asInstanceOf[js.Any], pointerPosition = pointerPosition.asInstanceOf[js.Any], releasePointerCapture = js.Any.fromFunction0(releasePointerCapture), setPointerCapture = js.Any.fromFunction0(setPointerCapture), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreWindow]
  }
  
  extension [Self <: ICoreWindow](x: Self) {
    
    inline def setActivate(value: () => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
    
    inline def setAutomationHostProvider(value: Any): Self = StObject.set(x, "automationHostProvider", value.asInstanceOf[js.Any])
    
    inline def setBounds(value: Rect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCustomProperties(value: IPropertySet): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
    
    inline def setDispatcher(value: CoreDispatcher): Self = StObject.set(x, "dispatcher", value.asInstanceOf[js.Any])
    
    inline def setFlowDirection(value: CoreWindowFlowDirection): Self = StObject.set(x, "flowDirection", value.asInstanceOf[js.Any])
    
    inline def setGetAsyncKeyState(value: VirtualKey => CoreVirtualKeyStates): Self = StObject.set(x, "getAsyncKeyState", js.Any.fromFunction1(value))
    
    inline def setGetKeyState(value: VirtualKey => CoreVirtualKeyStates): Self = StObject.set(x, "getKeyState", js.Any.fromFunction1(value))
    
    inline def setIsInputEnabled(value: Boolean): Self = StObject.set(x, "isInputEnabled", value.asInstanceOf[js.Any])
    
    inline def setOnactivated(value: Any): Self = StObject.set(x, "onactivated", value.asInstanceOf[js.Any])
    
    inline def setOnautomationproviderrequested(value: Any): Self = StObject.set(x, "onautomationproviderrequested", value.asInstanceOf[js.Any])
    
    inline def setOncharacterreceived(value: Any): Self = StObject.set(x, "oncharacterreceived", value.asInstanceOf[js.Any])
    
    inline def setOnclosed(value: Any): Self = StObject.set(x, "onclosed", value.asInstanceOf[js.Any])
    
    inline def setOninputenabled(value: Any): Self = StObject.set(x, "oninputenabled", value.asInstanceOf[js.Any])
    
    inline def setOnkeydown(value: Any): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
    
    inline def setOnkeyup(value: Any): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
    
    inline def setOnpointercapturelost(value: Any): Self = StObject.set(x, "onpointercapturelost", value.asInstanceOf[js.Any])
    
    inline def setOnpointerentered(value: Any): Self = StObject.set(x, "onpointerentered", value.asInstanceOf[js.Any])
    
    inline def setOnpointerexited(value: Any): Self = StObject.set(x, "onpointerexited", value.asInstanceOf[js.Any])
    
    inline def setOnpointermoved(value: Any): Self = StObject.set(x, "onpointermoved", value.asInstanceOf[js.Any])
    
    inline def setOnpointerpressed(value: Any): Self = StObject.set(x, "onpointerpressed", value.asInstanceOf[js.Any])
    
    inline def setOnpointerreleased(value: Any): Self = StObject.set(x, "onpointerreleased", value.asInstanceOf[js.Any])
    
    inline def setOnpointerwheelchanged(value: Any): Self = StObject.set(x, "onpointerwheelchanged", value.asInstanceOf[js.Any])
    
    inline def setOnsizechanged(value: Any): Self = StObject.set(x, "onsizechanged", value.asInstanceOf[js.Any])
    
    inline def setOntouchhittesting(value: Any): Self = StObject.set(x, "ontouchhittesting", value.asInstanceOf[js.Any])
    
    inline def setOnvisibilitychanged(value: Any): Self = StObject.set(x, "onvisibilitychanged", value.asInstanceOf[js.Any])
    
    inline def setPointerCursor(value: CoreCursor): Self = StObject.set(x, "pointerCursor", value.asInstanceOf[js.Any])
    
    inline def setPointerPosition(value: Point): Self = StObject.set(x, "pointerPosition", value.asInstanceOf[js.Any])
    
    inline def setReleasePointerCapture(value: () => Unit): Self = StObject.set(x, "releasePointerCapture", js.Any.fromFunction0(value))
    
    inline def setSetPointerCapture(value: () => Unit): Self = StObject.set(x, "setPointerCapture", js.Any.fromFunction0(value))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
